package br.com.zup;

import java.util.Locale;
import java.util.Scanner;

public class Sistema {

    public static Scanner capturarDados(String msg) {
        System.out.print(msg);
        return new Scanner(System.in);
    }

    public static void exibirMenu() {

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("|           MENU PRINCIPAL             |");
        System.out.println("----------------------------------------");
        System.out.println("|  Digite 1 para exibir catálogo       |");
        System.out.println("|  Digite 2 para conhecer os cursos    |");
        System.out.println("|  Digite 3 para efetuar matrícula     |");
        System.out.println("|  Digite 4 para vizualizar matrícula  |");
        System.out.println("|  Digite 5 para sair                  |");
        System.out.println("---------------------------------------");
    }

    public static void exibirCatalogo() {
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("|                   CATÁLOGO                   |");
        System.out.println("------------------------------------------------");
        System.out.println("|            Bem-vinde a LEB SCHOOL            |");
        System.out.println("|           Nossa escola de idiomas!           |");
        System.out.println("|                                              |");
        System.out.println("|      Aqui temos cursos de três idiomas:      |");
        System.out.println("|       Inglês  |  Espanhol  |  Francês        |");
        System.out.println("|                                              |");
        System.out.println("|      Efetuando o pagamento até o dia 20,     |");
        System.out.println("|   você ganha DESCONTO DE 25% do valor total  |");
        System.out.println("|         para todas as mensalidades!          |");
        System.out.println("------------------------------------------------");
        System.out.println("Fim de exibição!");
    }

    public static void exibirListaDeCursos() {
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("|                     LISTA DE CURSOS                      |");
        System.out.println("------------------------------------------------------------");
        System.out.println("|  Digite 1 para saber mais sobre nosso curso de INGLÊS    |");
        System.out.println("|  Digite 2 para saber mais sobre nosso curso de FRANCÊS   |");
        System.out.println("|  Digite 3 para saber mais sobre nosso curso de ESPANHOL  |");
        System.out.println("------------------------------------------------------------");
    }

    public static void exibirInformacoesCursos(int opcaoDesejada) {

        Curso ingles = new Curso("Inglês", 4000, "1 ano e 6 meses", 9, "Let");
        Curso frances = new Curso("Francês", 2000, "6 meses", 3, "Elaine");
        Curso espanhol = new Curso("Espanhol", 3500, "1 ano", 6, "Barbara");

        if (opcaoDesejada < 1 | opcaoDesejada > 3) {
            System.out.println("Opção inválida!");
        }
        else {
            System.out.println();
            System.out.println("---------------------");
            System.out.println("|    Informações    |");
            System.out.println("---------------------");

            if (opcaoDesejada == 1) {
                System.out.println(ingles);
            }
            else if (opcaoDesejada == 2) {
                System.out.println(frances);
            }
            else {
                System.out.println(espanhol);
            }
        }
    }

    public static Curso verificarCurso(String cursoDesejado) {

        boolean dadosCertos;
        Curso curso = new Curso();
        cursoDesejado = cursoDesejado.toUpperCase(Locale.ROOT);

        do {
            if (cursoDesejado.equals("INGLES") | cursoDesejado.equals("INGLÊS")) {
                dadosCertos = true;
                curso = new Curso("Inglês", 4000, "1 ano e 6 meses", 9, "Let");
            }
            else if (cursoDesejado.equals("FRANCES") | cursoDesejado.equals("FRANCÊS")) {
                dadosCertos =true;
                curso = new Curso("Francês", 2000, "6 meses", 3, "Elaine");
            }
            else if (cursoDesejado.equals("ESPANHOL")) {
                dadosCertos = true;
                curso = new Curso("Espanhol", 3500, "1 ano", 6, "Barbara");
            }
            else {
                dadosCertos = false;
                cursoDesejado = capturarDados("|  Dados digitados incorretamente!\n|  Informe um curso válido: ").nextLine().toUpperCase(Locale.ROOT);
            }
        } while (!dadosCertos);

        return curso;
    }

    public static void verificarDesconto(int diaPagamento, Curso cursoDesejado){

        if (diaPagamento <= 20 & diaPagamento > 0) {
            cursoDesejado.aplicarDesconto(diaPagamento);
            System.out.println("-----------------------");
            System.out.printf("Desconto de 25%% aplicado com sucesso! Você pagará R$ %.2f pelo curso.\n", cursoDesejado.getValor());
        }
        else {
            System.out.println("-----------------------");
            System.out.println("Cadastro efetuado com sucesso!");
        }
    }

    public static void executar() {

        Curso cursoDesejado = new Curso();

        int opcaoDesejada;
        boolean finalizar = false;

        while (!finalizar) {

            exibirMenu();
            opcaoDesejada = capturarDados("Informe um número referente a opção desejada: ").nextInt();

            if (opcaoDesejada == 1) {
                exibirCatalogo();
            }
            else if (opcaoDesejada == 2) {
                exibirListaDeCursos();
                opcaoDesejada = capturarDados("Informe um número referente a opção desejada: ").nextInt();
                exibirInformacoesCursos(opcaoDesejada);
            }
            else if (opcaoDesejada == 3) {
                System.out.println("-----------------------");
                System.out.println("|  Ficha de cadastro  |");
                System.out.println("-----------------------");
                String nome = capturarDados("|  Nome: ").nextLine();
                String cpf = capturarDados("|  CPF: ").nextLine();
                String email = capturarDados("|  Email: ").nextLine();
                String curso = capturarDados("|  Curso desejado: ").nextLine();
                cursoDesejado = verificarCurso(curso);
                int diaPagamento = capturarDados("|  Dia do pagamento: ").nextInt();
                verificarDesconto(diaPagamento, cursoDesejado);
                System.out.println("Seus dados de acesso serão enviado para o email informado");

                curso = cursoDesejado.getNomeDoCurso();
                Aluno aluno = new Aluno(nome,cpf,email,curso);
                cursoDesejado.adicionarAluno(aluno);
            }
            else if (opcaoDesejada == 4) {

                if (cursoDesejado.getAlunos().size() == 0) {
                    System.out.println("Você ainda não efetuou sua matrícula :(");
                }
                else {
                    System.out.println(cursoDesejado.getAlunos());
                }
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
