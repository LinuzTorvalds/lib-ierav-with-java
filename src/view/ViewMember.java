package view;

import control.ControlBasic;
import control.ControlGeneral;
import java.awt.Color;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import model.Member;
import useful.Several;

public class ViewMember extends javax.swing.JFrame {

    private final String title;
    private final ControlBasic cM;
    
    public ViewMember() {
        initComponents();
        title = "System lib - Members";
        cM = new ControlGeneral(2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContentPane = new javax.swing.JPanel();
        LblCode = new javax.swing.JLabel();
        TxtCode = new javax.swing.JTextField();
        LblName = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        LblPhone = new javax.swing.JLabel();
        TxtPhone = new javax.swing.JFormattedTextField();
        LblCellphone = new javax.swing.JLabel();
        TxtCellphone = new javax.swing.JFormattedTextField();
        LblAdress = new javax.swing.JLabel();
        TxtAdress = new javax.swing.JTextField();
        LblSituation = new javax.swing.JLabel();
        TxtSituation = new javax.swing.JTextField();
        LblSeminarian = new javax.swing.JLabel();
        ChbSeminarian = new javax.swing.JCheckBox();
        LblIoan = new javax.swing.JLabel();
        ChbIoan = new javax.swing.JCheckBox();
        LblOwing = new javax.swing.JLabel();
        ChbOwing = new javax.swing.JCheckBox();
        PnlButtons = new javax.swing.JPanel();
        BtnCreate = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnExport = new javax.swing.JButton();
        BtnClean = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("System lib - Members");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ContentPane.setBackground(new java.awt.Color(255, 255, 255));
        ContentPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblCode.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblCode.setText("Código :");

        TxtCode.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        TxtCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtCodeFocusLost(evt);
            }
        });

        LblName.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblName.setText("Nome :");

        TxtName.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblPhone.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblPhone.setText("Telefone :");

        TxtPhone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        try {
            TxtPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LblCellphone.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblCellphone.setText("Celular :");

        TxtCellphone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        try {
            TxtCellphone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtCellphone.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LblAdress.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblAdress.setText("Endereço :");

        TxtAdress.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtAdress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtAdress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblSituation.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblSituation.setText("Situação :");

        TxtSituation.setEditable(false);
        TxtSituation.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtSituation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtSituation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblSeminarian.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblSeminarian.setText("Seminarista :");

        ChbSeminarian.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        ChbSeminarian.setText("Sim");

        LblIoan.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblIoan.setText("Empréstimo :");

        ChbIoan.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        ChbIoan.setText("Sim");
        ChbIoan.setEnabled(false);

        LblOwing.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblOwing.setText("Devendo :");

        ChbOwing.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        ChbOwing.setText("Sim");
        ChbOwing.setEnabled(false);

        PnlButtons.setBackground(new java.awt.Color(124, 222, 220));
        PnlButtons.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        BtnCreate.setBackground(new java.awt.Color(255, 255, 255));
        BtnCreate.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        BtnCreate.setText("Inserir");
        BtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateActionPerformed(evt);
            }
        });

        BtnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        BtnUpdate.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        BtnUpdate.setText("Atualizar");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        BtnDelete.setBackground(new java.awt.Color(255, 255, 255));
        BtnDelete.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        BtnDelete.setText("Deletar");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        BtnExport.setBackground(new java.awt.Color(255, 255, 255));
        BtnExport.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        BtnExport.setText("Export");
        BtnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExportActionPerformed(evt);
            }
        });

        BtnClean.setBackground(new java.awt.Color(255, 255, 255));
        BtnClean.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        BtnClean.setText("Limpar");
        BtnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCleanActionPerformed(evt);
            }
        });

        BtnExit.setBackground(new java.awt.Color(255, 255, 255));
        BtnExit.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        BtnExit.setText("Voltar");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlButtonsLayout = new javax.swing.GroupLayout(PnlButtons);
        PnlButtons.setLayout(PnlButtonsLayout);
        PnlButtonsLayout.setHorizontalGroup(
            PnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnExport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnClean)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnExit)
                .addContainerGap())
        );
        PnlButtonsLayout.setVerticalGroup(
            PnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCreate)
                    .addComponent(BtnUpdate)
                    .addComponent(BtnDelete)
                    .addComponent(BtnExport)
                    .addComponent(BtnClean)
                    .addComponent(BtnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContentPaneLayout = new javax.swing.GroupLayout(ContentPane);
        ContentPane.setLayout(ContentPaneLayout);
        ContentPaneLayout.setHorizontalGroup(
            ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContentPaneLayout.createSequentialGroup()
                        .addComponent(LblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentPaneLayout.createSequentialGroup()
                        .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ContentPaneLayout.createSequentialGroup()
                                .addComponent(LblSeminarian)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ChbSeminarian)
                                .addGap(51, 51, 51)
                                .addComponent(LblIoan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ChbIoan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LblOwing)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ChbOwing))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContentPaneLayout.createSequentialGroup()
                                .addComponent(LblCellphone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCellphone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblSituation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtSituation, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContentPaneLayout.createSequentialGroup()
                                .addComponent(LblCode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblPhone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtPhone))
                            .addGroup(ContentPaneLayout.createSequentialGroup()
                                .addComponent(LblAdress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtAdress)))
                        .addGap(6, 6, 6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContentPaneLayout.setVerticalGroup(
            ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCode)
                    .addComponent(TxtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPhone)
                    .addComponent(TxtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblName)
                    .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCellphone)
                    .addComponent(TxtCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblSituation)
                    .addComponent(TxtSituation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblAdress)
                    .addComponent(TxtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblSeminarian)
                        .addComponent(ChbSeminarian))
                    .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ChbIoan)
                        .addComponent(LblIoan))
                    .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ChbOwing)
                        .addComponent(LblOwing)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        clean();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        TxtName.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void BtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateActionPerformed
        manipulate('C');
    }//GEN-LAST:event_BtnCreateActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        manipulate('U');
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        manipulate('D');
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void BtnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExportActionPerformed
        exportData();
    }//GEN-LAST:event_BtnExportActionPerformed

    private void BtnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCleanActionPerformed
        clean();
    }//GEN-LAST:event_BtnCleanActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        if (Several.confirm("Deseja retornar ao menu? 0_0", title)) {
            ViewMenu frame = new ViewMenu();
            frame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BtnExitActionPerformed

    private void TxtCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtCodeFocusLost
        search();
    }//GEN-LAST:event_TxtCodeFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClean;
    private javax.swing.JButton BtnCreate;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnExport;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JCheckBox ChbIoan;
    private javax.swing.JCheckBox ChbOwing;
    private javax.swing.JCheckBox ChbSeminarian;
    private javax.swing.JPanel ContentPane;
    private javax.swing.JLabel LblAdress;
    private javax.swing.JLabel LblCellphone;
    private javax.swing.JLabel LblCode;
    private javax.swing.JLabel LblIoan;
    private javax.swing.JLabel LblName;
    private javax.swing.JLabel LblOwing;
    private javax.swing.JLabel LblPhone;
    private javax.swing.JLabel LblSeminarian;
    private javax.swing.JLabel LblSituation;
    private javax.swing.JPanel PnlButtons;
    private javax.swing.JTextField TxtAdress;
    private javax.swing.JFormattedTextField TxtCellphone;
    private javax.swing.JTextField TxtCode;
    private javax.swing.JTextField TxtName;
    private javax.swing.JFormattedTextField TxtPhone;
    private javax.swing.JTextField TxtSituation;
    // End of variables declaration//GEN-END:variables

    private void clean() {
        JTextField txt[] = { TxtAdress, TxtCellphone, TxtCode, TxtName, TxtPhone, TxtSituation };
        for (JTextField t : txt)
            t.setText("");
        JButton btn[] = { BtnCreate, BtnDelete, BtnUpdate };
        for (JButton b : btn)
            b.setEnabled(false);
        JCheckBox chb[] = { ChbIoan, ChbOwing, ChbSeminarian };
        for (JCheckBox c : chb)
            c.setSelected(false);        
        TxtCode.setEnabled(true);
    }
    
    private void exportData() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);
        File path = fileChooser.getSelectedFile();
        boolean verify = cM.export(path.getPath());
        if (verify)
            Several.showData("Dados exportados com sucessos", title, true);
        else
            Several.showData("Erro na exportação dos dados", title, false);
    }
    
    private void carriesObjects(Member m) {
        TxtAdress.setText(m.getAdress());
        TxtCellphone.setText(m.getCellphone());
        TxtCode.setText(String.valueOf(m.getCode()));
        TxtName.setText(m.getName());
        TxtPhone.setText(m.getPhone());
        TxtSituation.setText(m.getSituation());
        TxtSituation.setForeground(m.getSituation().equals("Normal") ? Color.BLUE : Color.MAGENTA);
        ChbIoan.setSelected(m.isIoan());
        ChbOwing.setSelected(m.isOwing());
        ChbSeminarian.setSelected(m.isSeminarian());
    }
    
    private void search() {
        int code;
        Member m;
        if (!Several.testNum(TxtCode.getText(), title))
            TxtCode.setText("");
        else if (!Several.testBreak(Integer.parseInt(TxtCode.getText()), 0, 0, title))
            TxtCode.setText("");
        else {
            code = Integer.parseInt(TxtCode.getText());
            Object o = cM.getRead("", code);
            if (o != null) {
                m = (Member) o;
                carriesObjects(m);   
                BtnDelete.setEnabled(true);
                BtnUpdate.setEnabled(true);
            }
            else {
                BtnCreate.setEnabled(true);
                Several.showData("Código : " + code + " ainda não esta em uso", title, true);
            }
            TxtCode.setEnabled(false);
        }
    }
    
    private void manipulate(char option) {
        String resp = "";
        if (TxtAdress.getText().isEmpty() || TxtCellphone.getText().isEmpty() || TxtCode.getText().isEmpty()
            || TxtName.getText().isEmpty() || TxtPhone.getText().isEmpty())
        resp = "Favor informar todos os dados 0k O_o";
        else {
            Member m = new Member();
            m.setAdress(TxtAdress.getText());
            m.setCellphone(TxtCellphone.getText());
            m.setCode(Integer.parseInt(Several.convertValue(TxtCode.getText())));
            m.setIoan(ChbIoan.isSelected());
            m.setName(TxtName.getText());
            m.setOwing(ChbOwing.isSelected());
            m.setPhone(TxtPhone.getText());
            m.setSeminarian(ChbSeminarian.isSelected());
            m.setSituation(TxtSituation.getText());
            switch (option) {
                case 'C' : {
                    m.setSituation("Normal");
                    if (cM.setManipulate(m, option))
                        resp = "Os dados do membro : " + TxtName.getText() + "\nForam Persistidos com sucesso";
                    else
                        resp = "Problemas ao tentar persistir os dados do membro :( \n" + TxtName.getText();
                    clean();
                }
                    break;
                case 'D' : {
                    if (cM.setManipulate(m, option))
                        resp = "Os dados do membro : " + TxtName.getText() + "\nForam removidos com sucesso";
                    else
                        resp = "Problemas ao tentar remover os dados do membro :( \n" + TxtName.getText();
                    clean();
                }
                    break;
                case 'U' : {
                    if (cM.setManipulate(m, option))
                        resp = "Os dados do membro : " + TxtName.getText() + "\nForam atualizados com sucesso";
                    else
                        resp = "Problemas ao tentar atualizar os dados do membro :( \n" + TxtName.getText();
                    clean();
                }
            }
        }
        Several.showData(resp, title, (resp.charAt(0) != 'F' && resp.charAt(0) != 'P'));
    }
}