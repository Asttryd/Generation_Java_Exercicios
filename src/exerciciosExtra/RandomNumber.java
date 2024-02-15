package exerciciosExtra;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random aleatorio = new Random();
		
		int numeroAleatorio = aleatorio.nextInt(0, 100);
		int numeroDigitado;
		int tentativa = 3;
		System.out.println("JOGO DA ADIVINHAÇÃO");

			
		do{
			System.out.printf("Número de tentativas: " + tentativa);
			System.out.println("\nDigite um número aleatório entre 0 a 100 (Caso deseje encerrar, digite '-1'): ");
			numeroDigitado = sc.nextInt();
			
			int resultado = Math.abs(numeroDigitado - numeroAleatorio);
			
			if (numeroDigitado == -1) {
				System.out.println("Encerrando o programa...");
			} else if (resultado >= 50) {
				System.out.println("A batata está congelada!");
			} else if (resultado >= 20 & resultado < 50) {
				System.out.println("A batata está fria.");
			} else if (resultado >= 10 & resultado < 20) {
				System.out.println("A batata está esquentando...");
			} else if (resultado >= 5 & resultado < 10) {
				System.out.println("A batata está fervendo!");
			} else if (resultado >= 1 && resultado < 5) {
				System.out.println("A batata está queimando!!");
			}
			else if (numeroDigitado == numeroAleatorio) {
				System.out.println("Você adivinhou o número corretamente! O número era: " + numeroAleatorio);
				break;
			} else {
				System.out.println("Inválido, tente novamente");
			}
			
			tentativa--;
			
			if (tentativa == 0) {
				System.out.println("Acabaram suas tentativas, você perdeu.");
				break;
			}
			
		} while (numeroDigitado != numeroAleatorio);
		
		sc.close();
	}

}
