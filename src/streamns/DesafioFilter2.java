/*
 * Usando o filter
 */
package streamns;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author Allan.Kelvin.Santos
 */
public class DesafioFilter2 {
    
    public static void main(String[] args) {
    oProduto produto1 = new oProduto("Lapis", 1.99, 0.12, 30);
    oProduto produto2 = new oProduto("Notebook", 15000.00,0.32 , 30);
    oProduto produto3 = new oProduto("Caderno", 10.99, 0.12, 0);
    oProduto produto4 = new oProduto("Impressora", 205.99, 0.8, 30);
    oProduto produto5 = new oProduto("ipad", 1100.99, 0.35, 0);
    oProduto produto6 = new oProduto("Releogio", 1909.0, 0.12, 0);
    oProduto produto7 = new oProduto("Monitor", 1000.99, 0.40, 0);
    
    
    List<oProduto> produtos = Arrays.asList(produto1,produto2,produto3,produto4,produto5,produto6,produto7);
    
    // Filter , Map
    
    Predicate<oProduto> superPromocao = s -> s.desconto >=0.3;
    Predicate<oProduto> freteGratis = f -> f.valorFrete ==0;
    Predicate<oProduto> precoRelevante = p -> p.preco >=500;
    
    Function<oProduto, String> chamadaPromocional = p -> "Aproveite!" +p.nome + "por R$"+p.preco;
    
    produtos.stream()
            .filter(superPromocao)
            .filter(freteGratis)
            .filter(precoRelevante)
            .map(chamadaPromocional)
            .forEach(System.out::println);
    }
    
    
}
