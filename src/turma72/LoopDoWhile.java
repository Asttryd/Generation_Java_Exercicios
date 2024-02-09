package turma72;

import java.util.Scanner;

public class LoopDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, resultado, contador = 0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número Inteiro: ");
			numero = leia.nextInt();
			
			resultado = numero * 5;
			System.out.println("\n O resultado da multiplicação é: " + resultado);
			contador++;
		} while (contador < 3);
		
		leia.close();
	}

}
