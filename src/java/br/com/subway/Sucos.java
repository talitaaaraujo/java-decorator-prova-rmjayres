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
public class Sucos extends opcoesBebidas {
    
    private String nome ;
    private double valor ;
    
    public Sucos(String nome, double valor, Bebida bebida){
        this.nome = nome ;
        this.valor = valor ;
        this.bebida = bebida ;
    }
    @Override
    public double getValor() {
      return bebida.getValor() + this.valor;
    }

    @Override
    public String getNome() {
        return bebida.getNome() + " Suco: " + this.nome;
    }
}
