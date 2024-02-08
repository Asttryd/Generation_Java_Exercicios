package turma72;

import java.util.Scanner;

public class Atividade9_3_04_switch_case {

	public static void main(String[] args) {
		// Simule uma calculadora simples
		// Deverá ter 2 números float: numero1 e numero2, ler o código da operação matemática (NÚMERO INTEIRO DE 1 A 4)
		// Mostre na tela o resultado da operação entre os 2 números
		// Caso a operação seja diferente do intervalo de 1 a 4, mostre a mensagem "OPERAÇÃO INVÁLIDA"!
		// 1 - SOMA  2 - SUBTRAÇÃO  3 - MULTIPLICAÇÃO  4 - DIVISÃO
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		float numero1;
		float numero2;
		float adicao;
		float subtracao;
		float multiplicacao;
		float divisao;
		
		System.out.println("###################### CALCULADORA ######################");
		System.out.println("Escolha a operação que deseja efetuar: \n1- Soma");
		System.out.println("\n2- Subtração");
		System.out.println("\n3- Multiplicação");
		System.out.println("\n4- Divisão");
		opcao = leia.nextInt();
		
		System.out.println("\nDigite o primeiro número: ");
		numero1 = leia.nextFloat();
		
		System.out.println("\nDigite o segundo número: ");
		numero2 = leia.nextFloat();
		
		switch(opcao) {
		case 1:
			adicao = numero1 + numero2;
			System.out.println("A soma dos números é: " + adicao);
			break;
			
		case 2:
			subtracao = numero1 - numero2;
			System.out.println("A subtração dos números é: " + subtracao);
			break;
			
		case 3:
			multiplicacao = numero1 * numero2;
			System.out.println("A  dos números é: " + multiplicacao);
			break;
			
		case 4:
			divisao = numero1 / numero2;
			System.out.println("A soma dos números é: " + divisao);
			break;
		}
		
		
		leia.close();
	}

}
