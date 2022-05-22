
import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beesh
 */
public class Aplic {
    public static void main(String[] args) {
       
        int opcao,numConta;
        double valSaldo, valSaque, valDep;
        
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        
        System.out.print("Digite o numero da conta: ");
        numConta = entrada.nextInt();
        System.out.print("Digite o valor do saldo inicial: ");
        valSaldo = entrada.nextDouble();
        
        
        //instanciação(alocação) de um objeto da classe Retangulo
        // e chamada do método construtor, que só pode ser feita uma única vez
        ContaCorrente objConta = new ContaCorrente(numConta, valSaldo);
        
    
        
        do{
             System.out.println("\n1 - Depositar");
             System.out.println("2 - Sacar");
             System.out.println("3 - Consultar Saldo");
             System.out.println("4 - Sair");
             System.out.print("\n\tDigite a opcao: ");
             opcao = entrada.nextInt();
             
             System.out.println("\n\nNumero da Conta: " + objConta.getNumero());
             
             switch(opcao){ //passagem de mensagens
                 case 1 : System.out.println("Digite o valor do deposito: ");
                          valDep = entrada.nextDouble();
                          objConta.depositar(valDep);
                          break;
                 case 2 : System.out.println("Digite o valor do saque: ");  
                          valSaque = entrada.nextDouble();
                          if (valSaque <= objConta.getSaldo()){
                             objConta.sacar(valSaque);
                          }else{
                              System.out.println("Saldo Insuficiente");  
                          }
                           break;
                 case 3 : System.out.println("O valor do saldo é : " + df.format(objConta.getSaldo()));
             }
        }while (opcao < 4);
    }    
}


    

