/*
 * Consumir> METODO QUE RECEBE ALGUM PARAMETRO MAS NAO RETORNA NADA OU SEJA UM VOID
 */
package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Allan.Kelvin.Santos
 */
public class Consumidor {
    public static void main(String[] args) {
        
        Consumer<Produto> imprimir = produto ->System.out.println(produto.nome);
        
        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        Produto p2 = new Produto("Notebbok", 1.34, 0.09);
        Produto p3 = new Produto("Borracha", 2.34, 0.09);
        Produto p4 = new Produto("Caderno", 7.34, 0.09);
        Produto p5 = new Produto("Lapis", 19.34, 0.09);
        
        imprimir.accept(p1);
        
        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
        
        produtos.forEach(imprimir);
        produtos.forEach(System.out::println);
    }
    
}
