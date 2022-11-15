/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Matheus
 */
public class Curso {
    
    private static int geradorCodigo = 0;
    private int codigo;
    private String nome;
    private List<Turma> turmas;

    public Curso(String nome) {
        this.nome = nome;
        this.codigo = geradorCodigo++;
    }

    public static int getGeradorCodigo() {
        return geradorCodigo;
    }

    public static void setGeradorCodigo(int geradorCodigo) {
        Curso.geradorCodigo = geradorCodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
    
    
    
}
