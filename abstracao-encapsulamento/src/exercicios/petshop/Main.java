package exercicios.petshop;

import java.util.Scanner;

public class Main {

    // scanner para ler a entrada do usuário
    private final static Scanner scanner = new Scanner(System.in);

    // instanciar petMachine
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        // elaboração do menu interativo
        var option = -1;

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
            System.out.println("9. Limpar máquina");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> petMachine.addWater();
                case 3 -> petMachine.addShampoo();
                case 4 -> System.out.println("Água disponível: " + petMachine.getWater() + " litros.");
                case 5 -> System.out.println("Shampoo disponível: " + petMachine.getShampoo() + " ml.");
                case 6 -> System.out.println("Há um pet na máquina? " + petMachine.hasPet());
                case 7 -> {
                    System.out.print("Digite o nome do pet: ");
                    String petName = scanner.nextLine();
                    petMachine.setPet(new Pet(petName));
                }
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.cleanMachine();
                case 0 -> System.out.println("Saindo do programa...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (option != 0);

        scanner.close();

    }

}
