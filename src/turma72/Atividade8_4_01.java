package turma72;

import java.util.Scanner;

public class Atividade8_4_01 {

	public static void main(String[] args) {
		// Dado o fluxograma, desenvolva o algoritmo abaixo na linguagem Java:
		Scanner leia = new Scanner(System.in);
		
		float salario;
		float abono;
		float novoSalario;
		
		//1. Digite o salário
		System.out.println("\nPor favor, digite seu salário (float): ");
		//2. Leia o salário
		salario = leia.nextFloat();
		
		//3. Digite o Abono
		System.out.println("\nPerfeito! Agora por favor, digite o abono (float): ");
		//4. Leia o abono
		abono = leia.nextFloat();
		
		//5. NovoSalário = Salário + Abono
		novoSalario = salario + abono;
		//6. Exibe o NovoSalário
		System.out.println("\nSeu novo salário é no valor de: " + novoSalario);
		//ENTRADA: (Salário: 10000.00) (Abono: 1000.00); SAIDA: (11000.00)
		//VARIÁVEIS DEVEM SER DO TIPO FLOAT

		leia.close();
	}

}
