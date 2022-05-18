/*
 * Criando um Set Mais organizado;
 */
package Colletions;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TipoSet2 {
    public static void main(String[] args) {
        
        // Coloando o tipo para o SET em <> Significa que agora so pode ser adicionado esse valor.
        Set<String> lista = new HashSet<String>();
        lista.add("ALLAN");
        lista.add("Julia");
        lista.add("Isabelle");
        lista.add("Laura");
        
        // Fazendo um FOREACH para imprimir a lista SET. 
        // Obseve que quando usamos o SET, ele imprime de maneira desordenada, não pegando por ordem alguma. 
        for (String Lista : lista) {            
            System.out.println(Lista);          
        }
        
        // Para organizar a ordem de Inserção, precisamos usar o método TREESET;      
        // Vamos instanciar uma nova List SET. 
        
        System.out.println(" \n ========== Imprimindo a lista em ordem de inserção ========= \n");
        Set<String> lista2 = new TreeSet<>();
        lista2.add("ALLAN");
        lista2.add("Julia");
        lista2.add("Isabelle");
        lista2.add("Laura");
        
        for (String Lista2 : lista2) {
            System.out.println(Lista2);
        }
    }
    
}
