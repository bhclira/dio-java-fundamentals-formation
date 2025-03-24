public class WhileDoWhile {
    public static void main(String[] args) {
        // estrutura while - laço de repetição
        var scanner = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("Digite um nome ou exit pra sair:  ");
            var name = scanner.next();

            if(name.equalsIgnoreCase("exit")) break;

            System.out.println(name);
        }

        // while com contador - executa caso a condição seja atendida
        int i = 0;
        while (i <= 10) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

        // estrutura do-while - executa o  código ao menos uma vez
        do {
            System.out.println("Digite um nome ou exit pra sair:  ");
            var name = scanner.next();

            if(name.equalsIgnoreCase("exit")) break;

            System.out.println(name);
        } while (true);

        scanner.close();
    }
}
