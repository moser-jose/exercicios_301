
package poo;

public class Poo {

    public static void main(String[] args) {
        
        // Já dominam:
        
        // Classes
        // Atributos
        // Métodos (Funções)
        // Encapsulamento
        // 
        
       // Classses Abstractas
       // Polimorfismo
       // Métodos Estaticos
       // Interfaces
       // Exceptions
       // Relacionamentos
       
       // Classes Abstractas ?
       
            // Classe que não precisa ser instanciada;
            // Vai possui métodos com assinatura abstracta e não abstracta
            // Vai ser uma classe de suporte as demais classes, 
            //ou seja ela sempre será uma classe pai.
       
       // Polimorfismo ?
       
           // São várias formas de representar uma funçaõ.
           // Poli -> Muitas
           // morfismo -> Formas
           
           // O Polimorfismo - Por Sobre Carga
           // O polimorfismo - Por Sobre Escrita
           
           // Por Sobre Carga - Temos vários métodos como o mesmo nome diferenciando apenas na quantidade de parametros.
            
                // int soma (int numero);
                // int soma (int numero, double valor);
                // int soma (String info);
           
           // Por Sobre Escrita - Quando nós temos método numa classe pai implementado ou não 
           // e classe filha re-implementa o mesmo método.
           
           //Classe PAI
           
           /*
                public int soma(int numero1, int numero2){
                    return numero1+numero2;
                }
                public int soma(int numero1){
                    return numero1;
                }
           
           */
           
           //Classe FILHA
           
                /*
                    @override
                    public int soma(int numero1, int numero2){
                        return (numero1 - numero2) * 512 - 230;
                    }
           
                    @override
                    public int soma(int numero1){
                        return numero1 * 512 - 230;
                    }
                */
                
                
               Cabrito c = new Cabrito();
           
               c.setAltura(13.4);
               c.setChifre(true);
               c.setCor("Castanho e preto");
               c.setLargura(20.34);
               c.setPelo(true);
               c.setQpatas(4);
               c.setRaca("Raça da Huíla");
               c.setSom("Mheeeeee");
               
               
               System.out.println(c.EmitirSom());
               System.out.println(c.Comer("Capim"));
               System.out.println(c.Mover());
    }          
    
}
