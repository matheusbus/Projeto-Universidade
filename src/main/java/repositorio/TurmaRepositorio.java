/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorio;

import java.util.List;
import model.Turma;

/**
 *
 * @author Matheus
 */
public interface TurmaRepositorio {
    
    public boolean addTurma(Turma t);
    public boolean removeTurma(int codigo);
    public Turma getTurmaById(int codigo);
    public List<Turma> getTurmas();
    
}
