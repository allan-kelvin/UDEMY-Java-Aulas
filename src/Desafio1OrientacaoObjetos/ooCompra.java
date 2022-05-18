
package Desafio1OrientacaoObjetos;

import java.util.ArrayList;
import java.util.List;


public class ooCompra {
    
    List<oItem> itens = new ArrayList<>();
    
    void adicionarItem(oProduto p, int quantidade){
        this.itens.add(new oItem(p,quantidade));
    }
    
    void adicionarItemCompleto(String nome, double preco, int qante){
        var produto = new oProduto(nome,preco);
        this.itens.add(new oItem(produto,qante));
    }
    
    double obtervalorTotal(){
        double total=0;
        for(oItem item: itens){
            total+=item.quantidade * item.produto.preco;
        }
        return total;
    }
    
}
