package GerenciadorTarefas;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private int id;
    private String prioridade;
    private String categoria;
    private String dificuldade;

    public Tarefa(String descricao, int id, String prioridade, String categoria, String dificuldade) {
        this.descricao = descricao;
        this.id = id;
        this.concluida = false;
        this.prioridade = prioridade;
        this.categoria = categoria;
        this.dificuldade = dificuldade;
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
    public  String getDificuldade() {
        return dificuldade;
    }
    public String getStatus() {
        return concluida ? "Concluída" : "Pendente...";
    }
    public void exibir() {
        System.out.println("[" + id + "] " + descricao + " - Prioridade: " + prioridade + " - Categoria: " + categoria + " - Dificuldade: "+ dificuldade + " - " + getStatus());
    }
}
