
package streamns;


import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {
        
        oAluno aluno1 = new oAluno("Allan", 7.1);
        oAluno aluno2 = new oAluno("Allan", 6.1);
        oAluno aluno3 = new oAluno("Allan", 8.1);
        oAluno aluno4 = new oAluno("Allan", 10);
        
        List<oAluno> alunos = Arrays.asList(aluno1,aluno2,aluno3,aluno4);
        
        Predicate<oAluno> aprovado = a -> a.nota >=7;
        Function<oAluno,Double> apenasNota = a-> a.nota;
        BinaryOperator<Double> somatorio = (a,b) -> a+b;
        
        alunos.parallelStream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(somatorio)
                .ifPresent(System.out::println);
    }
    
    
}
