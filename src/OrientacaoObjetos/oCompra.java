
package OrientacaoObjetos;

import java.util.ArrayList;

public class oCompra {
    
    String cliente;
    ArrayList<oItem> itens = new ArrayList<>();
    
    void adicionarItem(oItem item){
        itens.add(item);
        item.compra=this;
    }
    
     void adicionarItem(String nome, int quantidade, double preco){
        this.itens.add(new oItem(nome, quantidade, preco));
    }
    
    double getValorTotal(){
        double total=0;
        for (oItem item : itens) {
            total+=item.quantidade * item.preco;
        }
        return total;
    }
    
}
