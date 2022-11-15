/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.HashSet;
import java.util.Set;
import model.Aluno;
import model.Pessoa;
import model.Professor;
import repositorio.PessoaRepositorio;

/**
 *
 * @author Matheus
 */
public class PessoaDAO implements PessoaRepositorio{
    
    private static Set<Pessoa> pessoas;
    
    public PessoaDAO(){
        if(pessoas == null){
            pessoas = new HashSet<>();
        }
    }

    @Override
    public boolean addPessoa(Pessoa p) {
        return pessoas.add(p);
    }

    @Override
    public boolean removePessoa(String cpf) {
        return pessoas.remove(getPessoaByCpf(cpf));
    }

    @Override
    public Aluno getAlunoByMatricula(String matricula) {
        for(Pessoa p : pessoas){
            if(p instanceof Aluno aluno){
                if(aluno.getMatricula().equals(matricula)){
                    return aluno;
                }
            }
        }
        return null;
    }

    @Override
    public Professor getProfessorByMatricula(String matricula) {
        for(Pessoa p : pessoas){
            if(p instanceof Professor prof){
                if(prof.getMatricula().equals(matricula)){
                    return prof;
                }
            }
        }
        return null;
    }

    @Override
    public Set<Aluno> getAlunos() {
        Set<Aluno> alunos = new HashSet<>();
        pessoas.stream().filter(e -> e instanceof Aluno).forEach(e -> alunos.add((Aluno)e));
        return alunos;
    }

    @Override
    public Set<Professor> getProfessores() {
        Set<Professor> professores = new HashSet<>();
        pessoas.stream().filter(e -> e instanceof Professor).forEach(e -> professores.add((Professor)e));
        return professores;
    }

    @Override
    public Pessoa getPessoaByCpf(String cpf) {
        for(Pessoa p : pessoas){
            if(p.getCpf().equals(cpf)){
                return p;
            }
        }
        return null;
    }
    
    @Override
    public void imprimeAlunos(){
        for(Pessoa p : pessoas){
            if(p instanceof Aluno aluno){
                System.out.println(aluno.toString() + "\n");
            }
        }
    }
  
    @Override
    public void imprimeProfessores(){
        for(Pessoa p : pessoas){
            if(p instanceof Professor prof){
                System.out.println(prof.toString() + "\n");
            }
        }
    }
    
}
