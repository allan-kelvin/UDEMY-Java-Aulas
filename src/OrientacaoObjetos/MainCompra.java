/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrientacaoObjetos;

/**
 *
 * @author Allan.Kelvin.Santos
 */
public class MainCompra {
        
    public static void main(String[] args) {
        oCompra Supermercado = new oCompra();
        
        Supermercado.cliente= "Francisco";
        Supermercado.adicionarItem("Laranja", 10, 2.99);
        Supermercado.adicionarItem("Manga", 5, 8.99);
        Supermercado.adicionarItem("Abacaxi", 2, 5.99);
        Supermercado.adicionarItem("Morango", 3, 7.99);
        
        System.out.println(Supermercado.itens.size());
        System.out.println(Supermercado.itens.toString());
        
    }
    
    
}
