import java.util.ArrayList;
import java.util.List;

public class Projeto {

    private String nomeProjeto;
    private List<Tarefa> tarefas;

    public Projeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void listarTarefas() {

        System.out.println("Projeto: " + nomeProjeto);

        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }
}
