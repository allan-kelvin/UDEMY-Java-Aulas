/*
 * Criando uma Matriz com notas de Alunos
 */
package arrays;

import java.util.Scanner;
import java.util.Arrays;
public class matriz {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
        System.out.println("Quantos Alunos?");
            int qantAlunos = entrada.nextInt();
            
            System.out.println("Quantos Notas por Alunos");
            int qantNotas = entrada.nextInt();
            
            //Criando uma Matriz
            double [][] notasDaTurma = new double [qantAlunos][qantNotas];
            
            
            //Criando um FOR dentro de outro FOR, para Percorrer a Matriz;
            double total = 0;
            for (int i = 0; i < notasDaTurma.length; i++) {
                for (int j = 0; j < notasDaTurma[i].length; j++) {
                    System.out.printf("Informe a nota %d do aluno %d:",i+1,j+1);
                    notasDaTurma[i][j] = entrada.nextDouble();
                    total+=notasDaTurma[i][j];
                }
             }
          
            double media = total / (qantAlunos * qantNotas);
            System.out.println("A media é:" +media);
            
            for (double[] notastotal : notasDaTurma) {
             System.out.println(Arrays.toString(notastotal));
        }
            
          entrada.close();
            
    }
    
}
