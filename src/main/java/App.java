
import controller.ControllerMainView;
import excecao.TurmaException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import model.Aluno;
import model.Curso;
import model.Professor;
import model.Turma;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Matheus
 */
public class App {
    
    public static void main(String[] args) {
        
        ControllerMainView controllerMainView = new ControllerMainView();
        controllerMainView.exibirTela();
        
        /*Aluno aluno1 = new Aluno("123561", "Matheus", "123456789", 18);
        Aluno aluno2 = new Aluno("4354186", "Rafael", "15684988", 20);
        Aluno aluno3 = new Aluno("1568432", "João", "84685132", 19);
        Aluno aluno4 = new Aluno("3548651", "Cleber", "65461351", 21);
        Professor prof1 = new Professor("1651313", "21/01/2020", "Paolo Moser", "1235184");
        
        Curso curso = new Curso("Engenharia de Software");
        Turma turma = null;
        
        try {
            turma = new Turma(curso, prof1, "Programação 1", 4);               
            turma.matricularAluno(aluno1);
            turma.matricularAluno(aluno2);
            turma.matricularAluno(aluno3);
            turma.matricularAluno(aluno4);
        } catch (TurmaException ex){
            System.out.println(ex.getMessage());
        }
        
        List<Aluno> alunosOrdenadosMatricula = turma.getAlunos();
        Collections.sort(alunosOrdenadosMatricula);
        System.out.println("Alunos ordenados por matricula:");
        for(Aluno a : alunosOrdenadosMatricula){
            System.out.println(a.toString());
        }
        List<Aluno> alunosOrdenadosIdade = turma.getAlunos();
        Collections.sort(alunosOrdenadosIdade, new Comparator<Aluno>() {
            @Override
            public int compare(Aluno o1, Aluno o2) {
                if(o1.getIdade() > o2.getIdade()){
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        System.out.println("Alunos ordenados por idade:");
        for(Aluno a : alunosOrdenadosIdade){
            System.out.println(a.toString());
        }
        System.out.println("Alunos ordenados por nome:");
        Collections.sort(alunosOrdenadosIdade);*/
        
        
    }
    
}
