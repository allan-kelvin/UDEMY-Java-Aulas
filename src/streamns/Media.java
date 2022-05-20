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
public class Media {
    
    private double total;
    private int quantidade;
    
    public Media adicionar(double valor){
        total += valor;
        quantidade++;
        return this;
    }
    
    public double getValor(){
        return total/quantidade;
    }
    
    
    public Media combinar(Media m1, Media m2){
        Media resultante = new Media();
        
        resultante.total=m1.total+m2.total;
        resultante.quantidade = m1.quantidade+m2.quantidade;
        return resultante;
    }
}
