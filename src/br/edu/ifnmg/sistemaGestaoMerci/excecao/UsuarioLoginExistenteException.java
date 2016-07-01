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
public class UsuarioLoginExistenteException extends SistemaGestaoException{
   
    
    public UsuarioLoginExistenteException() {
        super("Usuário ja cadastrado no sistema com esse LOGIN!");
         }
}
