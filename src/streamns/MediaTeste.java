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
public class MediaTeste {
    public static void main(String[] args) {
        
        Media m1 = new Media().adicionar(8.3).adicionar(6.7);
        System.out.println(m1.getValor());
    }
    
}
