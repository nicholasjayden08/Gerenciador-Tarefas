package GerenciadorTarefas;

import java.util.ArrayList;

public class GerenciadorTarefas {
    private ArrayList<Tarefa> tarefas;
    private int proximoId;

    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
        this.proximoId = 1;
    }

    public void adicionarTarefa(String descricao, String prioridade, String categoria) {

        if (!prioridade.equalsIgnoreCase("alta") &&
         !prioridade.equalsIgnoreCase("média") &&
         !prioridade.equalsIgnoreCase("baixa")) {
            System.out.println("Prioridade inválida! Use: alta, média ou baixa");
            return;
        }

        Tarefa novaTarefa = new Tarefa(descricao, proximoId, prioridade, categoria);
        tarefas.add(novaTarefa);
        proximoId++;
        System.out.println("✅ Tarefa adicionada com sucesso!");
        System.out.println("Descrição: " + descricao);
        System.out.println("Prioridade: " + prioridade);
        System.out.println("Categoria: " + categoria);
    }

    public void listarTodas() {
        if (tarefas.isEmpty()) {
            System.out.println("❌ Nenhuma tarefa adicionada!");
            return;
        }

        System.out.println("\n===== TODAS AS TAREFAS =====");
        for (Tarefa tarefa : tarefas) {
            tarefa.exibir();
        }
    }

    public void concluirTarefa(int id) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefa.concluir();
                System.out.println("✅ Tarefa concluída!");
                return;
            }
        }
        System.out.println("❌ Tarefa não encontrada!");
    }
    public void deletarTarefas(int id) {
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getId() == id) {
                tarefas.remove(i);
                System.out.println("✅ Tarefa deletada!");
                return;
            }
        }
        System.out.println("❌ Tarefa não encontrada!");
    }
    public void listarPendentes() {
        System.out.println("\n===== TAREFAS PENDENTES =====");
        boolean temPendente = false;

        for (Tarefa tarefa : tarefas) {
            if (!tarefa.isConcluida()) {
                tarefa.exibir();
                temPendente = true;
            }
        }

        if (!temPendente) {
            System.out.println("✅ Nenhuma tarefa pendente!");
        }
    }

    public void listarConcluidas() {
        System.out.println("\n===== TAREFAS CONCLUÍDAS =====");
        boolean temConcluida = false;

        for (Tarefa tarefa : tarefas) {
            if (tarefa.isConcluida()) {
                tarefa.exibir();
                temConcluida = true;
            }
        }
        if (!temConcluida) {
            System.out.println("❌ Nenhuma tarefa concluída!");
        }
    }
}
