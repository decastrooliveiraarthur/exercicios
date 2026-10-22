import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> cores = new LinkedHashSet<>(
                List.of("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));
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

        List<String> coresOrdemInversa = new ArrayList<>(cores);
        Collections.reverse(coresOrdemInversa);
        System.out.println("Cores do arco-íris na ordem inversa que foi informada:");
        coresOrdemInversa.forEach(System.out::println);
        System.out.println();

        System.out.println("Cores que começam com a letra v:");
        cores.stream().filter(cor -> cor.startsWith("v")).forEach(System.out::println);
        System.out.println();

        System.out.println("Remover todas as cores que não começam com a letra v:");
        cores.removeIf(cor -> !cor.startsWith("v"));
        System.out.println(cores);
        System.out.println();

        System.out.println("Limpar o conjunto:");
        cores.clear();
        System.out.println(cores);
        System.out.println();

        System.out.println("Conferir se o conjunto está vazio:");
        if (cores.isEmpty())
            System.out.println("O conjunto está vazio");
        else
            System.out.println("O conjunto não está vazio");
    }
}
