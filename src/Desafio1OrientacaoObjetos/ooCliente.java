
package Desafio1OrientacaoObjetos;

import java.util.ArrayList;
import java.util.List;

public class ooCliente {
  final  String nome;

    public ooCliente(String nome) {
        this.nome = nome;
    }
    
   final List<ooCompra> compras = new ArrayList<>();
    
    double obterValorTotal(){
        double total=0;
        
        for (ooCompra compra : compras) {
          total += compra.obtervalorTotal();
        }
        return total;
    }
    
    void adicionarCompra(ooCompra compra){
        this.compras.add(compra);
    }
    
}
