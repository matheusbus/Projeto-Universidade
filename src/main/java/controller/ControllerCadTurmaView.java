/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.CursoDAO;
import dao.PessoaDAO;
import excecao.TurmaException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Curso;
import model.Professor;
import model.Turma;
import repositorio.CursoRepositorio;
import repositorio.PessoaRepositorio;
import view.CadTurmaView;

/**
 *
 * @author Matheus
 */
public final class ControllerCadTurmaView extends ControllerDefault{
    
    private CadTurmaView cadTurmaView;
    private Turma modeloTurma;

    public ControllerCadTurmaView() {
        this.cadTurmaView = new CadTurmaView();
        this.modeloTurma = null;
        initFields();
        inicializarBotoes();
    }
    
    public void inicializarBotoes(){
        cadTurmaView.adicionarAcaoAoBotaoCadastrar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    cadastrarTurma();
                } catch (TurmaException ex) {
                    cadTurmaView.showMessage("Erro", ex.getMessage());
                }
            }
        });
        cadTurmaView.adicionarAcaoAoBotaoCancelar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoCancelar();
            }
        });
    }
    
    public void cadastrarTurma() throws TurmaException{
        CursoRepositorio cursoRepositorio = new CursoDAO();
        Curso curso = cursoRepositorio.getCursoByNome(cadTurmaView.getCursoSelecionado());
        PessoaRepositorio pessoaRepositorio = new PessoaDAO();
        Professor professor = pessoaRepositorio.getProfessorByNome(cadTurmaView.getProfessorSelecionado());
        String nomeDisciplina = cadTurmaView.getNomeDisciplina();
        int qtdVagas = Integer.parseInt(cadTurmaView.getQuantidadeVagas());
        modeloTurma = new Turma(curso, professor, nomeDisciplina, qtdVagas);
        cadTurmaView.showMessage("Êxito", "Turma cadastrada com sucesso.");
        cadTurmaView.limparCampos();
    }
    
    public void acaoCancelar(){
        cadTurmaView.dispose();
    }
    
    public void initFields(){
        PessoaRepositorio pessoaRepositorio = new PessoaDAO();
        cadTurmaView.createProfessores(pessoaRepositorio.getProfessores());
        CursoRepositorio cursoRepositorio = new CursoDAO();
        cadTurmaView.createCursos(cursoRepositorio.getCursos());
    }

    @Override
    public void exibirTela() {
        cadTurmaView.exibirTela();
    }
    
    
}
