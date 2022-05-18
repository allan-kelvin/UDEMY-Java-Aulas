/*
 * COMO FUNCIONA EQUALS E HASHCODE
 */
package arrays;

public class EqualsHashCode {
    public static void main(String[] args) {
        
        //Instânciando o Objeto;
        UsuarioEquals usuario1 = new UsuarioEquals();
        usuario1.nome="Allan";
        usuario1.email="allankelvin.santos@hotmail.com";
        
        UsuarioEquals usuario2 = new UsuarioEquals();
        usuario2.nome="Kelvin";
        usuario2.email="allankelvin.timao@hotmail.com";
        
        //usuando o metódo EQUALS
        
        System.out.println(usuario1.equals(usuario2));
        
    }
    
}
