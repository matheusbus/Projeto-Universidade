/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Curso;
import repositorio.CursoRepositorio;

/**
 *
 * @author Matheus
 */
public class CursoDAO implements CursoRepositorio{

    private static List<Curso> cursos;

    public CursoDAO() {
        if(cursos == null){
            cursos = new ArrayList<>();
        }
    }
    
    @Override
    public boolean addCurso(Curso c) {
        return cursos.add(c);
    }

    @Override
    public boolean removeCurso(int codigo) {
        return cursos.remove(getCursoById(codigo));
    }

    @Override
    public Curso getCursoById(int codigo) {
        for(Curso c : cursos){
            if(c.getCodigo() == codigo){
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Curso> getCursos() {
        return cursos;
    }
        
}
