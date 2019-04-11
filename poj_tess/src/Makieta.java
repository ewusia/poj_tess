
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ewa
 */
public class Makieta extends javax.swing.JFrame {

    /**
     * Creates new form Makieta
     */
    public Makieta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooserOtworzPlik = new javax.swing.JFileChooser();
        jFileChooserZapiszPlik = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonOtworz = new javax.swing.JButton();
        jButtonZapisz = new javax.swing.JButton();
        jButtonZakoncz = new javax.swing.JButton();

        jFileChooserZapiszPlik.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        jFileChooserZapiszPlik.setApproveButtonText("Zapisz");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButtonOtworz.setText("Otwórz plik");
        jButtonOtworz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOtworzActionPerformed(evt);
            }
        });

        jButtonZapisz.setText("Zapisz plik");
        jButtonZapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZapiszActionPerformed(evt);
            }
        });

        jButtonZakoncz.setText("Zakończ");
        jButtonZakoncz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZakonczActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonOtworz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonZapisz)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(jButtonZakoncz)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOtworz)
                    .addComponent(jButtonZapisz)
                    .addComponent(jButtonZakoncz))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOtworzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOtworzActionPerformed
        int odpowiedz = jFileChooserOtworzPlik.showOpenDialog(this);
        if (odpowiedz == jFileChooserOtworzPlik.APPROVE_OPTION) {
            File file = jFileChooserOtworzPlik.getSelectedFile();
            try {
                jTextArea1.read( new FileReader( file.getAbsolutePath() ), null );
            } catch (IOException e) {
                System.out.println("Nie mogę otworzyć pliku: "+file.getAbsolutePath());
                System.out.println("Problem: "+e);
            }
        }

    }//GEN-LAST:event_jButtonOtworzActionPerformed

    private void jButtonZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZapiszActionPerformed
        int odpowiedz = jFileChooserZapiszPlik.showSaveDialog(this);
        if (odpowiedz == jFileChooserZapiszPlik.APPROVE_OPTION) {
            File file = jFileChooserZapiszPlik.getSelectedFile();
            try {
                FileWriter out = new FileWriter(file);
                out.write(jTextArea1.getText());
                out.close();
            } catch (IOException e) {
                System.out.println("Nie mogę zapisać pliku: "+file.getAbsolutePath());
                System.out.println("Problem: "+e);
            }
        }
        /*FileWriter out = new FileWriter(file);
        String text = jTextArea1.getText();
        out.write(text.replaceAll("\n", System.getProperty("line.separator")));
        out.close();*/
    }//GEN-LAST:event_jButtonZapiszActionPerformed

    private void jButtonZakonczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZakonczActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonZakonczActionPerformed

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
            java.util.logging.Logger.getLogger(Makieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Makieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Makieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Makieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Makieta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOtworz;
    private javax.swing.JButton jButtonZakoncz;
    private javax.swing.JButton jButtonZapisz;
    private javax.swing.JFileChooser jFileChooserOtworzPlik;
    private javax.swing.JFileChooser jFileChooserZapiszPlik;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
