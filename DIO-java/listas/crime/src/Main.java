import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int somaRespostasTrue = 0;
        
        List<String> perguntas = new ArrayList<>(List.of(
                "Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou para a vítima?"
        ));
        List<Boolean> respostas =  new ArrayList<>();
        
        for (int i = 0; i < perguntas.size(); i++) {
            
            String booleano = " (true/false)";

            System.out.println(perguntas.get(i) + booleano);
            respostas.add(sc.nextBoolean());
            System.out.println();
            
            if (respostas.get(i))
                somaRespostasTrue++;
        }

        System.out.println("Você é:");
        System.out.println();

        switch(somaRespostasTrue) {
            
            case 0, 1:
                System.out.println("Inocente");
                break;
                
            case 2:
                System.out.println("Suspeita");
                break;

            case 3, 4:
                System.out.println("Cúmplice");
                break;

            case 5:
                System.out.println("Assassina");
                break;
        }
    }
}