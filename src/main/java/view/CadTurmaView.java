/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.ActionListener;
import java.util.List;
import java.util.Set;
import model.Curso;
import model.Professor;
import model.Turma;


/**
 *
 * @author Matheus
 */
public final class CadTurmaView extends DefaultView {

   
    public CadTurmaView() {
        initComponents();
        initLayout();
    }

    public void adicionarAcaoAoBotaoCadastrar(ActionListener acao){
        btnSave.addActionListener(acao);
    }
    
    public void adicionarAcaoAoBotaoCancelar(ActionListener acao){
        btnCancel.addActionListener(acao);
    }

    @Override
    public void initLayout() {
        this.setContentPane(pnlBackground);
        this.setSize(600, 250);
        this.txtCodigo.setText(Integer.toString(Turma.getGeradorCodigo()+1));
    }    
    
    public void createCursos(List<Curso> cursos){
        for(Curso c : cursos){
            cbCurso.addItem(c.getNome());
        }
    }
    
    public void createProfessores(Set<Professor> professores){
        for(Professor p : professores){
            cbProfessor.addItem(p.getNome());
        }
    }
    
    public String getCursoSelecionado(){
        return (String) cbCurso.getSelectedItem();
    }
    
    public String getProfessorSelecionado(){
        return (String) cbProfessor.getSelectedItem();
    }
    
    public String getQuantidadeVagas(){
        return (String) cbVagas.getSelectedItem();
    }
    
    public String getNomeDisciplina(){
        return txtNomeDisciplina.getText();
    }
    
    public void limparCampos(){
        this.cbCurso.setSelectedIndex(0);
        this.cbProfessor.setSelectedIndex(0);
        this.cbVagas.setSelectedIndex(0);
        this.txtCodigo.setText(Integer.toString(Turma.getGeradorCodigo()+1));
        this.txtNomeDisciplina.setText(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblCurso = new javax.swing.JLabel();
        cbCurso = new javax.swing.JComboBox<>();
        lblProfessor = new javax.swing.JLabel();
        cbProfessor = new javax.swing.JComboBox<>();
        lblNomeDisciplina = new javax.swing.JLabel();
        txtNomeDisciplina = new javax.swing.JTextField();
        lblVaga = new javax.swing.JLabel();
        cbVagas = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cursos");

        lblCodigo.setForeground(new java.awt.Color(255, 153, 51));
        lblCodigo.setText("C??digo");

        txtCodigo.setEditable(false);
        txtCodigo.setForeground(new java.awt.Color(255, 153, 51));

        lblCurso.setForeground(new java.awt.Color(255, 153, 51));
        lblCurso.setText("Curso");

        lblProfessor.setForeground(new java.awt.Color(255, 153, 51));
        lblProfessor.setText("Professor");

        lblNomeDisciplina.setForeground(new java.awt.Color(255, 153, 51));
        lblNomeDisciplina.setText("Nome da Disciplina");

        lblVaga.setForeground(new java.awt.Color(255, 153, 51));
        lblVaga.setText("Vagas");

        cbVagas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        btnSave.setBackground(new java.awt.Color(255, 153, 51));
        btnSave.setForeground(new java.awt.Color(0, 0, 0));
        btnSave.setText("Cadastrar");

        btnCancel.setBackground(new java.awt.Color(190, 190, 190));
        btnCancel.setForeground(new java.awt.Color(0, 0, 0));
        btnCancel.setText("Cancelar");

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBackgroundLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbVagas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProfessor)
                                    .addComponent(cbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                        .addComponent(lblCodigo)
                                        .addGap(55, 55, 55)
                                        .addComponent(lblCurso)))
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(lblNomeDisciplina)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNomeDisciplina))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblVaga)
                                        .addGap(55, 55, 55))))))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap(280, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(lblCurso)
                    .addComponent(lblVaga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfessor)
                    .addComponent(lblNomeDisciplina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbCurso;
    private javax.swing.JComboBox<String> cbProfessor;
    private javax.swing.JComboBox<String> cbVagas;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblNomeDisciplina;
    private javax.swing.JLabel lblProfessor;
    private javax.swing.JLabel lblVaga;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNomeDisciplina;
    // End of variables declaration//GEN-END:variables

}
