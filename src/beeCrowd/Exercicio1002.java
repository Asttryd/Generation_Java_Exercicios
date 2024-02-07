package beeCrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1002 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.0000");
		
        double area, raio;
        
        raio = leia.nextDouble();
        
        area = 3.14159 * Math.pow(raio, 2);
        
        System.out.println("A="+ deci.format(area));
	}

}
