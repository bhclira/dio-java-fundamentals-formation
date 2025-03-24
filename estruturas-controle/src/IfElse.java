// importe a biblioteca scanner
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) throws Exception {
        //estrutura if-else
        var scanner = new Scanner (System.in);

        System.out.println("Informe seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n): ");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        if (age >= 18) {
            System.out.printf("%s, você tem %s anos, você pode dirigir %n",name, age);
        } else if (age >= 16 && isEmancipated) {
            System.out.printf("%s, apesar de você ter %s anos, você é emancipado e pode dirigir %n", name, age);
        } else {
            System.out.printf("%s, você tem %s anos, você não pode dirigir %n", name, age);
        }
        scanner.close();
        System.out.println("Fim de execução");
    }
}
        

