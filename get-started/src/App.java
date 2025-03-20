import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

/* JAVA DOC
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        // como comentar - meu comentário - aula 01
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, informe o seu nome:");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();

        System.out.println("Olá, " + name + " você tem " + age + " anos.");
        System.out.println("");

        // declarando constantes
        final int NUMBER = 10;
        System.out.println("Olá, a constante é: " + NUMBER);
        System.out.println("");

        // aula 02 - Keywords e tipos primitivos
        byte number = 1;
        short number2 = 1;
        int number3 = 1;
        long number4 = 1L;
        float number5 = 1.0f;
        double number6 = 1.0;
        char character = 'A';
        var character2 = 'B';
        boolean condition = true;

        // Aula 03 - Operdaores de Atribuição e Lógicos
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
