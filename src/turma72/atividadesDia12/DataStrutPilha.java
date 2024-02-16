package turma72.atividadesDia12;
import java.util.Scanner;
import java.util.Stack;

public class DataStrutPilha {
    public static void main(String[] args) {
        Stack<String> pilhaLivros = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarLivro(pilhaLivros, scanner);
                    break;
                case 2:
                    listarLivros(pilhaLivros);
                    break;
                case 3:
                    retirarLivro(pilhaLivros);
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        // Fechar o scanner
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1: Adicionar Livro na pilha");
        System.out.println("2: Listar Livros na pilha");
        System.out.println("3: Retirar um Livro da pilha");
        System.out.println("0: Sair");
    }

    private static void adicionarLivro(Stack<String> pilhaLivros, Scanner scanner) {
        System.out.print("Digite o nome do Livro: ");
        String nomeLivro = scanner.nextLine();
        pilhaLivros.push(nomeLivro);
        System.out.println("Livro " + nomeLivro + " adicionado à pilha.");
    }

    private static void listarLivros(Stack<String> pilhaLivros) {
        if (pilhaLivros.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("Livros na pilha: " + pilhaLivros);
        }
    }

    private static void retirarLivro(Stack<String> pilhaLivros) {
        if (pilhaLivros.isEmpty()) {
            System.out.println("A pilha está vazia. Não é possível retirar um Livro.");
        } else {
            String livroRetirado = pilhaLivros.pop();
            System.out.println("Livro " + livroRetirado + " retirado da pilha.");
        }
    }
}
