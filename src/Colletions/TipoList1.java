/*
 *Criando uma Lista
 */
package Colletions;

import java.util.ArrayList;

public class TipoList1 {
    public static void main(String[] args) {
        
        //Criando uma Lista de Objeto
        ArrayList<oUsuario> lista = new ArrayList<>();
        
        //Aqui estamos adicionando um elemento a lista, ja instanciando o objeto dentro.
        lista.add(new oUsuario("Allan"));
        lista.add(new oUsuario("Marcus"));
        lista.add(new oUsuario("Bazan"));
        lista.add(new oUsuario("Rafael"));
        lista.add(new oUsuario("Lucão"));
        
        //Imprimindo uma Lista
        
        for (oUsuario usuario : lista) {
            System.out.println(usuario.nome);
        }
        
        //Podemos imprimir também, apenas 1 elementro especificando, usando o metodo, GET.
        
        System.out.println("O elemento 3 é:  "+ lista.get(3).nome);
    }
    
}
