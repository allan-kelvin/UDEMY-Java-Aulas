/*
 * Criando o Objeto Caro
 * Aqui estamos mostrando que é possivel ter uma classe dentro de outra classe;
 * Como por exemplo o oCarro tem dentro a classe oMotor;
 * Quando instanciamos um objeto dentro de outro, ele assume os atributos desse outro objeto;
 * Então o objeto carro, tem os atributos do objeto motor, fazendo com que eu consiga acessar.
 */
package OrientacaoObjetos;

public class oCarro {
    
    final oMotor motor;
    oCarro(){
        this.motor=new oMotor(this);
    }
    
    
    void acelerar(){
        if(motor.getFatorInjecao()<2.6){
           motor.setFatorInjecao(0.4); 
        }
        
    }
    
    void frear(){
        if(motor.getFatorInjecao()> 0.5){
           motor.setFatorInjecao(0.4); 
        }        
    }
    
    void ligar(){
        motor.setLigado(true);
    }
    
    void desligar(){
        motor.setLigado(false);
    }
    
    boolean estaLigado(){
            return motor.isLigado();
    }
}   
