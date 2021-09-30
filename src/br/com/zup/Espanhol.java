package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Espanhol extends Curso {
  private List<Espanhol> espanholList = new ArrayList<>();

  public Espanhol(String nomeDoCurso, double valor, String duracao, int qtdModulos, String professor) {
    super(nomeDoCurso, valor, duracao, qtdModulos, professor);
  }

  public void adicionarAlunoEspanhol(Espanhol novoAlunoEspanhol) {
    espanholList.add(novoAlunoEspanhol);
  }

  @Override
  public String toString() {
    StringBuilder mostrarDados = new StringBuilder();
    mostrarDados.append(super.toString());
    mostrarDados.append("Lista de alunos: " + espanholList);
    return mostrarDados.toString();
  }
}