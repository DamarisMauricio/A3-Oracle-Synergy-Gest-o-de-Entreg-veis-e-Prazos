public class Main {

    public static void main(String[] args) {

        Projeto projeto = new Projeto("Oracle Synergy");

        Tarefa tarefa1 = new Tarefa(
                "Levantamento de Requisitos",
                "Fernando",
                "10/06/2026");

        projeto.adicionarTarefa(tarefa1);

        projeto.listarTarefas();
    }
}
