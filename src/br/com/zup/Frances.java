package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Frances extends Curso {
  private List<Frances> francesList = new ArrayList<>();

  public Frances(String nomeDoCurso, double valor, String duracao, int qtdModulos, String professor) {
    super(nomeDoCurso, valor, duracao, qtdModulos, professor);
  }

  public void adicionarAlunoFrances(Frances novoAlunoFrances) {
    francesList.add(novoAlunoFrances);
  }

  @Override
  public String toString() {
    StringBuilder mostrarDados = new StringBuilder();
    mostrarDados.append(super.toString());
    mostrarDados.append("Lista de alunos: " + francesList);
    return mostrarDados.toString();
  }
}
