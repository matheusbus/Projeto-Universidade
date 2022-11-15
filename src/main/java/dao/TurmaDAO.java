/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.HashMap;
import java.util.Map;
import model.Turma;
import repositorio.TurmaRepositorio;

/**
 *
 * @author Matheus
 */
public class TurmaDAO implements TurmaRepositorio{
    
    public static Map<Integer, Turma> turmas;

    public TurmaDAO(){
        if(turmas == null){
            turmas = new HashMap<>();
        }
    }
    
    @Override
    public void addTurma(Turma t) {
        TurmaDAO.turmas.put(t.getCodigo(), t);
    }

    @Override
    public void removeTurma(int codigo) {
        TurmaDAO.turmas.remove(codigo);
    }

    @Override
    public Turma getTurmaById(int codigo) {
        if(turmas.containsKey(codigo)){
            return turmas.get(codigo);
        }
        return null;
    }

    @Override
    public Map<Integer, Turma> getTurmas() {
        return TurmaDAO.turmas;
    }

        
    
}
