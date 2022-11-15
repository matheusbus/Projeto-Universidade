/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Matheus
 */
public class Professor extends Pessoa{
    
    private final String matricula;
    private final String dataAdmissao;

    public Professor(String matricula, String dataAdmissao, String nome, String cpf) {
        super(nome, cpf);
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    @Override
    public String toString() {
        return super.toString() + " | Professor{" + "matricula=" + matricula + ", dataAdmissao=" + dataAdmissao + '}';
    }    
}
