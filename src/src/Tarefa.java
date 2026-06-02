public class Tarefa {

    private String nome;
    private String responsavel;
    private String prazo;

    public Tarefa(String nome, String responsavel, String prazo) {
        this.nome = nome;
        this.responsavel = responsavel;
        this.prazo = prazo;
    }

    @Override
    public String toString() {
        return "\nTarefa: " + nome +
               "\nResponsável: " + responsavel +
               "\nPrazo: " + prazo + "\n";
    }
}
