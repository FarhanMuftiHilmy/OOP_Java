/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selisihlebihkecil;

import javax.swing.JOptionPane;

/**
 *
 * @author HILMI
 */
public class selisihlebihkecil extends javax.swing.JFrame {

    /**
     * Creates new form selisihlebihkecil
     */
    public selisihlebihkecil() {
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

        jLabel6 = new javax.swing.JLabel();
        jLabelJudul = new javax.swing.JLabel();
        jTextInputPembilang2 = new javax.swing.JTextField();
        jTextInputPembilang1 = new javax.swing.JTextField();
        jTextInputPenyebut2 = new javax.swing.JTextField();
        jTextInputPenyebut1 = new javax.swing.JTextField();
        jLabelNilai2 = new javax.swing.JLabel();
        jLabelNilai1 = new javax.swing.JLabel();
        jButtonKurangDari = new javax.swing.JButton();
        jButtonSelisih = new javax.swing.JButton();
        jLabelHasilPerhitungan = new javax.swing.JLabel();
        jLabelHasilPembilang = new javax.swing.JLabel();
        jButtonClear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelHasilPenyebut = new javax.swing.JLabel();
        jLabelHasilBulat = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelJudul.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelJudul.setText("Masukkan 2 Pecahan");

        jTextInputPembilang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextInputPembilang1ActionPerformed(evt);
            }
        });

        jTextInputPenyebut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextInputPenyebut2ActionPerformed(evt);
            }
        });

        jLabelNilai2.setText("Nilai 2");

        jLabelNilai1.setText("Nilai 1");

        jButtonKurangDari.setText("Kurang Dari");
        jButtonKurangDari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKurangDariActionPerformed(evt);
            }
        });

        jButtonSelisih.setText("Selisih");
        jButtonSelisih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelisihActionPerformed(evt);
            }
        });

        jLabelHasilPerhitungan.setText("Hasil");

        jLabelHasilPembilang.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelHasilPembilang.setText("0");

        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelHasilPenyebut.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelHasilPenyebut.setText("0");

        jLabelHasilBulat.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelHasilBulat.setText("0");

        jLabel1.setText("atau");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabelNilai1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNilai2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonSelisih, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonKurangDari, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextInputPembilang1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextInputPenyebut1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextInputPenyebut2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextInputPembilang2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHasilPerhitungan))
                        .addGap(179, 179, 179))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabelHasilPembilang))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelHasilPenyebut))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelHasilBulat)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNilai2)
                    .addComponent(jLabelNilai1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextInputPembilang2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextInputPembilang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextInputPenyebut2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextInputPenyebut1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSelisih)
                    .addComponent(jButtonKurangDari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonClear)
                .addGap(18, 18, 18)
                .addComponent(jLabelHasilPerhitungan, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelHasilPembilang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelHasilBulat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHasilPenyebut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSelisihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelisihActionPerformed
        String strInput1 = jTextInputPembilang1.getText();
        String strInput2 = jTextInputPenyebut1.getText();
        String strInput3 = jTextInputPembilang2.getText();
        String strInput4 = jTextInputPenyebut2.getText();
        
        try{
            double pembilang1 = Double.parseDouble(strInput1); //pembilang1
            double penyebut1 = Double.parseDouble(strInput2); //penyebut1
            double pembilang2 = Double.parseDouble(strInput3);
            double penyebut2 = Double.parseDouble(strInput4);
            
            double hasilpembilang;
            double hasilpenyebut;
            
            double hasilbulat;
        
            if(penyebut1 != penyebut2){
                double pembagi = penyebut2/penyebut1;
                pembilang1 *= pembagi;
                penyebut1 *= pembagi;
                if(pembilang1 > pembilang2){
                     hasilpembilang = pembilang1 - pembilang2;
                }else{
                     hasilpembilang = pembilang2 - pembilang1;
                }
               
                hasilpenyebut = penyebut1;
            }else{
                if(pembilang1 > pembilang2){
                     hasilpembilang = pembilang1 - pembilang2;
                }else{
                     hasilpembilang = pembilang2 - pembilang1;
                }
               
                hasilpenyebut = penyebut1;
            }
            hasilbulat = hasilpembilang/hasilpenyebut;
        
            String strHasilPembilang = Double.toString(hasilpembilang);
            String strHasilPenyebut = Double.toString(hasilpenyebut);
            String strHasilBulat = Double.toString(hasilbulat);
            jLabelHasilPembilang.setText(strHasilPembilang);
            jLabelHasilPenyebut.setText(strHasilPenyebut);
            jLabelHasilBulat.setText(strHasilBulat);
        }catch(NumberFormatException e1){
            JOptionPane.showMessageDialog(null, "Mohon masukkan angka pertama, kedua, ketiga, dan keempat", "pesan error", JOptionPane.ERROR_MESSAGE);
        }
        try{
            double pembilang1 = Double.parseDouble(strInput1); //pembilang1
            double penyebut1 = Double.parseDouble(strInput2); //penyebut1
            double pembilang2 = Double.parseDouble(strInput3);
            double penyebut2 = Double.parseDouble(strInput4);
            
            double hasilpembilang;
            double hasilpenyebut;
            
            double hasilbulat;
        
            if(penyebut1 != penyebut2){
                double pembagi = penyebut2/penyebut1;
                pembilang1 *= pembagi;
                penyebut1 *= pembagi;
                if(pembilang1 > pembilang2){
                     hasilpembilang = pembilang1 - pembilang2;
                }else{
                     hasilpembilang = pembilang2 - pembilang1;
                }
               
                hasilpenyebut = penyebut1;
            }else{
                if(pembilang1 > pembilang2){
                     hasilpembilang = pembilang1 - pembilang2;
                }else{
                     hasilpembilang = pembilang2 - pembilang1;
                }
               
                hasilpenyebut = penyebut1;
            }
            
        
            hasilbulat = hasilpembilang/hasilpenyebut;
        
            String strHasilPembilang = Double.toString(hasilpembilang);
            String strHasilPenyebut = Double.toString(hasilpenyebut);
            String strHasilBulat = Double.toString(hasilbulat);
            jLabelHasilPembilang.setText(strHasilPembilang);
            jLabelHasilPenyebut.setText(strHasilPenyebut);
            jLabelHasilBulat.setText(strHasilBulat);
           

        }catch(NumberFormatException e2){
             JOptionPane.showMessageDialog(null, "Mohon masukkan angka bukan huruf", "pesan error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSelisihActionPerformed

    private void jTextInputPenyebut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextInputPenyebut2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextInputPenyebut2ActionPerformed

    private void jTextInputPembilang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextInputPembilang1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextInputPembilang1ActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jTextInputPembilang1.setText("");
        jTextInputPenyebut1.setText("");
        jTextInputPembilang2.setText("");
        jTextInputPenyebut2.setText("");
        jLabelHasilPembilang.setText("0");
        jLabelHasilPenyebut.setText("0");
        jLabelHasilBulat.setText("0");
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonKurangDariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKurangDariActionPerformed
        String strInput1 = jTextInputPembilang1.getText();
        String strInput2 = jTextInputPenyebut1.getText();
        String strInput3 = jTextInputPembilang2.getText();
        String strInput4 = jTextInputPenyebut2.getText();
        
        try{
            double pembilang1 = Double.parseDouble(strInput1); //pembilang1
            double penyebut1 = Double.parseDouble(strInput2); //penyebut1
            double pembilang2 = Double.parseDouble(strInput3);
            double penyebut2 = Double.parseDouble(strInput4);
            
            double hasilpembilang;
            double hasilpenyebut;
            
            double hasilbulat;
        
            if(penyebut1 != penyebut2){
                double pembagi = penyebut2/penyebut1;
                pembilang1 *= pembagi;
                penyebut1 *= pembagi;
                if(pembilang1 > pembilang2){
                    hasilpembilang = pembilang1;
                    hasilpenyebut = penyebut1;
                }else{
                    hasilpembilang = pembilang2;
                    hasilpenyebut = penyebut2;
                }         
            }else{
                if(pembilang1 > pembilang2){
                    hasilpembilang = pembilang1;
                    hasilpenyebut = penyebut1;
                }else{
                    hasilpembilang = pembilang2;
                    hasilpenyebut = penyebut2;
                }    
            }
            
        
            hasilbulat = hasilpembilang/hasilpenyebut;
        
            String strHasilPembilang = Double.toString(hasilpembilang);
            String strHasilPenyebut = Double.toString(hasilpenyebut);
            String strHasilBulat = Double.toString(hasilbulat);
            jLabelHasilPembilang.setText(strHasilPembilang);
            jLabelHasilPenyebut.setText(strHasilPenyebut);
            jLabelHasilBulat.setText(strHasilBulat);
        }catch(NumberFormatException e1){
            JOptionPane.showMessageDialog(null, "Mohon masukkan angka pertama, kedua, ketiga, dan keempat", "pesan error", JOptionPane.ERROR_MESSAGE);
        }
        try{
            double pembilang1 = Double.parseDouble(strInput1); //pembilang1
            double penyebut1 = Double.parseDouble(strInput2); //penyebut1
            double pembilang2 = Double.parseDouble(strInput3);
            double penyebut2 = Double.parseDouble(strInput4);
            
            double hasilpembilang;
            double hasilpenyebut;
            
            double hasilbulat;
        
            if(penyebut1 != penyebut2){
                double pembagi = penyebut2/penyebut1;
                pembilang1 *= pembagi;
                penyebut1 *= pembagi;
                if(pembilang1 > pembilang2){
                    hasilpembilang = pembilang1;
                    hasilpenyebut = penyebut1;
                }else{
                    hasilpembilang = pembilang2;
                    hasilpenyebut = penyebut2;
                }         
            }else{
                if(pembilang1 > pembilang2){
                    hasilpembilang = pembilang1;
                    hasilpenyebut = penyebut1;
                }else{
                    hasilpembilang = pembilang2;
                    hasilpenyebut = penyebut2;
                }    
            }
            
        
            hasilbulat = hasilpembilang/hasilpenyebut;
        
            String strHasilPembilang = Double.toString(hasilpembilang);
            String strHasilPenyebut = Double.toString(hasilpenyebut);
            String strHasilBulat = Double.toString(hasilbulat);
            jLabelHasilPembilang.setText(strHasilPembilang);
            jLabelHasilPenyebut.setText(strHasilPenyebut);
            jLabelHasilBulat.setText(strHasilBulat);
        }catch(NumberFormatException e2){
             JOptionPane.showMessageDialog(null, "Mohon masukkan angka bukan huruf", "pesan error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonKurangDariActionPerformed

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
            java.util.logging.Logger.getLogger(selisihlebihkecil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selisihlebihkecil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selisihlebihkecil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selisihlebihkecil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selisihlebihkecil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonKurangDari;
    private javax.swing.JButton jButtonSelisih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelHasilBulat;
    private javax.swing.JLabel jLabelHasilPembilang;
    private javax.swing.JLabel jLabelHasilPenyebut;
    private javax.swing.JLabel jLabelHasilPerhitungan;
    private javax.swing.JLabel jLabelJudul;
    private javax.swing.JLabel jLabelNilai1;
    private javax.swing.JLabel jLabelNilai2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextInputPembilang1;
    private javax.swing.JTextField jTextInputPembilang2;
    private javax.swing.JTextField jTextInputPenyebut1;
    private javax.swing.JTextField jTextInputPenyebut2;
    // End of variables declaration//GEN-END:variables
}