/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrientacaoObjetos;

import java.util.ArrayList;

/**
 *
 * @author Allan.Kelvin.Santos
 */
public class oAluno {
     final String nome;
    
    final ArrayList<oCurso> cursos = new ArrayList<>();

    public oAluno(String nome) {
        this.nome = nome;
    } 
    
    void adicionarCurso(oCurso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
    
    oCurso getCursoPorNome(String nome){
        for (oCurso curso : this.cursos) {
          if(curso.nome.equalsIgnoreCase(nome)) {
              return curso;
          } 
        }
        return null;
    }

    @Override
    public String toString() {
        return "Nome:"+nome;
    }
    
    
}
