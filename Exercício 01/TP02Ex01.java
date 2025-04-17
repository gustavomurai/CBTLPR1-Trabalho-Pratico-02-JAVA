// CTBLPR1 (Java) – ADS 371
// Dupla: Gustavo Murai e Igor Murai

/*
Enunciado:
TP02Ex01 - Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário, solicitar novamente apenas o segundo valor.
*/

import java.util.Scanner;

public class TP02Ex01 {
    public static void main(String[] args) {
        // Criando o objeto Scanner para entrada de dados
        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        // Solicita o primeiro valor
        System.out.print("Digite o primeiro valor: ");
        valor1 = input.nextInt();

        // Solicita o segundo valor com verificação
        System.out.print("Digite o segundo valor (maior que o primeiro): ");
        valor2 = input.nextInt();

        // Enquanto o segundo valor for menor ou igual ao primeiro, repete a solicitação
        while (valor2 <= valor1) {
            System.out.println("Erro: o segundo valor deve ser maior que o primeiro.");
            System.out.print("Digite o segundo valor novamente: ");
            valor2 = input.nextInt();
        }

        // Exibe os valores válidos
        System.out.println("Valores válidos informados:");
        System.out.println("Primeiro valor: " + valor1);
        System.out.println("Segundo valor: " + valor2);

        // Fecha o scanner
        input.close();
    }
}
