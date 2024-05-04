/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.internet_cafe;

import java.awt.Color;
import static java.awt.SystemColor.window;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
        Menu = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SearchBox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        MenuBar = new javax.swing.JPanel();
        HomeButton = new javax.swing.JButton();
        UserButton = new javax.swing.JButton();
        OrderButton = new javax.swing.JButton();
        BillButton = new javax.swing.JButton();
        ServiceButton = new javax.swing.JButton();
        ComputerButton = new javax.swing.JButton();
        StaffButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        bar.setBackground(new java.awt.Color(51, 51, 51));
        bar.setPreferredSize(new java.awt.Dimension(1000, 50));

        Menu.setBackground(new java.awt.Color(51, 51, 51));
        Menu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Menu.setForeground(new java.awt.Color(242, 242, 242));
        Menu.setText("≡ ");
        Menu.setActionCommand("≡");
        Menu.setBorder(null);
        Menu.setBorderPainted(false);
        Menu.setContentAreaFilled(false);
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Menu.setDefaultCapable(false);
        Menu.setFocusPainted(false);
        Menu.setFocusable(false);
        Menu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Menu.setName(""); // NOI18N
        Menu.setRequestFocusEnabled(false);
        Menu.setRolloverEnabled(false);
        Menu.setVerifyInputWhenFocusTarget(false);
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuMouseExited(evt);
            }
        });
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
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
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
                .addContainerGap())
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Menu)
                    .addComponent(name))
                .addContainerGap())
        );

        jPanel1.setToolTipText("");

        SearchBox.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        SearchBox.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        SearchBox.setText("Search...");
        SearchBox.setActionCommand("<Not Set>");
        SearchBox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SearchBox.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        SearchBox.setNextFocusableComponent(SearchBox);
        SearchBox.setPreferredSize(new java.awt.Dimension(700, 60));
        SearchBox.setRequestFocusEnabled(false);
        SearchBox.setVerifyInputWhenFocusTarget(false);
        SearchBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SearchBoxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SearchBoxFocusLost(evt);
            }
        });
        SearchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBoxActionPerformed(evt);
            }
        });
        SearchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchBoxKeyPressed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ha", null, null, null},
                {"ha", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table.setFocusable(false);
        Table.setPreferredSize(new java.awt.Dimension(700, 300));
        Table.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(Table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(133, 133, 133))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MenuBar.setBackground(new java.awt.Color(51, 51, 51));
        MenuBar.setPreferredSize(new java.awt.Dimension(120, 273));

        HomeButton.setBackground(new java.awt.Color(51, 51, 51));
        HomeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(242, 242, 242));
        HomeButton.setText("  Home");
        HomeButton.setBorder(null);
        HomeButton.setBorderPainted(false);
        HomeButton.setContentAreaFilled(false);
        HomeButton.setEnabled(false);
        HomeButton.setFocusPainted(false);
        HomeButton.setFocusable(false);
        HomeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        HomeButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        HomeButton.setName(""); // NOI18N
        HomeButton.setRequestFocusEnabled(false);
        HomeButton.setRolloverEnabled(false);
        HomeButton.setVerifyInputWhenFocusTarget(false);
        HomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeButtonMouseClicked(evt);
            }
        });
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        UserButton.setBackground(new java.awt.Color(51, 51, 51));
        UserButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserButton.setForeground(new java.awt.Color(242, 242, 242));
        UserButton.setText("  User");
        UserButton.setBorder(null);
        UserButton.setBorderPainted(false);
        UserButton.setContentAreaFilled(false);
        UserButton.setEnabled(false);
        UserButton.setFocusPainted(false);
        UserButton.setFocusable(false);
        UserButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        UserButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        UserButton.setRequestFocusEnabled(false);
        UserButton.setRolloverEnabled(false);
        UserButton.setVerifyInputWhenFocusTarget(false);
        UserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserButtonMouseClicked(evt);
            }
        });
        UserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserButtonActionPerformed(evt);
            }
        });

        OrderButton.setBackground(new java.awt.Color(51, 51, 51));
        OrderButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        OrderButton.setForeground(new java.awt.Color(242, 242, 242));
        OrderButton.setText("  Order");
        OrderButton.setBorder(null);
        OrderButton.setBorderPainted(false);
        OrderButton.setContentAreaFilled(false);
        OrderButton.setEnabled(false);
        OrderButton.setFocusPainted(false);
        OrderButton.setFocusable(false);
        OrderButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        OrderButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        OrderButton.setRequestFocusEnabled(false);
        OrderButton.setRolloverEnabled(false);
        OrderButton.setVerifyInputWhenFocusTarget(false);
        OrderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderButtonMouseClicked(evt);
            }
        });
        OrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderButtonActionPerformed(evt);
            }
        });

        BillButton.setBackground(new java.awt.Color(51, 51, 51));
        BillButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BillButton.setForeground(new java.awt.Color(242, 242, 242));
        BillButton.setText("  Billing");
        BillButton.setBorder(null);
        BillButton.setBorderPainted(false);
        BillButton.setContentAreaFilled(false);
        BillButton.setEnabled(false);
        BillButton.setFocusPainted(false);
        BillButton.setFocusable(false);
        BillButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        BillButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BillButton.setRequestFocusEnabled(false);
        BillButton.setRolloverEnabled(false);
        BillButton.setVerifyInputWhenFocusTarget(false);
        BillButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillButtonMouseClicked(evt);
            }
        });

        ServiceButton.setBackground(new java.awt.Color(51, 51, 51));
        ServiceButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ServiceButton.setForeground(new java.awt.Color(242, 242, 242));
        ServiceButton.setText("  Service");
        ServiceButton.setBorder(null);
        ServiceButton.setBorderPainted(false);
        ServiceButton.setContentAreaFilled(false);
        ServiceButton.setEnabled(false);
        ServiceButton.setFocusPainted(false);
        ServiceButton.setFocusable(false);
        ServiceButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        ServiceButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        ServiceButton.setRequestFocusEnabled(false);
        ServiceButton.setRolloverEnabled(false);
        ServiceButton.setVerifyInputWhenFocusTarget(false);
        ServiceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ServiceButtonMouseClicked(evt);
            }
        });

        ComputerButton.setBackground(new java.awt.Color(51, 51, 51));
        ComputerButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ComputerButton.setForeground(new java.awt.Color(242, 242, 242));
        ComputerButton.setText("  Computer");
        ComputerButton.setBorder(null);
        ComputerButton.setBorderPainted(false);
        ComputerButton.setContentAreaFilled(false);
        ComputerButton.setEnabled(false);
        ComputerButton.setFocusPainted(false);
        ComputerButton.setFocusable(false);
        ComputerButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        ComputerButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        ComputerButton.setRequestFocusEnabled(false);
        ComputerButton.setRolloverEnabled(false);
        ComputerButton.setVerifyInputWhenFocusTarget(false);
        ComputerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComputerButtonMouseClicked(evt);
            }
        });
        ComputerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputerButtonActionPerformed(evt);
            }
        });

        StaffButton.setBackground(new java.awt.Color(51, 51, 51));
        StaffButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        StaffButton.setForeground(new java.awt.Color(242, 242, 242));
        StaffButton.setText("  Staff");
        StaffButton.setBorder(null);
        StaffButton.setBorderPainted(false);
        StaffButton.setContentAreaFilled(false);
        StaffButton.setEnabled(false);
        StaffButton.setFocusPainted(false);
        StaffButton.setFocusable(false);
        StaffButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        StaffButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        StaffButton.setRequestFocusEnabled(false);
        StaffButton.setRolloverEnabled(false);
        StaffButton.setVerifyInputWhenFocusTarget(false);
        StaffButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaffButtonMouseClicked(evt);
            }
        });

        BackButton.setBackground(new java.awt.Color(51, 51, 51));
        BackButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BackButton.setForeground(new java.awt.Color(204, 204, 204));
        BackButton.setText("←");
        BackButton.setBorder(null);
        BackButton.setBorderPainted(false);
        BackButton.setContentAreaFilled(false);
        BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton.setDefaultCapable(false);
        BackButton.setEnabled(false);
        BackButton.setFocusPainted(false);
        BackButton.setFocusable(false);
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackButtonMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BackButtonMouseReleased(evt);
            }
        });
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuBarLayout = new javax.swing.GroupLayout(MenuBar);
        MenuBar.setLayout(MenuBarLayout);
        MenuBarLayout.setHorizontalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HomeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BillButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ServiceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComputerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StaffButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BackButton)))
                .addContainerGap())
        );
        MenuBarLayout.setVerticalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(HomeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrderButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BillButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ServiceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComputerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StaffButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BackButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(MenuBar, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void OrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderButtonActionPerformed

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        openMenuBar();        // TODO add your handling code here:
    }//GEN-LAST:event_MenuMouseClicked

    private void MenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseEntered
    // TODO add your handling code here:
    }//GEN-LAST:event_MenuMouseEntered

    private void MenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuMouseExited

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        closeMenuBar();// TODO add your handling code here:
    }//GEN-LAST:event_BackButtonMouseClicked

    private void SearchBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchBoxKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER && !SearchBox.getText().equals("")){
            new Thread(() -> {
                for (int i = 247; i>=10; i--){
                    SearchBox.setSize(700, 30);
                    SearchBox.setLocation(148, i);
                    jScrollPane1.setLocation(148, 90 + i*2);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }).start();
        }
    }//GEN-LAST:event_SearchBoxKeyPressed

    private void HomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseClicked
        SearchBox.setLocation(148, 247);
        SearchBox.setSize(700, 70);
        jScrollPane1.setLocation(148, 1000);
    }//GEN-LAST:event_HomeButtonMouseClicked

    private void UserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButtonMouseClicked
        jScrollPane1.setLocation(148, 90);
        String a = SearchBox.getText();
        SearchBox.setLocation(850, 10);
        SearchBox.setSize(100, 30);
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ha", null, null, null},
                {"null", null, null, null},
                {a, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }));
    }//GEN-LAST:event_UserButtonMouseClicked

    private void OrderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderButtonMouseClicked
        jScrollPane1.setLocation(148, 90);
        SearchBox.setLocation(850, 10);
        SearchBox.setSize(100, 30);
    }//GEN-LAST:event_OrderButtonMouseClicked

    private void BillButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillButtonMouseClicked
        jScrollPane1.setLocation(148, 90);
        SearchBox.setLocation(850, 10);
        SearchBox.setSize(100, 30);
    }//GEN-LAST:event_BillButtonMouseClicked

    private void ServiceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServiceButtonMouseClicked
        jScrollPane1.setLocation(148, 90);
        SearchBox.setLocation(850, 10);
        SearchBox.setSize(100, 30);
    }//GEN-LAST:event_ServiceButtonMouseClicked

    private void ComputerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComputerButtonMouseClicked
        jScrollPane1.setLocation(148, 90);
        SearchBox.setLocation(850, 10);
        SearchBox.setSize(100, 30);
    }//GEN-LAST:event_ComputerButtonMouseClicked

    private void StaffButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StaffButtonMouseClicked
        jScrollPane1.setLocation(148, 90);
        SearchBox.setLocation(850, 10);
        SearchBox.setSize(100, 30);
    }//GEN-LAST:event_StaffButtonMouseClicked

    private void SearchBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchBoxFocusGained
        if (SearchBox.getText().trim().equals("Search...")) {
            SearchBox.setText("");
        }
    }//GEN-LAST:event_SearchBoxFocusGained

    private void SearchBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchBoxFocusLost
        if (SearchBox.getText().trim().equals("")) {
            SearchBox.setText("Search...");
        }
    }//GEN-LAST:event_SearchBoxFocusLost

    private void SearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBoxActionPerformed
        if (SearchBox.getText().length() == 0){
            JOptionPane.showMessageDialog(null,"Please input query string!","Message", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SearchBoxActionPerformed

    private void UserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserButtonActionPerformed

    private void ComputerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComputerButtonActionPerformed

    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseEntered
        BackButton.setForeground(new Color(216,174,94));
        BackButton.setBackground(new Color(59, 59, 59));
    }//GEN-LAST:event_BackButtonMouseEntered

    private void BackButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseReleased
        BackButton.setBackground(new Color(51, 51, 51));
        BackButton.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_BackButtonMouseReleased

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
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BillButton;
    private javax.swing.JButton ComputerButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton Menu;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JButton OrderButton;
    private javax.swing.JTextField SearchBox;
    private javax.swing.JButton ServiceButton;
    private javax.swing.JButton StaffButton;
    private javax.swing.JTable Table;
    private javax.swing.JButton UserButton;
    private javax.swing.JPanel bar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
    int width = 120;
    int height = 800;
    private void openMenuBar() {
        new Thread(() -> {
            for(int i=0; i<=width; i++){
                MenuBar.setSize(i, height);
                bar.setLocation(i, 0);
                try {     
                    Thread.sleep(2);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
        }).start();
    }

    private void closeMenuBar() {
        MenuBar.setSize(0, height);
        bar.setLocation(0, 0);
    }
    
    
}
