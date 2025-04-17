// CTBLPR1 (Java) – ADS 371
// Dupla: Gustavo Murai e Igor Murai

/*
Enunciado:
TP02Ex07 - Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4.
Após a digitação dos valores, solicitar uma constante multiplicativa, que deverá multiplicar cada valor da matriz
e armazenar o resultado na própria matriz, nas posições correspondentes.
*/

import java.util.Scanner;

public class TP02Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Criando a matriz 3x4
        int[][] matriz = new int[3][4];

        // Entrada dos valores para a matriz
        System.out.println("Digite os 12 valores para a matriz 3x4:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Solicitar a constante multiplicativa
        System.out.print("Digite a constante multiplicativa: ");
        int constante = input.nextInt();

        // Multiplicar cada valor da matriz pela constante
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] *= constante;  // Multiplicação do valor atual pela constante
            }
        }

        // Exibindo a matriz após a multiplicação
        System.out.println("\nMatriz após multiplicação:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();  // Quebra de linha para cada linha da matriz
        }

        input.close();
    }
}
