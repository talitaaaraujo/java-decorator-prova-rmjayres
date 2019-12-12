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
public class test_bebida {
    
    public static void main(String[] args) {
        
        Bebida bebida = new Bebida350ml();
        
        bebida = new Refrigerante("Coca-cola", 5.00, bebida) ;
        bebida = new Sucos("Abacaxi", 3.00, bebida) ;
        
        System.out.println(bebida.getNome());
        System.out.println(bebida.getValor());
        
        
        bebida = new Bebida500ml();
        
        bebida = new Refrigerante("Sprite", 6.00, bebida) ;
        bebida = new Sucos("Abacaxi", 5.00, bebida) ;
        
        System.out.println(bebida.getNome());
        System.out.println(bebida.getValor());
        
        
    }
    
}
