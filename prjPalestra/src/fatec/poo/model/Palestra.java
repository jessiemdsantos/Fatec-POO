package fatec.poo.model;

import java.text.DecimalFormat;

/**
 *
 * @author carlos wagner
 */
public class Palestra {
    
    private String data;
    private String tema;
    private String local;
    private double valor;
    private double totalArrecadado;
    private Palestrante palestrante;
    private Participante [] participante;

    public Palestra(String data, String tema) {
        this.data = data;
        this.tema = tema;
    }
    
    public void setLocal(String local){
        this.local=local;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public String getTema() {
        return tema;
    }

    public String getLocal() {
        return local;
    }
    
    public double getValor() {
        return valor;
    }

    public double getTotalArrecadado() {
        return totalArrecadado;
    }
    
    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }

    public String getPalestrante() {
        return palestrante.getNome();
    }    
    

    public void setParticipante(Participante[] participante) {
        int cont = 0;
        this.participante = participante;
    }
    
    public void emitirListaParticipantes(){
        
        DecimalFormat df = new DecimalFormat("#,##0.00");        
        
        System.out.println("\n\n\t\t\tRelação de Participantes");
        System.out.println("\n\n\tPalestrante: " + getPalestrante());
        System.out.println("\tData: " + getData());
        System.out.println("\tLocal: " + getLocal());
        System.out.println("\tNumero de Participantes: " + participante.length);
        
        System.out.printf("\n\t%-15s %-20s %-15s\n", "Nome", "Escolaridade", "Tipo");
        
        for (int i = 0; i < participante.length; i++) {
            
            String tipo;
            
            if(participante[i].getTipo() == 1){
                tipo = "Comum";
            }else if(participante[i].getTipo() == 2){
                tipo = "Estudante";
            }else{
                tipo = "Idoso";
            }
            
            System.out.printf(
                "\t%-15s %-20s %-15s\n", participante[i].getNome(), 
                    participante[i].getEscolaridade(), tipo);
            
            totalArrecadado += getValor(); 
        }
        
        System.out.printf("\t%-15s %10s\n", "Total Arrecadado:", df.format(totalArrecadado));    
        
    }       
    
}
