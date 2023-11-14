/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_estr_repeticao;

import java.util.Scanner;

/**
 *
 * @author mosmmy
 */
public class Exercicios_estr_repeticao {

    
    public static void main(String[] args) {
        //Faça um programa em java que leia 100 números e mostre
        //os divisores de 20,30,70,100 
        
            // 2 5 6 10
            
                // Divisores de 20
                    //2, 5, 10
                // Divisores de 30
                    //2, 5, 6, 10
                // Divisores de 70
                    //2,5, 10
                    
                // Divisores de 100
                    //2,5,10
        
        Scanner s= new Scanner(System.in);
        int n;
        for(int i=1; i<=4; i++){
            System.out.println("Introduzir um número de 0 a 100");
            n=s.nextInt();
            
            if(n >= 0 && n <= 100){
                
                if(20 % n == 0){
                    System.out.println(n+" é divisor de 20 ");
                }
                 if(30 % n == 0){
                    System.out.println(n+" é divisor de 30 ");
                }
                  if(70 % n == 0){
                    System.out.println(n+" é divisor de 70 ");
                }
                   if(100 % n == 0){
                    System.out.println(n+" é divisor de 100 ");
                }
               System.out.println("");
            }
            
            else{
                System.out.println("O número introduzido não esta no intervalo desejado.");
            }
        }
        
    }
    
}
