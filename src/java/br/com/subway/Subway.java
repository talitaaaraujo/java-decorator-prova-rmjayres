/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.subway;

import java.util.Scanner;

/**
 *
 * @author Talita Araujo
 */
public class Subway {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int TamLanche;
        int OpcaoAdd;
        int TamBebida;
        int NumBebida = 0;
        Lanche lanche = null;
        Bebida bebida = null;
        
         System.out.println("Informe o tamanho do lanche desejado: 1=15cm 2=30cm");
         TamLanche = input.nextInt();
         if (TamLanche == 1){
             lanche = new Lanche15cm();
             
          }
         else if (TamLanche == 2){
             lanche = new Lanche30cm();
         }
         else {
             System.out.println("Opção não existente!");
             System.exit(0);
         }
         
         System.out.println(lanche.getDescricao());
        
         do{ 
                  System.out.println("\n1 - Barbecue");
                  System.out.println("2 - Mostarda");
                  System.out.println("3 - Maionese");
                  System.out.println("4 - Pimenta");
                  System.out.println("5 - Bacon");
                  System.out.println("6 - Calabresa");
                  System.out.println("7 - Frango");
                  System.out.println("8 - Salada");
                  System.out.println("9 - Queijo");
                  System.out.println("10 - Batata Palha "); 
                  System.out.println("\n\n0 - Finalizar");
                  OpcaoAdd = input.nextInt();
                  
                  switch(OpcaoAdd){
                            case 1: 
                                 lanche = new Molho("Barbecue", lanche);
                                 break;
                            case 2:
                                 lanche = new Molho("Mostarda", lanche);
                                 break;
                            case 3:
                                 lanche = new Molho("Maionese", lanche);
                                 break;
                            case 4:
                                 lanche = new Molho("Pimenta", lanche);
                                 break;
                            case 5:
                                 lanche = new Bacon("Bacon", lanche);
                                 break;
                            case 6:
                               lanche = new Calabresa("Calabresa", lanche);
                               break;
                            case 7:
                               lanche = new Frango("Frango", lanche);
                               break;
                            case 8:
                               lanche = new Salada("Salada", lanche);
                               break;
                            case 9:
                               lanche = new Queijo("Queijo", lanche);
                               break;
                            case 10:
                               lanche = new BatataPalha("Batata Palha", lanche);
                               break;
                  }
         }
         while (OpcaoAdd != 0);
         
         System.out.println("Informe o tamanho da bebida desejada: 1=300ml 2=500ml");
         TamBebida = input.nextInt();
         if (TamBebida == 1){
             bebida = new Bebida350ml();
             
          }
         else if (TamBebida == 2){
             bebida = new Bebida500ml();
         }
         
         
         System.out.println(bebida.getNome());
         if   (TamBebida == 1 || TamBebida == 2){    
                    do{ 
                             System.out.println(" ---------- REFRIGERANTES ---------");
                             System.out.println("\n1 - Pepsi");
                             System.out.println("2 - Coca-Cola");
                             System.out.println("3 - Fanta");
                             System.out.println("4 - Sprite");
                             System.out.println(" ---------- SUCOS ---------");
                             System.out.println("5 - Laranja");
                             System.out.println("6 - Maracuja");
                             System.out.println("7 - Morango");
                             System.out.println("8 - Abacaxi");
                             System.out.println("\n\n0 - Finalizar");
                             NumBebida = input.nextInt();

                             switch(NumBebida){
                                           case 1: 
                                                bebida = new Refrigerante("Pepsi", 4.00, bebida);
                                            break;
                                            case 2: 
                                               bebida = new Refrigerante("Coca-Cola",5.00, bebida);
                                            break;
                                           case 3: 
                                               bebida = new Refrigerante("Fanta",3.50, bebida);
                                            break;
                                            case 4: 
                                               bebida = new Refrigerante("Sprite",4.00, bebida);
                                            break;
                                            case 5: 
                                               bebida = new Sucos("Laranja",3.50, bebida);
                                            break;
                                            case 6: 
                                               bebida = new Sucos("Maracuja",5.50, bebida);
                                            break;
                                            case 7: 
                                               bebida = new Sucos("Morango",3.50, bebida);
                                            break;
                                            case 8: 
                                               bebida = new Sucos("Abacaxi",3.50, bebida);
                                            break;
                             }
                    }
                    while (NumBebida != 0);
                   }  
         else if (NumBebida == 2) {
             System.exit(NumBebida);
         }
         System.out.println("\n");
         System.out.println("------------- PEDIDO REALIZADO COM SUCESSO! -------------");
         System.out.println(lanche.getDescricao());
         System.out.println("Lanche: " + lanche.getPreco());
         if (bebida.getValor() != 0 ){
             System.out.println(bebida.getNome());         
             System.out.println("Bebida " + bebida.getValor());
         }
         System.out.println("Total: " + (lanche.getPreco() + bebida.getValor()));
         System.out.println("\n");
         
    }
}