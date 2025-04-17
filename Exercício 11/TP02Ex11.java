// CTBLPR1 (Java) – ADS 371
// Dupla: Gustavo Murai e Igor Murai

/*
Enunciado:
TP02Ex11 - Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática.
Após a digitação dos elementos, calcular e exibir o determinante da matriz.
*/

import java.util.Scanner;

public class TP02Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz quadrada (máx 10): ");
        int ordem = input.nextInt();

        if (ordem < 1 || ordem > 10) {
            System.out.println("A ordem deve estar entre 1 e 10.");
            return;
        }

        double[][] matriz = new double[ordem][ordem];

        // Entrada dos valores da matriz
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextDouble();
            }
        }

        double determinante = calcularDeterminante(matriz, ordem);

        System.out.printf("\nDeterminante da matriz: %.2f\n", determinante);

        input.close();
    }

    // Função para calcular determinante recursivamente (expansão por menores)
    public static double calcularDeterminante(double[][] matriz, int ordem) {
        if (ordem == 1) {
            return matriz[0][0];
        }

        if (ordem == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        }

        double det = 0;
        for (int coluna = 0; coluna < ordem; coluna++) {
            det += Math.pow(-1, coluna) * matriz[0][coluna] * calcularDeterminante(submatriz(matriz, ordem, 0, coluna), ordem - 1);
        }

        return det;
    }

    // Função auxiliar para criar a submatriz excluindo a linha e coluna
    public static double[][] submatriz(double[][] matriz, int ordem, int linhaExcluir, int colunaExcluir) {
        double[][] nova = new double[ordem - 1][ordem - 1];
        int r = 0;

        for (int i = 0; i < ordem; i++) {
            if (i == linhaExcluir) continue;

            int c = 0;
            for (int j = 0; j < ordem; j++) {
                if (j == colunaExcluir) continue;
                nova[r][c] = matriz[i][j];
                c++;
            }
            r++;
        }

        return nova;
    }
}
