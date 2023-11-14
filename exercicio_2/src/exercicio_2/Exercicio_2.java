/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_2;

import java.util.Scanner;

/**
 *
 * @author mosmmy
 */
public class Exercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Programação, Algoritmos e Estruturas de Dados, Pags 21-71
        
        // Desenvolvendo Software em Java, Russel Winder & Graham Roberts, Pags 3 - 133 
        
       // Estruturas Condicionais
       
        
       
            //if
                 // Operadores Aritmetricos
                    // + - / * %
                // Operadores de Comparação
                    // < > <= >= != ==
                // Operadores Lógicos
                    // && || !
                    
                    
            // Tabela de Verdades
            
                // e ( && )
                    
                    // V e V = V
                    // V e F = F
                    // F e V = F
                    // F e F = F
                
               // ou ( || )
                    
                    // V ou V = V
                    // V ou F = V
                    // F ou V = V
                    // F ou F = F
                    
                //  ( ! )
                    
                    // ~V = F
                    // ~F = V
            
            String a="_odio", b="_odio";
            
            // Primeira Forma de Utilização do if
            
                if(a != b){
                    System.out.println("São diferentes");
                }
                    
            // Segunda Forma de Utilização do if        
            
                if(a == b ){
                    System.out.println("São iguais");
                }else
                {
                    System.out.println("São diferentes");
                }
                
            // Terceira Forma de Utilização do if
                int n1=1000, n2=1000;
                
                if(n1 == n2){
                    System.out.println("são iguais");
                }
                else if(n1 > n2){
                    System.out.println("n1 é maior");
                }
                else{
                    System.out.println("n2 é maior");
                }
                boolean fg=false;
                
                fg = (n1==n2) ? true :false;
                
                System.out.println(fg);
                
                
                
               // Exemplo de uso dos Operadores de comparação e Lógicos
                      
                if((n1 != n2) && (n1 > n2)){
                    System.out.println("A tua Ficha de 5 milhões entrou");
                }
                else{
                   System.out.println("A tua Ficha não entrou. Tente outra vez"); 
                }
                
                
                
                Scanner s= new Scanner(System.in);
                
                double peso, altura, imc;
                
                System.out.println("Introduza o peso");
                peso=s.nextDouble();
                
                System.out.println("Introduza a altura");
                altura=s.nextDouble();
                
                imc= peso / (altura * altura);
                
                /*
                    Abaixo de 18,5 Abaixo do peso
                    • Entre 18,5 e 25 Peso normal
                    • de 25 a 30 Acima do peso
                    • Acima dos 30 Obeso
                */
                if(imc < 18.5){
                       System.out.println(imc+" - Abaixo do Peso");
                       
                }
                else if((imc >= 18.5) && (imc <= 24)){
                    System.out.println(imc+" - Peso normal");
                }
                else if((imc >= 25) && (imc <= 30)){
                    System.out.println(imc+" - Acima do Peso");
                }
                else{
                    System.out.println(imc+" - Obeso");
                }
    }
    
}
