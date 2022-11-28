/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.PessoaDAO;
import excecao.PessoaException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Professor;
import repositorio.PessoaRepositorio;
import view.CadProfessorView;

/**
 *
 * @author Matheus
 */
public final class ControllerCadProfessorView {
    
    private CadProfessorView cadProfessorView;
    private Professor modeloProfessor;
    

    public ControllerCadProfessorView() {
        this.cadProfessorView = new CadProfessorView();
        this.modeloProfessor = null;
        inicializarBotoes();
    }
    
    public void inicializarBotoes(){
        cadProfessorView.adicionarAcaoAoBotaoSalvar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    saveProfessor();
                } catch (PessoaException ex) {
                    cadProfessorView.showMessage("Erro", ex.getMessage());
                }
            }
        });
        cadProfessorView.adicionarAcaoAoBotaoCancelar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AcaoCancelar();
            }
        });
    }
    
    public void saveProfessor() throws PessoaException{
        Professor novoProfessor;
        String nome = cadProfessorView.getNomeProfessor();
        String cpf = cadProfessorView.getCpfProfessor();
        String matricula = cadProfessorView.getMatriculaProfessor();
        String dataAdmissao = cadProfessorView.getDataAdmissaoProfessor();
        if(nome.isBlank() || cpf.isBlank() || matricula.isBlank() || dataAdmissao.isBlank()){
            throw new PessoaException("Preencha todos os campos.");
        }
        PessoaRepositorio pessoaRepositorio = new PessoaDAO();
        modeloProfessor = new Professor(matricula, dataAdmissao, nome, cpf);
        pessoaRepositorio.addPessoa(modeloProfessor);
        cadProfessorView.showMessage("Exito", "Professor '" + modeloProfessor.getNome() + "' cadastrado com sucesso.");
        cadProfessorView.limparTela();
        System.out.println(pessoaRepositorio.getProfessores());
    }
    
    public void AcaoCancelar(){
        cadProfessorView.dispose();
    }
    
    public void exibirTela(){
        cadProfessorView.exibirTela();
    }
    
}
