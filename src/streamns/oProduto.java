/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamns;

/**
 *
 * @author Allan.Kelvin.Santos
 */
public class oProduto {
    
    String nome;
    final double preco;
    final double desconto;
    final double valorFrete;

    public oProduto(String nome, double preco, double desconto, double valorFrete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.valorFrete = valorFrete;
    }
    
    
    
}
