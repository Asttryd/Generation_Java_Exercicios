package turma72;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade9_3_03_switch_case {

	public static void main(String[] args) {
		//Com base na tela, escreva um algoritmo que leia o código de um item (NÚMERO INTEIRO DE 1 A 6)
		//E a quantidade comprada deste item (NÚMERO INTEIRO).
		//Mostre na tela o valor total da conta e o nome do produto que foi comprado
		Scanner leia = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		int item;
		int qtd;
		int valorTotal;
		
		System.out.println("###################### LANCHONETE ######################");
		System.out.println("Digite o número do produto que deseja comprar: \n1- Cachorro Quente      R$10,00");
		System.out.println("\n2- X-Salada             R$15,00");
		System.out.println("\n3- X-Bacon              R$18,00");
		System.out.println("\n4- Bauru                R$12,00");
		System.out.println("\n5- Refrigerante          R$8,00");
		System.out.println("\n6- Suco de laranja      R$13,00");
		item = leia.nextInt();
		
		switch (item) {
		case 1:
			System.out.println("\nDigite a quantidade que deseja comprar: ");
			qtd = leia.nextInt();
			valorTotal = 10 * qtd;
			System.out.println("\nProduto: Cachorro quente\nValor total: R$" + deci.format(valorTotal));
			break;
			
			
		case 2:
			System.out.println("\nDigite a quantidade que deseja comprar: ");
			qtd = leia.nextInt();
			valorTotal = 15 * qtd;
			System.out.println("\nProduto: X-Salada\nValor total: R$" + deci.format(valorTotal));
			break;
			
			
		case 3:
			System.out.println("\nDigite a quantidade que deseja comprar: ");
			qtd = leia.nextInt();
			valorTotal = 18 * qtd;
			System.out.println("\nProduto: X-Bacon\nValor total: R$" + deci.format(valorTotal));
			break;
			
			
		case 4:
			System.out.println("\nDigite a quantidade que deseja comprar: ");
			qtd = leia.nextInt();
			valorTotal = 12 * qtd;
			System.out.println("\nProduto: Bauru\nValor total: R$" + deci.format(valorTotal));
			break;
			
			
		case 5:
			System.out.println("\nDigite a quantidade que deseja comprar: ");
			qtd = leia.nextInt();
			valorTotal = 8 * qtd;
			System.out.println("\nProduto: Refrigerante\nValor total: R$" + deci.format(valorTotal));
			break;
			
			
		case 6:
			System.out.println("\nDigite a quantidade que deseja comprar: ");
			qtd = leia.nextInt();
			valorTotal = 13 * qtd;
			System.out.println("\nProduto: Suco de laranja\nValor total: R$" + deci.format(valorTotal));
			break;
			
			
			default:
				System.out.println("Opção invaida: não há opção para o número desejado.");
		}
		
		leia.close();
	}

}
