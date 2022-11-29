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

    public Turma(Curso curso, Professor professor, String nomeDisciplina, int vagas) throws TurmaException {
        this.codigo = geradorCodigo++;
        this.curso = curso;
        this.professor = professor;
        this.nomeDisciplina = nomeDisciplina;
        this.vagas = vagas;
        this.alunos = new ArrayList<>();
        
        if(this.vagas <= 0){
            throw new TurmaException("A quantidade de vagas deve ser maior que zero.");
        }
        if(this.professor == null){
            throw new TurmaException("Deve ser informado um professor.");
        }
        if(this.curso == null){
            throw new TurmaException("Deve ser informado um curso.");
        }
        if(this.nomeDisciplina.isBlank()){
            throw new TurmaException("O nome da disciplina não pode ser nulo.");
        }
    }

    public void matricularAluno(Aluno aluno) throws TurmaException{
        if(this.getVagas() > 0){
            alunos.add(aluno);
            this.vagas = getVagas() -1;
        } else {
            throw new TurmaException("Não há vagas disponíveis na disciplina.");
        }
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
    
    
    public int getQuantidadeAlunosMatriculados(){
        return this.alunos.size();
    }

    @Override
    public String toString() {
        return "Turma{" + "vagas=" + vagas + ", alunos=" + alunos + '}';
    }
    
    
}
