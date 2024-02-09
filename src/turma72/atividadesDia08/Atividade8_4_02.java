package turma72.atividadesDia08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade8_4_02 {

	public static void main(String[] args) {
		// Elabore um algoritmo em Java que leia 4 notas de um participante, em variáveis do tipo float e exiba na tela a média final do participante.
		// CALCULAR MÉDIA = (NOTA1 + NOTA2 + NOTA3 + NOTA4)/4
		Scanner leia = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.0");
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		double mediaFinal;
		
		System.out.println("\nPor favor, digite a primeira nota (float): ");
		nota1 = leia.nextFloat();
		
		System.out.println("\nPor favor, digite a segunda nota (float): ");
		nota2 = leia.nextFloat();
		
		System.out.println("\nPor favor, digite a terceira nota (float): ");
		nota3 = leia.nextFloat();
		
		System.out.println("\nPor favor, digite a quarta nota (float): ");
		nota4 = leia.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("\nSua média final, é: " + deci.format(mediaFinal));

		leia.close();
	}

}
