
package Exercicio1;

public class Mes {


    public static void main(String[] args) {
       ExibirMes(5);
    }
    
    
       public static void ExibirMes(int numero) {
           switch(numero){
           case 1: System.out.println("Janeiro");
           case 2: System.out.println("Feveireiro");
           case 3: System.out.println("Março");
           case 4: System.out.println("Abril");
           case 5: System.out.println("Maio");
           case 6: System.out.println("Junho");
           case 7: System.out.println("Julho");
           case 8: System.out.println("Agosto");
           case 9: System.out.println("setembro");
           case 10: System.out.println("Outubro");
           case 11: System.out.println("Novembro");
           case 12: System.out.println("Dezembro");
           break;
           
           default:
           System.out.println("Número inválido");
           } 
       }
    }
    

