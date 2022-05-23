package fatec.poo.model;

import java.util.ArrayList;

public class Instrutor extends Pessoa {
    
    private String formacao;
    private String areaAtuacao;
    private ArrayList<Turma> turmas;
    
    public Instrutor(String cpf, String nome) {
        super(cpf, nome);
        turmas = new ArrayList<Turma>();
    }       

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
        
    public void addTurma(Turma turma) {
        this.turmas.add(turma);
        turma.setInstrutor(this);
    }
    
    public void removeTurma(Turma turma) {
        turmas.remove(turma);
        turma.setInstrutor(null);
    }
    
    public static ArrayList<String> listarInstrutor(ArrayList<Instrutor> instrutores) {
        int x;
        ArrayList<String> nomes = new ArrayList<String>();
        for( x = 0; x < instrutores.size(); x++){
            nomes.add(instrutores.get(x).getNome());                    
        } 
      
        return nomes;     
    }
       
}
