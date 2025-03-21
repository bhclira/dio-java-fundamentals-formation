package br.com.dio.aulas;

public class TrabalhandoOpBiWise {
    public static void main(String[] args) {
        int a = 3; // 00000011 em binário
        int b = 2; // 00000010 em binário
        int c = 1; // 00000001 em binário

        // Operação AND bit a bit: compara cada bit de 'a' e 'b'.
        // O resultado é 1 apenas se ambos os bits forem 1.
        // Exemplo: a = 00000011 (3), b = 00000010 (2), resultado = 00000010 (2).
        int d = a & b; // 00000010

        // Operação OR bit a bit: compara cada bit de 'a' e 'b'.
        // O resultado é 1 se pelo menos um dos bits for 1.
        // Exemplo: a = 00000011 (3), b = 00000010 (2), resultado = 00000011 (3).
        int e = a | b; // 00000011

        // Operação XOR bit a bit: compara cada bit de 'a' e 'b'.
        // O resultado é 1 se os bits forem diferentes.
        // Exemplo: a = 00000011 (3), b = 00000010 (2), resultado = 00000001 (1).
        int f = a ^ b; // 00000001

        // Operação NOT bit a bit: inverte todos os bits de 'a'.
        // Exemplo: a = 00000011 (3), resultado = 11111100 (-4 em complemento de dois).
        int g = ~a; // 11111100

        // Operação de deslocamento à esquerda (shift left):
        // Desloca os bits de 'a' uma posição para a esquerda, preenchendo com 0 à
        // direita.
        // Exemplo: a = 00000011 (3), resultado = 00000110 (6).
        int h = a << 1; // 00000110

        // Operação de deslocamento à direita (shift right):
        // Desloca os bits de 'a' uma posição para a direita.
        // O bit mais significativo (à esquerda) depende do sinal.
        // Exemplo: a = 00000011 (3), resultado = 00000001 (1).
        int i = a >> 1; // 00000001

        // Exibe os resultados das operações
        System.out.println("a & b = " + d); // Resultado da operação AND
        System.out.println("a | b = " + e); // Resultado da operação OR
        System.out.println("a ^ b = " + f); // Resultado da operação XOR
        System.out.println("~a = " + g); // Resultado da operação NOT
        System.out.println("a << 1 = " + h); // Resultado do deslocamento à esquerda
        System.out.println("a >> 1 = " + i); // Resultado do deslocamento à direita
    }
}
