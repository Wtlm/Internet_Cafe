package com.mycompany.internet_cafe;

import Database.Connect;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */

public class Internet_cafe extends javax.swing.JFrame {
    Connect connect;
    private final Color HOVER_COLOR = new Color(216, 174, 94);
    private final Color NORMAL_COLOR = new Color(216, 174, 94, 200);
    boolean menuClick;

    public Internet_cafe() {
        initComponents();
        connect = new Connect();
        submenu.setSize(0, 0);
        menuClick = false;
    }

    private void menuSize(boolean status) {
        if (status) {
            submenu.setSize(150, 550);
        }
        else {
            submenu.setSize(0,0);
        }
    }

    private void showAddMessage(boolean state) {
        if (!state)
            JOptionPane.showMessageDialog(rootPane, "Please enter data!", "Input Request", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(rootPane, "Added data successfully!", "Addition Confirmation",
                    JOptionPane.INFORMATION_MESSAGE);
    }

    private void showUpdateMessage(boolean state) {
        if (!state)
            JOptionPane.showMessageDialog(rootPane, "No data to update!", "Input Request", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(rootPane, "Update data successfully!", "Update Confirmation",
                    JOptionPane.INFORMATION_MESSAGE);
    }

    private void showDeleteMessage(boolean state) {
        Boolean option = null;
        if (!state)
            JOptionPane.showMessageDialog(rootPane, "Please choose data!", "Input Request", JOptionPane.ERROR_MESSAGE);
        else {
            int confirmDelete = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to delete this data?",
                    "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (confirmDelete == JOptionPane.YES_OPTION) {
                option = true;
                JOptionPane.showMessageDialog(rootPane, "Data deleted successfully!", "Deletion Confirmation",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                option = false;
                JOptionPane.showMessageDialog(rootPane, "Deletion canceled.", "Deletion Canceled",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        Bar = new javax.swing.JPanel();
        menuButton = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        submenu = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        usersButton = new javax.swing.JButton();
        staffButton = new javax.swing.JButton();
        computerButton = new javax.swing.JButton();
        serviceButton = new javax.swing.JButton();
        ordersButton = new javax.swing.JButton();
        orderDetailButton = new javax.swing.JButton();
        billButton = new javax.swing.JButton();
        takeCareButton = new javax.swing.JButton();
        jTabbedPane = new javax.swing.JTabbedPane();
        homeInterface = new javax.swing.JPanel();
        SearchBox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        usersInterface = new javax.swing.JPanel();
        UserInformation = new javax.swing.JPanel();
        uID = new javax.swing.JLabel();
        uidText = new javax.swing.JTextField();
        uAcc = new javax.swing.JLabel();
        uaccText = new javax.swing.JTextField();
        uPass = new javax.swing.JLabel();
        upassText = new javax.swing.JTextField();
        uTime = new javax.swing.JLabel();
        utimeText = new javax.swing.JTextField();
        uAdd = new javax.swing.JButton();
        uUpdate = new javax.swing.JButton();
        uDelete = new javax.swing.JButton();
        UTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        staffInterface = new javax.swing.JPanel();
        StaffInformation = new javax.swing.JPanel();
        sID = new javax.swing.JLabel();
        sidText = new javax.swing.JTextField();
        sName = new javax.swing.JLabel();
        snameText = new javax.swing.JTextField();
        sDOB = new javax.swing.JLabel();
        sdobText = new javax.swing.JTextField();
        sPhone = new javax.swing.JLabel();
        sphoneText = new javax.swing.JTextField();
        sAddress = new javax.swing.JLabel();
        saddressText = new javax.swing.JTextField();
        sAdd = new javax.swing.JButton();
        sUpdate = new javax.swing.JButton();
        sDelete = new javax.swing.JButton();
        STable = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        StaffTable = new javax.swing.JTable();
        computerInterface = new javax.swing.JPanel();
        ComputerInformation = new javax.swing.JPanel();
        cID = new javax.swing.JLabel();
        cidText = new javax.swing.JTextField();
        cStatus = new javax.swing.JLabel();
        cON = new javax.swing.JRadioButton();
        cOFF = new javax.swing.JRadioButton();
        cUserID = new javax.swing.JLabel();
        cuseridText = new javax.swing.JTextField();
        cTime = new javax.swing.JLabel();
        ctimeText = new javax.swing.JTextField();
        cAdd = new javax.swing.JButton();
        cUpdate = new javax.swing.JButton();
        cDelete = new javax.swing.JButton();
        CTable = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ComputerTable = new javax.swing.JTable();
        serviceInterface = new javax.swing.JPanel();
        ServiceInformation = new javax.swing.JPanel();
        svID = new javax.swing.JLabel();
        svidText = new javax.swing.JTextField();
        svPrice = new javax.swing.JLabel();
        svpriceText = new javax.swing.JTextField();
        svDescription = new javax.swing.JLabel();
        svdescriptionText = new javax.swing.JTextField();
        svType = new javax.swing.JLabel();
        svtypeText = new javax.swing.JTextField();
        svAdd = new javax.swing.JButton();
        svUpdate = new javax.swing.JButton();
        svDelete = new javax.swing.JButton();
        SerTable = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ServiceTable = new javax.swing.JTable();
        orderInterface = new javax.swing.JPanel();
        OrderInformation = new javax.swing.JPanel();
        oID = new javax.swing.JLabel();
        oidText = new javax.swing.JTextField();
        oStaffID = new javax.swing.JLabel();
        ostaffidText = new javax.swing.JTextField();
        oOderDate = new javax.swing.JLabel();
        ooderdateText = new javax.swing.JTextField();
        oUserID = new javax.swing.JLabel();
        ouseridText = new javax.swing.JTextField();
        oAdd = new javax.swing.JButton();
        oUpdate = new javax.swing.JButton();
        oDelete = new javax.swing.JButton();
        OTable = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        orderDetailInterface = new javax.swing.JPanel();
        OrderDetaiInformation = new javax.swing.JPanel();
        odOderID = new javax.swing.JLabel();
        odorderidText = new javax.swing.JTextField();
        odServiceID = new javax.swing.JLabel();
        odserviceidText = new javax.swing.JTextField();
        odQuantity = new javax.swing.JLabel();
        odquantityText = new javax.swing.JTextField();
        odAdd = new javax.swing.JButton();
        odUpdate = new javax.swing.JButton();
        odDelete = new javax.swing.JButton();
        ODTable = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        OrderDetailTable = new javax.swing.JTable();
        billInterface = new javax.swing.JPanel();
        BillInformation = new javax.swing.JPanel();
        bID = new javax.swing.JLabel();
        bidText = new javax.swing.JTextField();
        bOderID = new javax.swing.JLabel();
        boderidText = new javax.swing.JTextField();
        bPaymentDay = new javax.swing.JLabel();
        bpaymentdayText = new javax.swing.JTextField();
        bPaymentMethod = new javax.swing.JLabel();
        bAdd = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        BTable = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        takeCareInterface = new javax.swing.JPanel();
        TakeCareInformation = new javax.swing.JPanel();
        tcUserID = new javax.swing.JLabel();
        tcuseridText = new javax.swing.JTextField();
        tcStaffID = new javax.swing.JLabel();
        tcstaffidText = new javax.swing.JTextField();
        tcRate = new javax.swing.JLabel();
        tcrateText = new javax.swing.JTextField();
        tcAdd = new javax.swing.JButton();
        tcUpdate = new javax.swing.JButton();
        tcDelete = new javax.swing.JButton();
        TCTable = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TakeCareTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PDM's Project");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));

        jPanel.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel.setMinimumSize(new java.awt.Dimension(1000, 600));
        jPanel.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel.setRequestFocusEnabled(false);
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bar.setBackground(new java.awt.Color(51, 51, 51));
        Bar.setPreferredSize(new java.awt.Dimension(1000, 50));

        menuButton.setBackground(new java.awt.Color(51, 51, 51));
        menuButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        menuButton.setForeground(new java.awt.Color(216, 174, 94));
        menuButton.setText("≡");
        menuButton.setBorder(null);
        menuButton.setBorderPainted(false);
        menuButton.setContentAreaFilled(false);
        menuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuButton.setDefaultCapable(false);
        menuButton.setFocusPainted(false);
        menuButton.setFocusable(false);
        menuButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuButton.setMaximumSize(new java.awt.Dimension(50, 50));
        menuButton.setMinimumSize(new java.awt.Dimension(50, 50));
        menuButton.setName(""); // NOI18N
        menuButton.setPreferredSize(new java.awt.Dimension(50, 50));
        menuButton.setRequestFocusEnabled(false);
        menuButton.setRolloverEnabled(false);
        menuButton.setVerifyInputWhenFocusTarget(false);
        menuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButtonMouseClicked(evt);
            }
        });

        name.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        name.setForeground(new java.awt.Color(216, 174, 94));
        name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name.setText("The Internet Cafe Management");
        name.setMaximumSize(new java.awt.Dimension(352, 50));
        name.setMinimumSize(new java.awt.Dimension(352, 50));
        name.setPreferredSize(new java.awt.Dimension(352, 50));

        javax.swing.GroupLayout BarLayout = new javax.swing.GroupLayout(Bar);
        Bar.setLayout(BarLayout);
        BarLayout.setHorizontalGroup(
                BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BarLayout.createSequentialGroup()
                                .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 1000,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        BarLayout.setVerticalGroup(
                BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BarLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(menuButton, javax.swing.GroupLayout.DEFAULT_SIZE, 51,
                                                Short.MAX_VALUE)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)));

        jPanel.add(Bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        submenu.setBackground(new java.awt.Color(51, 51, 51));
        submenu.setMaximumSize(new java.awt.Dimension(150, 325));
        submenu.setPreferredSize(new java.awt.Dimension(150, 325));

        homeButton.setBackground(new java.awt.Color(51, 51, 51));
        homeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        homeButton.setForeground(new java.awt.Color(216, 174, 94, 200));
        homeButton.setText("Home");
        homeButton.setBorder(null);
        homeButton.setBorderPainted(false);
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.setFocusPainted(false);
        homeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeButton.setMaximumSize(new java.awt.Dimension(150, 35));
        homeButton.setMinimumSize(new java.awt.Dimension(150, 35));
        homeButton.setPreferredSize(new java.awt.Dimension(150, 35));
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButtonMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButtonMouseExited(evt);
            }
        });

