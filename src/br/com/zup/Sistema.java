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

    }


    public static void executar() {
        Scanner input = new Scanner(System.in);

        char resposta = 'N';

        int diaMatricula;

        exibirMenu();
        System.out.print("Você gostaria de agendar sua matrícula? [s/n]  ");
        resposta = input.nextLine().charAt(0);



    }

}
