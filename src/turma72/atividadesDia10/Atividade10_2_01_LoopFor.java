package turma72.atividadesDia10;

import java.util.Scanner;

public class Atividade10_2_01_LoopFor {

	public static void main(String[] args) {
		//Escreva um algoritmo que leia 10 números inteiros via teclado
		//Mostre na tela quantos números são pares e quantos números são ímpares
		Scanner leia = new Scanner(System.in);
		int num;
		int numImpar = 0;
		int numPar = 0;
		
		for(int i = 1; i < 11; i++) {
			System.out.println("Digite o " + i + "º número: ");
			num = leia.nextInt();
			
			if (num % 2 != 0) {
				numImpar++;
			} else if (num % 2 == 0){
				numPar++;
			}
		}
		
		System.out.println("Total de números pares: " + numPar);
		System.out.println("Total de números ímpares: " + numImpar);
		
		leia.close();
	}

}
