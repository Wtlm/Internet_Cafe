package com.mycompany.internet_cafe;

import Database.Connect;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */

public class Internet_cafe extends javax.swing.JFrame {
    Connect connect;

    public Internet_cafe() {
        initComponents();
        connect = new Connect();
        String connectionUrl = "jdbc:sqlserver://LAPTOP-DCGSC18J\\SQLEXPRESS:1433;databaseName=InternetCafe;user=sa;password=123456;"
                + "encrypt=true;trustServerCertificate=true;";
        try {
            Connection con = DriverManager.getConnection(connectionUrl);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bar = new javax.swing.JPanel();
        Menu = new javax.swing.JButton();
        Name = new javax.swing.JLabel();
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
        TakeCareButton = new javax.swing.JButton();
        OrderDetailButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PDM's Project");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        Bar.setBackground(new java.awt.Color(51, 51, 51));
        Bar.setPreferredSize(new java.awt.Dimension(1000, 50));

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
        });

        Name.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Name.setForeground(new java.awt.Color(242, 242, 242));
        Name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Name.setText("The Internet Cafe Management");

        javax.swing.GroupLayout BarLayout = new javax.swing.GroupLayout(Bar);
        Bar.setLayout(BarLayout);
        BarLayout.setHorizontalGroup(
            BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BarLayout.setVerticalGroup(
            BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Menu)
                    .addComponent(Name))
                .addContainerGap())
        );

        jPanel1.setToolTipText("");
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        SearchBox.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        SearchBox.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        SearchBox.setText("Search...");
        SearchBox.setActionCommand("<Not Set>");
        SearchBox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SearchBox.setCursor(null);
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
        SearchBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SearchBoxMousePressed(evt);
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
        MenuBar.setPreferredSize(new java.awt.Dimension(140, 273));

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

        UserButton.setBackground(new java.awt.Color(51, 51, 51));
        UserButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserButton.setForeground(new java.awt.Color(242, 242, 242));
        UserButton.setText("  Users");
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
        OrderButton.setText("  Orders");
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

        TakeCareButton.setBackground(new java.awt.Color(51, 51, 51));
        TakeCareButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TakeCareButton.setForeground(new java.awt.Color(242, 242, 242));
        TakeCareButton.setText("  Take Care");
        TakeCareButton.setBorder(null);
        TakeCareButton.setBorderPainted(false);
        TakeCareButton.setContentAreaFilled(false);
        TakeCareButton.setEnabled(false);
        TakeCareButton.setFocusPainted(false);
        TakeCareButton.setFocusable(false);
        TakeCareButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        TakeCareButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        TakeCareButton.setRequestFocusEnabled(false);
        TakeCareButton.setRolloverEnabled(false);
        TakeCareButton.setVerifyInputWhenFocusTarget(false);
        TakeCareButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TakeCareButtonMouseClicked(evt);
            }
        });

        OrderDetailButton.setBackground(new java.awt.Color(51, 51, 51));
        OrderDetailButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        OrderDetailButton.setForeground(new java.awt.Color(242, 242, 242));
        OrderDetailButton.setText("  Order Detail");
        OrderDetailButton.setBorder(null);
        OrderDetailButton.setBorderPainted(false);
        OrderDetailButton.setContentAreaFilled(false);
        OrderDetailButton.setEnabled(false);
        OrderDetailButton.setFocusPainted(false);
        OrderDetailButton.setFocusable(false);
        OrderDetailButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        OrderDetailButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        OrderDetailButton.setRequestFocusEnabled(false);
        OrderDetailButton.setRolloverEnabled(false);
        OrderDetailButton.setVerifyInputWhenFocusTarget(false);
        OrderDetailButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderDetailButtonMouseClicked(evt);
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
                        .addComponent(BackButton))
                    .addComponent(OrderDetailButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TakeCareButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(OrderDetailButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StaffButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TakeCareButton)
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
                    .addComponent(Bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(MenuBar, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserButtonActionPerformed

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_MenuMouseClicked
        openMenuBar();
    }// GEN-LAST:event_MenuMouseClicked

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_BackButtonMouseClicked
        closeMenuBar();
    }// GEN-LAST:event_BackButtonMouseClicked

    private void TakeCareButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_TakeCareButtonMouseClicked
        state = 8;
        setDefault();
    }// GEN-LAST:event_TakeCareButtonMouseClicked

    private void OrderDetailButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_OrderDetailButtonMouseClicked
        state = 6;
        setDefault();
    }// GEN-LAST:event_OrderDetailButtonMouseClicked

    private void SearchBoxKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !SearchBox.getText().equals("")) {
            new Thread(() -> {
                for (int i = 246; i >= 10; i--) {
                    SearchBox.setSize(700, 30);
                    SearchBox.setLocation(148, i);
                    jScrollPane1.setLocation(148, 90 + i * 2);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Internet_cafe.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }).start();
        }
    }

    private void HomeButtonMouseClicked(java.awt.event.MouseEvent evt) {
        state = 0;
        setDefault();

        String cmd = SearchBox.getText();
        connect.displayData(cmd);
        String[] columnName = { "User ID", "Account", "Password", "Remaining Time" };
        DefaultTableModel model = new DefaultTableModel(connect.rowData, columnName);
        Table.setModel(model);
        jScrollPane1.setViewportView(Table);
    }

    private void UserButtonMouseClicked(java.awt.event.MouseEvent evt) {
        state = 1;
        setDefault();

        connect.displayData("SELECT * FROM Users");
        String[] columnName = { "User ID", "Account", "Password", "Remaining Time" };
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setDataVector(connect.rowData, columnName);
    }

    private void OrderButtonMouseClicked(java.awt.event.MouseEvent evt) {
        state = 2;
        setDefault();

        connect.displayData("SELECT * FROM Order");
        String[] columnName = { "Order ID", "Staff ID", "Order Date", "User ID" };
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setDataVector(connect.rowData, columnName);
    }

    private void BillButtonMouseClicked(java.awt.event.MouseEvent evt) {
        state = 3;
        setDefault();

        connect.displayData("SELECT * FROM Bill");
        String[] columnName = { "Bill ID", "Order ID", "Pay Date", "Payment Method" };
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setDataVector(connect.rowData, columnName);
    }

    private void ServiceButtonMouseClicked(java.awt.event.MouseEvent evt) {
        state = 4;
        setDefault();

        connect.displayData("SELECT * FROM Service");
        String[] columnName = { "Service ID", "Price", "Description", "Type" };
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setDataVector(connect.rowData, columnName);
    }

    private void ComputerButtonMouseClicked(java.awt.event.MouseEvent evt) {
        state = 5;
        setDefault();

        connect.displayData("SELECT * FROM Computer");
        String[] columnName = { "Computer ID", "Status", "User ID", "Start Time" };
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setDataVector(connect.rowData, columnName);
    }

    private void StaffButtonMouseClicked(java.awt.event.MouseEvent evt) {
        state = 7;
        setDefault();

        connect.displayData("SELECT * FROM Staff");
        String[] columnName = { "Staff ID", "Staff Name", "Date of Birth", "Phone Number", "Address" };
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setDataVector(connect.rowData, columnName);
    }
    
    

    private void SearchBoxFocusGained(java.awt.event.FocusEvent evt) {
        if (SearchBox.getText().trim().equals("Search...")) {
            SearchBox.setText("");
        }
    }

    private void SearchBoxFocusLost(java.awt.event.FocusEvent evt) {
        if (SearchBox.getText().trim().equals("")) {
            SearchBox.setText("Search...");
        }
    }

    private void SearchBoxActionPerformed(java.awt.event.ActionEvent evt) {
        if (SearchBox.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please input query string!", "Message", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {
        BackButton.setForeground(new Color(216, 174, 94));
        BackButton.setBackground(new Color(59, 59, 59));
    }

    private void BackButtonMouseReleased(java.awt.event.MouseEvent evt) {
        BackButton.setBackground(new Color(51, 51, 51));
        BackButton.setForeground(new Color(204, 204, 204));
    }

    private void SearchBoxMousePressed(java.awt.event.MouseEvent evt) {
        // if (!SearchBox.contains(evt.getPoint()))
        // SearchBox.setFocusable(true);
        // SearchBox.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    }

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {
        // if (jPanel1.contains(evt.getPoint()) &&
        // (jScrollPane1.contains(evt.getPoint()) ||
        // SearchBox.contains(evt.getPoint()))){
        // SearchBox.setCursor(null);
        // }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Internet_cafe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Internet_cafe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Internet_cafe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Internet_cafe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Internet_cafe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel Bar;
    private javax.swing.JButton BillButton;
    private javax.swing.JButton ComputerButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton Menu;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JLabel Name;
    private javax.swing.JButton OrderButton;
    private javax.swing.JButton OrderDetailButton;
    private javax.swing.JTextField SearchBox;
    private javax.swing.JButton ServiceButton;
    private javax.swing.JButton StaffButton;
    private javax.swing.JTable Table;
    private javax.swing.JButton TakeCareButton;
    private javax.swing.JButton UserButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    int width = 120;
    int height = 800;
    int state = 0;
    int menustatus = 0;

    private void openMenuBar() {
        menustatus = 1;
        new Thread(() -> {
            for (int i = 0; i <= width; i++) {
                MenuBar.setSize(i, height);
                Bar.setLocation(i, 0);
                if (state == 0) {
                    SearchBox.setLocation(148 + 2 * i / 5, SearchBox.getY());
                    SearchBox.setSize(700, 70);
                } else {
                    SearchBox.setLocation(850, 15);
                    SearchBox.setSize(100, 30);
                }
                jScrollPane1.setLocation(148 + 2 * i / 5, jScrollPane1.getY());
                try {
                    Thread.sleep(2);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Internet_cafe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    private void closeMenuBar() {
        menustatus = 0;
        MenuBar.setSize(0, height);
        Bar.setLocation(0, 0);
        if (state == 0) {
            SearchBox.setLocation(148, SearchBox.getY());
            SearchBox.setSize(700, 70);
        } else {
            SearchBox.setLocation(850, 15);
            SearchBox.setSize(100, 30);
        }
        jScrollPane1.setLocation(148, jScrollPane1.getY());
    }

    private void setDefault() {
        if (menustatus == 0) {
            if (state == 0) {
                SearchBox.setLocation(148, 250);
                SearchBox.setSize(700, 70);
                jScrollPane1.setLocation(148, 700);

            } else {
                SearchBox.setLocation(850, 15);
                SearchBox.setSize(100, 30);
                jScrollPane1.setLocation(148, 110);
            }

        } else {
            if (state == 0) {
                SearchBox.setLocation(196, 250);
                SearchBox.setSize(700, 70);
                jScrollPane1.setLocation(196, 700);
            } else {
                SearchBox.setLocation(850, 15);
                SearchBox.setSize(100, 30);
                jScrollPane1.setLocation(196, 110);
            }
        }

    }

    
    
    
}
