
package streamns;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparador {
    public static void main(String[] args) {
        
        oAluno aluno1 = new oAluno("Allan", 7.1);
        oAluno aluno2 = new oAluno("Allan", 6.1);
        oAluno aluno3 = new oAluno("Allan", 8.1);
        oAluno aluno4 = new oAluno("Allan", 10);
        
        List<oAluno> alunos = Arrays.asList(aluno1,aluno2,aluno3,aluno4);
        
        Comparator<oAluno> melhorNota = (alu1, alu2) ->{
            if(alu1.nota >alu2.nota) return 1;
            if(alu1.nota <alu2.nota) return -1;
            return 0;
        };
        
        System.out.println(alunos.stream().max(melhorNota).get());
    }
    
}
