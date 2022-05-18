
package OrientacaoObjetos.tipoEnum;

/**
 *
 * @author Allan.Kelvin.Santos
 */
public class Monstro extends Jogador{
    boolean atacar(Jogador oponente){
        boolean ataque1=super.atacar(oponente);
        boolean ataque2=super.atacar(oponente);
        boolean ataque3=super.atacar(oponente);
        //Se ataque 1 ou ataque2 ou ataque3 derem certo, o java retorna o ataque
        return ataque1 || ataque2 || ataque3;
    }
    
}
