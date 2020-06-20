package tiketbus;
import javax.swing.JOptionPane;
import tiketbus.data.Datatiket;
public class HalamanUtama extends javax.swing.JFrame {
int Eksekutive, Bisnis, Ekonomi;

    public HalamanUtama() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbTujuan = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cbTangaal = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbBulan = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        cbTahun = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        rbEksekutive = new javax.swing.JRadioButton();
        rbBisnis = new javax.swing.JRadioButton();
        rbEkonomi = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("TUJUAN");

        cbTujuan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbTujuan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Pilih Kota--", "Pontianak-Singkawang", "Pontianak-Sintang", "Pontianak-Sambas", "Pontianak-Mempawah", "Pontianak-Ketapang", " " }));
        cbTujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTujuanActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("TANGGAL BERANGKAT");

        cbTangaal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbTangaal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tanggal", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        cbTangaal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTangaalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CLASS");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("HARGA");

        cbBulan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbBulan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bulan", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        cbBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBulanActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton1.setText("OKE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbTahun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbTahun.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tahun", "2020", "2021", "2022", "2023", "2024" }));
        cbTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTahunActionPerformed(evt);
            }
        });

        rbEksekutive.setText("Eksekutive");
        rbEksekutive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEksekutiveActionPerformed(evt);
            }
        });

        rbBisnis.setText("Bisnis");
        rbBisnis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBisnisActionPerformed(evt);
            }
        });

        rbEkonomi.setText("Ekonomi");
        rbEkonomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEkonomiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbTujuan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbTangaal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbEksekutive)
                                .addGap(27, 27, 27)
                                .addComponent(rbBisnis)
                                .addGap(42, 42, 42)
                                .addComponent(rbEkonomi)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(146, 146, 146))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTangaal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbEksekutive)
                    .addComponent(rbBisnis)
                    .addComponent(rbEkonomi))
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBulanActionPerformed
        Datatiket.Bulan = (String) cbBulan.getSelectedItem();       
    }//GEN-LAST:event_cbBulanActionPerformed

    private void cbTujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTujuanActionPerformed
    switch (cbTujuan.getSelectedIndex()){
        case 1 : //Pontianak-Singkawang
           Eksekutive   = 150000;
           Bisnis       = 135000;
           Ekonomi      = 90000;
           break;
           
        case 2 : //Pontianak-Sintang
            Eksekutive   = 200000;
            Bisnis       = 175000;
            Ekonomi      = 150000;
            break;
            
        case 3: //Pontianak-Sambas
            Eksekutive   = 170000;
            Bisnis       = 150000;
            Ekonomi      = 100000;
            break;
            
        case 4: //Pontianak-Mempawah
            Eksekutive   = 120000;
            Bisnis       = 100000;
            Ekonomi      = 100000;
            break;
            
        case 5: //Pontianak-Ketapang
            Eksekutive   = 200000;
            Bisnis       = 170000;
            Ekonomi      = 150000;
            break;
     }
    Datatiket.KotaTujuan = (String) cbTujuan.getSelectedItem();

    }//GEN-LAST:event_cbTujuanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        new PilihKursi().setVisible(true);
             
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void cbTangaalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTangaalActionPerformed
        Datatiket.Tanggal = (String) cbTangaal.getSelectedItem();  
       
    }//GEN-LAST:event_cbTangaalActionPerformed

    private void rbBisnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBisnisActionPerformed
    if (rbBisnis.isSelected());
        rbEksekutive.setSelected(false);
        rbEkonomi.setSelected(false);
        jTextField1.setText("Rp "+Bisnis);
      
        Datatiket.Harga = Bisnis;
        Datatiket.Kelas = "Bisnis";
    }//GEN-LAST:event_rbBisnisActionPerformed

    private void rbEksekutiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEksekutiveActionPerformed
    if (rbEksekutive.isSelected());
        rbBisnis.setSelected(false);
        rbEkonomi.setSelected(false);
        jTextField1.setText("Rp "+Eksekutive);
        
       Datatiket.Harga = Eksekutive;  
       Datatiket.Kelas = "Eksekutive";
    }//GEN-LAST:event_rbEksekutiveActionPerformed

    private void rbEkonomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEkonomiActionPerformed
    if (rbEkonomi.isSelected());
        rbEksekutive.setSelected(false);
        rbBisnis.setSelected(false);
        jTextField1.setText("Rp "+Ekonomi);
        
       Datatiket.Harga = Ekonomi;
       Datatiket.Kelas = "Ekonomi";
    }//GEN-LAST:event_rbEkonomiActionPerformed

    private void cbTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTahunActionPerformed
        Datatiket.Tahun = (String) cbTahun.getSelectedItem();       
      
    }//GEN-LAST:event_cbTahunActionPerformed
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbBulan;
    private javax.swing.JComboBox cbTahun;
    private javax.swing.JComboBox cbTangaal;
    private javax.swing.JComboBox cbTujuan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton rbBisnis;
    private javax.swing.JRadioButton rbEkonomi;
    private javax.swing.JRadioButton rbEksekutive;
    // End of variables declaration//GEN-END:variables
}
