package exercicios.petshop;

public class PetMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;

    private Pet pet;

    // construtor vazio
    public PetMachine() {

    }
    // funções do enunciado

    // 1. dar banho no pet
    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o Pet na Máquina para iniciar o banho.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;

        pet.setClean(true);
        System.out.println("O Pet " + pet.getName() + " está limpo");
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("A máquina já está no máximo de água.");
            return;
        }

        water += 2;
        System.out.println("A máquina agora tem " + water + " litros de água.");

    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("A máquina já está no máximo de shampoo.");
            return;
        }
        else {
            shampoo += 2;
            System.out.println("A máquina agora tem " + shampoo + " litros de água.");
        }


    }

    public int getShampoo() {
        return shampoo;
    }

    public void setShampoo(int shampoo) {
        this.shampoo = shampoo;
    }

    // verificar se tem um pet no banho
    public boolean hasPet() {
        return pet != null;
    }

    // a maquian deve permitir apenas um pet por vez
    //
    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina não está limpa. Para colocar um Pet é necessário limpá-la.");
            return;
        }
        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " já está na máquina.");
            return;
        }

        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }

    // retirar o pet da máquina
    public void removePet() {
        if (this.pet == null) {
            System.out.println("Não tem pet na máquina.");
            return; // interrompe a execução do método atual
        }
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " está limpo e foi tirado da máquina");
        // depois de retirado, o pet deve ser setado como null
        // para que a máquina possa receber outro pet
        this.pet = null;
    }

    public void wash() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A limpeza da máquina está completa.");
    }

    public int getWater() {
        return water;
    }

}
