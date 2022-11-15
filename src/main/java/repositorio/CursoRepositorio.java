/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorio;

import java.util.List;
import model.Curso;

/**
 *
 * @author Matheus
 */
public interface CursoRepositorio {
    
    public boolean addCurso(Curso c);
    public boolean removeCurso(int codigo);
    public Curso getCursoById(int codigo);
    public List<Curso> getCursos();
    
}
