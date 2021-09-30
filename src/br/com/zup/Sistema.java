package br.com.zup;

import java.util.Locale;
import java.util.Scanner;

public class Sistema {

    public static Scanner capturarDados(String msg) {
        System.out.print(msg);
        return new Scanner(System.in);
    }

    public static void exibirMenu() {
        System.out.println("---------------------------------------");
        System.out.println("|  Digite 1 para exibir catálogo      |");
        System.out.println("|  Digite 2 para escolher curso       |");
        System.out.println("|  Digite 3 para se cadastrar         |");
        System.out.println("|  Digite 4 para vizualizar cadastro  |");
        System.out.println("|  Digite 5 para sair                 |");
        System.out.println("---------------------------------------");
    }

    public static void exibirCatalogo() {
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("|            Bem-vinde a LEB SCHOOL            |");
        System.out.println("|           Nossa escola de idiomas!           |");
        System.out.println("|                                              |");
        System.out.println("|      Aqui temos cursos de três idiomas:      |");
        System.out.println("|       Inglês  |  Espanhol  |  Francês        |");
        System.out.println("|                                              |");
        System.out.println("|        Caso se matricule até o dia 20,       |");
        System.out.println("|   você ganha DESCONTO DE 25% do valor total  |");
        System.out.println("|         para todas as mensalidades!          |");
        System.out.println("|                                              |");
        System.out.println("|          -desconto não acumulativo-          |");
        System.out.println("------------------------------------------------");
        System.out.println("Fim de exibição!");
        System.out.println();
    }

    public static void exibirListaDeCursos() {
        System.out.println("------------------------------------------------------------");
        System.out.println("|                     LISTA DE CURSOS                      |");
        System.out.println("------------------------------------------------------------");
        System.out.println("|  Digite 1 para saber mais sobre nosso curso de INGLÊS    |");
        System.out.println("|  Digite 2 para saber mais sobre nosso curso de FRANCÊS   |");
        System.out.println("|  Digite 3 para saber mais sobre nosso curso de ESPANHOL  |");
        System.out.println("------------------------------------------------------------");
    }

    public static void verificarCurso(String cursoDesejado) {
        cursoDesejado = cursoDesejado.toLowerCase(Locale.ROOT);
        if (cursoDesejado.equals("ingles") | cursoDesejado.equals("inglês")) {

        }
    }


    public static void executar() {

        Scanner input = new Scanner(System.in);
        Curso cursos = new Curso();
        Curso ingles = new Curso("Inglês", 4000, "1 ano e 6 meses", 9, "Let");
        Curso frances = new Curso("Francês", 2000, "6 meses", 3, "Elaine");
        Curso espanhol = new Curso("Espanhol", 3500, "1 ano", 6, "Barbara");

        int opcaoDesejada;
        boolean finalizar = false;

        while (!finalizar) {

            exibirMenu();
            System.out.print("Informe um número referente a opção desejada: ");
            opcaoDesejada = input.nextInt();

            if (opcaoDesejada == 1) {
                exibirCatalogo();
            }
            else if (opcaoDesejada == 2) {
                exibirListaDeCursos();
                System.out.print("Informe um número referente a opção desejada: ");
                opcaoDesejada = input.nextInt();

                System.out.println();
                System.out.println("---------------------");
                System.out.println("|    Informações    |");
                System.out.println("---------------------");

                if (opcaoDesejada == 1) {
                    System.out.println(ingles);
                    System.out.println("---------------------");
                }
                else if (opcaoDesejada == 2) {
                    System.out.println(frances);
                    System.out.println("---------------------");
                }
                else if (opcaoDesejada == 3) {
                    System.out.println(espanhol);
                    System.out.println("---------------------");
                }
                else {
                    System.out.println("Opção inválida!");
                }
            }
            else if (opcaoDesejada == 3) {
                System.out.println("-----------------------");
                System.out.println("|  Ficha de cadastro  |");
                System.out.println("-----------------------");
                String nome = capturarDados("|  Nome: ").nextLine();
                String cpf = capturarDados("|  CPF: ").nextLine();
                String email = capturarDados("|  Email: ").nextLine();
                String curso = capturarDados("|  Curso desejado: ").nextLine();
                int diaPagamento = capturarDados("|  Dia do pagamento: ").nextInt();
                if (diaPagamento <= 20 & diaPagamento > 0) {
                    cursos.aplicarDesconto(diaPagamento);
                    System.out.println("|  Desconto aplicado com sucesso!");
                }
                System.out.println("-----------------------");
                Aluno aluno = new Aluno(nome,cpf,email,curso);
                cursos.adicionarAluno(aluno);
                System.out.println("Cadastro efetuado com sucesso! Você receberá seus dados de acesso pelo email informado.");

            } else if (opcaoDesejada == 4) {
                System.out.println(cursos.getAlunos());
            }
            else if (opcaoDesejada == 5) {
                finalizar = true;
                System.out.println("Até breve");
            }
            else {
                System.out.println("Opção inválida!");
            }
        }



    }

}
