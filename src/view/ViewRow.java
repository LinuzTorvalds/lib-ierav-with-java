package view;

import control.ControlBasic;
import control.ControlGeneral;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import model.Row;
import useful.Several;

public class ViewRow extends javax.swing.JFrame {

    private final String title;
    private final ControlBasic cB, cR;
    
    public ViewRow() {
        initComponents();
        title = "System lib - Fila";
        cB = new ControlGeneral(1); 
        cR = new ControlGeneral(3); 
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContentPane = new javax.swing.JPanel();
        LblCode = new javax.swing.JLabel();
        TxtCode = new javax.swing.JTextField();
        LblRow = new javax.swing.JLabel();
        TxtRow = new javax.swing.JTextField();
        PnlButtons = new javax.swing.JPanel();
        BtnCreate = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnExport = new javax.swing.JButton();
        BtnClean = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("System lib - Fila");
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
        LblCode.setText("Código livro :");

        TxtCode.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        TxtCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtCodeFocusLost(evt);
            }
        });

        LblRow.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblRow.setText("Fila :");
        LblRow.setToolTipText("");

        TxtRow.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtRow.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtRow.setToolTipText("digite o código dos membros separados por virgulas");
        TxtRow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

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
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentPaneLayout.createSequentialGroup()
                        .addComponent(LblRow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtRow, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentPaneLayout.createSequentialGroup()
                        .addComponent(LblCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContentPaneLayout.setVerticalGroup(
            ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCode)
                    .addComponent(TxtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblRow)
                    .addComponent(TxtRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtCodeFocusLost
        search();
    }//GEN-LAST:event_TxtCodeFocusLost

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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        TxtRow.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        clean();
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClean;
    private javax.swing.JButton BtnCreate;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnExport;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JPanel ContentPane;
    private javax.swing.JLabel LblCode;
    private javax.swing.JLabel LblRow;
    private javax.swing.JPanel PnlButtons;
    private javax.swing.JTextField TxtCode;
    private javax.swing.JTextField TxtRow;
    // End of variables declaration//GEN-END:variables
    
    private void clean () {
        JTextField txt[] = { TxtCode, TxtRow };
        for (JTextField t : txt)
            t.setText("");
        JButton btn[] = { BtnCreate, BtnDelete, BtnUpdate };
        for (JButton b : btn)
            b.setEnabled(false);
        TxtCode.setEnabled(true);
        TxtRow.requestFocus();
    }
    
    private void exportData() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);
        File path = fileChooser.getSelectedFile();
        boolean verify = cR.export(path.getPath());
        if (verify)
            Several.showData("Dados exportados com sucessos", title, true);
        else
            Several.showData("Erro na exportação dos dados", title, false);
    }
    
    private void carriesObjects(Row r) {
        TxtCode.setText(String.valueOf(r.getBook()));
        TxtRow.setText(r.getRow());
    }
    
    private void search() {
        int code;
        Row r;
        if (!Several.testNum(TxtCode.getText(), title))
            TxtCode.setText("");
        else if (!Several.testBreak(Integer.parseInt(TxtCode.getText()), 0, 0, title))
            TxtCode.setText("");
        else {
            code = Integer.parseInt(TxtCode.getText());
            Object b = cB.getRead("", code);
            if (b != null) {
                Object o = cR.getRead("", code);
                if (o != null) {
                    r = (Row) o;
                    carriesObjects(r);   
                    BtnDelete.setEnabled(true);
                    BtnUpdate.setEnabled(true);
                }
                else {
                    BtnCreate.setEnabled(true);
                    Several.showData("Fila para livro ainda não exite", title, true);
                }
                TxtCode.setEnabled(false);
            }
            else {
                Several.showData("Código do livro : " + code + " não esta em uso", title, true);            
                TxtCode.setText("");
            }
        }
    }
    
    private void manipulate(char option) {
        String resp = "";
        if (TxtCode.getText().isEmpty())
            resp = "Favor informar o código do livro";
        else {
            Row r = new Row();
            r.setBook(Integer.parseInt(Several.convertValue(TxtCode.getText())));
            r.setRow(TxtRow.getText());
            switch (option) {
                case 'C' : {
                    if (cR.setManipulate(r, option))
                        resp = "Os dados da fila \nForam Persistidos com sucesso";
                    else
                        resp = "Problemas ao tentar persistir os dados da fila";
                    clean();
                }
                    break;
                case 'D' : {
                    if (cR.setManipulate(r, option))
                        resp = "Os dados da fila \nForam removidos com sucesso";
                    else
                        resp = "Problemas ao tentar remover os dados da fila";
                    clean();
                }
                    break;
                case 'U' : {
                    if (cR.setManipulate(r, option))
                        resp = "Os dados da fila \nForam atualizados com sucesso";
                    else
                        resp = "Problemas ao tentar atualizar os dados da fila";
                    clean();
                }
            }
        }
        Several.showData(resp, title, (resp.charAt(0) != 'F' && resp.charAt(0) != 'P'));
    }
}