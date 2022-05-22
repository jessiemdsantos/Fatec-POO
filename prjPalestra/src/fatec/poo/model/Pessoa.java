package fatec.poo.model;

/**
 *
 * @author carlos wagner
 */
public class Pessoa {
    String cpf;
    String nome;
    private String telefone;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public void setTelefone(String telefone){
        this.telefone=telefone;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
}
