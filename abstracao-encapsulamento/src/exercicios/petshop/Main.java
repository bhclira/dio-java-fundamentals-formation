package exercicios.petshop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        // elaboração do menu interativo
        int option;

        do {
            System.out.println("Escolha uma das opções: ");
            System.out.println("1. Dar banho no Pet");
            System.out.println("2. Adicionar água na máquina");
            System.out.println("3. Adicionar shampoo na máquina");
            System.out.println("4. Verificar água da máquina");
            System.out.println("5. Verificar shampoo da máquina");
            System.out.println("6. Verificar se tem Pet na máquina");
            System.out.println("7. Colocar o Pet na máquina");
            System.out.println("8. Retirar Pet da máquina");
            System.out.println("9.Limpar máquina");
            System.out.println("0. Sair");
            option = scanner.nextInt();
        } while (option != 0);
    }
}
