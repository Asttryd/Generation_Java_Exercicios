package turma72;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade8_4_03 {

	public static void main(String[] args) {
		// Elabore um algoritmo que leia o salário bruto, o adicional noturno, as horas estras e os descontos de um colaborador
		//EM VARIÁVEIS DO TIPO FLOAT E EXIBA NA TELA O SALÁRIO LÍQUIDO
		Scanner leia = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;
		
		System.out.println("\nPor favor, digite seu salário bruto (float): ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("\nPor favor, digite seu adicional noturno (float): ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("\nPor favor, digite suas horas extras (float): ");
		horasExtras = leia.nextFloat();

		System.out.println("\nPor favor, digite seus descontos (float): ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("\nO seu salário líquido é: " + deci.format(salarioLiquido));

		leia.close();
	}

}
