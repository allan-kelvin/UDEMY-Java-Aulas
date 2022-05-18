/*
 * Herança
 */
package OrientacaoObjetos.tipoEnum;

/**
 * @author Allan.Kelvin.Santos
 */
public class Heroi extends Jogador{

    @Override
    boolean atacar(Jogador oponente) {
        oponente.vida -=20;
        return super.atacar(oponente); 
    }
    
           
}
