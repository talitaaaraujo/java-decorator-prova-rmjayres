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
public class Calabresa extends Complemento {
    
    private String descricao ;
    
    public Calabresa(String descricao, Lanche lanche){
        this.descricao = descricao ;
        this.lanche = lanche ;
    }
    
    @Override
    public  double getPreco(){
        return lanche.getPreco() + 3.80;
    }
    
    @Override
    public  String getDescricao(){
        return lanche.getDescricao() + ", com " + this.descricao ;
    }
}
