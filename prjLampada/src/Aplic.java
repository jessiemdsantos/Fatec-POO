
import fatec.poo.model.Comodo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author carlos wagner
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#,##0.0");
        Scanner entrada = new Scanner(System.in);
        int tpComodo, potLampada, i;
                
        
        Comodo [] comodos = new Comodo[5];
        
        for(i = 0; i < comodos.length; i++){
            System.out.println("\nInforme o tipo de cômodo: ");
            tpComodo = entrada.nextInt();
            System.out.println("Informe a potência da Lâmpada ( em Watts)");
            potLampada = entrada.nextInt();
            
            comodos[i]= new Comodo(tpComodo, potLampada);
            System.out.println("Informe a largura do cômodo: ");
            comodos[i].setMedLarg(entrada.nextDouble());
            
            System.out.println("Informe o comprimento do cômodo: ");
            comodos[i].setMedComp(entrada.nextDouble());
            
            System.out.println("Informe a altura do cômodo: ");
            comodos[i].setMedAlt(entrada.nextDouble());           
            
        }
        
        System.out.printf("\n\t%-15s %-20s %-15s\n", "Tipo Cômodo", "Potência Lâmpada", 
                "Nº Aprox. de Lâmpadas");
        
        for(i = 0; i < comodos.length; i++){
            System.out.printf("\t\t%-15s %-20s %-15s\n", comodos[i].getTipo(), 
                    comodos[i].getPotLampada(), df.format(comodos[i].calcQtdeLampada()));
        }
        
    }
    
}
