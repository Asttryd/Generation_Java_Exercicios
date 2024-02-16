package turma72.atividadesDia12;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		// Criar um Set de Objetos da Classe Wrapper Integer
        Set<Integer> numeros = new HashSet<>();

        // Inicializar o Set com 10 valores inteiros
        for (int i = 1; i <= 10; i++) {
            numeros.add(i * 2);
        }

        // Exibir o Set inicial
        System.out.println("Set inicial: " + numeros);

        // Solicitar ao usuário que digite um número inteiro
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numeroDigitado = scanner.nextInt();

        // Verificar se o número está no Set e exibir a mensagem correspondente
        if (numeros.contains(numeroDigitado)) {
            System.out.println("Número " + numeroDigitado + " Encontrado!");
        } else {
            System.out.println("O número " + numeroDigitado + " não foi encontrado!");
        }

        scanner.close();

	}

}
