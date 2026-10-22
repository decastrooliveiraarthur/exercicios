import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<String> cores = new HashSet<>(Set.of("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));
        System.out.println("Cores do arco-íris: ");
        cores.forEach(System.out::println);
        System.out.println();

        System.out.println("Quantidade de cores que tem no arco-íris:");
        System.out.println("O arco-íris tem " + cores.size() + " cores");
        System.out.println();

        Set<String> coresOrdemAlfabetica = new TreeSet<>(cores);
        System.out.println("Cores do arco-íris em ordem alfabética: ");
        coresOrdemAlfabetica.forEach(System.out::println);
        System.out.println();

        Set<String> coresOrdemInversa = new TreeSet<>(coresOrdemAlfabetica).descendingSet();
        System.out.println("Cores do arco-íris em ordem alfabética inversa: ");
        coresOrdemInversa.forEach(System.out::println);
        System.out.println();

        System.out.println("Cores que começam com a letra v:");
        coresOrdemAlfabetica.stream().filter(cor -> cor.startsWith("v")).forEach(System.out::println);
        System.out.println();

        System.out.println("Remover todas as cores que não começam com a letra v:");
        coresOrdemAlfabetica.removeIf(cor -> !cor.startsWith("v"));
        System.out.println(coresOrdemAlfabetica);
        System.out.println();

        System.out.println("Limpar o conjunto:");
        coresOrdemAlfabetica.clear();
        System.out.println(coresOrdemAlfabetica);
        System.out.println();

        System.out.println("Conferir se o conjunto está vazio:");
        if (coresOrdemAlfabetica.isEmpty())
            System.out.println("O conjunto está vazio");
        else
            System.out.println("O conjunto não está vazio");
    }
}
