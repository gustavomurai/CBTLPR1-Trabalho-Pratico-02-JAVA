// CTBLPR1 (Java) – ADS 371
// Dupla: Gustavo Murai e Igor Murai

/*
Enunciado:
TP02Ex10 - Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x colunas).
*/

import java.util.Scanner;

public class TP02Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz quadrada (máx 10): ");
        int ordem = input.nextInt();

        if (ordem < 1 || ordem > 10) {
            System.out.println("A ordem deve estar entre 1 e 10.");
            return;
        }

        double[][] matriz = new double[ordem][ordem];
        double[][] identidade = new double[ordem][ordem];

        // Entrada de dados da matriz original
        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextDouble();

                // Inicializa a matriz identidade
                identidade[i][j] = (i == j) ? 1 : 0;
            }
        }

        // Cálculo da inversa (método Gauss-Jordan)
        for (int i = 0; i < ordem; i++) {
            double pivo = matriz[i][i];
            if (pivo == 0) {
                System.out.println("A matriz não possui inversa (divisão por zero).");
                return;
            }

            for (int j = 0; j < ordem; j++) {
                matriz[i][j] /= pivo;
                identidade[i][j] /= pivo;
            }

            for (int k = 0; k < ordem; k++) {
                if (k != i) {
                    double fator = matriz[k][i];
                    for (int j = 0; j < ordem; j++) {
                        matriz[k][j] -= fator * matriz[i][j];
                        identidade[k][j] -= fator * identidade[i][j];
                    }
                }
            }
        }

        // Exibir matriz original (agora é a identidade por conta do cálculo)
        System.out.println("\nMatriz Original transformada (deve ser identidade):");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.printf("%.2f ", matriz[i][j]);
            }
            System.out.println();
        }

        // Exibir matriz inversa
        System.out.println("\nMatriz Inversa:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.printf("%.2f ", identidade[i][j]);
            }
            System.out.println();
        }

        input.close();
    }
}
