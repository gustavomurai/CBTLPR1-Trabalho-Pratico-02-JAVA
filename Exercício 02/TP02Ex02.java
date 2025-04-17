// CTBLPR1 (Java) – ADS 371
// Dupla: Gustavo Murai e Igor Murai

/*
Enunciado:
TP02Ex02 - Entrar via teclado com dez valores positivos.
Consistir a digitação e enviar mensagem de erro se necessário.
Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.
*/

import java.util.Scanner;

public class TP02Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] valores = new int[10];
        int soma = 0;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            int valor;

            // Validação de número positivo
            do {
                System.out.print("Digite o " + (i + 1) + "º valor positivo: ");
                valor = input.nextInt();

                if (valor <= 0) {
                    System.out.println("Erro: o valor deve ser positivo. Tente novamente.");
                }
            } while (valor <= 0);

            valores[i] = valor;
            soma += valor;

            if (valor > maior) {
                maior = valor;
            }
        }

        double media = soma / 10.0;

        // Exibindo os resultados
        System.out.println("\nResultado:");
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média aritmética: " + media);

        input.close();
    }
}
