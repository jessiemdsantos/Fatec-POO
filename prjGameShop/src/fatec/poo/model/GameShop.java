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
public class GameShop {
    private int codigo;
    private int idade;
    private double qtdeHoras;
    
    public GameShop(int cod, int i){
        codigo = cod;
        idade = i;
    }
    public void comprar(double compra){
        qtdeHoras += compra;
    }
    
    public void jogar (double joga){
        qtdeHoras -= joga;
    }
    public void brinde (){
        qtdeHoras = qtdeHoras * 2;
    }
    public int getCodigo(){
        return(codigo);
    }
    public int getIdade(){
        return (idade);
    }
    public double getQtdeHoras(){
        return (qtdeHoras);
    }
}
