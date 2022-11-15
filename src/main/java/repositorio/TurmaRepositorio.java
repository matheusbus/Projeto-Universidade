/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorio;

import java.util.Map;
import model.Turma;

/**
 *
 * @author Matheus
 */
public interface TurmaRepositorio {
    
    public void addTurma(Turma t);
    public void removeTurma(int codigo);
    public Turma getTurmaById(int codigo);
    public Map<Integer, Turma> getTurmas();
    
}
