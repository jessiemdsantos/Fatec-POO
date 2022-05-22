/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.text.DecimalFormat;

/**
 *
 * @author carlos
 */
public class Palestrante extends Pessoa{
    String areaAtuacao;
    double taxaCobranca;
    private Palestra[] palestra;
    
    public Palestrante(String cpf, String nome, double taxaCobranca) {
        super(cpf, nome);
        this.taxaCobranca = taxaCobranca;
    }
    
    public void setAreaAtuacao(String areaAtuacao){
        this.areaAtuacao = areaAtuacao;
    }
    
    public String getAreaAtuacao(){
        return areaAtuacao;
    }
    
    public double getTaxaCobranca(){
        return taxaCobranca;        
    }
    
    public void setPalestra(Palestra[] palestra){
        
        //set palestras
        this.palestra = palestra;
        
        for (int i=0; i < palestra.length; i++){
            
            //set palestrante para a palestra
            palestra[i].setPalestrante(this);
        }
       
    }
        
    public void listarPalestras(){  
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        double valorTotal = 0;
        
        System.out.println("\t\t\tRelação de Palestras Dadas");
        System.out.println("\n\n\tCPF: " + getCpf());
        System.out.println("\tNome: " + getNome());
        System.out.println("\tÁrea de Atuação: " + getAreaAtuacao());
        System.out.println("\tTaxa: " + getTaxaCobranca());
        
        System.out.printf("\n\t%-15s %-25s %-15s\n", "Data Palestra", "Tema", "Valor Recebido");
        
        for (int i = 0; i < palestra.length; i++) {
            
            System.out.printf(
                "\t%-15s %-25s %10s\n", palestra[i].getData(), palestra[i].getTema(), 
                    df.format(palestra[i].getValor()* getTaxaCobranca())
            );
            valorTotal += palestra[i].getValor()* getTaxaCobranca(); 
        }
        
        System.out.printf("\t%45s %5s\n", "Total", df.format(valorTotal));    
        
        
    }   
    
    
}
