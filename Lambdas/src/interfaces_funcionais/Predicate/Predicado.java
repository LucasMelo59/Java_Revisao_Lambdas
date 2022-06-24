package interfaces_funcionais.Predicate;
import interfaces_funcionais.Produto;

import java.util.function.Predicate;
public class Predicado {

    public static void main(String[] args) {
        Produto produto = new Produto("Book", 50.89, 0.85);

        Predicate<Produto> caro = prod -> (prod.price)*(1 - prod.desconto) >= 750;

        System.out.println(caro.test(produto));



    }
}
