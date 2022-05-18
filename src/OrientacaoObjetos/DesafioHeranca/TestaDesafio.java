/**
 * Criar um herança entre Carros e fazer com que acelere e freie;
 */
package OrientacaoObjetos.DesafioHeranca;

/**
 * @author Allan.Kelvin.Santos
 */
public class TestaDesafio {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        
        //ferrari.frear();
        //ferrari.frear();
        //ferrari.frear();
        //ferrari.frear();
        
        System.out.println("Velocidade Atual: "+ferrari.velocidade);
    }
    
}
