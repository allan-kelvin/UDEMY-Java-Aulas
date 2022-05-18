/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrientacaoObjetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Allan.Kelvin.Santos
 */
public class oCurso {
    final String nome;
    final List<oAluno> alunos = new ArrayList<>();

    public oCurso(String nome) {
        this.nome = nome;
    }
    
    void adicionarAluno(oAluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add((this));
    }
}
