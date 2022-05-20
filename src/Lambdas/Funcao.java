/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambdas;

import java.util.function.Function;

/**
 *
 * @author Allan.Kelvin.Santos
 */
public class Funcao {
    public static void main(String[] args) {
        /*Aqui ele recebe um Integer devolve uma Strng*/
        Function<Integer,String> parOuImpar = numero->numero %2 ==0 ? "Par" : "Impar";
        
        System.out.println(parOuImpar.apply(32));
        /*Aqui recebe ums String e devolve uma String*/
        Function<String, String> oResaultado= valor -> "O resultado é: "+valor;
        
        /*A função andThen, chama a função oResultado, e depois chama o apply*/
        String resultadoFinal= parOuImpar.andThen(oResaultado).apply(32);
        
        System.out.println(resultadoFinal);
    }
}
