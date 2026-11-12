import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Main {

    private static final Random RANDOM = new Random();
    private static final int QUANTIDADE_LANCAMENTOS = 100;
    private static final int QUANTIDADE_LADOS = 6;

    private static int lancarDado() {
        return RANDOM.nextInt(QUANTIDADE_LADOS) + 1;
    }

    public static void main(String[] args) {


        Map<Integer, Integer> quantidadeCadaLado = new TreeMap<>(Map.of(
                1, 0,
                2, 0,
                3, 0,
                4, 0,
                5, 0,
                6, 0
        ));


        for (int i = 0; i < QUANTIDADE_LANCAMENTOS; i++) {

            int lado = lancarDado();

            quantidadeCadaLado.compute(lado, (k, quantidade) -> quantidade + 1);
        }

        System.out.println("O dado foi lançado " + QUANTIDADE_LANCAMENTOS + " vezes!\n" +
                "Veja quantas vezes ele caiu em cada lado:\n" +
                quantidadeCadaLado);
    }
}