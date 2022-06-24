package interfaces_funcionais.function;

import interfaces_funcionais.Produto;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        // deve informar o parametro e tipo de retorno
        Function<Integer, String> parOuImpar = n -> n % 2 == 0 ? "par" : "impar";
        System.out.println(parOuImpar.apply(2));

        Function<String, String> oResultadoE = valor ->
                "O resultado é: " + valor;

        String resultadoFinal = parOuImpar.apply(2);
        System.out.println(oResultadoE.apply(resultadoFinal));
        // ou
        String resultadoFinal2 = parOuImpar.andThen(oResultadoE).apply(3);
        System.out.println(resultadoFinal2);


        Produto produto = new Produto("book", 51.80, 0.15);

        Function<Produto, String> caroOuBarato = n ->
                n.price * n.desconto > 50 ? "caro" : "barato";

        System.out.println(caroOuBarato.apply(produto));
        System.out.println(caroOuBarato.andThen(oResultadoE).apply(produto));

        double b = 7.2;
        Function< Double, String> conceito = m-> m>= 7? "Aprovado" : "Reprovado";

        System.out.println(conceito.apply(b));
    }
}
