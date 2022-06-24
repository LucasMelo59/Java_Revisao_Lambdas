package interfaces_funcionais.binaryOperatorEBiFuction;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
    public static void main(String[] args) {

        BinaryOperator<Double> media =
                (n1,n2) -> (n1+n2)/2;
        System.out.println(media.apply(9.8, 5.7));

        BiFunction<Double, Double, String> notas = (n1,n2) ->
                (n1 + n2)/2 > 7 ? "Aprovado" : "Reprovado";

        System.out.println(notas.apply(9.5,5.2));

        }
}
