/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaGestaoMerci.excecao;

/**
 *
 * @author Rayssa
 */
public class LoginNaoEncontradoException extends SistemaGestaoException{

    public LoginNaoEncontradoException() {
        super("Login não encontrado para que a PESQUISA possa ser efetuada!");
    }
    
}
