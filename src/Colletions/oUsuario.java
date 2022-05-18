/*
 * Objeto Usuario para Colletions
 */
package Colletions;

import java.util.Objects;

public class oUsuario {
    String nome;
    
    
    oUsuario(String nome){
        this.nome=nome;
    }
    


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final oUsuario other = (oUsuario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "oUsuario{" + "nome=" + nome + '}';
    }
    
}
