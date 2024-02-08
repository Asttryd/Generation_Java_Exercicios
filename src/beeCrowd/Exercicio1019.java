package beeCrowd;

import java.util.Scanner;

public class Exercicio1019 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int valor, hrs, min, sg;
		valor = leia.nextInt();
		
		hrs = valor / 3600;
		min = ((valor % 3600)/60);
		sg = valor % 60;
		
		System.out.println(hrs + ":" + min + ":" + sg);

		leia.close();
	}

}
