import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;
        List<String> meses = new ArrayList<>(List.of("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"));
        List<Integer> temperaturasMedias = new ArrayList<>();

        for (int i = 0; i < 6; i++) {

            System.out.println("Digite a temperatura média de " + meses.get(i) + ":");
            temperaturasMedias.add(sc.nextInt());
            System.out.println();
            soma += temperaturasMedias.get(i);
        }

        int mediaSemestral = soma / temperaturasMedias.size();
        System.out.println("A média semestral das temperaturas é: " + mediaSemestral);
        System.out.println();
        System.out.println("As temperaturas acima da média são:");
        System.out.println();

        for (int i = 0; i < meses.size(); i++) {

            if (temperaturasMedias.get(i) > mediaSemestral)
                System.out.println(i + 1 + " - " + meses.get(i) + " - " + temperaturasMedias.get(i));
        }
    }
}