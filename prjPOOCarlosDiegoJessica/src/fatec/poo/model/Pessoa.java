package fatec.poo.model;

import java.util.ArrayList;

public class Pessoa {
    
    private String nome;
    private String dataNasc;
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    private String celular;
    private String sexo;
    private String estadoCivil;
    private String rg;
    private String cpf;
    private String email;

    public Pessoa(String cpf, String nome) { 
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public static boolean validarCPF(String cpf) {
        
        int somaTotal = 0;
        int primeiroDigitoVerificador = 0;
        
        // 1. Cálculo do primeiro digito verificador     
        for (int i = 0; i < 9; i++) {
            char algarismoChar = cpf.charAt(i);
            int algarismo = algarismoChar - 48;      
            somaTotal += algarismo * (i + 1);      
        }
                
        int resto = somaTotal % 11;
        
        if (resto != 10) {
            primeiroDigitoVerificador = resto;
        }
        
        // 2. Cálculo do segundo digito verificador
        
        somaTotal = 0;
        int segundoDigitoVerificador = 0;
        
        for (int i = 0; i < 9; i++) {
            char algarismoChar = cpf.charAt(i);
            int algarismo = algarismoChar - 48;      
            somaTotal += algarismo * (11 - i);      
        }
        
        somaTotal += primeiroDigitoVerificador * 2;
        
        resto = (somaTotal * 10) % 11;
        
        if (resto != 10) {
            segundoDigitoVerificador = resto;
        }
        
        // Checando se os digitos estao corretos
        
        if ((cpf.charAt(9) - 48 == primeiroDigitoVerificador) &&
            (cpf.charAt(10) - 48 == segundoDigitoVerificador)) {
            
            return true;
        }
         
        return false;
    }
    
}
