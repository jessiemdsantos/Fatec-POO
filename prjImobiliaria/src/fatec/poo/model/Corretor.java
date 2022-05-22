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
public class Corretor extends Pessoa {
    private double taxaLocacao;
    private double totalLocacao;

    public Corretor( int codigo, String nome, double taxaLocacao) {
        super(codigo, nome);
        this.taxaLocacao = taxaLocacao;
    }

    public double getTaxaLocacao() {
        return taxaLocacao;
    }

    public double getTotalLocacao() {
        return totalLocacao;
    }
    public void addLocacao (double valorAluguel) {
        totalLocacao += valorAluguel;
    }   
    public double calcValorComissaoLocacao (){
        return (getTaxaLocacao() * getTotalLocacao());
    }
}
