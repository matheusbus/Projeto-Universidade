/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.intellijthemes.FlatHiberbeeDarkIJTheme;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Matheus
 */
public final class MainView extends DefaultView {

    /**
     * Creates new form MainForm
     */
    public MainView() {
        initComponents();
        initLayout();
        initButtons();
    }
    
    @Override
    public void initButtons() {
        miCadProfessor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCadProfessorView();
            }
        }
        );
        miCadAluno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCadAlunoView();
            }
        });
        miCadCurso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCadCursoView();
            }
        });
        miCadTurma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCadTurmaView();
            }
        });
    }

    @Override
    public void initLayout() {
        this.setContentPane(pnlBackground);
        this.setLocationRelativeTo(null);
        this.setSize(800, 500);
    }    
    
    public void openCadProfessorView(){
        CadProfessorView cadProfessor = new CadProfessorView();
        cadProfessor.setVisible(true);
    }

    public void openCadAlunoView(){
        CadAlunoView cadAluno = new CadAlunoView();
        cadAluno.setVisible(true);
    }
    
    public void openCadCursoView(){
        CadCursoView cadCurso = new CadCursoView();
        cadCurso.setVisible(true);
    }
    
    public void openCadTurmaView(){
        CadTurmaView cadTurma = new CadTurmaView();
        cadTurma.setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        pnlBackground = new javax.swing.JPanel();
        mbPrincipal = new javax.swing.JMenuBar();
        muCadastro = new javax.swing.JMenu();
        miCadProfessor = new javax.swing.JMenuItem();
        miCadAluno = new javax.swing.JMenuItem();
        miCadCurso = new javax.swing.JMenuItem();
        miCadTurma = new javax.swing.JMenuItem();
        muConsulta = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Universidade Informatizada");

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        muCadastro.setText("Cadastros");

        miCadProfessor.setText("Professores");
        muCadastro.add(miCadProfessor);

        miCadAluno.setText("Alunos");
        muCadastro.add(miCadAluno);

        miCadCurso.setText("Cursos");
        muCadastro.add(miCadCurso);

        miCadTurma.setText("Turmas");
        muCadastro.add(miCadTurma);

        mbPrincipal.add(muCadastro);

        muConsulta.setText("Consultas");
        mbPrincipal.add(muConsulta);

        setJMenuBar(mbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatHiberbeeDarkIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainView().setVisible(true);
        });
    }    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenuBar mbPrincipal;
    private javax.swing.JMenuItem miCadAluno;
    private javax.swing.JMenuItem miCadCurso;
    private javax.swing.JMenuItem miCadProfessor;
    private javax.swing.JMenuItem miCadTurma;
    private javax.swing.JMenu muCadastro;
    private javax.swing.JMenu muConsulta;
    private javax.swing.JPanel pnlBackground;
    // End of variables declaration//GEN-END:variables


}
