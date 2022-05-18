
package OrientacaoObjetos;

public class oItem {
    String nome;
    int quantidade;
    double preco;
    oCompra compra;
    
    public oItem(String nome, int quantidade, double preco){
        this.nome= nome;
        this.quantidade=quantidade;
        this.preco=preco;
    }

    @Override
    public String toString() {
        return "Itens: {" + "nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + '}';
    }
    
}
