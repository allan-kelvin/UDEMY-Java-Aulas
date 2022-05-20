
package streamns;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        
        
        oAluno aluno1 = new oAluno("Ana", 7.8);
        oAluno aluno2 = new oAluno("Allan", 5.8);
        oAluno aluno3 = new oAluno("Bruno", 9.8);
        oAluno aluno4 = new oAluno("Aço", 6.8);
        oAluno aluno5 = new oAluno("Marcus", 7.1);
        oAluno aluno6 = new oAluno("João", 8.8);
        
        List<oAluno> alunos =  Arrays.asList(aluno1,aluno2,aluno3,aluno4,aluno5,aluno6);
        Predicate<oAluno> aprovado = a->a.nota >=7;
        Function<oAluno, String> saudacaoAprovado = a-> "Parabens!! "+ a.nome+" Você foi aprovado ";
        
        alunos.stream()
                .filter(aprovado)
                .map(saudacaoAprovado)
                .forEach(System.out::println);
                
    }
    
}
