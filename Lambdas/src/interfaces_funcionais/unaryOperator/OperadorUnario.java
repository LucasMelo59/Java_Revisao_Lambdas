package interfaces_funcionais.unaryOperator;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {

        UnaryOperator<Integer> soma = n -> n+2;
        UnaryOperator<Integer> multiplica = n -> n*2;
        UnaryOperator<Integer> aoQuadrado = n -> n*n;
        // com andthen o codigo segue a sequencia da linha pra ser executando, "entao faça isso"
        System.out.println(soma
                .andThen(multiplica)
                .andThen(aoQuadrado)
                .apply(2));
        // compose o codigo faz o primeiro o que esta como parametro "faça antes de..."
        System.out.println(aoQuadrado
                .compose(multiplica).
                compose(soma)
                .apply(2));

    }
}
