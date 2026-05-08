package GerenciadorTarefas;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private int id;
    private String prioridade;
    private String categoria;

    public Tarefa(String descricao, int id, String prioridade, String categoria) {
        this.descricao = descricao;
        this.id = id;
        this.concluida = false;
        this.prioridade = prioridade;
        this.categoria = categoria;
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
    public String getPrioridade() {
        return prioridade;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getStatus() {
        return concluida ? "Concluída" : "Pendente...";
    }
    public void exibir() {
        System.out.println("[" + id + "] " + descricao + " - Prioridade: " + prioridade + " - Categoria: " + categoria + " - "+ getStatus());
    }
}
