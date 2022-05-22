
import fatec.poo.model.Palestra;
import fatec.poo.model.Palestrante;
import fatec.poo.model.Participante;
import java.text.DecimalFormat;

/**
 *
 * @author carlos wagner            
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        //instanciando o objeto Palestrante
        Palestrante palestrante = new Palestrante(
                "123.456.789-11",
                "Carlos Silva",
                0.75);
        palestrante.setAreaAtuacao("Segurança em Rede de Computadores");
                
        
        //instanciando o objeto palestra
        Palestra [] palestras = new Palestra[1];
        palestras[0] = new Palestra ("15/06/2020", "Segurança Corporativa");
        palestras[0].setLocal("Auditório Carlos Penha");
        palestras[0].setValor(600.00);
        
        //Definindo relação palestrantes e palestras
        palestrante.setPalestra(palestras);
        
        //Definindo relação palestras e palestrante
        palestras[0].setPalestrante(palestrante);


        //Instanciando os objetos participantes        
        Participante [] participante = new Participante[3];
        //participante 1
        participante[0] = new Participante("121.121.121-22", "Ana Beatriz", 1);
        participante[0].setEscolaridade("Ensino Médio");
        
        //participante 2
        participante[1] = new Participante("131.131.131-33", "Fabio Souza", 2);
        participante[1].setEscolaridade("Ensino Médio");

        //participante 3
        participante[2] = new Participante("141.141.141-22", "Marcos Silva", 3);
        participante[2].setEscolaridade("Ensino Superior");   
        
        //Definindo a relação de palestra e participantes
        palestras[0].setParticipante(participante);
        palestras[0].setParticipante(participante);        
        palestras[0].setParticipante(participante);
        
        //Lista de palestras do palestrante
        palestrante.listarPalestras();
        
        //Lista de Participantes da Palestra
        palestras[0].emitirListaParticipantes();
    }
    
}
