/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import control.ObraControl;
import entity.ObraBean;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author gabriela.oliveira
 */


public class ManterObra extends javax.swing.JFrame {

    DefaultTableModel tmObras = new DefaultTableModel(null, new String[]{"Título", "Autor", "Piso", "Andar"});
    ListSelectionModel lsmObras;
    List<ObraBean> obras;
   
    
    public ManterObra() {
        System.out.println("Iniciando initComponents()");
        initComponents();
        
        cbMes.setVisible(false);
        cbAno.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dataObraBtnG = new javax.swing.ButtonGroup();
        expoBtnG = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        tfAltura = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfLargura = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfProfundidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfPeso = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rbSeculo = new javax.swing.JRadioButton();
        tfMuseu = new javax.swing.JTextField();
        rbData = new javax.swing.JRadioButton();
        btLimparTela = new javax.swing.JButton();
        cbSeculo = new javax.swing.JComboBox();
        btnCadastrar = new javax.swing.JButton();
        cbMes = new javax.swing.JComboBox();
        btnPesquisaTitulo = new javax.swing.JButton();
        cbAno = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        btnPesquisaAutor = new javax.swing.JButton();
        cbPiso = new javax.swing.JComboBox();
        cbSetor = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cbExposicao = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfAutor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbxObraEmprestada = new javax.swing.JCheckBox();
        btnAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbObras = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setTitle("Obras");

        jLabel9.setText("Largura: ");

        tfLargura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLarguraActionPerformed(evt);
            }
        });

        jLabel10.setText("Profundidade:");

        tfProfundidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProfundidadeActionPerformed(evt);
            }
        });

        jLabel11.setText("Peso:");

        tfPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesoActionPerformed(evt);
            }
        });

        jLabel12.setText("Situação:");

        jLabel13.setText("Museu:");

        dataObraBtnG.add(rbSeculo);
        rbSeculo.setSelected(true);
        rbSeculo.setText("Século");
        rbSeculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSeculoActionPerformed(evt);
            }
        });

        tfMuseu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMuseuActionPerformed(evt);
            }
        });

        dataObraBtnG.add(rbData);
        rbData.setText("Data");
        rbData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDataActionPerformed(evt);
            }
        });

        btLimparTela.setText("Limpar Tela");
        btLimparTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparTelaActionPerformed(evt);
            }
        });

        cbSeculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XI" }));
        cbSeculo.setToolTipText("SEC");
        cbSeculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeculoActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        cbMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro" }));

        btnPesquisaTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boundary/imgLupa.jpg"))); // NOI18N
        btnPesquisaTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaTituloActionPerformed(evt);
            }
        });

        cbAno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1900", "1910", "1920", "1930" }));

        jLabel5.setText("Local da obra no MASP");

        btnPesquisaAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boundary/imgLupa.jpg"))); // NOI18N
        btnPesquisaAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaAutorActionPerformed(evt);
            }
        });

        cbPiso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-1", "0", "1", "2" }));

        cbSetor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Norte", "Sul", "Leste", "Oeste" }));

        jLabel6.setText("Obra pertencente a exposição");

        cbExposicao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhuma", "Expo 1", "Expo 2", "Expo 3", "Expo 4" }));

        jLabel1.setText("Cod:");

        tfCodigo.setEditable(false);
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Título:");

        tfTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTituloActionPerformed(evt);
            }
        });

        jLabel3.setText("Autor: ");

        tfAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAutorActionPerformed(evt);
            }
        });

        jLabel4.setText("Data da Obra");

        jLabel7.setText("Dimensões");

        jLabel8.setText("Altura:");

        cbxObraEmprestada.setText("Obra Emprestada");

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        tbObras.setModel(tmObras);
        tbObras.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmObras = tbObras.getSelectionModel();
        lsmObras.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (! e.getValueIsAdjusting()){
                    tbObrasLinhaSelecionada(tbObras);
                }
            }
        });
        jScrollPane1.setViewportView(tbObras);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(8, 8, 8)
                        .addComponent(cbxObraEmprestada)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfMuseu, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel8)
                            .addGap(4, 4, 4)
                            .addComponent(tfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(jLabel9)
                            .addGap(4, 4, 4)
                            .addComponent(tfLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(jLabel10)
                            .addGap(4, 4, 4)
                            .addComponent(tfProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(jLabel11)
                            .addGap(10, 10, 10)
                            .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel7))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel4)
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbSeculo)
                                .addComponent(rbData))
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbSeculo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbMes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(4, 4, 4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                        .addComponent(tfTitulo))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnPesquisaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnPesquisaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addGap(57, 57, 57)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbExposicao, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btLimparTela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnCadastrar, btnExcluir});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbSeculo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(rbData))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbSeculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbExposicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxObraEmprestada)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(tfMuseu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimparTela)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarObraAutor(){
        ObraControl ob = new ObraControl();
        obras = ob.mostrarObraPesquisa(tfAutor.getText().trim(), "autor");
        mostrarObra(obras);
    }
    
    private void btnPesquisaAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaAutorActionPerformed
        mostrarObraAutor();
    }//GEN-LAST:event_btnPesquisaAutorActionPerformed
    
    public void mostrarObra(List<ObraBean> obras){
        while(tmObras.getRowCount() > 0){
            tmObras.removeRow(0);
        }
        if(obras.size() > 0){
            String [] campos = new String[] {null, null, null, null};
            for(int i = 0; i < obras.size(); i++){
                tmObras.addRow(campos);
                tmObras.setValueAt(obras.get(i).getTituloObra(), i, 0);
                tmObras.setValueAt(obras.get(i).getAutorObra(), i, 1);
                tmObras.setValueAt(obras.get(i).getPisoObra(), i, 2);
                tmObras.setValueAt(obras.get(i).getSetorObra(), i, 3);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma obra encontrada!", "Control + Art", 2);
        }
    }
    
    public void tbObrasLinhaSelecionada(JTable tb){
        if (tb.getSelectedRow() != -1){
            tfCodigo.setText(obras.get(tb.getSelectedRow()).getCodigoObra().toString());
            tfTitulo.setText(obras.get(tb.getSelectedRow()).getTituloObra());
            tfAutor.setText(obras.get(tb.getSelectedRow()).getAutorObra());
            if(obras.get(tb.getSelectedRow()).getTipoDataObra().equals("seculo")){
                cbSeculo.setVisible(true);
                rbSeculo.setSelected(true);
                cbSeculo.setSelectedItem(obras.get(tb.getSelectedRow()).getSeculoObra());
                cbMes.setVisible(false);
                cbAno.setVisible(false);
            } else {
                rbData.setSelected(true);
                cbSeculo.setVisible(false);
                cbMes.setVisible(true);
                cbAno.setVisible(true);
                cbMes.setSelectedItem(obras.get(tb.getSelectedRow()).getMesObra());
                cbAno.setSelectedItem(obras.get(tb.getSelectedRow()).getAnoObra());
            }
            //lbImagem.setText(obras.get(0).getImagemObra());
            cbPiso.setSelectedItem(obras.get(tb.getSelectedRow()).getPisoObra().toString());
            cbSetor.setSelectedItem(obras.get(tb.getSelectedRow()).getSetorObra());
            tfAltura.setText(obras.get(tb.getSelectedRow()).getAlturaObra().toString());
            tfLargura.setText(obras.get(tb.getSelectedRow()).getLarguraObra().toString());
            tfProfundidade.setText(obras.get(tb.getSelectedRow()).getProfundidadeObra().toString());
            tfPeso.setText(obras.get(tb.getSelectedRow()).getPesoObra().toString());
            cbxObraEmprestada.setSelected(obras.get(tb.getSelectedRow()).getEmprestadaObra());
            cbExposicao.setSelectedItem(obras.get(tb.getSelectedRow()).getExposicaoObra());
            tfMuseu.setText(obras.get(tb.getSelectedRow()).getMuseuObra());
        }
    }
    
    public void mostrarObraCodigo(){
        ObraControl ob = new ObraControl();
        obras = ob.mostrarObraCod(Integer.parseInt(tfCodigo.getText().trim()));
        mostrarObra(obras);
    }
    
    public void mostrarObraTitulo(){
        ObraControl ob = new ObraControl();
        obras = ob.mostrarObraPesquisa(tfTitulo.getText().trim(), "titulo");
        mostrarObra(obras);
    }
    
    private void btnPesquisaTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaTituloActionPerformed
        mostrarObraTitulo();
    }//GEN-LAST:event_btnPesquisaTituloActionPerformed

    public void cadastraObra(){
        
        ObraBean obra = new ObraBean();
        obra.setTituloObra(tfTitulo.getText().trim());
        if(rbSeculo.isSelected()){
            obra.setTipoDataObra("seculo");
            obra.setSeculoObra(cbSeculo.getSelectedItem().toString());
            obra.setMesObra("");
            obra.setAnoObra(0);
        } else {
            obra.setTipoDataObra("data");
            obra.setSeculoObra("");
            obra.setMesObra(cbMes.getSelectedItem().toString());
            obra.setAnoObra(Integer.parseInt(cbAno.getSelectedItem().toString()));
        }
        //obra.setImagemObra(lbImagem.getText().trim());
        obra.setPisoObra(Integer.parseInt(cbPiso.getSelectedItem().toString()));
        obra.setSetorObra(cbSetor.getSelectedItem().toString());
        obra.setAlturaObra(Double.parseDouble(tfAltura.getText().trim()));
        obra.setLarguraObra(Double.parseDouble(tfLargura.getText().trim()));
        obra.setProfundidadeObra(Double.parseDouble(tfProfundidade.getText().trim()));
        obra.setPesoObra(Double.parseDouble(tfPeso.getText().trim()));
        obra.setEmprestadaObra(cbxObraEmprestada.isSelected());
        obra.setAutorObra(tfAutor.getText().trim());
        obra.setExposicaoObra(cbExposicao.getSelectedItem().toString());
        obra.setMuseuObra(tfMuseu.getText().trim());
        ObraControl c = new ObraControl();
        c.cadastrarObra(obra);
        JOptionPane.showMessageDialog(null, "Obra cadastrada com sucesso", "Control + Art", 3);
        limpaTela();

    }
    
    private void limpaTela(){
        while(tmObras.getRowCount() > 0){
            tmObras.removeRow(0);
        }
        tfCodigo.setText("");
        tfTitulo.setText("");
        cbSeculo.setSelectedIndex(0);
        cbMes.setSelectedIndex(0);
        cbAno.setSelectedIndex(0);
        //lbImagem.setText("");
        cbPiso.setSelectedIndex(0);
        cbSetor.setSelectedIndex(0);
        tfAltura.setText("");
        tfLargura.setText("");
        tfProfundidade.setText("");
        tfPeso.setText("");
        cbxObraEmprestada.setSelected(false);
        tfAutor.setText("");
        cbExposicao.setSelectedIndex(0);
        tfMuseu.setText("");
        
    }
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastraObra();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tfMuseuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMuseuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMuseuActionPerformed

    private void tfPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesoActionPerformed

    private void tfProfundidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProfundidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfProfundidadeActionPerformed

    private void cbSeculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSeculoActionPerformed

    private void rbDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDataActionPerformed
        // TODO add your handling code here:
        if (rbData.isSelected()){
            rbSeculo.setSelected(false);
            cbSeculo.setVisible(false);
            cbMes.setVisible(true);
            cbAno.setVisible(true);
        }
    }//GEN-LAST:event_rbDataActionPerformed

    private void rbSeculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSeculoActionPerformed
        // TODO add your handling code here:

        if (rbSeculo.isSelected()){
            rbData.setSelected(false);
            cbSeculo.setVisible(true);
            cbMes.setVisible(false);
            cbAno.setVisible(false);
        }
    }//GEN-LAST:event_rbSeculoActionPerformed

    private void tfAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAutorActionPerformed

    private void tfTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTituloActionPerformed
        // TODO add your handling code here:
        tfTitulo.setText(String.format(" "));
    }//GEN-LAST:event_tfTituloActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void btLimparTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparTelaActionPerformed
        limpaTela();
    }//GEN-LAST:event_btLimparTelaActionPerformed

    private void tfLarguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLarguraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLarguraActionPerformed

    public void alteraObra(){
        ObraBean obra = new ObraBean();
        obra.setCodigoObra(Integer.parseInt(tfCodigo.getText()));
        obra.setTituloObra(tfTitulo.getText().trim());
        if(rbSeculo.isSelected()){
            obra.setTipoDataObra("seculo");
            obra.setSeculoObra(cbSeculo.getSelectedItem().toString());
            obra.setMesObra("");
            obra.setAnoObra(0);
        } else {
            obra.setTipoDataObra("data");
            obra.setSeculoObra("");
            obra.setMesObra(cbMes.getSelectedItem().toString());
            obra.setAnoObra(Integer.parseInt(cbAno.getSelectedItem().toString()));
        }
        //obra.setImagemObra(lbImagem.getText().trim());
        obra.setPisoObra(Integer.parseInt(cbPiso.getSelectedItem().toString()));
        obra.setSetorObra(cbSetor.getSelectedItem().toString());
        obra.setAlturaObra(Double.parseDouble(tfAltura.getText().trim()));
        obra.setLarguraObra(Double.parseDouble(tfLargura.getText().trim()));
        obra.setProfundidadeObra(Double.parseDouble(tfProfundidade.getText().trim()));
        obra.setPesoObra(Double.parseDouble(tfPeso.getText().trim()));
        obra.setEmprestadaObra(cbxObraEmprestada.isSelected());
        obra.setAutorObra(tfAutor.getText().trim());
        obra.setExposicaoObra(cbExposicao.getSelectedItem().toString());
        obra.setMuseuObra(tfMuseu.getText().trim());
        ObraControl c = new ObraControl();
        c.alterarObra(obra);
        JOptionPane.showMessageDialog(null, "Obra alterada com sucesso", "Control + Art", 3);
    }
    
    public void excluiObra(){
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir essa obra?", "Control + Art", JOptionPane.YES_NO_OPTION);
        if (opcao == 0){
            ObraBean obra = new ObraBean();
            obra.setCodigoObra(Integer.parseInt(tfCodigo.getText()));
            ObraControl c = new ObraControl();
            c.excluirObra(obra);
            JOptionPane.showMessageDialog(null, "Obra excluida com sucesso", "Control + Art", 3);
        } 
    }
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alteraObra();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluiObra();
        
        while(tmObras.getRowCount() > 0){
            tmObras.removeRow(0);
        }
        limpaTela();
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManterObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManterObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManterObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManterObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManterObra().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimparTela;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisaAutor;
    private javax.swing.JButton btnPesquisaTitulo;
    private javax.swing.JComboBox cbAno;
    private javax.swing.JComboBox cbExposicao;
    private javax.swing.JComboBox cbMes;
    private javax.swing.JComboBox cbPiso;
    private javax.swing.JComboBox cbSeculo;
    private javax.swing.JComboBox cbSetor;
    private javax.swing.JCheckBox cbxObraEmprestada;
    private javax.swing.ButtonGroup dataObraBtnG;
    private javax.swing.ButtonGroup expoBtnG;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbData;
    private javax.swing.JRadioButton rbSeculo;
    private javax.swing.JTable tbObras;
    private javax.swing.JTextField tfAltura;
    private javax.swing.JTextField tfAutor;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfLargura;
    private javax.swing.JTextField tfMuseu;
    private javax.swing.JTextField tfPeso;
    private javax.swing.JTextField tfProfundidade;
    private javax.swing.JTextField tfTitulo;
    // End of variables declaration//GEN-END:variables
}
