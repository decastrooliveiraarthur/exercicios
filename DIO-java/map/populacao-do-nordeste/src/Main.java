import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> populacaoNordeste = new LinkedHashMap<>();
        populacaoNordeste.put("PE", 9_616_621);
        populacaoNordeste.put("AL", 3_351_543);
        populacaoNordeste.put("CE", 9_187_103);
        populacaoNordeste.put("RN", 3_534_265);
        Set<String> estados = populacaoNordeste.keySet();

        System.out.println("População do Nordeste:");
        System.out.println(populacaoNordeste);
        System.out.println();

        System.out.println("Substituindo a população do RN por 3.534.165");
        populacaoNordeste.put("RN", 3_534_165);
        System.out.println("População do Nordeste:");
        System.out.println(populacaoNordeste);
        System.out.println();

        System.out.println("Verificando se o estado PB está no dicionário:");
        if (populacaoNordeste.containsKey("PB")) {
            System.out.println("O estado PB está no dicionário.");
        } else {
            System.out.println("O estado PB não está no dicionário.");
            System.out.println("Adicionando o estado PB com população de 4.039.277");
            populacaoNordeste.put("PB", 4_039_277);
            System.out.println("População do Nordeste:");
            System.out.println(populacaoNordeste);
        }
        System.out.println();

        System.out.println("Exibindo a população de PE: " + populacaoNordeste.get("PE"));
        System.out.println();

        System.out.println("Exibindo os estados e suas populações na ordem em que foi informada:");
        System.out.println(populacaoNordeste);
        System.out.println();

        System.out.println("Exibindo os estados e suas populações em ordem alfabética:");
        Map<String, Integer> populacaoNordesteAlfabetica = new TreeMap<>(populacaoNordeste);
        System.out.println(populacaoNordesteAlfabetica);
        System.out.println();

        System.out.println("Exibindo o estado com a menor população:");
        int menorPopulacao = Collections.min(populacaoNordeste.values());
        for (String estado : estados) {
            if (populacaoNordeste.get(estado).equals(menorPopulacao)) {
                System.out.println(estado + " - " + menorPopulacao);
            }
        }
        System.out.println();

        System.out.println("Exibindo o estado com a maior população:");
        int maiorPopulacao = Collections.max(populacaoNordeste.values());
        for (String estado : estados) {
            if (populacaoNordeste.get(estado).equals(maiorPopulacao)) {
                System.out.println(estado + " - " + maiorPopulacao);
            }
        }
        System.out.println();

        System.out.println("Exibindo a soma da população dos estados do Nordeste:");
        int soma = 0;
        for (String estado : populacaoNordeste.keySet()) {
            soma += populacaoNordeste.get(estado);
        }
        System.out.println(soma);
        System.out.println();

        System.out.println("Exibindo a média da população dos estados do Nordeste:");
        double media = (double) soma / populacaoNordeste.size();
        System.out.println(media);
        System.out.println();

        System.out.println("Removendo os estados com população menor que 4.000.000:");
        Iterator<Map.Entry<String, Integer>> iterator = populacaoNordeste.entrySet().iterator();
        while (iterator.hasNext()) {
            String estado = iterator.next().getKey();
            if (populacaoNordeste.get(estado) < 4_000_000) {
                iterator.remove();
            }
        }
        System.out.println("População do Nordeste:");
        System.out.println(populacaoNordeste);
        System.out.println();

        System.out.println("Apagando o dicionário de população do Nordeste:");
        populacaoNordeste.clear();
        System.out.println(populacaoNordeste);
        System.out.println();

        System.out.println("Verificando se o dicionário está vazio:");
        if (populacaoNordeste.isEmpty())
            System.out.println("O dicionário está vazio.");
        else
            System.out.println("O dicionário não está vazio.");
    }
}
