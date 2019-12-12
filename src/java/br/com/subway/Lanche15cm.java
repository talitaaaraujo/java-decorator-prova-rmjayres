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
public class Lanche15cm extends Lanche {
    
    @Override
    public double  getPreco(){
        return 15.50;
    }
    
    @Override
    public String  getDescricao(){
        return descricao + " de 15cm "  ;
    }
    
}