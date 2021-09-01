package view;

import control.ControlGeneral;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import model.Book;
import model.Row;
import useful.Several;

public class ViewBook extends javax.swing.JFrame {
    
    private final String title;
    private final ControlGeneral cB, cR;

    public ViewBook() {
        initComponents();
        title = "System lib - Books";
        cB = new ControlGeneral(1);
        cR = new ControlGeneral(3);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContenPane = new javax.swing.JPanel();
        LblCode = new javax.swing.JLabel();
        TxtCode = new javax.swing.JTextField();
        LblCategoryM = new javax.swing.JLabel();
        TxtCategoryM = new javax.swing.JTextField();
        LblCategoryS = new javax.swing.JLabel();
        TxtCategoryS = new javax.swing.JTextField();
        LblEditora = new javax.swing.JLabel();
        TxtEditora = new javax.swing.JTextField();
        LblAuthor = new javax.swing.JLabel();
        TxtAuthor = new javax.swing.JTextField();
        LblAmountT = new javax.swing.JLabel();
        TxtAmountT = new javax.swing.JTextField();
        LblAmountD = new javax.swing.JLabel();
        TxtAmountD = new javax.swing.JTextField();
        LblRestricted = new javax.swing.JLabel();
        ChbRestricted = new javax.swing.JCheckBox();
        LblTitle = new javax.swing.JLabel();
        TxtTitle = new javax.swing.JTextField();
        PnlButtons = new javax.swing.JPanel();
        BtnCreate = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnExport = new javax.swing.JButton();
        BtnClean = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();
        LblRow = new javax.swing.JLabel();
        TxtRow = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("System lib - Books");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ContenPane.setBackground(new java.awt.Color(255, 255, 255));
        ContenPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ContenPane.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N

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

        LblCategoryM.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblCategoryM.setText("Categoria Principal :");

        TxtCategoryM.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtCategoryM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtCategoryM.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblCategoryS.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblCategoryS.setText("Categoria Secundária :");

        TxtCategoryS.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtCategoryS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtCategoryS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblEditora.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblEditora.setText("Editora :");

        TxtEditora.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtEditora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtEditora.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblAuthor.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblAuthor.setText("Autor :");

        TxtAuthor.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtAuthor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtAuthor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblAmountT.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblAmountT.setText("Quantidade Total :");

        TxtAmountT.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtAmountT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtAmountT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        TxtAmountT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtAmountTKeyReleased(evt);
            }
        });

        LblAmountD.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblAmountD.setText("Quantidade Disponivél :");
        LblAmountD.setToolTipText("");

        TxtAmountD.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtAmountD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtAmountD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        TxtAmountD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtAmountDKeyReleased(evt);
            }
        });

        LblRestricted.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblRestricted.setText("Restrito :");

        ChbRestricted.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        ChbRestricted.setText("Sim");

        LblTitle.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblTitle.setText("Titulo :");

        TxtTitle.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtTitle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        PnlButtons.setBackground(new java.awt.Color(124, 222, 220));

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
                .addComponent(BtnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        LblRow.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblRow.setText("Primerio da Fila :");

        TxtRow.setEditable(false);
        TxtRow.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtRow.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtRow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout ContenPaneLayout = new javax.swing.GroupLayout(ContenPane);
        ContenPane.setLayout(ContenPaneLayout);
        ContenPaneLayout.setHorizontalGroup(
            ContenPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenPaneLayout.createSequentialGroup()
                        .addGroup(ContenPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ContenPaneLayout.createSequentialGroup()
                                .addComponent(LblTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtTitle))
                            .addGroup(ContenPaneLayout.createSequentialGroup()
                                .addComponent(LblCode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblAuthor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtAuthor))
                            .addGroup(ContenPaneLayout.createSequentialGroup()
                                .addComponent(LblCategoryM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCategoryM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblAmountT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtAmountT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContenPaneLayout.createSequentialGroup()
                                .addComponent(LblCategoryS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCategoryS)))
                        .addContainerGap())
                    .addGroup(ContenPaneLayout.createSequentialGroup()
                        .addGroup(ContenPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ContenPaneLayout.createSequentialGroup()
                                .addComponent(LblEditora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblAmountD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtAmountD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblRestricted)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ChbRestricted))
                            .addGroup(ContenPaneLayout.createSequentialGroup()
                                .addComponent(LblRow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtRow)))
                        .addGap(0, 8, Short.MAX_VALUE))))
        );
        ContenPaneLayout.setVerticalGroup(
            ContenPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCode)
                    .addComponent(TxtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblAuthor)
                    .addComponent(TxtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContenPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTitle)
                    .addComponent(TxtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContenPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblCategoryM)
                    .addGroup(ContenPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtCategoryM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LblAmountT)
                        .addComponent(TxtAmountT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContenPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCategoryS)
                    .addComponent(TxtCategoryS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContenPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblEditora)
                    .addComponent(TxtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblAmountD)
                    .addComponent(TxtAmountD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblRestricted)
                    .addComponent(ChbRestricted))
                .addGap(6, 6, 6)
                .addGroup(ContenPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblRow)
                    .addComponent(TxtRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExportActionPerformed
        exportData();
    }//GEN-LAST:event_BtnExportActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        clean();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        TxtTitle.requestFocus();
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

    private void TxtAmountTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAmountTKeyReleased
        if (!Several.testNum(TxtAmountT.getText(), title))
            TxtAmountT.setText("");
        else if (!Several.testBreak(Integer.parseInt(TxtAmountT.getText()), 0, 0, title))
            TxtAmountT.setText("");
    }//GEN-LAST:event_TxtAmountTKeyReleased

    private void TxtAmountDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAmountDKeyReleased
        if (!Several.testNum(TxtAmountD.getText(), title))
            TxtAmountD.setText("");
        else if (!Several.testBreak(Integer.parseInt(TxtAmountD.getText()), 0, 0, title))
            TxtAmountD.setText("");
    }//GEN-LAST:event_TxtAmountDKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClean;
    private javax.swing.JButton BtnCreate;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnExport;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JCheckBox ChbRestricted;
    private javax.swing.JPanel ContenPane;
    private javax.swing.JLabel LblAmountD;
    private javax.swing.JLabel LblAmountT;
    private javax.swing.JLabel LblAuthor;
    private javax.swing.JLabel LblCategoryM;
    private javax.swing.JLabel LblCategoryS;
    private javax.swing.JLabel LblCode;
    private javax.swing.JLabel LblEditora;
    private javax.swing.JLabel LblRestricted;
    private javax.swing.JLabel LblRow;
    private javax.swing.JLabel LblTitle;
    private javax.swing.JPanel PnlButtons;
    private javax.swing.JTextField TxtAmountD;
    private javax.swing.JTextField TxtAmountT;
    private javax.swing.JTextField TxtAuthor;
    private javax.swing.JTextField TxtCategoryM;
    private javax.swing.JTextField TxtCategoryS;
    private javax.swing.JTextField TxtCode;
    private javax.swing.JTextField TxtEditora;
    private javax.swing.JTextField TxtRow;
    private javax.swing.JTextField TxtTitle;
    // End of variables declaration//GEN-END:variables
    
    private void clean() {
        JTextField txt[] = { TxtAmountD, TxtAmountT, TxtAuthor, TxtCategoryS, TxtCategoryM, TxtCode, TxtEditora, TxtRow, TxtTitle };
        for (JTextField t : txt)
            t.setText("");
        JButton btn[] = { BtnCreate, BtnDelete, BtnUpdate };
        for (JButton b : btn)
            b.setEnabled(false);
        TxtCode.setEnabled(true);
        ChbRestricted.setSelected(false);
        TxtTitle.requestFocus();
    }
    
    private void exportData() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);
        File path = fileChooser.getSelectedFile();
        boolean verify = cB.export(path.getPath());
        if (verify)
            Several.showData("Dados exportados com sucessos", title, true);
        else
            Several.showData("Erro na exportação dos dados", title, false);
    }
    
    private void carriesObjects(Book b) {
        TxtCode.setText(String.valueOf(b.getCode()));
        TxtAuthor.setText(b.getAuthor());
        TxtTitle.setText(b.getTitle());
        TxtCategoryM.setText(b.getCategoryM());
        TxtAmountT.setText(Several.twoDigits(true).format(b.getAmountT()));
        TxtCategoryS.setText(b.getCategoryS());
        TxtEditora.setText(b.getEditora());
        TxtAmountD.setText(Several.twoDigits(true).format(b.getAmountD()));
        ChbRestricted.setSelected(b.isRestricted());
        Object o = cR.getRead("", b.getCode());
        Row r = (Row) o;
        if ( r != null) {
            String row[] = r.getRow().split(",");
            TxtRow.setText(row[0]);
        }
        else 
            TxtRow.setText("Não há uma fila para este titulo o_O");
    }
    
    private void search() {
        int code;
        Book b;
        if (!Several.testNum(TxtCode.getText(), title))
            TxtCode.setText("");
        else if (!Several.testBreak(Integer.parseInt(TxtCode.getText()), 0, 0, title))
            TxtCode.setText("");
        else {
            code = Integer.parseInt(TxtCode.getText());
            Object o = cB.getRead("", code);
            if (o != null) {
                b = (Book) o;
                carriesObjects(b);   
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
        if (TxtAmountD.getText().isEmpty() || TxtAmountT.getText().isEmpty() || TxtAuthor.getText().isEmpty() 
            || TxtCategoryS.getText().isEmpty() || TxtCategoryM.getText().isEmpty() || TxtCode.getText().isEmpty() 
            || TxtEditora.getText().isEmpty() || TxtTitle.getText().isEmpty())
            resp = "Favor informar todos os dados 0k O_o";
        else {
            Book b = new Book();
            b.setAmountD(Integer.parseInt(Several.convertValue(TxtAmountD.getText())));
            b.setAmountT(Integer.parseInt(Several.convertValue(TxtAmountT.getText())));
            b.setAuthor(TxtAuthor.getText());
            b.setCategoryM(TxtCategoryM.getText());
            b.setCategoryS(TxtCategoryS.getText());
            b.setCode(Integer.parseInt(Several.convertValue(TxtCode.getText())));
            b.setEditora(TxtEditora.getText());
            b.setRestricted(ChbRestricted.isSelected());
            b.setTitle(TxtTitle.getText());
            switch (option) {
                case 'C' : {
                    if (cB.setManipulate(b, option))
                        resp = "Os dados do livro : " + TxtTitle.getText() + "\nForam Persistidos com sucesso";
                    else
                        resp = "Problemas ao tentar persistir os dados do livro :( \n" + TxtTitle.getText();
                    clean();
                }
                    break;
                case 'D' : {
                    if (cB.setManipulate(b, option))
                        resp = "Os dados do livro : " + TxtTitle.getText() + "\nForam removidos com sucesso";
                    else
                        resp = "Problemas ao tentar remover os dados do livro :( \n" + TxtTitle.getText();
                    clean();
                }
                    break;
                case 'U' : {
                    if (cB.setManipulate(b, option))
                        resp = "Os dados do livro : " + TxtTitle.getText() + "\nForam atualizados com sucesso";
                    else
                        resp = "Problemas ao tentar atualizar os dados do livro :( \n" + TxtTitle.getText();
                    clean();
                }
            }
        }
        Several.showData(resp, title, (resp.charAt(0) != 'F' && resp.charAt(0) != 'P'));
    }
}