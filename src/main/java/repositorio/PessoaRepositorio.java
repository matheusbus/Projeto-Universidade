/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorio;

import java.util.Set;
import model.Aluno;
import model.Pessoa;
import model.Professor;

/**
 *
 * @author Matheus
 */
public interface PessoaRepositorio {
    
    public boolean addPessoa(Pessoa p);
    public boolean removePessoa(String cpf);
    public Pessoa getPessoaByCpf(String cpf);
    public Aluno getAlunoByMatricula(String matricula);
    public Professor getProfessorByMatricula(String matricula);
    public Set<Aluno> getAlunos();
    public Set<Professor> getProfessores();
    
}
