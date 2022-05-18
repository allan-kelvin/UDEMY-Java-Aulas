
package OrientacaoObjetos.DesafioHeranca;

public class Carro {
    final Integer VELOCIDADE_MAXIMA;
    Integer velocidade=0;
    
    Carro (Integer velocidadeMaxima){
        VELOCIDADE_MAXIMA =velocidade;
    }
    
   boolean acelerar(){
        if(velocidade +5 >VELOCIDADE_MAXIMA){
            velocidade = VELOCIDADE_MAXIMA;
            return false;
        }else {
            velocidade +=5;
        return true;
        } 
    }
    
    boolean frear(){
        if (velocidade <=0){
            return false;
        } else{
             velocidade -=5;
        return true;
        }   
    }
}
