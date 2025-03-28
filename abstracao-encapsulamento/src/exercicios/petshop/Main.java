package exercicios.petshop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        // elaboração do menu interativo
        int option;
        String name = "";
        Pet pet1 = new Pet("Vermelho");
        PetMachine petMachine = new PetMachine(pet1);

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
            scanner.nextLine();
            

            switch (option) {
                case 1: {
                    petMachine.takeAShower();
                    break;
                }

                case 2: {
                    petMachine.addWater();
                    break;
                }

                case 3: {
                    petMachine.addShampoo();
                    break;
                }

                case 4: {
                    System.out.println("A máquina tem " + petMachine.getWater() + " litros de água.");
                    break;
                }

                case 5: {
                    System.out.println("A máquina tem " + petMachine.getShampoo() + " litros de shampoo.");
                    break;
                }

                case 6: {
                    if (petMachine.hasPet()) {
                        System.out.println("Tem um Pet na máquina.");
                    } else {
                        System.out.println("não tem Pet algum na máquina");
                    }
                    break;
                }
                
                case 7: { //Colocar o Pet na máquina
                    while (name == null || name.isEmpty()) {
                        System.out.println("Digite o nome do Pet: ");
                        name = scanner.nextLine();
                    }

                    var pet = new Pet(name);
                    petMachine.setPet(pet);
                    break;
                }

                case 8: {
                    petMachine.removePet();
                    break;
                }

                case 9: {
                    petMachine.wash();
                    break;
                }

                case 0: {
                    System.out.println("Saindo do programa...");
                    break;
                }

                default: {
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
                }
            }
            
        } while (option != 0);

        scanner.close();

    }

}
