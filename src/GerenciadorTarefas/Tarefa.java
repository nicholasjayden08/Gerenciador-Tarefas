package GerenciadorTarefas;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private int id;

    public Tarefa(String descricao, int id) {
        this.descricao = descricao;
        this.id = id;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }
    public boolean isConcluida() {
        return concluida;
    }
    public void concluir() {
        this.concluida = true;
    }
    public int getId() {
        return id;
    }
    public String getStatus() {
        return concluida ? "Concluída" : "Pendente...";
    }
    public void exibir() {
        System.out.println("[" + id + "] " + descricao + " - " + getStatus());
    }
}
