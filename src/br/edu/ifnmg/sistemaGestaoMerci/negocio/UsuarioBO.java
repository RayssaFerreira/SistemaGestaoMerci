/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaGestaoMerci.negocio;

import br.edu.ifnmg.sistemaGestaoMerci.entidade.Usuario;
import br.edu.ifnmg.sistemaGestaoMerci.excecao.CampoObrigatorioException;
import br.edu.ifnmg.sistemaGestaoMerci.excecao.LoginInvalidoException;
import br.edu.ifnmg.sistemaGestaoMerci.excecao.LoginNaoEncontradoException;
import br.edu.ifnmg.sistemaGestaoMerci.excecao.UsuarioLoginExistenteException;
import br.edu.ifnmg.sistemaGestaoMerci.persistencia.UsuarioDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Rayssa
 */
public class UsuarioBO {

    public void inserirUsuario(Usuario usuario) throws SQLException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        this.verificaUsuarioLogin(usuario);
        usuarioDAO.inserirUsuario(usuario);
    }

    public void verificaUsuarioLogin(Usuario usuario) throws SQLException {
        Usuario usuarioExistente = null;
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioExistente = usuarioDAO.buscarLoginUsuario(usuario.getLogin());
        if (usuarioExistente != null) {
            throw new UsuarioLoginExistenteException();
        }
    }

    public Usuario pesquisarLoginCadastrado(Usuario usuario) throws SQLException {
        Usuario usuarioBuscado = null;
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioBuscado = usuarioDAO.buscarLoginUsuario(usuario.getLogin());
        if (usuarioBuscado == null) {
            throw new LoginNaoEncontradoException();
        } else {
            return usuarioBuscado;
        }
    }

    public void removerUsuario(Usuario usuario) throws SQLException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.removerUsuario(usuario.getLogin());
    }

    public void alterarUsuario(Usuario usuario) throws Exception {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.alterarUsuario(usuario);
    }

    public void loginUsuario(Usuario usuario) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        if (usuario.getLogin().isEmpty() || usuario.getSenha().isEmpty()) {
            throw new CampoObrigatorioException();
        }
        if (!usuarioDAO.loginUsuario(usuario)) {
            throw new LoginInvalidoException();
        }
    }

    public List<Usuario> buscarTodosUsuarios() throws SQLException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        return usuarioDAO.buscarTodosUsuarios();
    }

    public void atualizarUsuarios(Usuario usuario) throws SQLException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.atualizarUsuario(usuario);
    }

}
