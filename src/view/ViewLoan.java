package view;

import control.ControlBasic;
import control.ControlGeneral;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import model.Book;
import model.Loan;
import model.Member;
import org.joda.time.DateTime;
import useful.Several;

public class ViewLoan extends javax.swing.JFrame {

    private final String title;
    private final ControlBasic cB, cL, cM;
    private List<Object> listB, listM;
    
    public ViewLoan() {
        initComponents();
        title = "System lib - Ioan";
        cB = new ControlGeneral(1);
        cL = new ControlGeneral(4);
        cM = new ControlGeneral(2);
        listB = new ArrayList<>();
        listM = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TbpPane = new javax.swing.JTabbedPane();
        ContentPane = new javax.swing.JPanel();
        LblBook = new javax.swing.JLabel();
        TxtBook = new javax.swing.JTextField();
        LblTitle = new javax.swing.JLabel();
        CmbTitle = new javax.swing.JComboBox<>();
        LblMember = new javax.swing.JLabel();
        TxtMember = new javax.swing.JTextField();
        LblName = new javax.swing.JLabel();
        CmbName = new javax.swing.JComboBox<>();
        PnlButtons = new javax.swing.JPanel();
        BtnCreate = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnExport = new javax.swing.JButton();
        BtnClean = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();
        LblCode = new javax.swing.JLabel();
        TxtCode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("System lib - Ioan");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TbpPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        ContentPane.setBackground(new java.awt.Color(255, 255, 255));
        ContentPane.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N

        LblBook.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblBook.setText("Código livro :");

        TxtBook.setEditable(false);
        TxtBook.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtBook.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtBook.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblTitle.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblTitle.setText("Titulo :");

        CmbTitle.setBackground(new java.awt.Color(255, 255, 255));
        CmbTitle.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        CmbTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbTitleActionPerformed(evt);
            }
        });

        LblMember.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblMember.setText("Código membro :");

        TxtMember.setEditable(false);
        TxtMember.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtMember.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtMember.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblName.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblName.setText("Nome :");

        CmbName.setBackground(new java.awt.Color(255, 255, 255));
        CmbName.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        CmbName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbNameActionPerformed(evt);
            }
        });

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

        LblCode.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblCode.setText("Código empréstimo :");

        TxtCode.setEditable(false);
        TxtCode.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout ContentPaneLayout = new javax.swing.GroupLayout(ContentPane);
        ContentPane.setLayout(ContentPaneLayout);
        ContentPaneLayout.setHorizontalGroup(
            ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ContentPaneLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtMember, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtBook, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CmbTitle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CmbName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(ContentPaneLayout.createSequentialGroup()
                        .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContentPaneLayout.createSequentialGroup()
                                .addComponent(LblCode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContentPaneLayout.createSequentialGroup()
                                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblBook)
                                    .addComponent(LblMember))
                                .addGap(28, 28, 28)
                                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblName)
                                    .addComponent(LblTitle))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ContentPaneLayout.setVerticalGroup(
            ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCode)
                    .addComponent(TxtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblBook)
                    .addComponent(LblTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblMember)
                    .addComponent(LblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TbpPane.addTab("Emprestar", ContentPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TbpPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TbpPane, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        clean();
        carriesBooks();
        carriesMembers();
    }//GEN-LAST:event_formWindowOpened

    private void CmbTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbTitleActionPerformed
        int ind = CmbTitle.getSelectedIndex();
        if (ind > -1) {
            Object o = listB.get(ind);
            Book b = (Book) o;
            TxtBook.setText(String.valueOf(b.getCode()));
        }
    }//GEN-LAST:event_CmbTitleActionPerformed

    private void CmbNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbNameActionPerformed
        int ind = CmbName.getSelectedIndex();
        if (ind > -1) {
            Object o = listM.get(ind);
            Member m = (Member) o;
            TxtMember.setText(String.valueOf(m.getCode()));
        }
    }//GEN-LAST:event_CmbNameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClean;
    private javax.swing.JButton BtnCreate;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnExport;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JComboBox<String> CmbName;
    private javax.swing.JComboBox<String> CmbTitle;
    private javax.swing.JPanel ContentPane;
    private javax.swing.JLabel LblBook;
    private javax.swing.JLabel LblCode;
    private javax.swing.JLabel LblMember;
    private javax.swing.JLabel LblName;
    private javax.swing.JLabel LblTitle;
    private javax.swing.JPanel PnlButtons;
    private javax.swing.JTabbedPane TbpPane;
    private javax.swing.JTextField TxtBook;
    private javax.swing.JTextField TxtCode;
    private javax.swing.JTextField TxtMember;
    // End of variables declaration//GEN-END:variables
    
    private void clean() {
        JTextField txt[] = { TxtBook, TxtCode, TxtMember };
        for (JTextField t : txt)
            t.setText("");
        JButton btn[] = { BtnDelete, BtnUpdate };
        for (JButton b : btn)
            b.setEnabled(false);
        JComboBox cmb[] = { CmbName, CmbTitle };
        for (JComboBox c : cmb)
            c.setSelectedIndex(-1);
        BtnCreate.setEnabled(true);
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
    
    private void carriesBooks() {
        int posi = CmbTitle.getSelectedIndex();
        listB = cB.getList();
        CmbTitle.removeAllItems();
        listB.stream().map(o -> (Book) o).forEachOrdered(b -> {
            CmbTitle.addItem(b.getTitle());
        });
        if (posi > -1)
            CmbTitle.setSelectedIndex(posi);
        else {
            TxtBook.setText("");
            CmbTitle.setSelectedIndex(-1);
        }
    }
    
    private void carriesMembers() {
        int posi = CmbName.getSelectedIndex();
        listM = cM.getList();
        listM.stream().map(o -> (Member) o).forEachOrdered(m -> {
            CmbName.addItem(m.getName());
        });
        if (posi > 1)
            CmbName.setSelectedIndex(posi);
        else {
            TxtMember.setText("");
            CmbName.setSelectedIndex(-1);
        }
    }
    
    private void manipulate(char option) {
        String resp = "";
        if (CmbName.getSelectedIndex() == -1 || CmbTitle.getSelectedIndex() == -1 
            || TxtBook.getText().isEmpty() || TxtMember.getText().isEmpty())
            resp = "Amigão seleciona 1 livro e/ou 1 membro O_o";
        else {
            Loan l = new Loan();
            Object book = cB.getRead("", Integer.parseInt(TxtBook.getText()));
            Book b = (Book) book;
            l.setBook(b);
            Object member = cM.getRead("", Integer.parseInt(TxtMember.getText()));
            Member m = (Member) member;
            l.setMember(m);          
            l.setDateE(new Date());
            DateTime date = new DateTime();
            date = date.plusWeeks(5);
            l.setDateD(date.toDate());
            switch (option) {
                case 'C' : {
                    if (cL.setManipulate(l, option))
                        resp = "Os dados do emprétimo \nForam Persistidos com sucesso";
                    else
                        resp = "Problemas ao tentar persistir os dados do emprétimo";
                    clean();
                }
                    break;
                case 'D' : {
                    l.setCode(Integer.parseInt(TxtCode.getText()));
                    if (cL.setManipulate(l, option))
                        resp = "Os dados do emprétimo \nForam removidos com sucesso";
                    else
                        resp = "Problemas ao tentar remover os dados do emprétimo";
                    clean();
                }
                    break;
                case 'U' : {
                    l.setCode(Integer.parseInt(TxtCode.getText()));
                    if (cL.setManipulate(l, option))
                        resp = "Os dados do emprétimo \nForam atualizados com sucesso";
                    else
                        resp = "Problemas ao tentar atualizar os dados do emprétimo";
                    clean();
                }
            }
        }
        Several.showData(resp, title, (resp.charAt(0) != 'A' && resp.charAt(0) != 'P'));
    }
}