package turma72.atividadesDia12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DataStrutQeue {
    public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarCliente(filaClientes, scanner);
                    break;
                case 2:
                    listarClientes(filaClientes);
                    break;
                case 3:
                    chamarCliente(filaClientes);
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
        System.out.println("1: Adicionar Cliente na fila");
        System.out.println("2: Listar Clientes na fila");
        System.out.println("3: Chamar (retirar) um Cliente da fila");
        System.out.println("0: Sair");
    }

    private static void adicionarCliente(Queue<String> filaClientes, Scanner scanner) {
        System.out.print("Digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        filaClientes.add(nomeCliente);
        System.out.println("Cliente " + nomeCliente + " adicionado à fila.");
    }

    private static void listarClientes(Queue<String> filaClientes) {
        if (filaClientes.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Clientes na fila: " + filaClientes);
        }
    }

    private static void chamarCliente(Queue<String> filaClientes) {
        if (filaClientes.isEmpty()) {
            System.out.println("A fila está vazia. Não é possível chamar um Cliente.");
        } else {
            String clienteChamado = filaClientes.poll();
            System.out.println("Cliente " + clienteChamado + " chamado e removido da fila.");
        }
    }
}
