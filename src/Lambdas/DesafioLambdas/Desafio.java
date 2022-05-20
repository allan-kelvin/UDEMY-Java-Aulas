
package Lambdas.DesafioLambdas;

import Lambdas.Produto;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
    
    
    
    /* 1º A partir do produto calcular o preço real (com desconto)*/
    Function<Produto, Double> precoFinal =null;
            //produto -> produto.preco *(1 - produto.desconto);
            
    
    /* 2º Imposto municipal: >=2500 (8.5%) / 2500(isento) */
    UnaryOperator<Double> impostoMunicipal=
            preco ->preco >=2500 ? preco *1.085 :preco;
    /* 3º Frete: >=3000 (100) / <3000 (50) */
     UnaryOperator<Double> frete=
             preco -> preco >=3000 ? preco +100 : preco+50;
    /* 4º Arredondar: Deixar duas casas decimais  */
     UnaryOperator<Double> arredondar=
             preco -> Double.parseDouble(String.format("%.2f", preco));
    /* 5º Formatar: R$ 1234,56*/
     Function<Double, String> formatar=
             preco -> ("R$"+ preco).replace(".", ",");
      
      Produto p = new Produto("ipad", 3235.89,0.13);
      
      String preco = precoFinal
              .andThen(impostoMunicipal)
              .andThen(frete)
              .andThen(arredondar)
              .andThen(formatar)
              .apply(p);
      
        System.out.println(" o Preço final é " + preco);
    }
    
    
}
