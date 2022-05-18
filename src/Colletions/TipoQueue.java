/*
 * Criando uma Queue
 */
package Colletions;

import java.util.LinkedList;
import java.util.Queue;

public class TipoQueue {
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();
        
        
        // Offer e ADD -> Os dois adicionam elementos 
        // A diferença e o comportamento quando a fila esta cheia. 
        fila.add("allan");
        fila.offer("Kelvin");
        
        System.out.println(fila.peek() );
        
        
    }
    
}
