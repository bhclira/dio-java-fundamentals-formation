import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

/* JAVA DOC
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        // como comentar - meu comentário
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
        
    }
}