        usersButton.setBackground(new java.awt.Color(51, 51, 51));
        usersButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usersButton.setForeground(new java.awt.Color(216, 174, 94, 200));
        usersButton.setText("Users");
        usersButton.setBorder(null);
        usersButton.setBorderPainted(false);
        usersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usersButton.setFocusPainted(false);
        usersButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        usersButton.setMaximumSize(new java.awt.Dimension(150, 35));
        usersButton.setMinimumSize(new java.awt.Dimension(150, 35));
        usersButton.setPreferredSize(new java.awt.Dimension(150, 35));
        usersButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersButtonMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersButtonMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersButtonMouseExited(evt);
            }
        });

        staffButton.setBackground(new java.awt.Color(51, 51, 51));
        staffButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        staffButton.setForeground(new java.awt.Color(216, 174, 94, 200));
        staffButton.setText("Staff");
        staffButton.setBorder(null);
        staffButton.setBorderPainted(false);
        staffButton.setFocusPainted(false);
        staffButton.setMaximumSize(new java.awt.Dimension(150, 35));
        staffButton.setMinimumSize(new java.awt.Dimension(150, 35));
        staffButton.setPreferredSize(new java.awt.Dimension(150, 35));
        staffButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffButtonMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                staffButtonMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                staffButtonMouseExited(evt);
            }
        });

        computerButton.setBackground(new java.awt.Color(51, 51, 51));
        computerButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        computerButton.setForeground(new java.awt.Color(216, 174, 94, 200));
        computerButton.setText("Computer");
        computerButton.setBorder(null);
        computerButton.setBorderPainted(false);
        computerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        computerButton.setFocusPainted(false);
        computerButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        computerButton.setMaximumSize(new java.awt.Dimension(150, 35));
        computerButton.setMinimumSize(new java.awt.Dimension(150, 35));
        computerButton.setPreferredSize(new java.awt.Dimension(150, 35));
        computerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                computerButtonMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                computerButtonMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                computerButtonMouseExited(evt);
            }
        });
        computerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerButtonActionPerformed(evt);
            }
        });

        serviceButton.setBackground(new java.awt.Color(51, 51, 51));
        serviceButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        serviceButton.setForeground(new java.awt.Color(216, 174, 94, 200));
        serviceButton.setText("Service");
        serviceButton.setBorder(null);
        serviceButton.setBorderPainted(false);
        serviceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serviceButton.setFocusPainted(false);
        serviceButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        serviceButton.setMaximumSize(new java.awt.Dimension(150, 35));
        serviceButton.setMinimumSize(new java.awt.Dimension(150, 35));
        serviceButton.setPreferredSize(new java.awt.Dimension(150, 35));
        serviceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serviceButtonMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                serviceButtonMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                serviceButtonMouseExited(evt);
            }
        });

        ordersButton.setBackground(new java.awt.Color(51, 51, 51));
        ordersButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ordersButton.setForeground(new java.awt.Color(216, 174, 94, 200));
        ordersButton.setText("Orders");
        ordersButton.setBorder(null);
        ordersButton.setBorderPainted(false);
        ordersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ordersButton.setFocusPainted(false);
        ordersButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ordersButton.setMaximumSize(new java.awt.Dimension(150, 35));
        ordersButton.setMinimumSize(new java.awt.Dimension(150, 35));
        ordersButton.setPreferredSize(new java.awt.Dimension(150, 35));
        ordersButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersButtonMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ordersButtonMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                ordersButtonMouseExited(evt);
            }
        });

        orderDetailButton.setBackground(new java.awt.Color(51, 51, 51));
        orderDetailButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        orderDetailButton.setForeground(new java.awt.Color(216, 174, 94, 200));
        orderDetailButton.setText("Order Detail");
        orderDetailButton.setBorder(null);
        orderDetailButton.setBorderPainted(false);
        orderDetailButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orderDetailButton.setFocusPainted(false);
        orderDetailButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        orderDetailButton.setMaximumSize(new java.awt.Dimension(150, 35));
        orderDetailButton.setMinimumSize(new java.awt.Dimension(150, 35));
        orderDetailButton.setPreferredSize(new java.awt.Dimension(150, 35));
        orderDetailButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderDetailButtonMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                orderDetailButtonMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                orderDetailButtonMouseExited(evt);
            }
        });

        billButton.setBackground(new java.awt.Color(51, 51, 51));
        billButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        billButton.setForeground(new java.awt.Color(216, 174, 94, 200));
        billButton.setText("Bill");
        billButton.setBorder(null);
        billButton.setBorderPainted(false);
        billButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        billButton.setFocusPainted(false);
        billButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        billButton.setMaximumSize(new java.awt.Dimension(150, 35));
        billButton.setMinimumSize(new java.awt.Dimension(150, 35));
        billButton.setPreferredSize(new java.awt.Dimension(150, 35));
        billButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billButtonMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                billButtonMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                billButtonMouseExited(evt);
            }
        });

        takeCareButton.setBackground(new java.awt.Color(51, 51, 51));
        takeCareButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        takeCareButton.setForeground(new java.awt.Color(216, 174, 94, 200));
        takeCareButton.setText("Take Care");
        takeCareButton.setBorder(null);
        takeCareButton.setBorderPainted(false);
        takeCareButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        takeCareButton.setFocusPainted(false);
        takeCareButton.setMaximumSize(new java.awt.Dimension(150, 35));
        takeCareButton.setMinimumSize(new java.awt.Dimension(150, 35));
        takeCareButton.setName(""); // NOI18N
        takeCareButton.setPreferredSize(new java.awt.Dimension(150, 35));
        takeCareButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                takeCareButtonMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                takeCareButtonMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                takeCareButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout submenuLayout = new javax.swing.GroupLayout(submenu);
        submenu.setLayout(submenuLayout);
        submenuLayout.setHorizontalGroup(
                submenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(submenuLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(submenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usersButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(staffButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(serviceButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ordersButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(orderDetailButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(billButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(takeCareButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(computerButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))));
        submenuLayout.setVerticalGroup(
                submenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, submenuLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(usersButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(staffButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(computerButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(serviceButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(ordersButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(orderDetailButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(billButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(takeCareButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)));

        jPanel.add(submenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 0));

        jTabbedPane.setMaximumSize(new java.awt.Dimension(1000, 600));
        jTabbedPane.setMinimumSize(new java.awt.Dimension(1000, 600));
        jTabbedPane.setPreferredSize(new java.awt.Dimension(1000, 600));

        homeInterface.setBackground(new java.awt.Color(245, 229, 191));
        homeInterface.setToolTipText("");
        homeInterface.setMaximumSize(new java.awt.Dimension(1000, 550));
        homeInterface.setMinimumSize(new java.awt.Dimension(1000, 550));
        homeInterface.setPreferredSize(new java.awt.Dimension(1000, 550));

        SearchBox.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        SearchBox.setText("Search...");
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

        jScrollPane1.setBorder(null);
        jScrollPane1.setEnabled(false);
        jScrollPane1.setFocusable(false);
        jScrollPane1.setRequestFocusEnabled(false);

        Table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        {},
                        {},
                        {},
                        {},
                        {},
                        {},
                        {}
                },
                new String[] {

                }));
        Table.setAutoscrolls(false);
        Table.setColumnSelectionAllowed(true);
        Table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Table.setDropMode(javax.swing.DropMode.ON_OR_INSERT);
        Table.setEnabled(false);
        Table.setFocusable(false);
        Table.setPreferredSize(new java.awt.Dimension(700, 300));
        Table.setRequestFocusEnabled(false);
        Table.setShowGrid(true);
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table);

        javax.swing.GroupLayout homeInterfaceLayout = new javax.swing.GroupLayout(homeInterface);
        homeInterface.setLayout(homeInterfaceLayout);
        homeInterfaceLayout.setHorizontalGroup(
            homeInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeInterfaceLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(SearchBox, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addGap(150, 150, 150))
            .addGroup(homeInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homeInterfaceLayout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addGap(150, 150, 150)))
        );
        homeInterfaceLayout.setVerticalGroup(
                homeInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(homeInterfaceLayout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(264, Short.MAX_VALUE))
                        .addGroup(homeInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(homeInterfaceLayout.createSequentialGroup()
                                        .addGap(377, 377, 377)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(173, Short.MAX_VALUE))));

        jTabbedPane.addTab("home", homeInterface);

        usersInterface.setBackground(new java.awt.Color(245, 229, 191));
        usersInterface.setToolTipText("");
        usersInterface.setFocusable(false);
        usersInterface.setMaximumSize(new java.awt.Dimension(1000, 550));
        usersInterface.setMinimumSize(new java.awt.Dimension(1000, 550));
        usersInterface.setName(""); // NOI18N
        usersInterface.setPreferredSize(new java.awt.Dimension(1000, 550));
        usersInterface.setRequestFocusEnabled(false);
        usersInterface.setVerifyInputWhenFocusTarget(false);

        UserInformation.setBackground(new java.awt.Color(216, 174, 94, 200));
        UserInformation.setBorder(new RoundedBorder(40));
        UserInformation.setOpaque(false);
        UserInformation.setPreferredSize(new java.awt.Dimension(400, 400));

        uID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uID.setText("ID");

        uAcc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uAcc.setText("Account");

        uPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uPass.setText("Password");

        uTime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uTime.setText("Remaining Time");

        uAdd.setBackground(new java.awt.Color(73, 79, 86));
        uAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uAdd.setForeground(new java.awt.Color(252, 255, 222));
        uAdd.setText("Add");
        uAdd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        uAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        uAdd.setMaximumSize(new java.awt.Dimension(100, 25));
        uAdd.setMinimumSize(new java.awt.Dimension(100, 25));
        uAdd.setPreferredSize(new java.awt.Dimension(100, 25));
        uAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uAddActionPerformed(evt);
            }
        });

        uUpdate.setBackground(new java.awt.Color(73, 79, 86));
        uUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uUpdate.setForeground(new java.awt.Color(252, 255, 222));
        uUpdate.setText("Update");
        uUpdate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        uUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        uUpdate.setMaximumSize(new java.awt.Dimension(100, 25));
        uUpdate.setMinimumSize(new java.awt.Dimension(100, 25));
        uUpdate.setPreferredSize(new java.awt.Dimension(100, 25));
        uUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uUpdateActionPerformed(evt);
            }
        });

        uDelete.setBackground(new java.awt.Color(73, 79, 86));
        uDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uDelete.setForeground(new java.awt.Color(242, 242, 242));
        uDelete.setText("Delete");
        uDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        uDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        uDelete.setMaximumSize(new java.awt.Dimension(100, 25));
        uDelete.setMinimumSize(new java.awt.Dimension(100, 25));
        uDelete.setPreferredSize(new java.awt.Dimension(100, 25));
        uDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UserInformationLayout = new javax.swing.GroupLayout(UserInformation);
        UserInformation.setLayout(UserInformationLayout);
        UserInformationLayout.setHorizontalGroup(
            UserInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserInformationLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(UserInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserInformationLayout.createSequentialGroup()
                        .addComponent(uID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uidText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserInformationLayout.createSequentialGroup()
                        .addComponent(uPass, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(upassText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserInformationLayout.createSequentialGroup()
                        .addComponent(uAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uaccText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserInformationLayout.createSequentialGroup()
                        .addGroup(UserInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uTime, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addGroup(UserInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserInformationLayout.createSequentialGroup()
                                .addComponent(uUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(uDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(utimeText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        UserInformationLayout.setVerticalGroup(
            UserInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserInformationLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(UserInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(uID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uidText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UserInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uaccText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(UserInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uPass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UserInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uTime, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(utimeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(UserInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        UTable.setPreferredSize(new java.awt.Dimension(500, 550));
        UTable.setRequestFocusEnabled(false);

        jScrollPane2.setMaximumSize(new java.awt.Dimension(500, 550));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(500, 550));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(500, 550));

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {

                }));
        UserTable.setGridColor(new java.awt.Color(51, 51, 51));
        UserTable.setMaximumSize(new java.awt.Dimension(500, 550));
        UserTable.setMinimumSize(new java.awt.Dimension(500, 550));
        UserTable.setPreferredSize(new java.awt.Dimension(500, 550));
        UserTable.setSelectionBackground(new java.awt.Color(216, 174, 94));
        UserTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        UserTable.setShowGrid(true);
        UserTable.getTableHeader().setReorderingAllowed(false);
        UserTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(UserTable);

        javax.swing.GroupLayout UTableLayout = new javax.swing.GroupLayout(UTable);
        UTable.setLayout(UTableLayout);
        UTableLayout.setHorizontalGroup(
            UTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        UTableLayout.setVerticalGroup(
            UTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UTableLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout usersInterfaceLayout = new javax.swing.GroupLayout(usersInterface);
        usersInterface.setLayout(usersInterfaceLayout);
        usersInterfaceLayout.setHorizontalGroup(
            usersInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersInterfaceLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(UserInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(UTable, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
        );
        usersInterfaceLayout.setVerticalGroup(
            usersInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersInterfaceLayout.createSequentialGroup()
                .addComponent(UTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(usersInterfaceLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(UserInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("users", usersInterface);

        staffInterface.setBackground(new java.awt.Color(245, 229, 191));
        staffInterface.setToolTipText("");
        staffInterface.setFocusable(false);
        staffInterface.setMaximumSize(new java.awt.Dimension(1000, 550));
        staffInterface.setMinimumSize(new java.awt.Dimension(1000, 550));
        staffInterface.setName(""); // NOI18N
        staffInterface.setPreferredSize(new java.awt.Dimension(1000, 550));
        staffInterface.setRequestFocusEnabled(false);
        staffInterface.setVerifyInputWhenFocusTarget(false);

        StaffInformation.setBackground(new java.awt.Color(216, 174, 94, 200));
        StaffInformation.setBorder(new RoundedBorder(40));
        StaffInformation.setOpaque(false);
        StaffInformation.setPreferredSize(new java.awt.Dimension(400, 400));

        sID.setText("ID");

        sName.setText("Name");

        sDOB.setText("Date of Birth");

        sPhone.setText("Phone Number");

        sAddress.setText("Address");

        sAdd.setBackground(new java.awt.Color(73, 79, 86));
        sAdd.setForeground(new java.awt.Color(252, 255, 222));
        sAdd.setText("Add");
        sAdd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sAdd.setMaximumSize(new java.awt.Dimension(100, 25));
        sAdd.setMinimumSize(new java.awt.Dimension(100, 25));
        sAdd.setPreferredSize(new java.awt.Dimension(100, 25));
        sAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sAddActionPerformed(evt);
            }
        });

        sUpdate.setBackground(new java.awt.Color(73, 79, 86));
        sUpdate.setForeground(new java.awt.Color(252, 255, 222));
        sUpdate.setText("Update");
        sUpdate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sUpdate.setMaximumSize(new java.awt.Dimension(100, 25));
        sUpdate.setMinimumSize(new java.awt.Dimension(100, 25));
        sUpdate.setPreferredSize(new java.awt.Dimension(100, 25));
        sUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sUpdateActionPerformed(evt);
            }
        });

        sDelete.setBackground(new java.awt.Color(73, 79, 86));
        sDelete.setForeground(new java.awt.Color(252, 255, 222));
        sDelete.setText("Delete");
        sDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sDelete.setMaximumSize(new java.awt.Dimension(100, 25));
        sDelete.setMinimumSize(new java.awt.Dimension(100, 25));
        sDelete.setPreferredSize(new java.awt.Dimension(100, 25));
        sDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StaffInformationLayout = new javax.swing.GroupLayout(StaffInformation);
        StaffInformation.setLayout(StaffInformationLayout);
        StaffInformationLayout.setHorizontalGroup(
            StaffInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffInformationLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(StaffInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(StaffInformationLayout.createSequentialGroup()
                        .addComponent(sAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StaffInformationLayout.createSequentialGroup()
                        .addComponent(sID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sidText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StaffInformationLayout.createSequentialGroup()
                        .addComponent(sDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sdobText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StaffInformationLayout.createSequentialGroup()
                        .addComponent(sName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(snameText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StaffInformationLayout.createSequentialGroup()
                        .addGroup(StaffInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addGroup(StaffInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StaffInformationLayout.createSequentialGroup()
                                .addComponent(sUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(sDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sphoneText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        StaffInformationLayout.setVerticalGroup(
            StaffInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffInformationLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(StaffInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sidText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(StaffInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(snameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(StaffInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sdobText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(StaffInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sphoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(StaffInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(StaffInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        STable.setPreferredSize(new java.awt.Dimension(512, 550));
        STable.setRequestFocusEnabled(false);

        jScrollPane3.setMaximumSize(new java.awt.Dimension(500, 550));
        jScrollPane3.setMinimumSize(new java.awt.Dimension(500, 550));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(500, 550));

        StaffTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {

                }));
        StaffTable.setMaximumSize(new java.awt.Dimension(500, 550));
        StaffTable.setMinimumSize(new java.awt.Dimension(500, 550));
        StaffTable.setPreferredSize(new java.awt.Dimension(500, 550));
        StaffTable.setShowGrid(true);
        StaffTable.getTableHeader().setReorderingAllowed(false);
        StaffTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaffTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(StaffTable);

        javax.swing.GroupLayout STableLayout = new javax.swing.GroupLayout(STable);
        STable.setLayout(STableLayout);
        STableLayout.setHorizontalGroup(
            STableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        STableLayout.setVerticalGroup(
            STableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(STableLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout staffInterfaceLayout = new javax.swing.GroupLayout(staffInterface);
        staffInterface.setLayout(staffInterfaceLayout);
        staffInterfaceLayout.setHorizontalGroup(
            staffInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffInterfaceLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(StaffInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(STable, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
        );
        staffInterfaceLayout.setVerticalGroup(
            staffInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffInterfaceLayout.createSequentialGroup()
                .addGroup(staffInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(STable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(staffInterfaceLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(StaffInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9))
        );

        jTabbedPane.addTab("tab3", staffInterface);

        computerInterface.setBackground(new java.awt.Color(245, 229, 191));
        computerInterface.setToolTipText("");
        computerInterface.setFocusable(false);
        computerInterface.setMaximumSize(new java.awt.Dimension(1000, 550));
        computerInterface.setMinimumSize(new java.awt.Dimension(1000, 550));
        computerInterface.setName(""); // NOI18N
        computerInterface.setRequestFocusEnabled(false);
        computerInterface.setVerifyInputWhenFocusTarget(false);

        ComputerInformation.setBackground(new java.awt.Color(216, 174, 94, 200));
        ComputerInformation.setBorder(new RoundedBorder(40));
        ComputerInformation.setMaximumSize(new java.awt.Dimension(400, 400));
        ComputerInformation.setMinimumSize(new java.awt.Dimension(400, 400));
        ComputerInformation.setOpaque(false);
        ComputerInformation.setPreferredSize(new java.awt.Dimension(400, 400));

        cID.setText("ID");

        cStatus.setText("Status");

        cON.setText("ON");
        cON.setOpaque(true);

        cOFF.setText("OFF");
        cOFF.setOpaque(true);

        cUserID.setText("User ID");

        cTime.setText("Start Time");

        cAdd.setBackground(new java.awt.Color(73, 79, 86));
        cAdd.setForeground(new java.awt.Color(252, 255, 222));
        cAdd.setText("Add");
        cAdd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cAdd.setMaximumSize(new java.awt.Dimension(100, 25));
        cAdd.setMinimumSize(new java.awt.Dimension(100, 25));
        cAdd.setPreferredSize(new java.awt.Dimension(100, 25));
        cAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAddActionPerformed(evt);
            }
        });

        cUpdate.setBackground(new java.awt.Color(73, 79, 86));
        cUpdate.setForeground(new java.awt.Color(252, 255, 222));
        cUpdate.setText("Update");
        cUpdate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cUpdate.setMaximumSize(new java.awt.Dimension(100, 25));
        cUpdate.setMinimumSize(new java.awt.Dimension(100, 25));
        cUpdate.setPreferredSize(new java.awt.Dimension(100, 25));
        cUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cUpdateActionPerformed(evt);
            }
        });

        cDelete.setBackground(new java.awt.Color(73, 79, 86));
        cDelete.setForeground(new java.awt.Color(252, 255, 222));
        cDelete.setText("Delete");
        cDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cDelete.setMaximumSize(new java.awt.Dimension(100, 25));
        cDelete.setMinimumSize(new java.awt.Dimension(100, 25));
        cDelete.setPreferredSize(new java.awt.Dimension(100, 25));
        cDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ComputerInformationLayout = new javax.swing.GroupLayout(ComputerInformation);
        ComputerInformation.setLayout(ComputerInformationLayout);
        ComputerInformationLayout.setHorizontalGroup(
            ComputerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputerInformationLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(ComputerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ComputerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cTime, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(ComputerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ComputerInformationLayout.createSequentialGroup()
                        .addComponent(cUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(cDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cuseridText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctimeText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ComputerInformationLayout.createSequentialGroup()
                        .addGroup(ComputerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cidText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ComputerInformationLayout.createSequentialGroup()
                                .addComponent(cON)
                                .addGap(69, 69, 69)
                                .addComponent(cOFF)))
                        .addGap(1, 1, 1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        ComputerInformationLayout.setVerticalGroup(
            ComputerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputerInformationLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(ComputerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ComputerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cON)
                    .addComponent(cOFF))
                .addGap(12, 12, 12)
                .addGroup(ComputerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuseridText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ComputerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cTime, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctimeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(ComputerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        CTable.setPreferredSize(new java.awt.Dimension(500, 550));
        CTable.setRequestFocusEnabled(false);

        jScrollPane4.setMaximumSize(new java.awt.Dimension(500, 550));
        jScrollPane4.setMinimumSize(new java.awt.Dimension(500, 550));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(500, 550));

        ComputerTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {

                }));
        ComputerTable.setMaximumSize(new java.awt.Dimension(500, 550));
        ComputerTable.setMinimumSize(new java.awt.Dimension(500, 550));
        ComputerTable.setPreferredSize(new java.awt.Dimension(500, 550));
        ComputerTable.setShowGrid(true);
        ComputerTable.getTableHeader().setReorderingAllowed(false);
        ComputerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComputerTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(ComputerTable);

        javax.swing.GroupLayout CTableLayout = new javax.swing.GroupLayout(CTable);
        CTable.setLayout(CTableLayout);
        CTableLayout.setHorizontalGroup(
            CTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CTableLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CTableLayout.setVerticalGroup(
                CTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        javax.swing.GroupLayout computerInterfaceLayout = new javax.swing.GroupLayout(computerInterface);
        computerInterface.setLayout(computerInterfaceLayout);
        computerInterfaceLayout.setHorizontalGroup(
            computerInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(computerInterfaceLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(ComputerInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(CTable, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        computerInterfaceLayout.setVerticalGroup(
            computerInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(computerInterfaceLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(ComputerInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane.addTab("tab4", computerInterface);

        serviceInterface.setBackground(new java.awt.Color(245, 229, 191));
        serviceInterface.setToolTipText("");
        serviceInterface.setFocusable(false);
        serviceInterface.setMaximumSize(new java.awt.Dimension(1000, 550));
        serviceInterface.setMinimumSize(new java.awt.Dimension(1000, 550));
        serviceInterface.setName(""); // NOI18N
        serviceInterface.setRequestFocusEnabled(false);
        serviceInterface.setVerifyInputWhenFocusTarget(false);

        ServiceInformation.setBackground(new java.awt.Color(216, 174, 94, 200));
        ServiceInformation.setBorder(new RoundedBorder(40));
        ServiceInformation.setMaximumSize(new java.awt.Dimension(400, 400));
        ServiceInformation.setMinimumSize(new java.awt.Dimension(400, 400));
        ServiceInformation.setOpaque(false);
        ServiceInformation.setPreferredSize(new java.awt.Dimension(400, 400));

        svID.setText("ID");

        svPrice.setText("Price");

        svDescription.setText("Description");

        svType.setText("Type");

        svAdd.setBackground(new java.awt.Color(73, 79, 86));
        svAdd.setForeground(new java.awt.Color(252, 255, 222));
        svAdd.setText("Add");
        svAdd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        svAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        svAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        svAdd.setMaximumSize(new java.awt.Dimension(100, 25));
        svAdd.setMinimumSize(new java.awt.Dimension(100, 25));
        svAdd.setPreferredSize(new java.awt.Dimension(100, 25));
        svAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svAddActionPerformed(evt);
            }
        });

        svUpdate.setBackground(new java.awt.Color(73, 79, 86));
        svUpdate.setForeground(new java.awt.Color(252, 255, 222));
        svUpdate.setText("Update");
        svUpdate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        svUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        svUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        svUpdate.setMaximumSize(new java.awt.Dimension(100, 25));
        svUpdate.setMinimumSize(new java.awt.Dimension(100, 25));
        svUpdate.setPreferredSize(new java.awt.Dimension(100, 25));
        svUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svUpdateActionPerformed(evt);
            }
        });

        svDelete.setBackground(new java.awt.Color(73, 79, 86));
        svDelete.setForeground(new java.awt.Color(252, 255, 222));
        svDelete.setText("Delete");
        svDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        svDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        svDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        svDelete.setMaximumSize(new java.awt.Dimension(100, 25));
        svDelete.setMinimumSize(new java.awt.Dimension(100, 25));
        svDelete.setPreferredSize(new java.awt.Dimension(100, 25));
        svDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ServiceInformationLayout = new javax.swing.GroupLayout(ServiceInformation);
        ServiceInformation.setLayout(ServiceInformationLayout);
        ServiceInformationLayout.setHorizontalGroup(
            ServiceInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServiceInformationLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(ServiceInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(svType, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(ServiceInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ServiceInformationLayout.createSequentialGroup()
                        .addComponent(svUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(svDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(svidText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svdescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svpriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svtypeText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        ServiceInformationLayout.setVerticalGroup(
            ServiceInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServiceInformationLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(ServiceInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(svID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svidText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ServiceInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(svPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svpriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(ServiceInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(svDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svdescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ServiceInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(svType, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svtypeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(ServiceInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(svAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        SerTable.setPreferredSize(new java.awt.Dimension(500, 550));
        SerTable.setRequestFocusEnabled(false);

        jScrollPane5.setMaximumSize(new java.awt.Dimension(500, 550));
        jScrollPane5.setMinimumSize(new java.awt.Dimension(500, 550));
        jScrollPane5.setPreferredSize(new java.awt.Dimension(500, 550));

        ServiceTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {

                }));
        ServiceTable.setMaximumSize(new java.awt.Dimension(500, 550));
        ServiceTable.setMinimumSize(new java.awt.Dimension(500, 550));
        ServiceTable.setPreferredSize(new java.awt.Dimension(500, 550));
        ServiceTable.setShowGrid(true);
        ServiceTable.getTableHeader().setReorderingAllowed(false);
        ServiceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ServiceTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(ServiceTable);

        javax.swing.GroupLayout SerTableLayout = new javax.swing.GroupLayout(SerTable);
        SerTable.setLayout(SerTableLayout);
        SerTableLayout.setHorizontalGroup(
            SerTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        SerTableLayout.setVerticalGroup(
                SerTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        javax.swing.GroupLayout serviceInterfaceLayout = new javax.swing.GroupLayout(serviceInterface);
        serviceInterface.setLayout(serviceInterfaceLayout);
        serviceInterfaceLayout.setHorizontalGroup(
            serviceInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serviceInterfaceLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(ServiceInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(SerTable, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
        );
        serviceInterfaceLayout.setVerticalGroup(
            serviceInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serviceInterfaceLayout.createSequentialGroup()
                .addGroup(serviceInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SerTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(serviceInterfaceLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(ServiceInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane.addTab("tab5", serviceInterface);

        orderInterface.setBackground(new java.awt.Color(245, 229, 191));
        orderInterface.setToolTipText("");
        orderInterface.setFocusable(false);
        orderInterface.setMaximumSize(new java.awt.Dimension(1000, 550));
        orderInterface.setMinimumSize(new java.awt.Dimension(1000, 550));
        orderInterface.setName(""); // NOI18N
        orderInterface.setRequestFocusEnabled(false);
        orderInterface.setVerifyInputWhenFocusTarget(false);

        OrderInformation.setBackground(new java.awt.Color(216, 174, 94, 200));
        OrderInformation.setBorder(new RoundedBorder(40));
        OrderInformation.setMaximumSize(new java.awt.Dimension(400, 400));
        OrderInformation.setMinimumSize(new java.awt.Dimension(400, 400));
        OrderInformation.setOpaque(false);
        OrderInformation.setPreferredSize(new java.awt.Dimension(400, 400));

        oID.setText("ID");

        oStaffID.setText("Staff ID");

        oOderDate.setText("Order Date");

        oUserID.setText("User ID");

        oAdd.setBackground(new java.awt.Color(73, 79, 86));
        oAdd.setForeground(new java.awt.Color(252, 255, 222));
        oAdd.setText("Add");
        oAdd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        oAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        oAdd.setMaximumSize(new java.awt.Dimension(100, 25));
        oAdd.setMinimumSize(new java.awt.Dimension(100, 25));
        oAdd.setPreferredSize(new java.awt.Dimension(100, 25));
        oAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oAddActionPerformed(evt);
            }
        });

        oUpdate.setBackground(new java.awt.Color(73, 79, 86));
        oUpdate.setForeground(new java.awt.Color(252, 255, 222));
        oUpdate.setText("Update");
        oUpdate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        oUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        oUpdate.setMaximumSize(new java.awt.Dimension(100, 25));
        oUpdate.setMinimumSize(new java.awt.Dimension(100, 25));
        oUpdate.setPreferredSize(new java.awt.Dimension(100, 25));
        oUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oUpdateActionPerformed(evt);
            }
        });

        oDelete.setBackground(new java.awt.Color(73, 79, 86));
        oDelete.setForeground(new java.awt.Color(252, 255, 222));
        oDelete.setText("Delete");
        oDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        oDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        oDelete.setMaximumSize(new java.awt.Dimension(100, 25));
        oDelete.setMinimumSize(new java.awt.Dimension(100, 25));
        oDelete.setPreferredSize(new java.awt.Dimension(100, 25));
        oDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OrderInformationLayout = new javax.swing.GroupLayout(OrderInformation);
        OrderInformation.setLayout(OrderInformationLayout);
        OrderInformationLayout.setHorizontalGroup(
            OrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderInformationLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(OrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrderInformationLayout.createSequentialGroup()
                        .addComponent(oID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(oidText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrderInformationLayout.createSequentialGroup()
                        .addComponent(oOderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ooderdateText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrderInformationLayout.createSequentialGroup()
                        .addComponent(oStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ostaffidText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrderInformationLayout.createSequentialGroup()
                        .addGroup(OrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addGroup(OrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrderInformationLayout.createSequentialGroup()
                                .addComponent(oUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(oDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ouseridText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        OrderInformationLayout.setVerticalGroup(
            OrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderInformationLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(OrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(oID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oidText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(OrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ostaffidText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(OrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oOderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ooderdateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(OrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ouseridText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(OrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        OTable.setPreferredSize(new java.awt.Dimension(500, 550));
        OTable.setRequestFocusEnabled(false);

        jScrollPane6.setMaximumSize(new java.awt.Dimension(500, 550));
        jScrollPane6.setMinimumSize(new java.awt.Dimension(500, 550));
        jScrollPane6.setPreferredSize(new java.awt.Dimension(500, 550));

        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {

                }));
        OrderTable.setMaximumSize(new java.awt.Dimension(500, 550));
        OrderTable.setMinimumSize(new java.awt.Dimension(500, 550));
        OrderTable.setPreferredSize(new java.awt.Dimension(500, 550));
        OrderTable.setShowGrid(true);
        OrderTable.getTableHeader().setReorderingAllowed(false);
        OrderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(OrderTable);

        javax.swing.GroupLayout OTableLayout = new javax.swing.GroupLayout(OTable);
        OTable.setLayout(OTableLayout);
        OTableLayout.setHorizontalGroup(
            OTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OTableLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        OTableLayout.setVerticalGroup(
                OTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        javax.swing.GroupLayout orderInterfaceLayout = new javax.swing.GroupLayout(orderInterface);
        orderInterface.setLayout(orderInterfaceLayout);
        orderInterfaceLayout.setHorizontalGroup(
            orderInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderInterfaceLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(OrderInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(OTable, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
        );
        orderInterfaceLayout.setVerticalGroup(
            orderInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderInterfaceLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(orderInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(orderInterfaceLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(OrderInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTabbedPane.addTab("tab6", orderInterface);

        orderDetailInterface.setBackground(new java.awt.Color(245, 229, 191));
        orderDetailInterface.setToolTipText("");
        orderDetailInterface.setFocusable(false);
        orderDetailInterface.setMaximumSize(new java.awt.Dimension(1000, 550));
        orderDetailInterface.setMinimumSize(new java.awt.Dimension(1000, 550));
        orderDetailInterface.setName(""); // NOI18N
        orderDetailInterface.setRequestFocusEnabled(false);
        orderDetailInterface.setVerifyInputWhenFocusTarget(false);

        OrderDetaiInformation.setBackground(new java.awt.Color(216, 174, 94, 200));
        OrderDetaiInformation.setBorder(new RoundedBorder(40));
        OrderDetaiInformation.setMaximumSize(new java.awt.Dimension(400, 400));
        OrderDetaiInformation.setMinimumSize(new java.awt.Dimension(400, 400));
        OrderDetaiInformation.setOpaque(false);
        OrderDetaiInformation.setPreferredSize(new java.awt.Dimension(400, 400));

        odOderID.setText("Order ID");

        odServiceID.setText("Service ID");

        odQuantity.setText("Quantity");

        odAdd.setBackground(new java.awt.Color(73, 79, 86));
        odAdd.setForeground(new java.awt.Color(252, 255, 222));
        odAdd.setText("Add");
        odAdd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        odAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        odAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        odAdd.setMaximumSize(new java.awt.Dimension(100, 25));
        odAdd.setMinimumSize(new java.awt.Dimension(100, 25));
        odAdd.setPreferredSize(new java.awt.Dimension(100, 25));
        odAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odAddActionPerformed(evt);
            }
        });

        odUpdate.setBackground(new java.awt.Color(73, 79, 86));
        odUpdate.setForeground(new java.awt.Color(252, 255, 222));
        odUpdate.setText("Update");
        odUpdate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        odUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        odUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        odUpdate.setMaximumSize(new java.awt.Dimension(100, 25));
        odUpdate.setMinimumSize(new java.awt.Dimension(100, 25));
        odUpdate.setPreferredSize(new java.awt.Dimension(100, 25));
        odUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odUpdateActionPerformed(evt);
            }
        });

        odDelete.setBackground(new java.awt.Color(73, 79, 86));
        odDelete.setForeground(new java.awt.Color(252, 255, 222));
        odDelete.setText("Delete");
        odDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        odDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        odDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        odDelete.setMaximumSize(new java.awt.Dimension(100, 25));
        odDelete.setMinimumSize(new java.awt.Dimension(100, 25));
        odDelete.setPreferredSize(new java.awt.Dimension(100, 25));
        odDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OrderDetaiInformationLayout = new javax.swing.GroupLayout(OrderDetaiInformation);
        OrderDetaiInformation.setLayout(OrderDetaiInformationLayout);
        OrderDetaiInformationLayout.setHorizontalGroup(
            OrderDetaiInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderDetaiInformationLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(OrderDetaiInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(OrderDetaiInformationLayout.createSequentialGroup()
                        .addComponent(odAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(odUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(odDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OrderDetaiInformationLayout.createSequentialGroup()
                        .addGroup(OrderDetaiInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(odServiceID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(odOderID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(odQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(OrderDetaiInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(odorderidText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(odquantityText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(odserviceidText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        OrderDetaiInformationLayout.setVerticalGroup(
            OrderDetaiInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderDetaiInformationLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(OrderDetaiInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(odOderID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(odorderidText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(OrderDetaiInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(odServiceID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(odserviceidText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(OrderDetaiInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(odQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(odquantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(OrderDetaiInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(odAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(odUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(odDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        ODTable.setPreferredSize(new java.awt.Dimension(500, 550));
        ODTable.setRequestFocusEnabled(false);

        jScrollPane7.setMaximumSize(new java.awt.Dimension(500, 550));
        jScrollPane7.setMinimumSize(new java.awt.Dimension(500, 550));
        jScrollPane7.setPreferredSize(new java.awt.Dimension(500, 550));

        OrderDetailTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {

                }));
        OrderDetailTable.setMaximumSize(new java.awt.Dimension(500, 550));
        OrderDetailTable.setMinimumSize(new java.awt.Dimension(500, 550));
        OrderDetailTable.setPreferredSize(new java.awt.Dimension(500, 550));
        OrderDetailTable.setShowGrid(true);
        OrderDetailTable.getTableHeader().setReorderingAllowed(false);
        OrderDetailTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderDetailTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(OrderDetailTable);

        javax.swing.GroupLayout ODTableLayout = new javax.swing.GroupLayout(ODTable);
        ODTable.setLayout(ODTableLayout);
        ODTableLayout.setHorizontalGroup(
            ODTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ODTableLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ODTableLayout.setVerticalGroup(
                ODTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        javax.swing.GroupLayout orderDetailInterfaceLayout = new javax.swing.GroupLayout(orderDetailInterface);
        orderDetailInterface.setLayout(orderDetailInterfaceLayout);
        orderDetailInterfaceLayout.setHorizontalGroup(
            orderDetailInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderDetailInterfaceLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(OrderDetaiInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(ODTable, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        orderDetailInterfaceLayout.setVerticalGroup(
            orderDetailInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderDetailInterfaceLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(orderDetailInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ODTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(orderDetailInterfaceLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(OrderDetaiInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTabbedPane.addTab("tab7", orderDetailInterface);

        billInterface.setBackground(new java.awt.Color(245, 229, 191));
        billInterface.setToolTipText("");
        billInterface.setFocusable(false);
        billInterface.setMaximumSize(new java.awt.Dimension(1000, 550));
        billInterface.setMinimumSize(new java.awt.Dimension(1000, 550));
        billInterface.setName(""); // NOI18N
        billInterface.setRequestFocusEnabled(false);
        billInterface.setVerifyInputWhenFocusTarget(false);

        BillInformation.setBackground(new java.awt.Color(216, 174, 94, 200));
        BillInformation.setBorder(new RoundedBorder(40));
        BillInformation.setMaximumSize(new java.awt.Dimension(400, 400));
        BillInformation.setMinimumSize(new java.awt.Dimension(400, 400));
        BillInformation.setOpaque(false);
        BillInformation.setPreferredSize(new java.awt.Dimension(400, 400));

        bID.setText("ID");

        bOderID.setText("Order ID");

        bPaymentDay.setText("Payment Day");

        bPaymentMethod.setText("Payment Method");

        bAdd.setBackground(new java.awt.Color(73, 79, 86));
        bAdd.setForeground(new java.awt.Color(252, 255, 222));
        bAdd.setText("Add");
        bAdd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAdd.setMaximumSize(new java.awt.Dimension(100, 25));
        bAdd.setMinimumSize(new java.awt.Dimension(100, 25));
        bAdd.setPreferredSize(new java.awt.Dimension(100, 25));
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bUpdate.setBackground(new java.awt.Color(73, 79, 86));
        bUpdate.setForeground(new java.awt.Color(252, 255, 222));
        bUpdate.setText("Update");
        bUpdate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bUpdate.setMaximumSize(new java.awt.Dimension(100, 25));
        bUpdate.setMinimumSize(new java.awt.Dimension(100, 25));
        bUpdate.setPreferredSize(new java.awt.Dimension(100, 25));
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bDelete.setBackground(new java.awt.Color(73, 79, 86));
        bDelete.setForeground(new java.awt.Color(252, 255, 222));
        bDelete.setText("Delete");
        bDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bDelete.setMaximumSize(new java.awt.Dimension(100, 25));
        bDelete.setMinimumSize(new java.awt.Dimension(100, 25));
        bDelete.setPreferredSize(new java.awt.Dimension(100, 25));
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        jComboBox1
                .setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Card", "Internet Banking" }));

        javax.swing.GroupLayout BillInformationLayout = new javax.swing.GroupLayout(BillInformation);
        BillInformation.setLayout(BillInformationLayout);
        BillInformationLayout.setHorizontalGroup(
            BillInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillInformationLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(BillInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillInformationLayout.createSequentialGroup()
                        .addComponent(bID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bidText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillInformationLayout.createSequentialGroup()
                        .addComponent(bPaymentDay, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bpaymentdayText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillInformationLayout.createSequentialGroup()
                        .addComponent(bOderID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boderidText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillInformationLayout.createSequentialGroup()
                        .addGroup(BillInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(BillInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BillInformationLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BillInformationLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        BillInformationLayout.setVerticalGroup(
            BillInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillInformationLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(BillInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bidText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BillInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bOderID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boderidText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(BillInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPaymentDay, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bpaymentdayText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BillInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(BillInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        BTable.setPreferredSize(new java.awt.Dimension(500, 550));
        BTable.setRequestFocusEnabled(false);

        jScrollPane8.setMaximumSize(new java.awt.Dimension(500, 550));
        jScrollPane8.setMinimumSize(new java.awt.Dimension(500, 550));
        jScrollPane8.setPreferredSize(new java.awt.Dimension(500, 550));

        BillTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {

                }));
        BillTable.setMaximumSize(new java.awt.Dimension(500, 550));
        BillTable.setMinimumSize(new java.awt.Dimension(500, 550));
        BillTable.setPreferredSize(new java.awt.Dimension(500, 550));
        BillTable.setShowGrid(true);
        BillTable.getTableHeader().setReorderingAllowed(false);
        BillTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillTableMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(BillTable);

        javax.swing.GroupLayout BTableLayout = new javax.swing.GroupLayout(BTable);
        BTable.setLayout(BTableLayout);
        BTableLayout.setHorizontalGroup(
            BTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        BTableLayout.setVerticalGroup(
                BTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        javax.swing.GroupLayout billInterfaceLayout = new javax.swing.GroupLayout(billInterface);
        billInterface.setLayout(billInterfaceLayout);
        billInterfaceLayout.setHorizontalGroup(
            billInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billInterfaceLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(BillInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(BTable, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
        );
        billInterfaceLayout.setVerticalGroup(
            billInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(billInterfaceLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(BillInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane.addTab("tab8", billInterface);

        takeCareInterface.setBackground(new java.awt.Color(245, 229, 191));
        takeCareInterface.setToolTipText("");
        takeCareInterface.setFocusable(false);
        takeCareInterface.setMaximumSize(new java.awt.Dimension(1000, 550));
        takeCareInterface.setMinimumSize(new java.awt.Dimension(1000, 550));
        takeCareInterface.setName(""); // NOI18N
        takeCareInterface.setRequestFocusEnabled(false);
        takeCareInterface.setVerifyInputWhenFocusTarget(false);

        TakeCareInformation.setBackground(new java.awt.Color(216, 174, 94, 200));
        TakeCareInformation.setBorder(new RoundedBorder(40));
        TakeCareInformation.setMaximumSize(new java.awt.Dimension(400, 400));
        TakeCareInformation.setMinimumSize(new java.awt.Dimension(400, 400));
        TakeCareInformation.setOpaque(false);
        TakeCareInformation.setPreferredSize(new java.awt.Dimension(400, 400));

        tcUserID.setText("User ID");

        tcStaffID.setText("Staff ID");

        tcRate.setText("Rate");

        tcAdd.setBackground(new java.awt.Color(73, 79, 86));
        tcAdd.setForeground(new java.awt.Color(252, 255, 222));
        tcAdd.setText("Add");
        tcAdd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tcAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tcAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tcAdd.setMaximumSize(new java.awt.Dimension(100, 25));
        tcAdd.setMinimumSize(new java.awt.Dimension(100, 25));
        tcAdd.setPreferredSize(new java.awt.Dimension(100, 25));
        tcAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcAddActionPerformed(evt);
            }
        });

        tcUpdate.setBackground(new java.awt.Color(73, 79, 86));
        tcUpdate.setForeground(new java.awt.Color(252, 255, 222));
        tcUpdate.setText("Update");
        tcUpdate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tcUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tcUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tcUpdate.setMaximumSize(new java.awt.Dimension(100, 25));
        tcUpdate.setMinimumSize(new java.awt.Dimension(100, 25));
        tcUpdate.setPreferredSize(new java.awt.Dimension(100, 25));
        tcUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcUpdateActionPerformed(evt);
            }
        });

        tcDelete.setBackground(new java.awt.Color(73, 79, 86));
        tcDelete.setForeground(new java.awt.Color(252, 255, 222));
        tcDelete.setText("Delete");
        tcDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tcDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tcDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tcDelete.setMaximumSize(new java.awt.Dimension(100, 25));
        tcDelete.setMinimumSize(new java.awt.Dimension(100, 25));
        tcDelete.setPreferredSize(new java.awt.Dimension(100, 25));
        tcDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TakeCareInformationLayout = new javax.swing.GroupLayout(TakeCareInformation);
        TakeCareInformation.setLayout(TakeCareInformationLayout);
        TakeCareInformationLayout.setHorizontalGroup(
            TakeCareInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TakeCareInformationLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(TakeCareInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TakeCareInformationLayout.createSequentialGroup()
                        .addComponent(tcStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tcstaffidText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TakeCareInformationLayout.createSequentialGroup()
                        .addComponent(tcUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tcuseridText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TakeCareInformationLayout.createSequentialGroup()
                        .addGroup(TakeCareInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tcRate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tcAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addGroup(TakeCareInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TakeCareInformationLayout.createSequentialGroup()
                                .addComponent(tcUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(tcDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tcrateText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        TakeCareInformationLayout.setVerticalGroup(
            TakeCareInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TakeCareInformationLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(TakeCareInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcuseridText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(TakeCareInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcstaffidText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TakeCareInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcRate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcrateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(TakeCareInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        TCTable.setPreferredSize(new java.awt.Dimension(500, 550));
        TCTable.setRequestFocusEnabled(false);

        jScrollPane9.setMaximumSize(new java.awt.Dimension(500, 550));
        jScrollPane9.setMinimumSize(new java.awt.Dimension(500, 550));
        jScrollPane9.setPreferredSize(new java.awt.Dimension(500, 550));

        TakeCareTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {

                }));
        TakeCareTable.setMaximumSize(new java.awt.Dimension(500, 550));
        TakeCareTable.setMinimumSize(new java.awt.Dimension(500, 550));
        TakeCareTable.setPreferredSize(new java.awt.Dimension(500, 550));
        TakeCareTable.setShowGrid(true);
        TakeCareTable.getTableHeader().setReorderingAllowed(false);
        TakeCareTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TakeCareTableMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(TakeCareTable);

        javax.swing.GroupLayout TCTableLayout = new javax.swing.GroupLayout(TCTable);
        TCTable.setLayout(TCTableLayout);
        TCTableLayout.setHorizontalGroup(
            TCTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        TCTableLayout.setVerticalGroup(
                TCTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        javax.swing.GroupLayout takeCareInterfaceLayout = new javax.swing.GroupLayout(takeCareInterface);
        takeCareInterface.setLayout(takeCareInterfaceLayout);
        takeCareInterfaceLayout.setHorizontalGroup(
            takeCareInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(takeCareInterfaceLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(TakeCareInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(TCTable, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
        );
        takeCareInterfaceLayout.setVerticalGroup(
            takeCareInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(takeCareInterfaceLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(takeCareInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TCTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, takeCareInterfaceLayout.createSequentialGroup()
                        .addComponent(TakeCareInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );

        jTabbedPane.addTab("tab9", takeCareInterface);

        jPanel.add(jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_menuButtonMouseClicked
        if (!menuClick) {
            submenu.setSize(150, 550);
            menuClick = true;
        } else {
            submenu.setSize(0, 0);
            menuClick = false;
        }
    }// GEN-LAST:event_menuButtonMouseClicked

    private void usersButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_usersButtonMouseClicked
        menuSize(false);
        jTabbedPane.setSelectedIndex(1);
        connect.displayData("SELECT * FROM Users", UserTable);
    }// GEN-LAST:event_usersButtonMouseClicked

    private void staffButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_staffButtonMouseClicked
        menuSize(false);
        jTabbedPane.setSelectedIndex(2);
        connect.displayData("SELECT * FROM Staff", StaffTable);
    }// GEN-LAST:event_staffButtonMouseClicked

    private void computerButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_computerButtonMouseClicked
        menuSize(false);
        jTabbedPane.setSelectedIndex(3);
        connect.displayData("SELECT * FROM Computer", ComputerTable);
    }// GEN-LAST:event_computerButtonMouseClicked

    private void serviceButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_serviceButtonMouseClicked
        menuSize(false);
        jTabbedPane.setSelectedIndex(4);
        connect.displayData("SELECT * FROM Service", ServiceTable);
        menuSize(false);
    }// GEN-LAST:event_serviceButtonMouseClicked

    private void ordersButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ordersButtonMouseClicked
        menuSize(false);
        jTabbedPane.setSelectedIndex(5);
        connect.displayData("SELECT * FROM Orders", OrderTable);
    }// GEN-LAST:event_ordersButtonMouseClicked

    private void orderDetailButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_orderDetailButtonMouseClicked
        menuSize(false);
        jTabbedPane.setSelectedIndex(6);
        connect.displayData("SELECT * FROM OrderDetail", OrderDetailTable);
    }// GEN-LAST:event_orderDetailButtonMouseClicked

    private void billButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_billButtonMouseClicked
        menuSize(false);
        jTabbedPane.setSelectedIndex(7);
        connect.displayData("SELECT * FROM Bill", BillTable);
    }// GEN-LAST:event_billButtonMouseClicked

    private void takeCareButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_takeCareButtonMouseClicked
        menuSize(false);
        jTabbedPane.setSelectedIndex(8);
        connect.displayData("SELECT * FROM TakeCare", TakeCareTable);
    }// GEN-LAST:event_takeCareButtonMouseClicked

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_homeButtonMouseClicked
        jTabbedPane.setSelectedIndex(0);
        menuSize(false);
    }// GEN-LAST:event_homeButtonMouseClicked

    private void SearchBoxFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_SearchBoxFocusGained
        if (SearchBox.getText().trim().equals("Search...")) {
            SearchBox.setText("");
            SearchBox.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        }
    }// GEN-LAST:event_SearchBoxFocusGained

    private void SearchBoxFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_SearchBoxFocusLost
        if (SearchBox.getText().trim().equals("")) {
            SearchBox.setText("Search...");
            SearchBox.setFont(new Font("Segoe UI", Font.ITALIC, 12));
        }
    }// GEN-LAST:event_SearchBoxFocusLost

    private void SearchBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SearchBoxActionPerformed
        if (SearchBox.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please input query string!", "Message", JOptionPane.WARNING_MESSAGE);
        }
    }// GEN-LAST:event_SearchBoxActionPerformed

    private void SearchBoxKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_SearchBoxKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !SearchBox.getText().equals("")) {
            String cmd = SearchBox.getText();
            connect.displayData(cmd, Table);
            jScrollPane1.setViewportView(Table);

            if (connect.status) {
                SearchBox.setSize(700, 30);
                SearchBox.setLocation(148, 40);
                jScrollPane1.setSize(700, 300);
                jScrollPane1.setLocation(148, 110);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect syntax, please enter again!", "Message", JOptionPane.ERROR_MESSAGE);
            }
        }
    }// GEN-LAST:event_SearchBoxKeyPressed

    private void staffButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_staffButtonMouseEntered
        staffButton.setForeground(HOVER_COLOR);
    }// GEN-LAST:event_staffButtonMouseEntered

    private void staffButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_staffButtonMouseExited
        staffButton.setForeground(NORMAL_COLOR);
    }// GEN-LAST:event_staffButtonMouseExited

    private void computerButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_computerButtonMouseEntered
        computerButton.setForeground(HOVER_COLOR);
    }// GEN-LAST:event_computerButtonMouseEntered

    private void computerButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_computerButtonMouseExited
        computerButton.setForeground(NORMAL_COLOR);
    }// GEN-LAST:event_computerButtonMouseExited

    private void serviceButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_serviceButtonMouseEntered
        serviceButton.setForeground(HOVER_COLOR);
    }// GEN-LAST:event_serviceButtonMouseEntered

    private void serviceButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_serviceButtonMouseExited
        serviceButton.setForeground(NORMAL_COLOR);
    }// GEN-LAST:event_serviceButtonMouseExited

    private void ordersButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ordersButtonMouseEntered
        ordersButton.setForeground(HOVER_COLOR);
    }// GEN-LAST:event_ordersButtonMouseEntered

    private void ordersButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ordersButtonMouseExited
        ordersButton.setForeground(NORMAL_COLOR);
    }// GEN-LAST:event_ordersButtonMouseExited

    private void orderDetailButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_orderDetailButtonMouseEntered
        orderDetailButton.setForeground(HOVER_COLOR);
    }// GEN-LAST:event_orderDetailButtonMouseEntered

    private void orderDetailButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_orderDetailButtonMouseExited
        orderDetailButton.setForeground(NORMAL_COLOR);
    }// GEN-LAST:event_orderDetailButtonMouseExited

    private void billButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_billButtonMouseEntered
        billButton.setForeground(HOVER_COLOR);
    }// GEN-LAST:event_billButtonMouseEntered

    private void billButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_billButtonMouseExited
        billButton.setForeground(NORMAL_COLOR);
    }// GEN-LAST:event_billButtonMouseExited

    private void takeCareButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_takeCareButtonMouseEntered
        takeCareButton.setForeground(HOVER_COLOR);
    }// GEN-LAST:event_takeCareButtonMouseEntered

    private void takeCareButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_takeCareButtonMouseExited
        takeCareButton.setForeground(NORMAL_COLOR);
    }// GEN-LAST:event_takeCareButtonMouseExited

    private void usersButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_usersButtonMouseExited
        usersButton.setForeground(NORMAL_COLOR);
    }// GEN-LAST:event_usersButtonMouseExited

    private void usersButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_usersButtonMouseEntered
        usersButton.setForeground(HOVER_COLOR);
    }// GEN-LAST:event_usersButtonMouseEntered

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_homeButtonMouseExited
        homeButton.setForeground(NORMAL_COLOR);
    }// GEN-LAST:event_homeButtonMouseExited

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_homeButtonMouseEntered
        homeButton.setForeground(HOVER_COLOR);
    }// GEN-LAST:event_homeButtonMouseEntered

    private void uAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_uAddActionPerformed
        String[] data = { uidText.getText(), uaccText.getText(), upassText.getText(), utimeText.getText() };
        boolean state = true;
        for(String i: data){
            if(i.isEmpty() || i == null){
                state = false;
                break;
            }                
        }
        if(state){
            connect.showAddData("Users", data);
            connect.displayData("SELECT * FROM Users", UserTable);
            showAddMessage(true);
        }
        else
            showAddMessage(false);
    }// GEN-LAST:event_uAddActionPerformed

    private void uUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_uUpdateActionPerformed
        String[] data = { uidText.getText(), uaccText.getText(), upassText.getText(), utimeText.getText() };
        boolean state = true;
        for(String i: data){
            if(i.isEmpty() || i == null){
                state = false;
                break;
            }                
        }
        if(state){
            connect.showUpdateData("Users", data, UserTable);
            connect.displayData("SELECT * FROM Users", UserTable);
            showUpdateMessage(true);
        }
        else
            showUpdateMessage(false);
    }// GEN-LAST:event_uUpdateActionPerformed

    private void uDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_uDeleteActionPerformed
        String data = uidText.getText();
        if(!data.isEmpty()){
            connect.showDeleteData("Users", data);
            connect.displayData("SELECT * FROM Users", UserTable);
            showDeleteMessage(true);
//            if(show)
        }
        else 
            showDeleteMessage(false);
    }// GEN-LAST:event_uDeleteActionPerformed

    private void computerButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_computerButtonActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_computerButtonActionPerformed

    private void UserTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_UserTableMouseClicked
        connect.selectData("Users", UserTable);
        try {
            while (connect.rs.next()) {
                uidText.setText(connect.rs.getString("User_ID"));
                uaccText.setText(connect.rs.getString("Account"));
                upassText.setText(connect.rs.getString("Password"));
                utimeText.setText(connect.rs.getString("Remaining_Time"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }// GEN-LAST:event_UserTableMouseClicked

    private void sAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sAddActionPerformed
        String[] data = { sidText.getText(), snameText.getText(), sdobText.getText(), sphoneText.getText(),
                saddressText.getText() };
        
        boolean state = true;
        for(String i: data){
            if(i.isEmpty()){
                state = false;
                break;
            }                
        }
        if(state){
            connect.showAddData("Staff", data);
            connect.displayData("SELECT * FROM Staff", StaffTable);
            showAddMessage(true);
        }
        else
            showAddMessage(false);
    }// GEN-LAST:event_sAddActionPerformed

    private void sUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sUpdateActionPerformed
        String[] data = { sidText.getText(), snameText.getText(), sdobText.getText(), sphoneText.getText(),
                saddressText.getText() };
        boolean state = true;
        for(String i: data){
            if(i.isEmpty()){
                state = false;
                break;
            }                
        }
        if(state){
            connect.showUpdateData("Staff", data, StaffTable);
            connect.displayData("SELECT * FROM Staff", StaffTable);
            showUpdateMessage(true);
        }
        else
            showUpdateMessage(false);
    }// GEN-LAST:event_sUpdateActionPerformed

    private void sDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sDeleteActionPerformed
        String data = sidText.getText();
        if(!data.isEmpty()){
            connect.showDeleteData("Staff", data);
            connect.displayData("SELECT * FROM Staff", StaffTable);
            showDeleteMessage(true);
        }
        else 
            showDeleteMessage(false);
    }// GEN-LAST:event_sDeleteActionPerformed

    private void cAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cAddActionPerformed
        String[] data = null;
        if (cON.isSelected()) {
            data = new String[] { cidText.getText(), "ON", cuseridText.getText(), ctimeText.getText() };
        } else if (cOFF.isSelected()) {
            data = new String[] { cidText.getText(), "OFF", null, null };
        } else if (cON.isSelected() && cOFF.isSelected() || !cOFF.isSelected() && !cON.isSelected()) {
            System.out.print("Please choose status of computer");
        }
        boolean state = true;
        for(String i: data){
            if(i.isEmpty()){
                state = false;
                break;
            }                
        }
        if(state){
            connect.showAddData("Computer", data);
            connect.displayData("SELECT * FROM Computer", ComputerTable);
            showAddMessage(true);
        }
        else
            showAddMessage(false);
    }// GEN-LAST:event_cAddActionPerformed

    private void cUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cUpdateActionPerformed
        String[] data = null;
        if (cON.isSelected()) {
            data = new String[] { cidText.getText(), "ON", cuseridText.getText(), (String) ctimeText.getText() };
        } else if (cOFF.isSelected()) {
            data = new String[] { cidText.getText(), "OFF", null, null };
        } else if (cON.isSelected() && cOFF.isSelected() || !cOFF.isSelected() && !cON.isSelected()) {
            System.out.print("Please choose status of computer");
        }

        boolean state = true;
        for(String i: data){
            if(i.isEmpty()){
                state = false;
                break;
            }                
        }
        if(state){
            connect.showUpdateData("Computer", data, ComputerTable);
            connect.displayData("SELECT * FROM Computer", ComputerTable);
            showUpdateMessage(true);
        }
        else
            showUpdateMessage(false);
    }// GEN-LAST:event_cUpdateActionPerformed

    private void cDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cDeleteActionPerformed
        
        String data = cidText.getText();
        if(!data.isEmpty()){
            connect.showDeleteData("Computer", data);
            connect.displayData("SELECT * FROM Computer", ComputerTable);
            showDeleteMessage(true);
        }
        else 
            showDeleteMessage(false);
    }// GEN-LAST:event_cDeleteActionPerformed

    private void svAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_svAddActionPerformed
        String[] data = { svidText.getText(), svpriceText.getText(), svdescriptionText.getText(),
                svtypeText.getText() };
        
        boolean state = true;
        for(String i: data){
            if(i.isEmpty()){
                state = false;
                break;
            }                
        }
        if(state){
            connect.showAddData("Service", data);
            connect.displayData("SELECT * FROM Service", ServiceTable);
            showAddMessage(true);
        }
        else
            showAddMessage(false);
    }// GEN-LAST:event_svAddActionPerformed

    private void svUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_svUpdateActionPerformed
        String[] data = { svidText.getText(), svpriceText.getText(), svdescriptionText.getText(),
                svtypeText.getText() };
        
        boolean state = true;
        for(String i: data){
            if(i.isEmpty()){
                state = false;
                break;
            }                
        }
        if(state){
            connect.showUpdateData("Service", data, ServiceTable);
            connect.displayData("SELECT * FROM Service", ServiceTable);
            showUpdateMessage(true);
        }
        else
            showUpdateMessage(false);
    }// GEN-LAST:event_svUpdateActionPerformed

    private void svDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_svDeleteActionPerformed
        
        String data = svidText.getText();
        if(!data.isEmpty()){
            connect.showDeleteData("Service", data);
            connect.displayData("SELECT * FROM Service", ServiceTable);
            showDeleteMessage(true);
        }
        else 
            showDeleteMessage(false);
    }// GEN-LAST:event_svDeleteActionPerformed

    private void oAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_oAddActionPerformed
        String[] data = { oidText.getText(), ostaffidText.getText(), ooderdateText.getText(), ouseridText.getText() };
        
        boolean state = true;
        for(String i: data){
            if(i.isEmpty()){
                state = false;
                break;
            }                
        }
        if(state){
            connect.showAddData("Orders", data);
            connect.displayData("SELECT * FROM Orders", OrderTable);
            showAddMessage(true);
        }
        else
            showAddMessage(false);
    }// GEN-LAST:event_oAddActionPerformed

    private void oUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_oUpdateActionPerformed
        String[] data = { oidText.getText(), ostaffidText.getText(), ooderdateText.getText(), ouseridText.getText() };
        
        boolean state = true;
        for(String i: data){
            if(i.isEmpty() ){
                state = false;
                break;
            }                
        }
        if(state){
            connect.showUpdateData("Orders", data, OrderTable);
            connect.displayData("SELECT * FROM Orders", OrderTable);
            showUpdateMessage(true);
        }
        else
            showUpdateMessage(false);
    }// GEN-LAST:event_oUpdateActionPerformed

    private void oDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_oDeleteActionPerformed
        
        String data = oidText.getText();
        if(!data.isEmpty()){
            connect.showDeleteData("Orders", data);
            connect.displayData("SELECT * FROM Orders", OrderTable);
            showDeleteMessage(true);
        }
        else 
            showDeleteMessage(false);

    }// GEN-LAST:event_oDeleteActionPerformed

    private void odAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_odAddActionPerformed
        String[] data = { odorderidText.getText(), odserviceidText.getText(), odquantityText.getText() };
        
        boolean state = true;
        for(String i: data){
            if(i.isEmpty()){
                state = false;
                break;
            }                
        }
        if(state){
            connect.showAddData("OrderDetail", data);
            connect.displayData("SELECT * FROM OrderDetail", OrderDetailTable);
            showAddMessage(true);
        }
        else
            showAddMessage(false);
    }// GEN-LAST:event_odAddActionPerformed

    private void odUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_odUpdateActionPerformed
        String[] data = { odorderidText.getText(), odserviceidText.getText(), odquantityText.getText() };
        
        boolean state = true;
        for(String i: data){
            if(i.isEmpty() ){
                state = false;
                break;
            }                
        }
        if(state){
            connect.showUpdateData("OrderDetail", data, OrderDetailTable);
            connect.displayData("SELECT * FROM OrderDetail", OrderDetailTable);
            showUpdateMessage(true);
        }
        else
            showUpdateMessage(false);
    }// GEN-LAST:event_odUpdateActionPerformed

    private void odDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_odDeleteActionPerformed
        
        String data = odorderidText.getText();
        if(!data.isEmpty()){
            connect.showDeleteData("OrderDetail", data);
            connect.displayData("SELECT * FROM OrderDetail", OrderDetailTable);
            showDeleteMessage(true);
        }
        else 
            showDeleteMessage(false);
    }// GEN-LAST:event_odDeleteActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bAddActionPerformed
        String[] data = { bidText.getText(), boderidText.getText(), bpaymentdayText.getText(),
                (String) jComboBox1.getSelectedItem() };
        
        boolean state = true;
        for(String i: data){
            if(i.isEmpty()){
                state = false;
                break;
            }                
        }
        if(state){
            connect.showAddData("Bill", data);
            connect.displayData("SELECT * FROM Bill", BillTable);
            showAddMessage(true);
        }
        else
            showAddMessage(false);
    }// GEN-LAST:event_bAddActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bUpdateActionPerformed
        String[] data = { bidText.getText(), boderidText.getText(), bpaymentdayText.getText(),
                (String) jComboBox1.getSelectedItem() };
        
        boolean state = true;
        for(String i: data){
            if(i.isEmpty()){
                state = false;
                break;
            }                
        }
        if(state){
            connect.showUpdateData("Bill", data, BillTable);
            connect.displayData("SELECT * FROM Bill", BillTable);
            showUpdateMessage(true);
        }
        else
            showUpdateMessage(false);
    }// GEN-LAST:event_bUpdateActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bDeleteActionPerformed
        
        String data = bidText.getText();
        if(!data.isEmpty()){
            connect.showDeleteData("Bill", data);
            connect.displayData("SELECT * FROM Bill", BillTable);
            showDeleteMessage(true);
        }
        else 
            showDeleteMessage(false);
    }// GEN-LAST:event_bDeleteActionPerformed

    private void tcAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tcAddActionPerformed
        String[] data = { tcuseridText.getText(), tcstaffidText.getText(), tcrateText.getText() };
        
        boolean state = true;
        for(String i: data){
            if(i.isEmpty()){
                state = false;
                break;
            }                
        }
        if(state){
            connect.showAddData("TakeCare", data);
            connect.displayData("SELECT * FROM TakeCare", TakeCareTable);
            showAddMessage(true);
        }
        else
            showAddMessage(false);
    }// GEN-LAST:event_tcAddActionPerformed

    private void tcUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tcUpdateActionPerformed
        String[] data = { tcuseridText.getText(), tcstaffidText.getText(), tcrateText.getText() };
        
        boolean state = true;
        for(String i: data){
            if(i.isEmpty()){
                state = false;
                break;
            }                
        }
        if(state){
            connect.showUpdateData("TakeCare", data, TakeCareTable);
            connect.displayData("SELECT * FROM TakeCare", TakeCareTable);
            showUpdateMessage(true);
        }
        else
            showUpdateMessage(false);
    }// GEN-LAST:event_tcUpdateActionPerformed

    private void tcDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tcDeleteActionPerformed
        
        String data = tcuseridText.getText();
        if(!data.isEmpty()){
            connect.showDeleteData("TakeCare", data);
            connect.displayData("SELECT * FROM TakeCare", TakeCareTable);
            showDeleteMessage(true);
        }
        else 
            showDeleteMessage(false);
    }// GEN-LAST:event_tcDeleteActionPerformed

    private void StaffTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_StaffTableMouseClicked
        connect.selectData("Staff", StaffTable);
        try {
            while (connect.rs.next()) {
                sidText.setText(connect.rs.getString("Staff_ID"));
                snameText.setText(connect.rs.getString("Staff_Name"));
                sdobText.setText(connect.rs.getString("Date_Of_Birth"));
                sphoneText.setText(connect.rs.getString("Phone_Number"));
                saddressText.setText(connect.rs.getString("Address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }// GEN-LAST:event_StaffTableMouseClicked

    private void ComputerTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ComputerTableMouseClicked
        connect.selectData("Computer", ComputerTable);
        try {
            while (connect.rs.next()) {
                cidText.setText(connect.rs.getString("Computer_ID"));
                cuseridText.setText(connect.rs.getString("User_ID"));
                ctimeText.setText(connect.rs.getString("Start_Time"));
                String data = (String) connect.rs.getString("User_ID");
                if (data != null) {
                    cON.setSelected(true);
                    cOFF.setSelected(false);
                } else {
                    cON.setSelected(false);
                    cOFF.setSelected(true);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }// GEN-LAST:event_ComputerTableMouseClicked

    private void ServiceTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ServiceTableMouseClicked
        connect.selectData("Service", ServiceTable);
        try {
            while (connect.rs.next()) {
                svidText.setText(connect.rs.getString("Service_ID"));
                svpriceText.setText(connect.rs.getString("Price"));
                svdescriptionText.setText(connect.rs.getString("Description"));
                svtypeText.setText(connect.rs.getString("Type"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }// GEN-LAST:event_ServiceTableMouseClicked

    private void OrderTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_OrderTableMouseClicked
        connect.selectData("Orders", OrderTable);
        try {
            while (connect.rs.next()) {
                oidText.setText(connect.rs.getString("Order_ID"));
                ostaffidText.setText(connect.rs.getString("Staff_ID"));
                ooderdateText.setText(connect.rs.getString("Order_Date"));
                ouseridText.setText(connect.rs.getString("User_ID"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }// GEN-LAST:event_OrderTableMouseClicked

    private void OrderDetailTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_OrderDetailTableMouseClicked
        connect.selectData("OrderDetail", OrderDetailTable);
        try {
            while (connect.rs.next()) {
                odorderidText.setText(connect.rs.getString("Order_ID"));
                odserviceidText.setText(connect.rs.getString("Service_ID"));
                odquantityText.setText(connect.rs.getString("Quantity"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }// GEN-LAST:event_OrderDetailTableMouseClicked

    private void BillTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_BillTableMouseClicked
        connect.selectData("Bill", BillTable);
        try {
            while (connect.rs.next()) {
                bidText.setText(connect.rs.getString("Bill_ID"));
                boderidText.setText(connect.rs.getString("Order_ID"));
                bpaymentdayText.setText(connect.rs.getString("Pay_Date"));
                jComboBox1.setSelectedItem(connect.rs.getString("Payment_Method"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }// GEN-LAST:event_BillTableMouseClicked

    private void TakeCareTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_TakeCareTableMouseClicked
        connect.selectData("TakeCare", TakeCareTable);
        try {
            while (connect.rs.next()) {
                tcuseridText.setText(connect.rs.getString("User_ID"));
                tcstaffidText.setText(connect.rs.getString("Staff_ID"));
                tcrateText.setText(connect.rs.getString("Rate"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }// GEN-LAST:event_TakeCareTableMouseClicked

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
        new Internet_cafe().setVisible(true);
        // try {
        // for (javax.swing.UIManager.LookAndFeelInfo info :
        // javax.swing.UIManager.getInstalledLookAndFeels()) {
        // if ("Nimbus".equals(info.getName())) {
        // javax.swing.UIManager.setLookAndFeel(info.getClassName());
        // break;
        // }
        // }
        // } catch (ClassNotFoundException ex) {
        // java.util.logging.Logger.getLogger(Internet_cafe.class.getName()).log(java.util.logging.Level.SEVERE,
        // null,
        // ex);
        // } catch (InstantiationException ex) {
        // java.util.logging.Logger.getLogger(Internet_cafe.class.getName()).log(java.util.logging.Level.SEVERE,
        // null,
        // ex);
        // } catch (IllegalAccessException ex) {
        // java.util.logging.Logger.getLogger(Internet_cafe.class.getName()).log(java.util.logging.Level.SEVERE,
        // null,
        // ex);
        // } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        // java.util.logging.Logger.getLogger(Internet_cafe.class.getName()).log(java.util.logging.Level.SEVERE,
        // null,
        // ex);
        // }
        // // </editor-fold>
        //
        // /* Create and display the form */
        // java.awt.EventQueue.invokeLater(new Runnable() {
        // @Override
        // public void run() {
        // new Internet_cafe().setVisible(true);
        // }
        // });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BTable;
    private javax.swing.JPanel Bar;
    private javax.swing.JPanel BillInformation;
    private javax.swing.JTable BillTable;
    private javax.swing.JPanel CTable;
    private javax.swing.JPanel ComputerInformation;
    private javax.swing.JTable ComputerTable;
    private javax.swing.JPanel ODTable;
    private javax.swing.JPanel OTable;
    private javax.swing.JPanel OrderDetaiInformation;
    private javax.swing.JTable OrderDetailTable;
    private javax.swing.JPanel OrderInformation;
    private javax.swing.JTable OrderTable;
    private javax.swing.JPanel STable;
    private javax.swing.JTextField SearchBox;
    private javax.swing.JPanel SerTable;
    private javax.swing.JPanel ServiceInformation;
    private javax.swing.JTable ServiceTable;
    private javax.swing.JPanel StaffInformation;
    private javax.swing.JTable StaffTable;
    private javax.swing.JPanel TCTable;
    private javax.swing.JTable Table;
    private javax.swing.JPanel TakeCareInformation;
    private javax.swing.JTable TakeCareTable;
    private javax.swing.JPanel UTable;
    private javax.swing.JPanel UserInformation;
    private javax.swing.JTable UserTable;
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bDelete;
    private javax.swing.JLabel bID;
    private javax.swing.JLabel bOderID;
    private javax.swing.JLabel bPaymentDay;
    private javax.swing.JLabel bPaymentMethod;
    private javax.swing.JButton bUpdate;
    private javax.swing.JTextField bidText;
    private javax.swing.JButton billButton;
    private javax.swing.JPanel billInterface;
    private javax.swing.JTextField boderidText;
    private javax.swing.JTextField bpaymentdayText;
    private javax.swing.JButton cAdd;
    private javax.swing.JButton cDelete;
    private javax.swing.JLabel cID;
    private javax.swing.JRadioButton cOFF;
    private javax.swing.JRadioButton cON;
    private javax.swing.JLabel cStatus;
    private javax.swing.JLabel cTime;
    private javax.swing.JButton cUpdate;
    private javax.swing.JLabel cUserID;
    private javax.swing.JTextField cidText;
    private javax.swing.JButton computerButton;
    private javax.swing.JPanel computerInterface;
    private javax.swing.JTextField ctimeText;
    private javax.swing.JTextField cuseridText;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel homeInterface;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JButton menuButton;
    private javax.swing.JLabel name;
    private javax.swing.JButton oAdd;
    private javax.swing.JButton oDelete;
    private javax.swing.JLabel oID;
    private javax.swing.JLabel oOderDate;
    private javax.swing.JLabel oStaffID;
    private javax.swing.JButton oUpdate;
    private javax.swing.JLabel oUserID;
    private javax.swing.JButton odAdd;
    private javax.swing.JButton odDelete;
    private javax.swing.JLabel odOderID;
    private javax.swing.JLabel odQuantity;
    private javax.swing.JLabel odServiceID;
    private javax.swing.JButton odUpdate;
    private javax.swing.JTextField odorderidText;
    private javax.swing.JTextField odquantityText;
    private javax.swing.JTextField odserviceidText;
    private javax.swing.JTextField oidText;
    private javax.swing.JTextField ooderdateText;
    private javax.swing.JButton orderDetailButton;
    private javax.swing.JPanel orderDetailInterface;
    private javax.swing.JPanel orderInterface;
    private javax.swing.JButton ordersButton;
    private javax.swing.JTextField ostaffidText;
    private javax.swing.JTextField ouseridText;
    private javax.swing.JButton sAdd;
    private javax.swing.JLabel sAddress;
    private javax.swing.JLabel sDOB;
    private javax.swing.JButton sDelete;
    private javax.swing.JLabel sID;
    private javax.swing.JLabel sName;
    private javax.swing.JLabel sPhone;
    private javax.swing.JButton sUpdate;
    private javax.swing.JTextField saddressText;
    private javax.swing.JTextField sdobText;
    private javax.swing.JButton serviceButton;
    private javax.swing.JPanel serviceInterface;
    private javax.swing.JTextField sidText;
    private javax.swing.JTextField snameText;
    private javax.swing.JTextField sphoneText;
    private javax.swing.JButton staffButton;
    private javax.swing.JPanel staffInterface;
    private javax.swing.JPanel submenu;
    private javax.swing.JButton svAdd;
    private javax.swing.JButton svDelete;
    private javax.swing.JLabel svDescription;
    private javax.swing.JLabel svID;
    private javax.swing.JLabel svPrice;
    private javax.swing.JLabel svType;
    private javax.swing.JButton svUpdate;
    private javax.swing.JTextField svdescriptionText;
    private javax.swing.JTextField svidText;
    private javax.swing.JTextField svpriceText;
    private javax.swing.JTextField svtypeText;
    private javax.swing.JButton takeCareButton;
    private javax.swing.JPanel takeCareInterface;
    private javax.swing.JButton tcAdd;
    private javax.swing.JButton tcDelete;
    private javax.swing.JLabel tcRate;
    private javax.swing.JLabel tcStaffID;
    private javax.swing.JButton tcUpdate;
    private javax.swing.JLabel tcUserID;
    private javax.swing.JTextField tcrateText;
    private javax.swing.JTextField tcstaffidText;
    private javax.swing.JTextField tcuseridText;
    private javax.swing.JLabel uAcc;
    private javax.swing.JButton uAdd;
    private javax.swing.JButton uDelete;
    private javax.swing.JLabel uID;
    private javax.swing.JLabel uPass;
    private javax.swing.JLabel uTime;
    private javax.swing.JButton uUpdate;
    private javax.swing.JTextField uaccText;
    private javax.swing.JTextField uidText;
    private javax.swing.JTextField upassText;
    private javax.swing.JButton usersButton;
    private javax.swing.JPanel usersInterface;
    private javax.swing.JTextField utimeText;
    // End of variables declaration//GEN-END:variables
}