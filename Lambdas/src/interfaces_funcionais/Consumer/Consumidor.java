package interfaces_funcionais.Consumer;

import interfaces_funcionais.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {


        Produto p1 = new Produto("lapis", 1.80, 0.85);
        Produto p2 = new Produto("book", 51.80, 0.85);
        Produto p3 = new Produto("caneta", 0.80, 0.85);
        Produto p4 = new Produto("lapiseira", 3.50, 0.85);
        Produto p5 = new Produto("borracha", 2.80, 0.85);

        Consumer<Produto> imprimir = p -> System.out.println(p.nome);
        imprimir.accept(p1);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
        // Foreach recebe um Consumer
        produtos.forEach(imprimir);
        produtos.forEach( p -> System.out.println(p.price));
        produtos.forEach(p -> System.out.println(p.desconto));
        // method Reference
        produtos.forEach(System.out::println);
    }
}
