/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Turma;
import repositorio.TurmaRepositorio;

/**
 *
 * @author Matheus
 */
public class TurmaDAO implements TurmaRepositorio{
    
    public static List<Turma> turmas;

    public TurmaDAO(){
        if(turmas == null){
            turmas = new ArrayList<>();
        }
    }
    
    @Override
    public boolean addTurma(Turma t) {
        return TurmaDAO.turmas.add(t);
    }

    @Override
    public boolean removeTurma(int codigo) {
        return TurmaDAO.turmas.remove(getTurmaById(codigo));
    }

    @Override
    public Turma getTurmaById(int codigo) {
        for(Turma t : turmas){
            if(t.getCodigo() == codigo){
                return t;
            }
        }
        return null;
    }

    @Override
    public List<Turma> getTurmas() {
        return TurmaDAO.turmas;
    }

        
    
}
