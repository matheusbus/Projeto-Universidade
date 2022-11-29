/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MainView;

/**
 *
 * @author Matheus
 */
public final class ControllerMainView extends ControllerDefault{
    
    private MainView telaPrincipal;

    public ControllerMainView() {
        this.telaPrincipal = new MainView();
        inicializarBotoes();
    }
    
    @Override
    public void exibirTela(){
        telaPrincipal.exibirTela();
    }
    
    public void inicializarBotoes(){
        telaPrincipal.adicionarAcaoAoBotaoCadastrarAluno(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCadAlunoView();
            }
        });
        telaPrincipal.adicionarAcaoAoBotaoCadastrarCurso(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCadCursoView();
            }
        });
        telaPrincipal.adicionarAcaoAoBotaoCadastrarProfessor(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCadProfessorView();
            }
        });
        telaPrincipal.adicionarAcaoAoBotaoCadastrarTurma(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCadTurmaView();
            }
        });
    }
    
    public void openCadProfessorView(){
        ControllerCadProfessorView controllerCadProfessorView = new ControllerCadProfessorView();
        controllerCadProfessorView.exibirTela();
    }

    public void openCadAlunoView(){
        ControllerCadAlunoView controllerCadAlunoView = new ControllerCadAlunoView();
        controllerCadAlunoView.exibirTela();
    }
    
    public void openCadCursoView(){
        ControllerCadCursoView controllerCadCursoView = new ControllerCadCursoView();
        controllerCadCursoView.exibirTela();
    }
    
    public void openCadTurmaView(){
        ControllerCadTurmaView controllerCadTurmaView = new ControllerCadTurmaView();
        controllerCadTurmaView.exibirTela();
    }
    
}
