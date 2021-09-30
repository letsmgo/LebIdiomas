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

    //Getters and Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public int getQtdModulos() {
        return qtdModulos;
    }

    public void setQtdModulos(int qtdModulos) {
        this.qtdModulos = qtdModulos;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

}
