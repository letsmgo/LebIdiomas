package br.com.zup;

public class Aluno {
    private String nomeDoAluno;
    private String cpf;
    private String email;
    Curso curso;

    //Método construtor
    public Aluno(String nomeDoAluno, String cpf, String email, Curso curso) {
        this.nomeDoAluno = nomeDoAluno;
        this.cpf = cpf;
        this.email = email;
        this.curso = curso;
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
}
