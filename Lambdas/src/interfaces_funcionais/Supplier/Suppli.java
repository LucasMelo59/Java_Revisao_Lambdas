package interfaces_funcionais.Supplier;

import interfaces_funcionais.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Suppli {
    public static void main(String[] args) {
        // nao recebe parametro e traz um retorno

        Supplier<List< String > > umaLista = () -> Arrays.asList("joao", "gustavo", "germano");

        System.out.println(umaLista.get());

        Produto produto = new Produto("book", 2.5, 0.15);
        Produto produto1 = new Produto("caneta", 2.5, 0.25);

        List < Produto > lista  = List.of(produto, produto1);

        Supplier < List < Produto > > listaDeProduto = () -> lista;
        // o resultado sai nessa formatação devido ao to String na classe produto
        System.out.println(listaDeProduto.get());



    }


}
