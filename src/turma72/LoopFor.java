package turma72;

public class LoopFor {

	public static void main(String[] args) {
		//int oddsAddition = 0;
		int num1 = 2;
		int num2 = 4;
		int num3 = 6;
		int num4 = 8;
		int num5 = 11;
		int num6 = 12;
		int num7 = 14;
		int num8 = 16;
		int num9 = 19;
		int num10 = 20;
		
		int[] numeros = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};
		
		for (int i = 0; i < numeros.length; i++) {
			int numero = numeros[i];
			if(numImpar(numero)) {
				System.out.println(numero + " É ímpar");
			} else {
				System.out.println(numero + " É par");
			}
		}
		System.out.println("");

	}
	public static boolean numImpar(int numero) {
		return numero % 2 != 0;
	}

}
