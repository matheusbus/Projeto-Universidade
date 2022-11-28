/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.CursoDAO;
import excecao.CursoException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Curso;
import repositorio.CursoRepositorio;
import view.CadCursoView;

/**
 *
 * @author Matheus
 */
public final class ControllerCadCursoView {
    
    private CadCursoView cadCursoView;
    private Curso modeloCurso;

    public ControllerCadCursoView() {
        this.cadCursoView = new CadCursoView();
        this.modeloCurso = null;
        inicializarBotoes();
    }
    
    public void inicializarBotoes(){
        cadCursoView.adicionarAcaoAoBotaoSalvar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    saveCurso();
                } catch (CursoException ex) {
                    cadCursoView.showMessage("Erro", ex.getMessage());
                }
            }
        });
        cadCursoView.adicionarAcaoAoBotaoCancelar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelar();
            }
        });
    }
    
    public void cancelar(){
        cadCursoView.dispose();
    }
    
    public void saveCurso() throws CursoException{
        String nome = cadCursoView.getNomeCurso();
        if(nome.isBlank()){
            throw new CursoException("O nome do curso não pode ser nulo.");
        }
        modeloCurso = new Curso(nome);
        CursoRepositorio cursoRepositorio = new CursoDAO();
        cursoRepositorio.addCurso(modeloCurso);
    }

    
    public void exibirTela(){
        cadCursoView.exibirTela();
    }
    
    
    
}
