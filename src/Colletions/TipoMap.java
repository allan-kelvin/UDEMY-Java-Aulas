/*
 * Criando um MAP
 */
package Colletions;

import java.util.HashMap;
import java.util.Map;


public class TipoMap {
    public static void main(String[] args) {
        //Instanciando o MAP
        Map<Integer,String> usuarios = new HashMap<>();
        
        // O MAP não usa o metodo ADD, para adicionar itens dentro da lista, ele usa o metodo PUT;
        usuarios.put(1, "ALLAN");
        
        //iMPRIMINDO O MAP
        System.out.println(usuarios);
        
        //Imprimindo a CHAVE
        System.out.println(usuarios.keySet());
        
        //Imprimindo os Valores
        System.out.println(usuarios.values());
        
        //Buscando para ver se contém
        System.out.println(usuarios.containsKey(1));
        System.out.println(usuarios.containsValue("Allan"));
    }
    
}
