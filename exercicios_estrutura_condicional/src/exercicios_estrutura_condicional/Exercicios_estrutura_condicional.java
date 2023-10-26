
package exercicios_estrutura_condicional;


public class Exercicios_estrutura_condicional {

    public static void main(String[] args) {
        
        // Exercícios usando estruturas condicionais
        
        /*
            1. Criar um programa em java que verifique ou mostre se um número é par ou impar;
            
            2. Criar um programa em java que leia três números inteiros e verifique qual tipo de
                triângulo eles formam (Isósceles, Escaleno e Equilátero);
        */
        
        // 1.
        
            int n=3;

            if(n % 2 == 0){
                System.out.println("O número "+ n + " é par");
            }else{
                System.out.println("O número "+ n + " é impar");
            }
        
        
        //2.
        
            //Triângulo Equilátero -> Todos os lados são iguais
            //Triângulo Isósceles  -> Dois (2) lados iguais
            //Triângulo Escaleno   -> Todos os lados diferentes
            
            
            /*
                Quando o Triângulo é Isósceles
                
                n1 = n2 && n1! = n3
                n3 = n1 && n1! = n2
                n2 = n3 && n2 != n1
            
            
                Quando o o Triângulo é Escaleno
            
                n1 != n2 && n1 != n3
                
                n2 != n3 && n2 != n1
            
                Quando o Triângulo é Equilátero
            
                n1 = n2 && n1 = n3
                
                n2 = n3 && n2 = n1
                
            */
            int n1=1,n2=67,n3=1;
            
            if((n1 == n2 && n1!= n3) || 
                (n3 == n1 && n1!= n2) ||
                (n2 == n3 && n2 != n1)){
                   
                System.out.println("O número "+ n1+", o número "+n2+" e o número "+n3+" formam um Triângulo Isósceles");
            }
            else if(n1 != n2 && n1 != n3){
                System.out.println("O número "+ n1+", o número "+n2+" e o número "+n3+" formam um Triângulo Escaleno");
            }
            else{
                System.out.println("O número "+ n1+", o número "+n2+" e o número "+n3+" formam um Triângulo Equilátero");
            }
            
            /*
                Cria um programa em java que, com base em uma temperatura em graus
                celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e
                Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C
                * 0.8; Ra = C * 1.8 + 32 + 459.67.
            */
            
            double f,c=23.3,re, ra, k;
            
            f = c * 1.8 + 32;
            k = c + 273.15;
            re = c * 0.8;
            ra = c * 1.8 + 32 + 459.67;
            
            System.out.println("Fahrenheit (F) = "+f);
            System.out.println("Kelvin (K) = "+k);
            System.out.println("Réaumur (Re) = "+re);
            System.out.println("Rankine (Ra) = "+ra);
            
            /*
                Cria um programa em java que encontre o dobro de um número caso ele seja
                positivo e o seu triplo caso seja negativo, imprima o resultado no final.
            */
            
            int b1=-20;
            
            if(b1 < 0){
                System.out.println(b1*3);
            }
            else if(b1 > 0){
                System.out.println(b1*2);
            }
            else{
                System.out.println("O valor é neutro");
            }
            
        
        
        
    }
    
}
