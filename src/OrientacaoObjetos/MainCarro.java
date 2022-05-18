/*
 *
 */
package OrientacaoObjetos;

public class MainCarro {
    public static void main(String[] args) {
        oCarro BMW = new oCarro();
        
        System.out.println("O carro esta ligado ?: \n"+BMW.estaLigado());
        
        BMW.ligar();
        
        System.out.println("O carro esta ligado ?: \n"+BMW.estaLigado());
        
        //Como a BMW é do tipo Carro, e cada Carro possui um motor, eu posso acessar o objeto motor. acessando o giros.
        System.out.println(BMW.motor.giros());
        
        BMW.acelerar();
        BMW.acelerar();
        BMW.acelerar();
        BMW.acelerar();
        
        System.out.println(BMW.motor.giros());
        
        BMW.frear();
        BMW.frear();
        BMW.frear();
    }
    
}
