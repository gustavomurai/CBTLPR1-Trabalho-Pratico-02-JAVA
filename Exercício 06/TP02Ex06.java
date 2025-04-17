// CTBLPR1 (Java) – ADS 371
// Dupla: Gustavo Murai e Igor Murai

/*
Enunciado:
TP02Ex06 - Armazenar seis nomes em uma matriz de ordem 2x3.
Apresentar os nomes na tela.
*/

import java.util.Scanner;

public class TP02Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Criando a matriz 2x3 para armazenar nomes
        String[][] matriz = new String[2][3];

        // Entrada de dados na matriz
        System.out.println("Digite os 6 nomes para a matriz 2x3:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextLine();  // Captura os nomes
            }
        }

        // Exibindo os valores da matriz
        System.out.println("\nNomes armazenados na matriz 2x3:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Quebra de linha para cada linha da matriz
        }

        input.close();
    }
}
