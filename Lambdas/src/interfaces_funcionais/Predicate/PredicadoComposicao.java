package interfaces_funcionais.Predicate;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {

        Predicate<Integer> ispar = num ->
                num % 2 == 0;

        Predicate<Integer> isTreDigitos = num ->
                num >= 100 && num <= 999;

        System.out.println(ispar.or(isTreDigitos).test(22));
        System.out.println(ispar.and(isTreDigitos).test(22));
        System.out.println(ispar.and(isTreDigitos).test(122));
        System.out.println(ispar.or(isTreDigitos).test(123));

    }
}
