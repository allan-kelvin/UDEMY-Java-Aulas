/*
 * Utilizando SET

 */
package Colletions;

import java.util.HashSet;

public class TipoSet1 {
    public static void main(String[] args) {
        
        //Criando um SET
        
        HashSet conjunto = new HashSet();
        
        //Adicionando um elemento no SET
        //A vantagem de criar um SET é que ele aceita qualquer tipo de elemento/ variavel (String, Int, boolean);
         conjunto.add("Teste"); // String
         conjunto.add(25.0); // double
         conjunto.add(1); // int
         conjunto.add(true); // boolean
         conjunto.add("X"); // Caracter
         
        // Para imprimir o tamanho um SET utilizamos a classe SIZE.
         System.out.println(conjunto.size());
         System.out.println(conjunto);
         
         //Removendo um Elmento dentro do SET
         conjunto.remove(1);
         
         //Metodo Contains, traz se o SET possui alguma elemento especifico. 
         conjunto.contains("Teste");
         
         //Limpar um SET
         
         conjunto.clear();
         
         System.out.println(conjunto);
         
    }
    
}
