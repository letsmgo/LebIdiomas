package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Espanhol extends Curso{
  List<Espanhol> espanholList = new ArrayList<>();

  public Espanhol(String nomeDoCurso, double valor, String duracao, int qtdModulos, String professor) {
    super(nomeDoCurso, valor, duracao, qtdModulos, professor);
  }

  public void adicionarAlunoEspanhol (Espanhol novoAlunoEspanhol){
    espanholList.add(novoAlunoEspanhol);
  }


}
