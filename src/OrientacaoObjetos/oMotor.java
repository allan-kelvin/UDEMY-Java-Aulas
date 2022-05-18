/*
 * Criando o Objeto Motor
 */
package OrientacaoObjetos; 

public class oMotor {
   private  boolean ligado = false;
   private  double GetfatorInjecao =1;
    oCarro carro;
    
    oMotor(oCarro  carro){
        this.carro=carro;
    }
    
    int giros(){
        if (!ligado){
            return 0;
        } else
        // O METODO MATH.ROUND, SERVE PARA ARREDONDAR O VALOR INTEIRO;
        return (int)Math.round(getFatorInjecao() *3000);
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public double getFatorInjecao() {
        return GetfatorInjecao;
    }

    public void setFatorInjecao(double fatorInjecao) {
        this.GetfatorInjecao = fatorInjecao;
    }

    public oCarro getCarro() {
        return carro;
    }

    public void setCarro(oCarro carro) {
        this.carro = carro;
    }
    
    
    
}
