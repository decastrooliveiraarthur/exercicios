import java.util.TreeSet;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){

        Set<String> cores = new HashSet<>(Set.of("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));

        System.out.println("Cores do arco-íris: ");
        System.out.println();
        for(String cor : cores){

            System.out.println(cor);
        }
        System.out.println();


        System.out.println("O arco-íris tem " + cores.size() + " cores");
        System.out.println();


        Set<String> coresOrdemAlfabetica = new TreeSet<>(cores);

        System.out.println("Cores do arco-íris em ordem alfabética: ");
        System.out.println();
        for(String cor : coresOrdemAlfabetica){

            System.out.println(cor);
        }
        System.out.println();


        Set<String> coresOrdemInversa = new TreeSet<>(coresOrdemAlfabetica).descendingSet();

        System.out.println("Cores do arco-íris em ordem alfabética inversa: ");
        System.out.println();
        for(String cor : coresOrdemInversa){

            System.out.println(cor);
        }
        System.out.println();
    }
}
