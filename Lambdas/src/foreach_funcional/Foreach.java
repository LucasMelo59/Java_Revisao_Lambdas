package foreach_funcional;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {


        List<String> aprovados = Arrays.asList("Ana", "Bia", "Gui", "pae");

        for(String nome : aprovados){
            System.out.println(nome);
        }

        // com lambda
        aprovados.forEach((nome) -> System.out.println(nome));

        //com method Reference
        aprovados.forEach(System.out::println);

        // com lambda 02
        aprovados.forEach(nome -> meuImprimir(nome));

        // com method Reference 02
        aprovados.forEach(Foreach::meuImprimir);
    }

    static void meuImprimir(String nome){
        System.out.println(" oi "+ nome);
    }
}
