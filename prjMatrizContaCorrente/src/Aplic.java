
import fatec.poo.model.ContaCorrente;
import java.util.Scanner;


public class Aplic {    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       //Definição da matriz
       
       double valor;
       int opcao, cont, numConta;
       
       //Instanciação dos objetos da classe Conta Corrente
       
   
       
       do{
            System.out.println("\n\n\n\tConta Corrente");
            System.out.println("1-Sacar");
            System.out.println("2-Depositar");
            System.out.println("3-Consultar saldo");
            System.out.println("4-Listar Contas");
            System.out.println("5-Sair");
            System.out.println("\n\n\tDigite a opcao:");
            opcao = entrada.nextInt();
            
            
        }while(opcao < 5);
    }    
}
