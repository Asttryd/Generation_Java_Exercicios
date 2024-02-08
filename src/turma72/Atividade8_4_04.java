package turma72;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade8_4_04 {

	public static void main(String[] args) {
		// Leia quatro valores float (n1, n2, n3, n4)
		//A seguir, calcule e mostre a diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4.
		Scanner leia = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.0");
		
		float n1;
		float n2;
		float n3;
		float n4;
		float resultado;
		
		System.out.println("\nPor favor, digite o primeiro número (float): ");
		n1 = leia.nextFloat();
		
		System.out.println("\nPor favor, digite o segundo número (float): ");
		n2 = leia.nextFloat();
		
		System.out.println("\nPor favor, digite o terceiro número (float): ");
		n3 = leia.nextFloat();
		
		System.out.println("\nPor favor, digite o quarto número (float): ");
		n4 = leia.nextFloat();
		
		resultado = (n1 * n2) - (n3 * n4);
		
		System.out.println("\nA diferença do produto entre o n1 e n2 pelo produto entre o n3 e n4 é: " + deci.format(resultado));
		
		leia.close();
	}

}
