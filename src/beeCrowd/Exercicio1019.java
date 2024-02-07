package beeCrowd;

import java.util.Scanner;

public class Exercicio1019 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valor, horas, minutos, segundos;
		valor = leia.nextInt();
		
		horas = valor / 3600;
		minutos = ((valor % 3600)/60);
		segundos = valor % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		

	}

}
