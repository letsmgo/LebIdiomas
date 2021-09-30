package br.com.zup;

public class Curso {

    private String nomeDoCurso;
    private double valor;
    private String duracao;
    private int qtdModulos;
    private String professor;

    //Método construtor
    public Curso(String nomeDoCurso, double valor, String duracao, int qtdModulos, String professor) {
        this.nomeDoCurso = nomeDoCurso;
        this.valor = valor;
        this.duracao = duracao;
        this.qtdModulos = qtdModulos;
        this.professor = professor;
    }
}
