/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author YAHYA
 */
public class viewTransfer extends javax.swing.JFrame {

    /**
     * Creates new form viewTransfer
     */
    public viewTransfer() {
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

        namaBank = new javax.swing.JTextField();
        noRekening = new javax.swing.JTextField();
        jumlahTransfer = new javax.swing.JTextField();
        berita = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(namaBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 300, 40));
        getContentPane().add(noRekening, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 300, 40));
        getContentPane().add(jumlahTransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 300, 40));
        getContentPane().add(berita, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 300, 40));

        ok.setText("OK");
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, 70, 40));

        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });
        getContentPane().add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, 70, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/background/29.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed

    }//GEN-LAST:event_batalActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton batal;
    private javax.swing.JTextField berita;
    private javax.swing.JTextField jumlahTransfer;
    private javax.swing.JTextField namaBank;
    private javax.swing.JTextField noRekening;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables

    public JButton getBatal() {
        return batal;
    }

    public void setBatal(JButton batal) {
        this.batal = batal;
    }

    public String getBerita() {
        return berita.getText();
    }

    public void setBerita(String berita) {
        this.berita.setText(berita);
    }

    public String getJumlahTransfer() {
        return jumlahTransfer.getText();
    }

    public void setJumlahTransfer(String jumlahTransfer) {
        this.jumlahTransfer.setText(jumlahTransfer);
    }

    public String getNamaBank() {
        return namaBank.getText();
    }

    public void setNamaBank(String namaBank) {
        this.namaBank.setText(namaBank);
    }

    public String getNoRekening() {
        return noRekening.getText();
    }

    public void setNoRekening(String noRekening) {
        this.noRekening.setText(noRekening);
    }

    public JButton getOk() {
        return ok;
    }

    public void setOk(JButton ok) {
        this.ok = ok;
    }
    public void addActionListener(ActionListener x) {
        ok.addActionListener(x);
        batal.addActionListener(x);
    }

    public void refresh() {
        berita.setText("");
        jumlahTransfer.setText("");
        noRekening.setText("");
        namaBank.setText("");
        
    }
    
}
