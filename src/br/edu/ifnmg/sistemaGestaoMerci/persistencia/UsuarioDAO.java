/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaGestaoMerci.persistencia;

import br.edu.ifnmg.sistemaGestaoMerci.entidade.Usuario;
import br.edu.ifnmg.sistemaGestaoMerci.excecao.LoginInvalidoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rayssa
 */
public class UsuarioDAO {

    private static final String SQL_INSERT = "INSERT INTO USUARIO(NOME,LOGIN,SENHA,GRUPO) VALUES(?,?,?,?)";
    private static final String SQL_REMOVER_USUARIO = "DELETE FROM USUARIO WHERE LOGIN = ?";
    private static final String SQL_LOGIN_USUARIO = "SELECT * FROM USUARIO WHERE LOGIN=? AND SENHA=?";
    private static final String SQL_BUSCAR_TODOS = "SELECT  * FROM USUARIO ORDER BY NOME DESC";
    private static final String SQL_NOME_LOGIN_EXISTENTE = "SELECT * FROM USUARIO WHERE LOGIN =? ,SENHA=?";
    private static final String SQL_BUSCAR_LOGIN = "SELECT NOME, LOGIN, SENHA, GRUPO FROM USUARIO WHERE LOGIN = ?";
    private static final String SQL_UPDATE_SENHA = "UPDATE USUARIO SET SENHA = ? WHERE ID =?";
    private static final String SQL_UPDATE = "UPDATE USUARIO SET NOME = ?, LOGIN =?, SENHA = ?, GRUPO =? WHERE ID =?";

    public void inserirUsuario(Usuario usuario) throws SQLException {
        Connection conexao = null;
        PreparedStatement comando = null;
        try {

            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_INSERT);

            comando.setString(1, usuario.getNome());
            comando.setString(2, usuario.getLogin());
            comando.setString(3, usuario.getSenha());
            comando.setString(4, usuario.getGrupo());

            comando.execute();
            conexao.commit();
        } catch (Exception e) {

            if (conexao != null) {
                conexao.rollback();
            }
            throw e;
        } finally {

            BancoDadosUtil.fecharChamadasBancoDados(conexao, comando);
        }
    }

    public void removerUsuario(String login) throws SQLException {
        Connection conexao = null;
        PreparedStatement comando = null;
        try {

            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_REMOVER_USUARIO);

            comando.setString(1, login);

            comando.execute();
            conexao.commit();
        } catch (Exception e) {

            if (conexao != null) {
                conexao.rollback();
            }
            throw e;
        } finally {

            BancoDadosUtil.fecharChamadasBancoDados(conexao, comando);
        }
    }

    public void alterarUsuario(Usuario usuario) throws Exception {
        Connection conexao = null;
        PreparedStatement comando = null;

        try {

            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_UPDATE);

            comando.setString(1, usuario.getNome());
            comando.setString(2, usuario.getLogin());
            comando.setString(3, usuario.getSenha());
            comando.setString(4, usuario.getGrupo());
            comando.setInt(5, usuario.getId());

            comando.execute();
            conexao.commit();
        } catch (Exception e) {

            if (conexao != null) {
                conexao.rollback();
            }
            throw e;
        } finally {
            BancoDadosUtil.fecharChamadasBancoDados(conexao, comando);
        }
    }

    public boolean loginUsuario(Usuario usuario) {
        PreparedStatement comando = null;
        Connection conexao = null;
        ResultSet resultado = null;
        try {
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_LOGIN_USUARIO);

            comando.setString(1, usuario.getLogin());
            comando.setString(2, usuario.getSenha());
            resultado = comando.executeQuery();
            if (resultado.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public List<Usuario> buscarTodosUsuarios() throws SQLException {
        List<Usuario> listaUsuarios = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comando = null;
        ResultSet resultado = null;
        try {
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_BUSCAR_TODOS);
            resultado = comando.executeQuery();

            while (resultado.next()) {
                Usuario usuario = new Usuario();

                usuario.setId(resultado.getInt(1));
                usuario.setNome(resultado.getString(2));
                usuario.setLogin(resultado.getString(3));
                usuario.setSenha(resultado.getString(4));
                usuario.setGrupo(resultado.getString(5));

                listaUsuarios.add(usuario);
            }

        } finally {

            BancoDadosUtil.fecharChamadasBancoDados(conexao, comando);
        }

        return listaUsuarios;
    }

    public boolean verificaLogin(Usuario usuario) {
        PreparedStatement comando = null;
        Connection conexao = null;
        ResultSet resultado = null;
        try {
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_NOME_LOGIN_EXISTENTE);

            comando.setString(1, usuario.getLogin());
            comando.setString(1, usuario.getNome());
            resultado = comando.executeQuery();
            if (resultado.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public Usuario buscarLoginUsuario(String login) throws SQLException {
        Usuario usuario = null;
        Connection conexao = null;
        PreparedStatement comando = null;
        ResultSet resultado = null;
        try {
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_BUSCAR_LOGIN);
            comando.setString(1, login);
            resultado = comando.executeQuery();

            while (resultado.next()) {
                usuario = new Usuario();

                usuario.setNome(resultado.getString(1));
                usuario.setLogin(resultado.getString(2));
                usuario.setSenha(resultado.getString(3));
                usuario.setGrupo(resultado.getString(4));

            }

        } catch (Exception e) {
            if (conexao != null) {
                conexao.rollback();
            }
            throw new RuntimeException();
        } finally {
            if (comando != null && !comando.isClosed()) {
                comando.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
        return usuario;
    }

    public void atualizarUsuario(Usuario usuario) throws SQLException {
        Connection conexao = null;
        PreparedStatement comando = null;
        try {

            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_UPDATE_SENHA);

            comando.setString(1, usuario.getSenha());
            comando.setInt(2, usuario.getId());

            comando.execute();
            conexao.commit();
        } catch (Exception e) {

            if (conexao != null) {
                conexao.rollback();
            }
            throw e;
        } finally {

            BancoDadosUtil.fecharChamadasBancoDados(conexao, comando);
        }
    }

}
