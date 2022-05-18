/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrientacaoObjetos;

/**
 *
 * @author Allan.Kelvin.Santos
 */
public class MainAluno {
    public static void main(String[] args) {
        oAluno aluno1 = new oAluno("Allan");
        oAluno aluno2 = new oAluno("Maria");
        oAluno aluno3 = new oAluno("Joao");
        
        oCurso curso1 = new oCurso("Java Basico 1");
        oCurso curso2 = new oCurso("Bnaco de Dados 1");
        oCurso curso3 = new oCurso("Logica de Programação 1");
        
        
        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        
        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);
        
       aluno1.adicionarCurso(curso3);
       aluno2.adicionarCurso(curso3);
       aluno3.adicionarCurso(curso3);
       
        for (oAluno aluno : curso3.alunos) {
            System.out.println("Estou Matriculado no Curso: "+curso3.nome);
            System.out.println("Meu Nome é: "+aluno.nome);
            System.out.println("");
        }
        
        System.out.println(aluno1.cursos.get(0).alunos);
     
    }
}
