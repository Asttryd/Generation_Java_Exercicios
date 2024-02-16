package turma72.atividadesDia12;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionArrayList {

	public static void main(String[] args) {
		 // Criar uma ArrayList de Objetos da Classe Wrapper Integer
        ArrayList<Integer> numeros = new ArrayList<>(10);

        // Inicializar a ArrayList com 10 valores inteiros
        for (int i = 1; i <= 10; i++) {
            numeros.add(i * 2);
        }

        // Exibir a ArrayList inicial
        System.out.println("ArrayList inicial: " + numeros);

        // Solicitar ao usuário que digite um número inteiro
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numeroDigitado = scanner.nextInt();

        // Verificar se o número está na ArrayList e exibir a posição ou mensagem
        if (numeros.contains(numeroDigitado)) {
            int posicao = numeros.indexOf(numeroDigitado);
            System.out.println("O número " + numeroDigitado + " foi encontrado na posição " + posicao);
        } else {
            System.out.println("O número " + numeroDigitado + " não foi encontrado!");
        }

        scanner.close();

	}

}
