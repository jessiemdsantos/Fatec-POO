/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Jéssica
 */
public class Locatario extends Pessoa {
    private double totalAluguel;

    public Locatario(int codigo, String nome) {
        super(codigo, nome);
    }

    public double getTotalAluguel() {
        return totalAluguel;
    }
    public void addAluguel (double valorAluguel, double taxaLocacao){
        totalAluguel += (valorAluguel - (taxaLocacao * valorAluguel)); 
    }
    
    
}
