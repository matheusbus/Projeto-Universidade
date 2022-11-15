/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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
}
