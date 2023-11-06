
package estruturas_de_repetição;

import java.util.Scanner;

public class Estruturas_de_repetição {

    public static void main(String[] args) {
       
        // Existem 3 Formas para repetir algum elemento.
        
            //while     - Ela primeiro procura saber se o valor da condição é verdadeiro, e se for verdadeiro irá repete
                //Sintaxe do WHILE
                /*
                      while(condição){
                            instruções a serem repetidas
                      }
                 */
            
            //do while  - Ela primeiro repete e depois procura saber se o valor da condição é verdadeira ou falso.
                //se o valor da condição for falso ela irá repetir pelo menos uma vez,
                //se o valor da condição for verdadeiro ela ira repetir sempre.
            
                 //Sintaxe do DO WHILE
                /*
                      do{
                            instruções a serem repetidas
                        
                        }while(condição);
                 */
                
                
            //for       - Ela irá repetir quando a condição for verdadeira e 
            //ela é utilizada para repetir quando sabemos a quantidade de vezes que nós queremos repetir
            
                //Sintaxe do FOR
                /*
                      for(inicialiazação; condição; incremento ou decremento){
                                (1)------>(2)      <-------- - ^ (4)
                                           |                   |
                                           |                   |
                                           v                   |
                                instruções a serem repetidas---
                                            (3)
                      }
                 */
                
                // Inicialização - O ponto de partida;
                // Condição - É o elemento que irá controlar se a repetição está dentro do intervalo ou não.
                // Incremento - 1 -> 6 -> 11 -> ..... n= n+5;   i++ <=> i=i+1 <=> i+=1
                // Decremento - 3 -> 2 -> 1...... n= n-1;
                
                
                
                //FOR
                
                    //1. Use o for para repertir 1000 vezes a mensagem "alunos da 301";
                    
                    System.out.println("Repetição copiando e colando o System.out.println(\"Alunos da 301\");");
                    
                    System.out.println("Alunos da 301");
                    System.out.println("Alunos da 301");
                    System.out.println("Alunos da 301");
                    System.out.println("Alunos da 301");
                    System.out.println("Alunos da 301");
                    System.out.println("Alunos da 301");
                    System.out.println("Alunos da 301");
                    
                    
                    System.out.println("Repetição  usando a estrutura de repetição FOR");
                    
                    for(int i=1; i<=1000; i=i+1){
                        System.out.println(i + " - Alunos da 301");
                    }
                    
                    //Cria um programa que mostra o produto de dois números usando apenas a SOMA;
                    
                    // 4 x 5             = 20;
                    
                    // 4 + 4 + 4 + 4 + 4 = 20;
                    // 5 + 5 + 5 + 5     = 20;
                    
                    int n1=15,n2=7,r=0;
                    
                    for(int i=1; i <= n1; i++ ){
                        r = n2 + r;
                    }
                    
                    System.out.println(r);
                    
                    
                    
                //WHILE
                
                int i=1;
                while(i<=100){
                    System.out.println(i + " - Alunos da 301 - USANDO O WHILE");
                    i=i+1;
                }
                
                
                // Introduza um número    5
                // Introduza um número    20
                // Introduza um número    15
                // Introduza um número    50
                // Introduza um número    -5
                
                 
                Scanner s= new Scanner(System.in);
                int numero, resultado=0;
                
                System.out.println("Introduza um número");
                numero=s.nextInt();
                
                while(numero > 0){
                     resultado=resultado+numero;
                     System.out.println("Introduza um número");
                     numero=s.nextInt();
                }
                
                System.out.println(resultado);
                
                
                
                
                //DO WHILE
                    int y=0;

                    do{

                        System.out.println("Alunos");

                    }while(y==1);
                    
                    
                    n1=34;n2=2;r=0;

                    int k=1;
                    do{

                        r=r+n1;
                        k++;

                    }while(k <= n2);
                    
                    System.out.println(r);




                
    }
     
    
}
