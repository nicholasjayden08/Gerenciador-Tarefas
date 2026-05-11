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

                    System.out.println("\nEscolha a prioridade");
                    System.out.println("1. Alta");
                    System.out.println("2. Média");
                    System.out.println("3. Baixa");
                    System.out.println("Digite a opção (1-3): ");
                    int opcaoPrioridade = scanner.nextInt();
                    scanner.nextLine();

                    String prioridade;
                    switch (opcaoPrioridade) {
                        case 1:
                            prioridade = "Alta";
                            break;
                        case 2:
                            prioridade = "Média";
                            break;
                        case 3:
                            prioridade = "Baixa";
                            break;
                        default:
                            System.out.println("❌ Opção inválida");
                            prioridade = "Média";
                            break;
                    }

                    System.out.println("\nEscolha a dificuldade");
                    System.out.println("1. Alta");
                    System.out.println("2. Média");
                    System.out.println("3. Baixa");
                    System.out.println("Digite a opção (1-3): ");
                    int opcaoDificuldade = scanner.nextInt();
                    scanner.nextLine();

                    String dificuldade;
                    switch (opcaoDificuldade) {
                        case 1:
                            dificuldade = "Alta";
                            break;
                        case 2:
                            dificuldade = "Média";
                            break;
                        case 3:
                            dificuldade = "Baixa";
                            break;
                        default:
                            System.out.println("❌ Opção inválida");
                            dificuldade = "Média";
                            break;
                    }

                    System.out.println("Digite a categoria da tarefa: ");
                    String categoria = scanner.nextLine();

                    if (opcaoPrioridade >= 1 && opcaoPrioridade <= 3) {
                        gerenciador.adicionarTarefa(descricao, prioridade, categoria, dificuldade);
                    }
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
                    System.out.println("❌ Opção inválida!");
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
