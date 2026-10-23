public record LinguagemFavorita(String nome, int anoDeCriacao, String ide) implements Comparable<LinguagemFavorita> {

    @Override
    public String toString() {
        return "Nome: " + nome + " | Ano de Criação: " + anoDeCriacao + " | Ide: " + ide;
    }

    @Override
    public int compareTo(LinguagemFavorita o) {
        return this.nome.compareTo(o.nome);
    }
}
