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
                case 2 -> setWater(); // adicionar água na máquina
                case 3 -> setShampoo(); // adicionar shampoo na máquina
                case 4 -> verifyWater(); // verificar a água na máquina
                case 5 -> verifyShampoo(); // verificar o shampoo na máquina                        
                case 6 -> checkIfHasPetInMachine(); // verificar se tem pet na máquina
                case 7 -> setPetInPetMachine(); // verificar se existe pet na máquina e colocar o pet na máquina
                case 8 -> petMachine.removePet(); // retirar o pet da máquina
                case 9 -> petMachine.wash(); // limpar a máquina

            }
        } while (option != 0);

    }
    // MÉTODOS
    // 2. método para adicionar shampoo na máquina
    public static void setWater() {
        System.out.println("Adicionando água na máquina...");
        petMachine.addWater();
    }
    // 3. método para adicionar água na máquina
    public static void setShampoo() {
        System.out.println("Adicionando água na máquina...");
        petMachine.addShampoo();
    }
    // 4. método para verificar o shampoo na máquina
    public static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A máquina tem " + amount + " litro(s) de água.");
    }
    // 5. método para verificar o shampoo na máquina
    public static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquina tem " + amount + " litro(s) de shampoo.");
    }

    // 6. método para verificar se tem pet na máquina
    public static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        // verificar se tem pet na máquina e imprimir o nome do pet
        System.out.println(hasPet ? "Tem pet na máquina." : "Não tem pet na máquina.");
    }

    // 7. método para criar o pet e colocá-lo em seguida
    public static void setPetInPetMachine() {
        
        var name = "";
        // verificar se o nome do pet é vazio ou nulo
        while (name == null || name.isEmpty()) {
            //trava o usuário enquanto ele nao passar o nome do Pet
            System.out.println("Digite o nome do pet: ");
            name = scanner.nextLine();
        }
        // uma vez setado o nome do pet com o nome passado pelo usuário, ele é instanciado e colocado na máquina
        var pet = new Pet(name);
        // agora que o pet foi instanciado, ele é colocado na máquina
        // e o nome do pet é setado na máquina
        petMachine.setPet(pet);
        // mensagem de retorno para o usuário
        // o nome do pet é passado para a máquina e o pet é colocado na máquina
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }

    public void getPetFromMachine () {
        
    }

}
