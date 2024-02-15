package turma72.atividadesDia11;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		 // Criando uma matriz 3x3
        int[][] matriz = new int[3][3];

        // Lendo os elementos da matriz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Exibindo os elementos da Diagonal Principal
        System.out.println("\nElementos da Diagonal Principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        // Exibindo os elementos da Diagonal Secundária
        System.out.println("\n\nElementos da Diagonal Secundária:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i] + " ");
        }

        // Calculando e exibindo a soma da Diagonal Principal
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        System.out.println("\n\nSoma da Diagonal Principal: " + somaDiagonalPrincipal);

        // Calculando e exibindo a soma da Diagonal Secundária
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonalSecundaria += matriz[i][matriz.length - 1 - i];
        }
        System.out.println("Soma da Diagonal Secundária: " + somaDiagonalSecundaria);

	}

}
