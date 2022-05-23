
package fatec.poo.model;

import java.util.ArrayList;

public class Curso {
    
private String sigla;
    private String nome;
    private int cargaHoraria;
    private double valor;
    private String dataVigencia;
    private double valorHoraInstrutor;
    private String programa;
    private ArrayList<Turma> turmas;

    public Curso(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        turmas = new ArrayList<Turma>();
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public double getValor() {
        return valor;
    }

    public String getDataVigencia() {
        return dataVigencia;
    }

    public double getValorHoraInstrutor() {
        return valorHoraInstrutor;
    }

    public String getPrograma() {
        return programa;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    } 

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDataVigencia(String dataVigencia) {
        this.dataVigencia = dataVigencia;
    }

    public void setValorHoraInstrutor(double valorHoraInstrutor) {
        this.valorHoraInstrutor = valorHoraInstrutor;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
   
    public void addTurma(Turma turma) {
        this.turmas.add(turma);
        turma.setCurso(this);
    }

    public static ArrayList<String> listarSiglas(ArrayList<Curso> cursos) {
        int x;
        ArrayList<String> siglas = new ArrayList<String>();
        for( x = 0; x < cursos.size(); x++){
            siglas.add(cursos.get(x).getSigla());                    
        } 
      
        return siglas;     
    }

    public void removeTurma(Turma turma) {
        turmas.remove(turma);
        turma.setCurso(null);
    }
       
}
