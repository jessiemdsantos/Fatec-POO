
import fatec.poo.model.Circulo;
import java.util.Scanner;



/**
 *
 * @author beesh
 */
public class Aplic {
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       Circulo objCirc = new Circulo();
       int opcao;
       double medRaio;
       
        System.out.println("Digite a medida do raio: ");
        medRaio = entrada.nextDouble();
        objCirc.setRaio(medRaio);
        
        do{
             System.out.println("\n1 - Consultar Área");
             System.out.println("2 - Consultar Perímetro");
             System.out.println("3 - Consultar Diametro");
             System.out.println("4 - Sair");
             System.out.print("\n\tDigite a opcao: ");
             opcao = entrada.nextInt();
             
             System.out.println("\n\nMedida do Raio: " + objCirc.getRaio());
             
             switch(opcao){ //passagem de mensagens
                 case 1 : System.out.println("A medida da área: " + objCirc.calcArea());
                          break;
                 case 2 : System.out.println("A medida do perímetro: " + objCirc.calcPerimetro());  
                          break;
                 case 3 : System.out.println("A medida da diametro: " + objCirc.calcDiametro());
             }
        }while (opcao < 4);
    }    
   
}
    

