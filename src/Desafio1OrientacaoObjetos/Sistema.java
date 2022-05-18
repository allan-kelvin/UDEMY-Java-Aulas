
package Desafio1OrientacaoObjetos;

public class Sistema {
    public static void main(String[] args) {
        
       
        
        ooCompra compra1 = new ooCompra();
        compra1.adicionarItemCompleto("Caneta", 9.69,100);
        //compra1.adicionarItem(new oProduto("Notebook", 2500.0), 2);
        
        ooCompra compra2 = new ooCompra();
        compra2.adicionarItemCompleto("Lapis", 7.69,10);
        compra2.adicionarItem(new oProduto("Tablet", 1500.0), 1);
        
        ooCliente cliente1 = new ooCliente("Allan");
        cliente1.adicionarCompra(compra1);
        cliente1.adicionarCompra(compra2);
         
         System.out.println("Valor Total: "+cliente1.obterValorTotal());
        
        
        
    }
    
}
