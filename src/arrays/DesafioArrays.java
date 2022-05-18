/*
 * Criando um array de notas e exibindo a Media.
 * O usuario que irá definir o tamanho do array, digitando no console;
 */
package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class DesafioArrays {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas Notas Deseja Digitar ? ");
        int tamanhoArray = entrada.nextInt();
        
        int [] notasAlunos = new int[tamanhoArray];
        
        
        for (int i =0; i<notasAlunos.length; i++){
            System.out.println("Digite a nota "+ i);
            notasAlunos[i]=entrada.nextInt();
        }
        int total=0;
        for (int notasAluno : notasAlunos) {
        total=total + notasAluno;
        }
        System.out.println("A média é: "+total/notasAlunos.length);
        entrada.close();
    }
    
}
