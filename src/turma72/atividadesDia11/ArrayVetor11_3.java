package turma72.atividadesDia11;
import java.util.Scanner;

public class ArrayVetor11_3 {

	public static void main(String[] args) {
		        // Definindo o vetor de números inteiros
		        int[] vetor = {12, 34, 56, 78, 90, 23, 45, 67, 89, 10};

		        // Pedindo ao usuário para inserir um número
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite um número para pesquisar: ");
		        int numero = scanner.nextInt();

		        // Chamando o método para pesquisar o número no vetor
		        int posicao = pesquisarNumero(vetor, numero);

		        // Exibindo o resultado
		        if (posicao != -1) {
		            System.out.println("O número " + numero + " foi encontrado na posição " + posicao + " do vetor.");
		        } else {
		            System.out.println("Não foi encontrado!");
		        }
		    }

		    // Método para pesquisar o número no vetor
		    public static int pesquisarNumero(int[] vetor, int numero) {
		        for (int i = 0; i < vetor.length; i++) {
		            if (vetor[i] == numero) {
		                return i; // Retorna a posição se o número for encontrado
		            }
		        }
		        return -1; // Retorna -1 se o número não for encontrado
		    }
}
