
import fatec.poo.model.Comodo;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author Jéssica
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,#0.0");
        Scanner entrada = new Scanner(System.in);       
        int tipo, i, potLamp;
        
        
          //definição de uma matriz de objetos 
       //para classe Comodo
       
       Comodo[] matComodo = new Comodo[5];
       
       for (i=0; i < matComodo.length; i++){
           
            System.out.print("\nDigite o tipo do cômodo: ");
            tipo = entrada.nextInt();       
            System.out.print("Digite a potência da lâmpada (Watts): ");
            potLamp = entrada.nextInt(); 
           
            matComodo[i] = new Comodo(tipo, potLamp);
            System.out.print("Digite a Largura do cômodo: ");
            matComodo[i].setMedLarg(entrada.nextDouble());
            System.out.print("Digite a Comprimento do cômodo: ");
            matComodo[i].setMedComp(entrada.nextDouble());
            System.out.print("Digite a Altura do cômodo: ");
            matComodo[i].setMedAlt(entrada.nextDouble());
            
        }     
       
             
        System.out.printf("\n\t%-15s %-20s %-15s\n", "Tipo Cômodo", "Potência Lâmpada", 
                "Nº Aprox. de Lâmpadas");
        
        for(i = 0; i < matComodo.length; i++){
            System.out.printf("\t\t%-15s %-20s %-15s\n", matComodo[i].getTipo(), 
                    matComodo[i].getPotLampada(), df.format(matComodo[i].calcQtdeLampada()));
        }
    }
}
