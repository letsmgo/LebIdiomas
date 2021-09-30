package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nomeDoAluno;
    private String cpf;
    private String email;
    private String cursoEscolhido;

    //Método construtor
    public Aluno(String nomeDoAluno, String cpf, String email, String cursoEscolhido) {
        this.nomeDoAluno = nomeDoAluno;
        this.cpf = cpf;
        this.email = email;
        this.cursoEscolhido = cursoEscolhido;
    }

    //Getters and Setters
    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
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

    //Sobreescrevendo toString das Hash para trazer os valores dos objetos
    @Override
    public String toString() {
        StringBuilder mostrarDados = new StringBuilder();
        mostrarDados.append("  Nome do aluno: " + nomeDoAluno);
        mostrarDados.append("\n|  Cpf: " + cpf);
        mostrarDados.append("\n|  E-mail :" + email);
        mostrarDados.append("\n|  Curso escolhido: " + cursoEscolhido);
        mostrarDados.append("\n");
        return mostrarDados.toString();
    }
}
