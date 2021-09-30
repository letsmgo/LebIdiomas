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
}
