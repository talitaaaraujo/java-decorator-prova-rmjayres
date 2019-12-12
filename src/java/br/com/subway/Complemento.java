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
public abstract class Complemento extends Lanche {
    
    public Lanche lanche ;
    @Override
    public abstract String getDescricao();
    @Override
    public abstract double getPreco();
    
}
