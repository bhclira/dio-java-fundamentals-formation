package br.com.dio.aulas;

import java.util.Scanner;

public class TrabalhandoComOpDeAtribuicaoAndLogicos {
    public static void main(String[] args) {
        // Aula 03 - Operdaores de Atribuição e Lógicos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2: ");
        var result = scanner.nextInt();
        var isRight = result == 4;
        System.out.printf("O resultado é 4, você acertou? (%s)", isRight);

        System.out.println("Você pode dirigir: ");
        var age1 = scanner.nextInt();
        var canDrive = age1 >= 18;
        System.out.printf("O resultado é 4, você acertou? (%s)", canDrive);

        System.out.println("Voce é emancipado? ");
        var isEmanciped = scanner.nextBoolean();
        var canDrive2 = isEmanciped || age1 >=18;
        System.out.printf("Você pode dirigir? (%s)", canDrive2);
        var canDrive3 = isEmanciped && age1 >= 16;
        System.out.printf("Você pode dirigir? (%s)", canDrive3);
    }

}
