package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Curso {
  private String nomeDoCurso, segundoCurso, terceiroCurso, duracao, professor;
  private int qtdModulos;
  private double valor;
  List<Aluno> alunos = new ArrayList<>();

  //Método construtor
  public Curso(String nomeDoCurso, double valor, String duracao, int qtdModulos, String professor) {
    this.nomeDoCurso = nomeDoCurso;
    this.valor = valor;
    this.duracao = duracao;
    this.qtdModulos = qtdModulos;
    this.professor = professor;
  }

  public Curso(String nomeDoCurso, String segundoCurso, double valor, String duracao, int qtdModulos, String professor) {
    this.nomeDoCurso = nomeDoCurso;
    this.valor = valor;
    this.duracao = duracao;
    this.qtdModulos = qtdModulos;
    this.professor = professor;
  }

  public Curso(String nomeDoCurso, String segundoCurso, String terceiroCurso, double valor, String duracao, int qtdModulos, String professor) {
    this.nomeDoCurso = nomeDoCurso;
    this.valor = valor;
    this.duracao = duracao;
    this.qtdModulos = qtdModulos;
    this.professor = professor;
  }

  public Curso() {
  }

  //Getters and Setters
  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public String getSegundoCurso() {
    return segundoCurso;
  }

  public void setSegundoCurso(String segundoCurso) {
    this.segundoCurso = segundoCurso;
  }

  public String getTerceiroCurso() {
    return terceiroCurso;
  }

  public void setTerceiroCurso(String terceiroCurso) {
    this.terceiroCurso = terceiroCurso;
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

  public List<Aluno> getAlunos() {
    return alunos;
  }

  public void adicionarAluno(Aluno novoAluno) {
    alunos.add(novoAluno);
  }

  //Método para calcular descontos

  public void aplicarDesconto(int dia) {
      valor -= 0.25 * valor;
  }

  //Sobreescrevendo toString das Hash para trazer os valores dos objetos
  @Override
  public String toString() {
    StringBuilder mostrarCurso = new StringBuilder();
    mostrarCurso.append("|  Curso: " + nomeDoCurso);
    mostrarCurso.append("\n|  Valor: " + valor);
    mostrarCurso.append("\n|  Duração: " + duracao);
    mostrarCurso.append("\n|  Módulos: " + qtdModulos);
    mostrarCurso.append("\n|  Professor: " + professor);
    return mostrarCurso.toString();
  }

}
