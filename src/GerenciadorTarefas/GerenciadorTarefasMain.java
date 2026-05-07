package GerenciadorTarefas;

import java.util.Scanner;

public class GerenciadorTarefasMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        boolean rodando = true;

        while (rodando) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarTarefa(descricao);
                    break;

                case 2:
                    gerenciador.listarTodas();
                    break;

                case 3:
                    gerenciador.listarPendentes();
                    break;

                case 4:
                    gerenciador.listarConcluidas();
                    break;

                case 5:
                    System.out.println("Digite o ID da tarefa para concluir: ");
                    int idConcluir = scanner.nextInt();
                    scanner.nextLine();
                    gerenciador.concluirTarefa(idConcluir);
                break;

                case 6:
                    System.out.println("Digite o ID da tarefa a deletar: ");
                    int idDeletar = scanner.nextInt();
                    scanner.nextLine();
                    gerenciador.deletarTarefas(idDeletar);
                    break;

                case 7:
                    rodando = false;
                    System.out.println("Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("\n===== GERENCIADOR DE TAREFAS =====");
        System.out.println("1. Adicionar tarefa");
        System.out.println("2. Listar todas as tarefas");
        System.out.println("3. Listar tarefas pendentes");
        System.out.println("4. Listar tarefas concluídas");
        System.out.println("5. Marcar tarefa como concluída");
        System.out.println("6. Deletar tarefa");
        System.out.println("7. Sair");
        System.out.println("==================================");
        System.out.println("Escolha uma opção: ");
    }
}
