/*
* Predicado
* Função que recebe um parametro e retorna true ou false;
*/
package Lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        
        Predicate<Produto> isCaro = prod -> (prod.preco *(1 - prod.desconto))>=750;
        
        Produto produto = new Produto("notebook",3893.89,0.15 );
        System.out.println("");
    }
    
}
