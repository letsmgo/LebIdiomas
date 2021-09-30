package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Ingles extends Curso {
  List <Ingles> inglesList = new ArrayList<>();

  public Ingles(String nomeDoCurso, double valor, String duracao, int qtdModulos, String professor) {
    super(nomeDoCurso, valor, duracao, qtdModulos, professor);
  }

  public void adicionarAlunoIngles (Ingles novoAlunoIngles){
    inglesList.add(novoAlunoIngles);
  }

  @Override
  public String toString() {
    StringBuilder mostrarDados = new StringBuilder();
    mostrarDados.append(super.toString());
    mostrarDados.append("Lista de alunos" + inglesList);
    return mostrarDados.toString();
  }
}
