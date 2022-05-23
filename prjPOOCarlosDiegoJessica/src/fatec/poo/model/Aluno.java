package fatec.poo.model;

public class Aluno extends Pessoa {
    
    private String escolaridade;
    private Matricula matricula;
    private String tipo;

    public Aluno(String cpf, String nome) {
        super(cpf, nome);
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
        matricula.setAluno(this);
    } 

    public String getEscolaridade() {
        return escolaridade;
    }

    
}
