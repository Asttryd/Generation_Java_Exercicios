package turma72;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String continua = "s";
		int numero1, numero2, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		while(continua.equals("s")) {
			System.out.println("\n+++++++++++++ MENU +++++++++++++");
			System.out.println("Deseja somar dois valores?");
			System.out.println("Digite s para sim OU digite n para não: ");
			continua = leia.next();
			System.out.println("Digite o primeiro valor: ");
			numero1 = leia.nextInt();
			
			System.out.println("Digite segundo valor: ");
			numero2 = leia.nextInt();
			
			resultado = numero1 + numero2;
			
			System.out.println("O resultado da soma é: " + resultado);
			
			
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
			
			leia.close();
		}
	}

}
