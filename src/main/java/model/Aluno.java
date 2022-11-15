/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Matheus
 */
public class Aluno extends Pessoa{
    
    private final String matricula;
    private final int idade;

    public Aluno(String matricula, String nome, String cpf, int idade) {
        super(nome, cpf);
        this.matricula = matricula;
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", idade=" + idade + '}';
    }
    
    
    
}
