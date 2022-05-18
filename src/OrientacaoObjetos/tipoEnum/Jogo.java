/*
 
 */
package OrientacaoObjetos.tipoEnum;

/**
 * @author Allan.Kelvin.Santos
 */
public class Jogo {
    public static void main(String[] args) {
        
        Jogador jogador1 = new Jogador(); 
        jogador1.x=1;
        jogador1.y=1;
        
        Jogador jogador2 = new Jogador(); 
        jogador2.x=1;
        jogador2.y=1;
        
        //jogador1.andar(Direcao.NORTE);
        //jogador1.andar(Direcao.LESTE);
        //jogador1.andar(Direcao.OESTE);
        //jogador1.andar(Direcao.OESTE);        
        //System.out.println("Y: "+jogador1.y + "\nX: "+ jogador1.x);
        
        System.out.println("Vida: "+ jogador1.vida);
        System.out.println("Vida: "+ jogador2.vida);
        
        jogador1.atacar(jogador2);
        jogador2.atacar(jogador1);
        
        System.out.println("Vida: "+ jogador1.vida);
        System.out.println("Vida: "+ jogador2.vida);
        
        Heroi heroi1 = new Heroi();
        heroi1.x=10;
        heroi1.y=10;
        
        Monstro monstro = new Monstro();
        heroi1.x=10;
        heroi1.y=11;
        
        System.out.println("Vida Monstro: "+ monstro.vida);
        heroi1.atacar(monstro);
        System.out.println("Vida Monstro: "+ monstro.vida);
        
        
    }
    
}
