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
public class LoginInvalidoException extends SistemaGestaoException{

    public LoginInvalidoException(String mensagem) {
        super(mensagem);
    }

    public LoginInvalidoException() {
        super("Login Inválido! Favor Informar Novamente!");
    }
  
    
}
