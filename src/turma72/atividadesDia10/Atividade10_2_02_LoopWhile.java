package turma72.atividadesDia10;

import java.util.Scanner;

public class Atividade10_2_02_LoopWhile {

	public static void main(String[] args) {
		// Escreva um algoritmo que leia a idade de várias pessoas (NUMEROS INTEIROS)
		// Mostre na tela o total de pessoas com menos de 21 anos e total com mais de 50 anos
		//A leitura dos dados deve ser finalizada ao digitar uma idade negativa
		Scanner leia = new Scanner(System.in);
		
		int idade;
		int qtdMenor21 = 0;
		int qtdMaior50 = 0;
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while (idade >= 0) {
			if (idade < 22) {
				qtdMenor21++;
			}
			if (idade > 50) {
				qtdMaior50++;
			}
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + qtdMenor21);
		System.out.println("Total de pessoas maiores de 50 anos: " + qtdMaior50);
		
		leia.close();
	}

}
