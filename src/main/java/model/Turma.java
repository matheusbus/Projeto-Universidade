/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import excecao.TurmaException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class Turma {

    private static int geradorCodigo = 0;
    private final int codigo;
    private Curso curso;
    private Professor professor;
    private String nomeDisciplina;
    private int vagas;
    private List<Aluno> alunos;

    public Turma(Curso curso, Professor professor, String nomeDisciplina, int vagas) {
        this.codigo = geradorCodigo++;
        this.curso = curso;
        this.professor = professor;
        this.nomeDisciplina = nomeDisciplina;
        this.vagas = vagas;
        this.alunos = new ArrayList<>();
    }

    public static int getGeradorCodigo() {
        return geradorCodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public Curso getCurso() {
        return curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public int getVagas() {
        return vagas;
    }
    
    public List<Aluno> getAlunos() {
        return alunos;
    }
    
    public boolean addAluno(Aluno a) throws TurmaException{
        if(vagas > 0){
            vagas -= vagas - 1;
            return this.alunos.add(a);
        } else {
            throw new TurmaException("Não há vagas para a turma.");
        }
    }
    
    public int getQuantidadeAlunosMatriculados(){
        return this.alunos.size();
    }
}
