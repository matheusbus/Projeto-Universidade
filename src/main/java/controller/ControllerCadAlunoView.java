/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.PessoaDAO;
import excecao.PessoaException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Aluno;
import repositorio.PessoaRepositorio;
import view.CadAlunoView;

/**
 *
 * @author Matheus
 */
public class ControllerCadAlunoView {
    
    private CadAlunoView telaCadAlunoView;
    private Aluno modeloAluno;

    public ControllerCadAlunoView() {
        telaCadAlunoView = new CadAlunoView();
        modeloAluno = null;
        inicializarBotoes();
    }
    
    public void inicializarBotoes(){
        telaCadAlunoView.adicionarAcaoAoBotaoCadastrarAluno(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    saveAluno();
                } catch (PessoaException ex) {
                    telaCadAlunoView.showMessage("Erro", ex.getMessage());
                }
            }
        });
    }
    
    public void saveAluno() throws PessoaException{
        Aluno novoAluno;
        String nome = telaCadAlunoView.getNomeAluno();
        String cpf = telaCadAlunoView.getCpfAluno();
        String matricula = telaCadAlunoView.getMatriculaAluno();
        if(nome.isBlank()){
            throw new PessoaException("O nome do aluno não pode ser nulo");
        }
        try {
            int idade = Integer.parseInt(telaCadAlunoView.getIdadeAluno());
            novoAluno = new Aluno(matricula, nome, cpf, idade);
        } catch (NumberFormatException ex){
            throw new PessoaException("Erro na conversão de valores para o valor: " + ex.getMessage());
        }
        PessoaRepositorio repositorioDeAlunos = new PessoaDAO();
        repositorioDeAlunos.addPessoa(novoAluno);
        telaCadAlunoView.showMessage("Êxito", "Aluno cadastrado com sucesso.");
        telaCadAlunoView.limparTela();
        System.out.println(repositorioDeAlunos.getAlunos());
    }
    
    public void exibirTela(){
        telaCadAlunoView.exibirTela();
    }
    
    
    
}
