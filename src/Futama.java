/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafi_
 */
import javax.swing.*;
public class Futama extends javax.swing.JFrame {

    /**
     * Creates new form Futama
     */
    public Futama() {
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

        LabelNama = new javax.swing.JLabel();
        LabelNIM = new javax.swing.JLabel();
        LabelKelas = new javax.swing.JLabel();
        ButtonTekan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelNama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNama.setText("Nama");

        LabelNIM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNIM.setText("NIM");

        LabelKelas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelKelas.setText("Kelas");

        ButtonTekan.setText("Tekan");
        ButtonTekan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonTekanMouseClicked(evt);
            }
        });
        ButtonTekan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTekanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelKelas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelNIM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(ButtonTekan)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelNama)
                .addGap(29, 29, 29)
                .addComponent(LabelNIM)
                .addGap(32, 32, 32)
                .addComponent(LabelKelas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(ButtonTekan)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonTekanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTekanActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ButtonTekanActionPerformed

    private void ButtonTekanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonTekanMouseClicked
        // TODO add your handling code here:
        LabelNama.setText("Muhammad Rafi Avisina");
        LabelNIM.setText("10118328");
        LabelKelas.setText("IF-8");
        JOptionPane.showMessageDialog(null,"Selamat Anda Berhasil mengubah label Nama, NIM dan Kelas");
    }//GEN-LAST:event_ButtonTekanMouseClicked

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonTekan;
    private javax.swing.JLabel LabelKelas;
    private javax.swing.JLabel LabelNIM;
    private javax.swing.JLabel LabelNama;
    // End of variables declaration//GEN-END:variables
}
