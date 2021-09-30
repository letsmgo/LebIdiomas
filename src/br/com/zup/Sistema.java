package br.com.zup;

import java.util.Scanner;

public class Sistema {

    public static void exibirMenu() {
        System.out.println("-----------------------------------");
        System.out.println("|  Digite 1 para exibir catálogo  |");
        System.out.println("|  Digite 2 para escolher curso   |");
        System.out.println("|  Digite 3 para se cadastrar     |");
        System.out.println("|  Digite 4 para sair             |");
        System.out.println("-----------------------------------");
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
        System.out.println("|  Digite 1 para saber mais sobre nosso curso de INGLêS    |");
        System.out.println("|  Digite 2 para saber mais sobre nosso curso de FRANCÊS   |");
        System.out.println("|  Digite 3 para saber mais sobre nosso curso de ESPANHOL  |");
        System.out.println("------------------------------------------------------------");
    }


    public static void executar() {
        Scanner input = new Scanner(System.in);
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

                if (opcaoDesejada == 1) {
                    System.out.println(ingles);
                }
                else if (opcaoDesejada == 2) {
                    System.out.println(frances);
                }
                else if (opcaoDesejada == 3) {
                    System.out.println(espanhol);
                }
                else {
                    System.out.println("Opção inválida!");
                }
            }
            else if (opcaoDesejada == 3) {

            } else if (opcaoDesejada == 4) {
                finalizar = true;
                System.out.println("Até breve");
            }
            else {
                System.out.println("Opção inválida!");
            }
        }



    }

}
