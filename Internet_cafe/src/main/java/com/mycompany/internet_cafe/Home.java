/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.internet_cafe;

import static java.awt.SystemColor.window;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        bar = new javax.swing.JPanel();
        option = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        menubar = new javax.swing.JPanel();
        homebutt = new javax.swing.JButton();
        userbutt = new javax.swing.JButton();
        orderbutt = new javax.swing.JButton();
        billbutt = new javax.swing.JButton();
        servbutt = new javax.swing.JButton();
        combutt = new javax.swing.JButton();
        staffbutt = new javax.swing.JButton();
        backbutt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        bar.setBackground(new java.awt.Color(51, 51, 51));
        bar.setPreferredSize(new java.awt.Dimension(1000, 50));

        option.setBackground(new java.awt.Color(51, 51, 51));
        option.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        option.setForeground(new java.awt.Color(242, 242, 242));
        option.setText("≡ ");
        option.setActionCommand("≡");
        option.setBorder(null);
        option.setBorderPainted(false);
        option.setContentAreaFilled(false);
        option.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        option.setDefaultCapable(false);
        option.setFocusPainted(false);
        option.setFocusable(false);
        option.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        option.setRequestFocusEnabled(false);
        option.setRolloverEnabled(false);
        option.setVerifyInputWhenFocusTarget(false);
        option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                optionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                optionMouseExited(evt);
            }
        });
        option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        name.setForeground(new java.awt.Color(242, 242, 242));
        name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name.setText("The Internet Cafe Management");

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(option, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
                .addContainerGap())
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(option)
                    .addComponent(name))
                .addContainerGap())
        );

        jTextField1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jTextField1.setText("  Search");
        jTextField1.setBorder(null);
        jTextField1.setRequestFocusEnabled(false);
        jTextField1.setVerifyInputWhenFocusTarget(false);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
                .addGap(148, 148, 148))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 456, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menubar.setBackground(new java.awt.Color(51, 51, 51));

        homebutt.setBackground(new java.awt.Color(51, 51, 51));
        homebutt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        homebutt.setForeground(new java.awt.Color(242, 242, 242));
        homebutt.setText("Home");
        homebutt.setBorder(null);
        homebutt.setBorderPainted(false);
        homebutt.setContentAreaFilled(false);
        homebutt.setEnabled(false);
        homebutt.setFocusPainted(false);
        homebutt.setFocusable(false);
        homebutt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homebutt.setRequestFocusEnabled(false);
        homebutt.setRolloverEnabled(false);
        homebutt.setVerifyInputWhenFocusTarget(false);
        homebutt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebuttMouseClicked(evt);
            }
        });
        homebutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttActionPerformed(evt);
            }
        });

        userbutt.setBackground(new java.awt.Color(51, 51, 51));
        userbutt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userbutt.setForeground(new java.awt.Color(242, 242, 242));
        userbutt.setText("User");
        userbutt.setBorder(null);
        userbutt.setBorderPainted(false);
        userbutt.setContentAreaFilled(false);
        userbutt.setEnabled(false);
        userbutt.setFocusPainted(false);
        userbutt.setFocusable(false);
        userbutt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        userbutt.setRequestFocusEnabled(false);
        userbutt.setRolloverEnabled(false);
        userbutt.setVerifyInputWhenFocusTarget(false);
        userbutt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userbuttMouseClicked(evt);
            }
        });

        orderbutt.setBackground(new java.awt.Color(51, 51, 51));
        orderbutt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        orderbutt.setForeground(new java.awt.Color(242, 242, 242));
        orderbutt.setText("Order");
        orderbutt.setBorder(null);
        orderbutt.setBorderPainted(false);
        orderbutt.setContentAreaFilled(false);
        orderbutt.setEnabled(false);
        orderbutt.setFocusPainted(false);
        orderbutt.setFocusable(false);
        orderbutt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        orderbutt.setRequestFocusEnabled(false);
        orderbutt.setRolloverEnabled(false);
        orderbutt.setVerifyInputWhenFocusTarget(false);
        orderbutt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderbuttMouseClicked(evt);
            }
        });
        orderbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderbuttActionPerformed(evt);
            }
        });

        billbutt.setBackground(new java.awt.Color(51, 51, 51));
        billbutt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        billbutt.setForeground(new java.awt.Color(242, 242, 242));
        billbutt.setText("Billing");
        billbutt.setBorder(null);
        billbutt.setBorderPainted(false);
        billbutt.setContentAreaFilled(false);
        billbutt.setEnabled(false);
        billbutt.setFocusPainted(false);
        billbutt.setFocusable(false);
        billbutt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        billbutt.setRequestFocusEnabled(false);
        billbutt.setRolloverEnabled(false);
        billbutt.setVerifyInputWhenFocusTarget(false);
        billbutt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billbuttMouseClicked(evt);
            }
        });

        servbutt.setBackground(new java.awt.Color(51, 51, 51));
        servbutt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        servbutt.setForeground(new java.awt.Color(242, 242, 242));
        servbutt.setText("Service");
        servbutt.setBorder(null);
        servbutt.setBorderPainted(false);
        servbutt.setContentAreaFilled(false);
        servbutt.setEnabled(false);
        servbutt.setFocusPainted(false);
        servbutt.setFocusable(false);
        servbutt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        servbutt.setRequestFocusEnabled(false);
        servbutt.setRolloverEnabled(false);
        servbutt.setVerifyInputWhenFocusTarget(false);
        servbutt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                servbuttMouseClicked(evt);
            }
        });

        combutt.setBackground(new java.awt.Color(51, 51, 51));
        combutt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        combutt.setForeground(new java.awt.Color(242, 242, 242));
        combutt.setText("Computer");
        combutt.setBorder(null);
        combutt.setBorderPainted(false);
        combutt.setContentAreaFilled(false);
        combutt.setEnabled(false);
        combutt.setFocusPainted(false);
        combutt.setFocusable(false);
        combutt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        combutt.setRequestFocusEnabled(false);
        combutt.setRolloverEnabled(false);
        combutt.setVerifyInputWhenFocusTarget(false);
        combutt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combuttMouseClicked(evt);
            }
        });

        staffbutt.setBackground(new java.awt.Color(51, 51, 51));
        staffbutt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        staffbutt.setForeground(new java.awt.Color(242, 242, 242));
        staffbutt.setText("Staff");
        staffbutt.setBorder(null);
        staffbutt.setBorderPainted(false);
        staffbutt.setContentAreaFilled(false);
        staffbutt.setEnabled(false);
        staffbutt.setFocusPainted(false);
        staffbutt.setFocusable(false);
        staffbutt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        staffbutt.setRequestFocusEnabled(false);
        staffbutt.setRolloverEnabled(false);
        staffbutt.setVerifyInputWhenFocusTarget(false);
        staffbutt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffbuttMouseClicked(evt);
            }
        });

        backbutt.setBackground(new java.awt.Color(51, 51, 51));
        backbutt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backbutt.setForeground(new java.awt.Color(242, 242, 242));
        backbutt.setText("←");
        backbutt.setBorderPainted(false);
        backbutt.setContentAreaFilled(false);
        backbutt.setDefaultCapable(false);
        backbutt.setEnabled(false);
        backbutt.setFocusPainted(false);
        backbutt.setFocusable(false);
        backbutt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbuttMouseClicked(evt);
            }
        });
        backbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menubarLayout = new javax.swing.GroupLayout(menubar);
        menubar.setLayout(menubarLayout);
        menubarLayout.setHorizontalGroup(
            menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menubarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homebutt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userbutt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderbutt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(billbutt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(servbutt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combutt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staffbutt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menubarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backbutt)))
                .addContainerGap())
        );
        menubarLayout.setVerticalGroup(
            menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menubarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(homebutt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userbutt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderbutt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billbutt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(servbutt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combutt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staffbutt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backbutt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menubar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(menubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionActionPerformed

    private void homebuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homebuttActionPerformed

    private void orderbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderbuttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderbuttActionPerformed

    private void optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionMouseClicked
        openmenubar();        // TODO add your handling code here:
    }//GEN-LAST:event_optionMouseClicked

    private void optionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionMouseEntered
    // TODO add your handling code here:
    }//GEN-LAST:event_optionMouseEntered

    private void optionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_optionMouseExited

    private void backbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backbuttActionPerformed

    private void backbuttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttMouseClicked
        closemenubar();// TODO add your handling code here:
    }//GEN-LAST:event_backbuttMouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            new Thread(() -> {
                for (int i = 247; i>=10; i--){
                    jTextField1.setLocation(148, i);
                    jScrollPane1.setLocation(148, 90 + i*2);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }).start();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void homebuttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebuttMouseClicked
        jTextField1.setLocation(148, 247);
        jTextField1.setSize(700, 30);
        jScrollPane1.setLocation(148, 1000);
    }//GEN-LAST:event_homebuttMouseClicked

    private void userbuttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userbuttMouseClicked
        jScrollPane1.setLocation(148, 90);
        jTextField1.setLocation(850, 10);
        jTextField1.setSize(100, 30);
    }//GEN-LAST:event_userbuttMouseClicked

    private void orderbuttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderbuttMouseClicked
        jScrollPane1.setLocation(148, 90);
        jTextField1.setLocation(850, 10);
        jTextField1.setSize(100, 30);
    }//GEN-LAST:event_orderbuttMouseClicked

    private void billbuttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billbuttMouseClicked
        jScrollPane1.setLocation(148, 90);
        jTextField1.setLocation(850, 10);
        jTextField1.setSize(100, 30);
    }//GEN-LAST:event_billbuttMouseClicked

    private void servbuttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servbuttMouseClicked
        jScrollPane1.setLocation(148, 90);
        jTextField1.setLocation(850, 10);
        jTextField1.setSize(100, 30);
    }//GEN-LAST:event_servbuttMouseClicked

    private void combuttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combuttMouseClicked
        jScrollPane1.setLocation(148, 90);
        jTextField1.setLocation(850, 10);
        jTextField1.setSize(100, 30);
    }//GEN-LAST:event_combuttMouseClicked

    private void staffbuttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffbuttMouseClicked
        jScrollPane1.setLocation(148, 90);
        jTextField1.setLocation(850, 10);
        jTextField1.setSize(100, 30);
    }//GEN-LAST:event_staffbuttMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutt;
    private javax.swing.JPanel bar;
    private javax.swing.JButton billbutt;
    private javax.swing.JButton combutt;
    private javax.swing.JButton homebutt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel menubar;
    private javax.swing.JLabel name;
    private javax.swing.JButton option;
    private javax.swing.JButton orderbutt;
    private javax.swing.JButton servbutt;
    private javax.swing.JButton staffbutt;
    private javax.swing.JTable table;
    private javax.swing.JButton userbutt;
    // End of variables declaration//GEN-END:variables
    int width = 100;
    int height = 800;
    private void openmenubar() {
        new Thread(() -> {
            for(int i=0; i<=width; i++){
                menubar.setSize(i, height);
                bar.setLocation(i, 0);
                try {
                    Thread.sleep(2);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
        }).start();
    }

    private void closemenubar() {
        new Thread(() -> {
            for(int i=width; i>=0; i--){
                menubar.setSize(i, height);
                bar.setLocation(i, 0);
                try {
                    Thread.sleep(2);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
        }).start();
    }
    
    
}