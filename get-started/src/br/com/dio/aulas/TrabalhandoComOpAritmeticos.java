package br.com.dio.aulas;

import java.util.Scanner;

public class TrabalhandoComOpAritmeticos {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        var value1 = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        var value2 = scanner.nextInt();
        var sum = value1 + value2;
        var sub = value1 - value2;

        System.out.printf("%s + %s = %s%n", value1, value2, sum);
        System.out.printf("%s - %s = %s%n", value1, value2, sub);

        //divisão float
        var div = (float) value1 / value2;
        System.out.printf("%s / %s = %s%n", value1, value2, div);

        //divisão inteira
        var divInt = value1 / value2;
        System.out.printf("%s %% %s = %s%n", value1, value2, divInt);

        // raiz quadrada
        var raiz = Math.sqrt(value1);
        System.out.printf("A raiz quadrada de %s é %s%n", value1, raiz);

        // potencia
        var potencia = Math.pow(value1, 2);
        System.out.printf("%s elevado a 2 é %s%n", value1, potencia);

        //incremento ++
        var incremento = value1++;
        System.out.printf("O incremento de %s é %s%n", value1, incremento);
        
        
        
    }

}
