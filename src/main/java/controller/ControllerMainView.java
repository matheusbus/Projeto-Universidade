/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadCursoView;
import view.CadTurmaView;
import view.MainView;

/**
 *
 * @author Matheus
 */
public final class ControllerMainView {
    
    private MainView telaPrincipal;

    public ControllerMainView() {
        this.telaPrincipal = new MainView();
        inicializarBotoes();
    }
    
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
        CadCursoView cadCurso = new CadCursoView();
        cadCurso.setVisible(true);
    }
    
    public void openCadTurmaView(){
        CadTurmaView cadTurma = new CadTurmaView();
        cadTurma.setVisible(true);
    }
    
}
