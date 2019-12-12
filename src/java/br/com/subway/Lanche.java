/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.subway;

/**
 *
 * @author Talita Araujo
 */
public abstract class Lanche {
    
    public String descricao = "Lanche" ;
    
    public String getDescricao(){
        return this.descricao ;
    }
    
    public abstract double getPreco();
        
}
