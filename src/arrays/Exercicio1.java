/*
 * Exercicio 1 Arrays
 */
package arrays;

import java.util.Arrays;


public class Exercicio1 {
    public static void main(String[] args) {
        double notasAlunoA[] = new double[3];
        
        notasAlunoA[0]=10.0;
        notasAlunoA[1]=9.0;
        notasAlunoA[2]=8.0;
        
        // O ToString faz imprimir um Arrays de forma correta. 
        System.out.println(Arrays.toString(notasAlunoA));
        
        double total= 0;
        
        for (int i = 0; i<notasAlunoA.length; i++){
            total+= notasAlunoA[i];
        }
        
        System.out.println("A média é: "+ total / notasAlunoA.length);
        
        
        // Inicializando um Array com valores Fixos;     
        double notasAlunoB[] ={7.0,8.0,9.0};
        
        
        
        
    }
    
}
