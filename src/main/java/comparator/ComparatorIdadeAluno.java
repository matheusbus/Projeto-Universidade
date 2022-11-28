/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparator;

import java.util.Comparator;
import model.Aluno;

/**
 *
 * @author Matheus
 */
public class ComparatorIdadeAluno implements Comparator<Aluno>{

    @Override
    public int compare(Aluno a1, Aluno a2) {
        if(a1.getIdade() > a2.getIdade()){
            return 1;
        } else if (a1.getIdade() == a2.getIdade()){
            return a1.getNome().compareTo(a2.getNome());
        } else {
            return -1;
        }
    }
    
}
