package turma72.atividadesDia09;

import java.util.Scanner;

public class Atividade9_3_02_if_else {

	public static void main(String[] args) {
		// Para doar sangue, é necessário:
		//TER ENTRE 18 E 69 anos de idade
		//Pessoas com idade entre 60 e 69 anos só podem doar se não for a sua primeira doação
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
		boolean primeiraDoacao;

		
		System.out.println("\nDigite o nome do doador (String): ");
		nome = leia.nextLine();
		
		System.out.println("\nDigite a idade do doador (Inteiro): ");
		idade = leia.nextInt();
		
		System.out.println("\nPrimeira doação de sangue? (Boolean): ");
		primeiraDoacao = leia.nextBoolean();
		
		if (idade >= 60 && idade <= 69) {
			if (primeiraDoacao == true) {
				System.out.println(nome + " não está apto(a/e) para doar sangue!");
			}
			else {
				System.out.println(nome + " está apto(a/e) para doar sangue!");
			}
		}
		else if (idade >= 18 && idade <= 59) {
			System.out.println(nome + " está apto(a/e) para doar sangue!");
		}
		else {
			System.out.println(nome + " não está apto(a/e) para doar sangue!");
		}
		
		leia.close();
	}

}
