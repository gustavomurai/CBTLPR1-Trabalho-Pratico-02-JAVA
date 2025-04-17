// CTBLPR1 (Java) – ADS 371
// Dupla: Gustavo Murai e Igor Murai

/*
Enunciado:
TP02Ex05 - Armazenar seis valores em uma matriz de ordem 3x2.
Apresentar os valores na tela.
*/

import java.util.Scanner;

public class TP02Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Criando a matriz 3x2
        int[][] matriz = new int[3][2];

        // Entrada de dados na matriz
        System.out.println("Digite os 6 valores para a matriz 3x2:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Exibindo os valores da matriz
        System.out.println("\nValores da matriz 3x2:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Quebra de linha para cada linha da matriz
        }

        input.close();
    }
}
