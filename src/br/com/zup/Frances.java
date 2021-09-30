package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Frances extends Curso{
  List<Frances> francesList = new ArrayList<>();

  public Frances(String nomeDoCurso, double valor, String duracao, int qtdModulos, String professor) {
    super(nomeDoCurso, valor, duracao, qtdModulos, professor);
  }


}
