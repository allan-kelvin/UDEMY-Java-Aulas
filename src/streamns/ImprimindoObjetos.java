
package streamns;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        
        List<String> aprovados = Arrays.asList("Lu", "Gui","Luca","Luca");
        
        System.out.println("Usando o Fore");
        for (String nome : aprovados) {
            System.out.println(nome);
        }
        
        System.out.println("\n Usando o Iterator");
        
        Iterator<String> interador = aprovados.iterator();
        while (interador.hasNext()){
            System.out.println(interador.next());
        }
        
        System.out.println(" \n Usando Stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
    }
    
}
