public class For {
    public static void main(String[] args) {
        // estrutura for - laço de repetição
        var scanner = new java.util.Scanner(System.in);

        for (;;) {
            System.out.println("Digite um nome ou exit pra sair:  ");
            var name = scanner.next();

            if(name.equalsIgnoreCase("exit")) break;

            System.out.println(name);
        }

        // for com contador
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
        System.out.println(i);
        }
    }

}
