package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Curso {
  private String nomeDoCurso;
  private double valor;
  private String duracao;
  private int qtdModulos;
  private String professor;
  List<Aluno> alunos = new ArrayList<>();

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

  public void adicionarAluno(Aluno novoAluno) {
    alunos.add(novoAluno);
  }

  //Método para calcular descontos

  public double calcularDesconto(int dia) {
    if (dia <= 20 & dia > 0) {
      valor -= 0.25 * valor;
    } else {
      System.out.println("Dia inválido!");
    }
    return valor;
  }

  //Sobreescrevendo toString das Hash para trazer os valores dos objetos
  @Override
  public String toString() {
    StringBuilder mostrarCurso = new StringBuilder();
    mostrarCurso.append("Curso: " + nomeDoCurso);
    mostrarCurso.append("Valor: " + valor);
    mostrarCurso.append("Duração: " + duracao);
    mostrarCurso.append("Módulos: " + qtdModulos);
    mostrarCurso.append("Professor: " + professor);
    mostrarCurso.append("Lista de alunos: " + alunos);

    return mostrarCurso.toString();
  }

}
