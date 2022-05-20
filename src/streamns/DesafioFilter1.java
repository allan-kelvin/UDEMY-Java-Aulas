
package streamns;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter1 {
    public static void main(String[] args) {
        
        oFilmes filmes1 = new oFilmes("Doutor Estranho 2", 2022, 7.5,false);
        oFilmes filmes2 = new oFilmes("The Batman", 2022, 9.0,true);
        oFilmes filmes3 = new oFilmes("Sonic 2", 2022, 7.0,false);
        oFilmes filmes4 = new oFilmes("Cavaleiro da Lua", 2022, 9.0,true);
        
        List<oFilmes> filmes = Arrays.asList(filmes1,filmes2,filmes3,filmes4);
        Predicate<oFilmes> selo = s->s.seloRotten ==true;
        Function<oFilmes, String> imprimirComSelos = i->"Os Filmes com selo de qualidade Rotten são: "+i.nome+"!!!";
        
        filmes.stream()
                .filter(selo)
                .map(imprimirComSelos)
                .forEach(System.out::println);
                
    }
    
}
