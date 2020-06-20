package tiketbus;
import java.awt.Button;
import java.awt.Color;

import tiketbus.data.Datatiket;
public class PilihKursi extends javax.swing.JFrame {
   private int kursi = 0;
 
 
    public PilihKursi() {
        initComponents();
        BatalkanKursi();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        bt10 = new javax.swing.JButton();
        bt11 = new javax.swing.JButton();
        bt12 = new javax.swing.JButton();
        bt13 = new javax.swing.JButton();
        bt14 = new javax.swing.JButton();
        bt15 = new javax.swing.JButton();
        bt16 = new javax.swing.JButton();
        bt17 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt18 = new javax.swing.JButton();
        bt19 = new javax.swing.JButton();
        bt20 = new javax.swing.JButton();
        bt21 = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153), 10));

        jButton1.setText("Supir");

        bt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt2.setText("02");
        bt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt2MousePressed(evt);
            }
        });
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt3.setText("03");
        bt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt3MousePressed(evt);
            }
        });
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        bt4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt4.setText("04");
        bt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt4MousePressed(evt);
            }
        });

        bt5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt5.setText("05");
        bt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt5MousePressed(evt);
            }
        });

        bt6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt6.setText("06");
        bt6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt6MousePressed(evt);
            }
        });

        bt7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt7.setText("07");
        bt7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt7MousePressed(evt);
            }
        });

        bt8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt8.setText("08");
        bt8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt8MousePressed(evt);
            }
        });

        bt9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt9.setText("09");
        bt9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt9MousePressed(evt);
            }
        });

        bt10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt10.setText("10");
        bt10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt10MousePressed(evt);
            }
        });

        bt11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt11.setText("11");
        bt11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt11MousePressed(evt);
            }
        });

        bt12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt12.setText("12");
        bt12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt12MousePressed(evt);
            }
        });

        bt13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt13.setText("13");
        bt13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt13MousePressed(evt);
            }
        });

        bt14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt14.setText("14");
        bt14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt14MousePressed(evt);
            }
        });

        bt15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt15.setText("15");
        bt15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt15MousePressed(evt);
            }
        });

        bt16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt16.setText("16");
        bt16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt16MousePressed(evt);
            }
        });

        bt17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt17.setText("17");
        bt17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt17MousePressed(evt);
            }
        });

        bt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt1.setText("01");
        bt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt1MousePressed(evt);
            }
        });
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt18.setText("18");
        bt18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt18MousePressed(evt);
            }
        });

        bt19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt19.setText("19");
        bt19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt19MousePressed(evt);
            }
        });

        bt20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt20.setText("20");
        bt20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt20MousePressed(evt);
            }
        });

        bt21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt21.setText("21");
        bt21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt21MousePressed(evt);
            }
        });

        btBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        btNext.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btNext.setText("Next");
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 204, 153));
        jSeparator1.setForeground(new java.awt.Color(255, 204, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(bt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(86, 86, 86))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bt18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(bt10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt11, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(bt15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt4, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(bt8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt13, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(bt9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btNext, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt19, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt21, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btNext, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
    
    }//GEN-LAST:event_bt2ActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
   
         this.setVisible(false);
         prevFrame();
   
    }//GEN-LAST:event_btBackActionPerformed

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed
        Datatiket.NomorKursi =  Integer.toString(kursi);
        new Booking().setVisible(true);
    }//GEN-LAST:event_btNextActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed

    }//GEN-LAST:event_bt1ActionPerformed

    private void bt1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt1MousePressed
        if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 1;
        bt1.setBackground(Color.pink);
       
    }//GEN-LAST:event_bt1MousePressed

    private void bt2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt2MousePressed
        if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 2;
        bt2.setBackground(Color.pink);
       
    }//GEN-LAST:event_bt2MousePressed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt3MousePressed
        if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 3;
        bt3.setBackground(Color.pink);
    }//GEN-LAST:event_bt3MousePressed

    private void bt4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt4MousePressed
        if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 4;
        bt4.setBackground(Color.pink);
    }//GEN-LAST:event_bt4MousePressed

    private void bt5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt5MousePressed
         if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 5;
        bt5.setBackground(Color.pink);
    }//GEN-LAST:event_bt5MousePressed

    private void bt6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt6MousePressed
        if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 6;
        bt6.setBackground(Color.pink);
    }//GEN-LAST:event_bt6MousePressed

    private void bt7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt7MousePressed
        if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 7;
        bt7.setBackground(Color.pink);
    }//GEN-LAST:event_bt7MousePressed

    private void bt8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt8MousePressed
      if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 8;
        bt8.setBackground(Color.pink);
    }//GEN-LAST:event_bt8MousePressed

    private void bt9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt9MousePressed
        if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 9;
        bt9.setBackground(Color.pink);
    }//GEN-LAST:event_bt9MousePressed

    private void bt10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt10MousePressed
       if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 10;
        bt10.setBackground(Color.pink);
    }//GEN-LAST:event_bt10MousePressed

    private void bt11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt11MousePressed
        if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 11;
        bt11.setBackground(Color.pink);
    }//GEN-LAST:event_bt11MousePressed

    private void bt12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt12MousePressed
        if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 12;
        bt12.setBackground(Color.pink);
    }//GEN-LAST:event_bt12MousePressed

    private void bt13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt13MousePressed
         if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 13;
        bt13.setBackground(Color.pink);
    }//GEN-LAST:event_bt13MousePressed

    private void bt14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt14MousePressed
         if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 14;
        bt14.setBackground(Color.pink);
    }//GEN-LAST:event_bt14MousePressed

    private void bt15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt15MousePressed
        if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 15;
        bt15.setBackground(Color.pink);
    }//GEN-LAST:event_bt15MousePressed

    private void bt16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt16MousePressed
         if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 16;
        bt16.setBackground(Color.pink);
    }//GEN-LAST:event_bt16MousePressed

    private void bt17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt17MousePressed
         if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 17;
        bt17.setBackground(Color.pink);
    }//GEN-LAST:event_bt17MousePressed

    private void bt18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt18MousePressed
        if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 18;
        bt18.setBackground(Color.pink);
    }//GEN-LAST:event_bt18MousePressed

    private void bt19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt19MousePressed
         if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 19;
        bt19.setBackground(Color.pink);
    }//GEN-LAST:event_bt19MousePressed

    private void bt20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt20MousePressed
        if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 20;
        bt20.setBackground(Color.pink);
    }//GEN-LAST:event_bt20MousePressed

    private void bt21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt21MousePressed
        if (kursi != 0){
            BatalkanKursi();
        }
        kursi = 21;
        bt13.setBackground(Color.pink);
    }//GEN-LAST:event_bt21MousePressed

    private void BatalkanKursi() {
        bt1.setBackground(Color.GRAY);
        bt2.setBackground(Color.GRAY);
        bt3.setBackground(Color.GRAY);
        bt4.setBackground(Color.GRAY);
        bt5.setBackground(Color.GRAY);
        bt6.setBackground(Color.GRAY);
        bt7.setBackground(Color.GRAY);
        bt8.setBackground(Color.GRAY);
        bt9.setBackground(Color.GRAY);
        bt10.setBackground(Color.GRAY);
        bt11.setBackground(Color.GRAY);
        bt12.setBackground(Color.GRAY);
        bt13.setBackground(Color.GRAY);
        bt14.setBackground(Color.GRAY);
        bt15.setBackground(Color.GRAY);
        bt16.setBackground(Color.GRAY);
        bt17.setBackground(Color.GRAY);
        bt18.setBackground(Color.GRAY);
        bt19.setBackground(Color.GRAY);
        bt20.setBackground(Color.GRAY);
        bt21.setBackground(Color.GRAY);   
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihKursi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt10;
    private javax.swing.JButton bt11;
    private javax.swing.JButton bt12;
    private javax.swing.JButton bt13;
    private javax.swing.JButton bt14;
    private javax.swing.JButton bt15;
    private javax.swing.JButton bt16;
    private javax.swing.JButton bt17;
    private javax.swing.JButton bt18;
    private javax.swing.JButton bt19;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt20;
    private javax.swing.JButton bt21;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btBack;
    private javax.swing.JButton btNext;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void prevFrame() {
       }
}
