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
public abstract class Bebida {
    
    public String nome = "Bebida" ;
    
    public String getNome(){
        return this.nome ;
    }
    
    public abstract double getValor();
        
}