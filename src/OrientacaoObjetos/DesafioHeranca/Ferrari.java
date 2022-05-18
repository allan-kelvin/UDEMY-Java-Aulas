
package OrientacaoObjetos.DesafioHeranca;

public class Ferrari extends Carro{
    
    Ferrari(){
        super(315);
    }

    @Override
    boolean acelerar() {
            velocidade+=15;
            return super.acelerar();
            
    }

    @Override
    boolean frear() {
        velocidade -=10;
        return super.frear();
    }
   
}
