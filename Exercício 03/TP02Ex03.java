// CTBLPR1 (Java) – ADS 371
// Dupla: Gustavo Murai e Igor Murai

/*
Enunciado:
TP02Ex03 - Entrar via teclado com “N” valores quaisquer.
O valor “N” (que representa a quantidade de números) será digitado, deverá ser positivo, porém menor que vinte.
Caso a quantidade não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente.

Após a digitação dos “N” valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;

Após exibir os dados, perguntar ao usuário se deseja ou não uma nova execução do programa.
Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o programa em função dessa resposta.
*/

import java.util.Scanner;

public class TP02Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char continuar;

        do {
            int n;

            // Validação da quantidade de números
            do {
                System.out.print("Digite a quantidade de valores (positivo e menor que 20): ");
                n = input.nextInt();

                if (n <= 0 || n >= 20) {
                    System.out.println("Erro: o valor deve ser positivo e menor que 20.");
                }
            } while (n <= 0 || n >= 20);

            int[] valores = new int[n];
            int soma = 0, positivos = 0, negativos = 0;
            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;

            // Entrada dos valores e análise
            for (int i = 0; i < n; i++) {
                System.out.print("Digite o " + (i + 1) + "º valor: ");
                valores[i] = input.nextInt();

                soma += valores[i];

                if (valores[i] > maior) {
                    maior = valores[i];
                }

                if (valores[i] < menor) {
                    menor = valores[i];
                }

                if (valores[i] >= 0) {
                    positivos++;
                } else {
                    negativos++;
                }
            }

            double media = soma / (double) n;
            double porcPositivos = (positivos * 100.0) / n;
            double porcNegativos = (negativos * 100.0) / n;

            // Exibindo resultados
            System.out.println("\nResultado:");
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Média aritmética: " + media);
            System.out.printf("Porcentagem de valores positivos: %.2f%%\n", porcPositivos);
            System.out.printf("Porcentagem de valores negativos: %.2f%%\n", porcNegativos);

            // Verificar se deseja nova execução
            do {
                System.out.print("\nDeseja executar novamente? (S/N): ");
                continuar = input.next().toUpperCase().charAt(0);

                if (continuar != 'S' && continuar != 'N') {
                    System.out.println("Erro: digite apenas S ou N.");
                }

            } while (continuar != 'S' && continuar != 'N');

        } while (continuar == 'S');

        System.out.println("Programa encerrado.");
        input.close();
    }
}
