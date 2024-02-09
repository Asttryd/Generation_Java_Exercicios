package turma72.atividadesDia10;

import java.util.Scanner;

public class Atividade10_2_03_LoopDoWhile {

	public static void main(String[] args) {
		//Leia números inteiros via teclado, até que o número zero seja digitado
		//Mostre na tela a soma de todos os números digitados que sejam positivos
		Scanner leia = new Scanner(System.in);
		int num;
		int soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if(num >= 0) {
				soma = num + soma;
			}
		} while(num > 0 || num < 0);
		
		System.out.println("A soma de números positivos é " + soma);

		leia.close();
	}

}
