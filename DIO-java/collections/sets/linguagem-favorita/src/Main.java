import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(List.of(

                new LinguagemFavorita("Java", 1991, "IntelliJ IDEA"),
                new LinguagemFavorita("Python", 1989, "PyCharm"),
                new LinguagemFavorita("C++", 1983, "Visual Studio")
        ));

        System.out.println("Linguagens em Ordem de Inserção:");
        linguagens.forEach(System.out::println);
        System.out.println();

        System.out.println("Linguagens em Ordem Natural:");
        Set<LinguagemFavorita> linguagensOrdemNatural = new TreeSet<>(linguagens);
        linguagensOrdemNatural.forEach(System.out::println);
        System.out.println();

        System.out.println("Linguagens em Ordem de IDE:");
        Comparator<LinguagemFavorita> porIde = Comparator.comparing(LinguagemFavorita::ide);
        Set<LinguagemFavorita> linguagensIde = new TreeSet<>(porIde);
        linguagensIde.addAll(linguagens);
        linguagensIde.forEach(System.out::println);
        System.out.println();

        System.out.println("Linguagens em Ordem de Ano de Criação e Nome:");
        Comparator<LinguagemFavorita> porAnoDeCriacaoNome = Comparator.comparing(LinguagemFavorita::anoDeCriacao)
                .thenComparing(LinguagemFavorita::nome);
        Set<LinguagemFavorita> linguagensAnoDeCriacaoENome = new TreeSet<>(porAnoDeCriacaoNome);
        linguagensAnoDeCriacaoENome.addAll(linguagens);
        linguagensAnoDeCriacaoENome.forEach(System.out::println);
        System.out.println();

        System.out.println("Linguagens em Nome, Ano de Criação e IDE:");
        Comparator<LinguagemFavorita> porNomeAnoDeCriacaoIde = Comparator.comparing(LinguagemFavorita::nome)
                .thenComparing(LinguagemFavorita::anoDeCriacao)
                .thenComparing(LinguagemFavorita::ide);
        Set<LinguagemFavorita> linguagensNomeAnoDeCriacaoIde = new TreeSet<>(porNomeAnoDeCriacaoIde);
        linguagensNomeAnoDeCriacaoIde.addAll(linguagens);
        linguagensNomeAnoDeCriacaoIde.forEach(System.out::println);
    }
}
