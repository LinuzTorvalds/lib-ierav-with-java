package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;
import useful.Several;

public class ViewMenu extends javax.swing.JFrame {

    private final String title;
    
    public ViewMenu() {
        initComponents();
        title = "System lib - I.E.R.A.V.";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TlbDev = new javax.swing.JToolBar();
        LblAuthor = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        LblDate = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        LblWatch = new javax.swing.JLabel();
        MnbMenu = new javax.swing.JMenuBar();
        MnFile = new javax.swing.JMenu();
        MniBook = new javax.swing.JMenuItem();
        MniExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu - lib I.E.R.A.V.");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TlbDev.setBackground(new java.awt.Color(255, 255, 255));
        TlbDev.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        TlbDev.setFloatable(false);
        TlbDev.setRollover(true);
        TlbDev.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N

        LblAuthor.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblAuthor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblAuthor.setText("     ");
        TlbDev.add(LblAuthor);
        TlbDev.add(jSeparator1);
        TlbDev.add(jSeparator2);

        LblDate.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblDate.setText("      ");
        TlbDev.add(LblDate);
        TlbDev.add(jSeparator3);
        TlbDev.add(jSeparator4);

        LblWatch.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblWatch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblWatch.setText("     ");
        TlbDev.add(LblWatch);

        MnFile.setText("Arquivo");
        MnFile.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N

        MniBook.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MniBook.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        MniBook.setText("Livros");
        MniBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniBookActionPerformed(evt);
            }
        });
        MnFile.add(MniBook);

        MniExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        MniExit.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        MniExit.setText("Sair");
        MniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniExitActionPerformed(evt);
            }
        });
        MnFile.add(MniExit);

        MnbMenu.add(MnFile);

        setJMenuBar(MnbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TlbDev, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(TlbDev, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        start();
    }//GEN-LAST:event_formWindowOpened

    private void MniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniExitActionPerformed
        if (Several.confirm("Deseja finalizar? :´(", title))
            System.exit(0);
    }//GEN-LAST:event_MniExitActionPerformed

    private void MniBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniBookActionPerformed
        ViewBook frame = new ViewBook();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MniBookActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new ViewMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblAuthor;
    private javax.swing.JLabel LblDate;
    private javax.swing.JLabel LblWatch;
    private javax.swing.JMenu MnFile;
    private javax.swing.JMenuBar MnbMenu;
    private javax.swing.JMenuItem MniBook;
    private javax.swing.JMenuItem MniExit;
    private javax.swing.JToolBar TlbDev;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
    
    private void start() {
        LblAuthor.setText(" Autor : Super Gêmeos ativar :D ");
        LblDate.setText("Data : " + DateFormat.getDateInstance().format(new Date()) + "");
        Timer timer = new Timer(1000, new clock());
        timer.start();
    }
    
    class clock implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            LblWatch.setText(String.format(" Hora : " + "%1$tH:%1$tM:%1$tS", now));
        }
    }
}