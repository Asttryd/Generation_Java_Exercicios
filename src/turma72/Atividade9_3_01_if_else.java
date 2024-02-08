package turma72;

import java.util.Scanner;

public class Atividade9_3_01_if_else {

	public static void main(String[] args) {
		//Faça um algoritmo que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.
		int a;
		int b;
		int c;
		int soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nPor favor, digite o primeiro valor (inteiro): ");
		a = leia.nextInt();
		
		System.out.println("\nPor favor, digite o segundo valor (inteiro): ");
		b = leia.nextInt();
		
		System.out.println("\nPor favor, digite o terceiro valor (inteiro): ");
		c = leia.nextInt();
		
		soma = a + b;
		
		if (soma > c) {
			System.out.println("A soma de A + B é maior do que C. Resultado: " + soma);
		}
		else if (soma < c) {
			System.out.println("A soma de A + B é menor do que C. Resultado: " + soma);
		}
		else if (soma == c) {
			System.out.println("A soma de A + B é igual ao valor de C. Resultado: " + soma);
		}
		else {
			System.out.println("Inválido, tente novamente.");
		}
		
		leia.close();
	}

}
