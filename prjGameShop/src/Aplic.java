
import fatec.poo.model.GameShop;
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
     int opcao,codJogador, idadeJogador;
        double qtdeHora;
        
        Scanner entrada = new Scanner(System.in);
        
        
        
        System.out.print("Digite o codigo do jogador: ");
        codJogador = entrada.nextInt();
        System.out.print("Digite a idade do jogador: ");
        idadeJogador = entrada.nextInt();
       
        
        
        //instanciação(alocação) de um objeto da classe Retangulo
        // e chamada do método construtor, que só pode ser feita uma única vez
        GameShop objGame = new GameShop(codJogador, idadeJogador);
        
    
        
        do{
             System.out.println("\n1 - Comprar Horas");
             System.out.println("2 - Jogar");
             System.out.println("3 - Brinde");
             System.out.println("4 - Consultar Saldo de Horas");
             System.out.println("5 - Sair");
             System.out.print("\n\tDigite a opcao: ");
             opcao = entrada.nextInt();
             
             System.out.println("\n\nCódigo do Jogador: " + objGame.getCodigo());
             
             switch(opcao){ //passagem de mensagens
                 case 1 : System.out.println("Digite a quantidade de horas que deseja comprar : ");
                          qtdeHora = entrada.nextDouble();
                          objGame.comprar(qtdeHora);
                          break;
                 case 2 : System.out.println("Digite a quantidade de horas jogadas: ");  
                          qtdeHora = entrada.nextDouble();
                          if (qtdeHora<= objGame.getQtdeHoras()){
                             objGame.jogar(qtdeHora);
                          }else{
                              System.out.println("Tempo Insuficiente");  
                          }
                           break;
                 case 3 : objGame.brinde();
                           break;
                 case 4:  System.out.println("O saldo disponivel em horas é : " + objGame.getQtdeHoras());    
             }
        }while (opcao < 5);
    }    
}


