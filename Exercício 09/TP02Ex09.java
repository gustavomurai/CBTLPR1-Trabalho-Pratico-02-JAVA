// CTBLPR1 (Java) – ADS 371
// Dupla: Gustavo Murai e Igor Murai

/*
Enunciado:
TP02Ex09 - Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática.
Após a digitação dos elementos, calcular e exibir a matriz transposta.
*/

import java.util.Scanner;

public class TP02Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar as dimensões da matriz
        System.out.print("Digite o número de linhas (M) da matriz (máximo 10): ");
        int M = input.nextInt();
        System.out.print("Digite o número de colunas (N) da matriz (máximo 10): ");
        int N = input.nextInt();

        // Validar as dimensões
        if (M < 1 || M > 10 || N < 1 || N > 10) {
            System.out.println("As dimensões da matriz devem ser entre 1 e 10.");
            return;
        }

        // Criar a matriz original
        int[][] matriz = new int[M][N];

        // Entrada dos valores para a matriz
        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Criar a matriz transposta
        int[][] matrizTransposta = new int[N][M];

        // Preencher a matriz transposta
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        // Exibir a matriz original
        System.out.println("\nMatriz Original:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Quebra de linha para cada linha da matriz
        }

        // Exibir a matriz transposta
        System.out.println("\nMatriz Transposta:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println(); // Quebra de linha para cada linha da matriz transposta
        }

        input.close();
    }
}
