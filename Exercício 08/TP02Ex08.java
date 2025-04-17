// CTBLPR1 (Java) – ADS 371
// Dupla: Gustavo Murai e Igor Murai

/*
Enunciado:
TP02Ex08 - Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4.
Após a digitação dos valores, solicitar uma constante multiplicativa, que deverá multiplicar cada valor da matriz
e armazenar o resultado em outra matriz de mesma ordem, nas posições correspondentes.
Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por colunas.
*/

import java.util.Scanner;

public class TP02Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Criando as duas matrizes 3x4
        int[][] matrizOriginal = new int[3][4];
        int[][] matrizResultado = new int[3][4];

        // Entrada dos valores para a matriz original
        System.out.println("Digite os 12 valores para a matriz 3x4:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matrizOriginal[i][j] = input.nextInt();
            }
        }

        // Solicitar a constante multiplicativa
        System.out.print("Digite a constante multiplicativa: ");
        int constante = input.nextInt();

        // Multiplicar cada valor da matriz original pela constante e armazenar na matriz resultado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrizResultado[i][j] = matrizOriginal[i][j] * constante;  // Multiplicação do valor atual pela constante
            }
        }

        // Exibindo a matriz original
        System.out.println("\nMatriz Original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizOriginal[i][j] + " ");
            }
            System.out.println(); // Quebra de linha para cada linha da matriz
        }

        // Exibindo a matriz resultado após multiplicação
        System.out.println("\nMatriz Resultado após multiplicação:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println(); // Quebra de linha para cada linha da matriz
        }

        input.close();
    }
}
