package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Fulano", "6565656", "fulano@fulano", "Espanhol");
    Aluno aluno2 = new Aluno("Let", "3565", "let@let", "Ingles");
    Curso curso = new Curso("Inglês", 2500, "3", 3, "Elaine");

    //curso.adicionarAluno(aluno2);
    //System.out.println(curso);
    System.out.println(curso);
    curso.calcularDesconto(20);
    System.out.println(curso);






  }
}
