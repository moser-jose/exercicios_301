
package numeros_primos;


public class Numeros_primos {

    public static void main(String[] args) {
        
        //Cria um programa em java que mostre os 
        //30 primeiros números primos.
        
        
        // Número primo é todo  aque número que só é 
        //divisivel por 1 e por ele mesmo.
        
            //Quando é que um número é divisivel por outro número?
            
            int q=0, contar=0;
             
              for(int i =1; i<=1000; i++){ //Números que podem ser primos
                  q=0;
                  for(int j=1; j<=i; j++){ //Achar os divisores do possível número primo.
                      if(i%j==0){
                          q=q+1;
                      }
                  }
                  
                  if(q == 2){
                      contar=contar+1;
                      if(contar<=30){
                          System.out.println(contar+" - "+i);
                      }
                  }
                  
              }
        
    }
    
}
