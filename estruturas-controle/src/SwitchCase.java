
public class SwitchCase {
public static void main(String[] args) {
    // estrutura switch-case
    var scanner = new java.util.Scanner(System.in);

    System.out.println("Informe um número de 1 a 7:");
    var option = scanner.nextInt();
    
    switch(option) {
        case 1:
            System.out.println("Domingo");
            break;
        case 2:
            System.out.println("Segunda");
            break;
        case 3:
            System.out.println("Terça");
            break;
        case 4:
            System.out.println("Quarta");
            break;
        case 5:
            System.out.println("Quinta");
            break;
        case 6:
            System.out.println("Sexta");
            break;
        case 7:
            System.out.println("Sábado");
            break;
        default:
            System.out.println("Opção inválida");
    }

    // outra forma de switch com -> nao precisa de break
    switch(option) {
        case 1, 7 -> System.out.println("Fim de semana");
        case 2 -> System.out.println("Segunda");
        case 3 -> System.out.println("Terça");
        case 4 -> System.out.println("Quarta");
        case 5 -> System.out.println("Quinta");
        case 6 -> System.out.println("Sexta");
        default -> System.out.println("Opção inválida");
    }

}

}
