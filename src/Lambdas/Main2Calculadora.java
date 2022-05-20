
package Lambdas;

public class Main2Calculadora {
    public static void main(String[] args) {
        Calculo calc = (a,b)->{return a+b;};
        
        /*Outra forma de usar o Lambda*/
        calc = (a,b) -> a*b;
        
    }  
}
