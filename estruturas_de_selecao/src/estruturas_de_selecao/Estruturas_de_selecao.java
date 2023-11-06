
package estruturas_de_selecao;

public class Estruturas_de_selecao {

    public static void main(String[] args) {
       
        // Estruturas de Seleção
            // Servem para em meio a vários elementos selecionar apenas 1 elemento.
       
            //switch - case
            
            // selecionar o mês do ano de acordo o número introduzido
            
            int n=1;
            
            
            switch(n){
            
                case 1:
                    System.out.println("Janeiro");
                    int r=n+1;
                    System.out.println(r);
                    break;
                case 2:
                    System.out.println("Fevereiro");
                    break;
                case 3:
                    System.out.println("Março");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Maio");
                    break;
                case 6:
                    System.out.println("Junho");
                    break;
                case 7:
                    System.out.println("Julho");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Setembro");
                    break;
                case 10:
                    System.out.println("Outubro");
                    break;
                case 11:
                    System.out.println("Novembro");
                    break;
                case 12:
                    System.out.println("Dezembro");
                    break;
                default:
                    System.out.println("O número introduzido não faz parte dos meses do ano");
                    break;
            }
            
    }
    
}
