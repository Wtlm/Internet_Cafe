package com.mycompany.internet_cafe;

import Database.Connect;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
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
        submenu.setSize(0,0);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        ComputerInformation6 = new javax.swing.JPanel();
        cID6 = new javax.swing.JLabel();
        cidText6 = new javax.swing.JTextField();
        cStatus6 = new javax.swing.JLabel();
        cON6 = new javax.swing.JRadioButton();
        cOFF6 = new javax.swing.JRadioButton();
        cUserID6 = new javax.swing.JLabel();
        cuseridText6 = new javax.swing.JTextField();
        cTime6 = new javax.swing.JLabel();
        ctimeText6 = new javax.swing.JTextField();
        cAdd6 = new javax.swing.JButton();
        cUpdate6 = new javax.swing.JButton();
        cDelete6 = new javax.swing.JButton();
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
        bpaymentmethodText = new javax.swing.JTextField();
        bAdd = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
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
        menuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
                .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BarLayout.setVerticalGroup(
            BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuButton, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel.add(Bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        submenu.setBackground(new java.awt.Color(51, 51, 51));
        submenu.setMaximumSize(new java.awt.Dimension(150, 350));
        submenu.setPreferredSize(new java.awt.Dimension(150, 390));

        homeButton.setBackground(new java.awt.Color(51, 51, 51));
        homeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        homeButton.setForeground(new java.awt.Color(216, 174, 94));
        homeButton.setText("Home");
        homeButton.setBorder(null);
        homeButton.setMaximumSize(new java.awt.Dimension(150, 25));
        homeButton.setMinimumSize(new java.awt.Dimension(150, 25));
        homeButton.setPreferredSize(new java.awt.Dimension(150, 25));
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        usersButton.setBackground(new java.awt.Color(51, 51, 51));
        usersButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usersButton.setForeground(new java.awt.Color(216, 174, 94));
        usersButton.setText("Users");
        usersButton.setBorder(null);
        usersButton.setMaximumSize(new java.awt.Dimension(150, 25));
        usersButton.setMinimumSize(new java.awt.Dimension(150, 25));
        usersButton.setPreferredSize(new java.awt.Dimension(150, 25));
        usersButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersButtonMouseClicked(evt);
            }
        });

        staffButton.setBackground(new java.awt.Color(51, 51, 51));
        staffButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        staffButton.setForeground(new java.awt.Color(216, 174, 94));
        staffButton.setText("Staff");
        staffButton.setBorder(null);
        staffButton.setMaximumSize(new java.awt.Dimension(150, 25));
        staffButton.setMinimumSize(new java.awt.Dimension(150, 25));
        staffButton.setPreferredSize(new java.awt.Dimension(150, 25));
        staffButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffButtonMouseClicked(evt);
            }
        });

        computerButton.setBackground(new java.awt.Color(51, 51, 51));
        computerButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        computerButton.setForeground(new java.awt.Color(216, 174, 94));
        computerButton.setText("Computer");
        computerButton.setBorder(null);
        computerButton.setMaximumSize(new java.awt.Dimension(150, 25));
        computerButton.setMinimumSize(new java.awt.Dimension(150, 25));
        computerButton.setPreferredSize(new java.awt.Dimension(150, 25));
        computerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                computerButtonMouseClicked(evt);
            }
        });

        serviceButton.setBackground(new java.awt.Color(51, 51, 51));
        serviceButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        serviceButton.setForeground(new java.awt.Color(216, 174, 94));
        serviceButton.setText("Service");
        serviceButton.setBorder(null);
        serviceButton.setMaximumSize(new java.awt.Dimension(150, 25));
        serviceButton.setMinimumSize(new java.awt.Dimension(150, 25));
        serviceButton.setPreferredSize(new java.awt.Dimension(150, 25));
        serviceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serviceButtonMouseClicked(evt);
            }
        });

        ordersButton.setBackground(new java.awt.Color(51, 51, 51));
        ordersButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ordersButton.setForeground(new java.awt.Color(216, 174, 94));
        ordersButton.setText("Orders");
        ordersButton.setBorder(null);
        ordersButton.setMaximumSize(new java.awt.Dimension(150, 25));
        ordersButton.setMinimumSize(new java.awt.Dimension(150, 25));
        ordersButton.setPreferredSize(new java.awt.Dimension(150, 25));
        ordersButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersButtonMouseClicked(evt);
            }
        });

        orderDetailButton.setBackground(new java.awt.Color(51, 51, 51));
        orderDetailButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        orderDetailButton.setForeground(new java.awt.Color(216, 174, 94));
        orderDetailButton.setText("Order Detail");
        orderDetailButton.setBorder(null);
        orderDetailButton.setMaximumSize(new java.awt.Dimension(150, 25));
        orderDetailButton.setMinimumSize(new java.awt.Dimension(150, 25));
        orderDetailButton.setPreferredSize(new java.awt.Dimension(150, 25));
        orderDetailButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderDetailButtonMouseClicked(evt);
            }
        });

        billButton.setBackground(new java.awt.Color(51, 51, 51));
        billButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        billButton.setForeground(new java.awt.Color(216, 174, 94));
        billButton.setText("Bill");
        billButton.setBorder(null);
        billButton.setMaximumSize(new java.awt.Dimension(150, 25));
        billButton.setMinimumSize(new java.awt.Dimension(150, 25));
        billButton.setPreferredSize(new java.awt.Dimension(150, 25));
        billButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billButtonMouseClicked(evt);
            }
        });

        takeCareButton.setBackground(new java.awt.Color(51, 51, 51));
        takeCareButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        takeCareButton.setForeground(new java.awt.Color(216, 174, 94));
        takeCareButton.setText("Take Care");
        takeCareButton.setBorder(null);
        takeCareButton.setMaximumSize(new java.awt.Dimension(150, 25));
        takeCareButton.setMinimumSize(new java.awt.Dimension(150, 25));
        takeCareButton.setPreferredSize(new java.awt.Dimension(150, 25));
        takeCareButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                takeCareButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout submenuLayout = new javax.swing.GroupLayout(submenu);
        submenu.setLayout(submenuLayout);
        submenuLayout.setHorizontalGroup(
            submenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(submenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usersButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serviceButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ordersButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderDetailButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(takeCareButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(computerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        submenuLayout.setVerticalGroup(
            submenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, submenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usersButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(staffButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(computerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(serviceButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ordersButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orderDetailButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(billButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(takeCareButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel.add(submenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 0));

        jTabbedPane.setMaximumSize(new java.awt.Dimension(1000, 800));
        jTabbedPane.setMinimumSize(new java.awt.Dimension(1000, 800));
        jTabbedPane.setPreferredSize(new java.awt.Dimension(1000, 800));

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
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
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
            .addGroup(homeInterfaceLayout.createSequentialGroup()
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
                .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
            .addGroup(homeInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homeInterfaceLayout.createSequentialGroup()
                    .addGap(377, 377, 377)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(173, Short.MAX_VALUE)))
        );

        jTabbedPane.addTab("home", homeInterface);

        usersInterface.setToolTipText("");
        usersInterface.setFocusable(false);
        usersInterface.setMaximumSize(new java.awt.Dimension(1000, 550));
        usersInterface.setMinimumSize(new java.awt.Dimension(1000, 550));
        usersInterface.setName(""); // NOI18N
        usersInterface.setPreferredSize(new java.awt.Dimension(1000, 550));
        usersInterface.setRequestFocusEnabled(false);
        usersInterface.setVerifyInputWhenFocusTarget(false);

        UserInformation.setPreferredSize(new java.awt.Dimension(500, 550));

        uID.setText("ID");

        uAcc.setText("Account");

        uPass.setText("Password");

        uTime.setText("Remaining Time");

        uAdd.setText("Add");
        uAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        uAdd.setMaximumSize(new java.awt.Dimension(100, 25));
        uAdd.setMinimumSize(new java.awt.Dimension(100, 25));
        uAdd.setPreferredSize(new java.awt.Dimension(100, 25));

        uUpdate.setText("Update");
        uUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        uUpdate.setMaximumSize(new java.awt.Dimension(100, 25));
        uUpdate.setMinimumSize(new java.awt.Dimension(100, 25));
        uUpdate.setPreferredSize(new java.awt.Dimension(100, 25));

        uDelete.setText("Delete");
        uDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        uDelete.setMaximumSize(new java.awt.Dimension(100, 25));
        uDelete.setMinimumSize(new java.awt.Dimension(100, 25));
        uDelete.setPreferredSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout UserInformationLayout = new javax.swing.GroupLayout(UserInformation);
        UserInformation.setLayout(UserInformationLayout);
        UserInformationLayout.setHorizontalGroup(
            UserInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserInformationLayout.createSequentialGroup()
                .addGap(69, 69, 69)
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
                .addContainerGap(69, Short.MAX_VALUE))
        );
        UserInformationLayout.setVerticalGroup(
            UserInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserInformationLayout.createSequentialGroup()
                .addGap(119, 119, 119)
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
                .addContainerGap(211, Short.MAX_VALUE))
        );

        UTable.setPreferredSize(new java.awt.Dimension(500, 550));
        UTable.setRequestFocusEnabled(false);

        jScrollPane2.setMaximumSize(new java.awt.Dimension(500, 550));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(500, 550));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(500, 550));

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        UserTable.setCellSelectionEnabled(false);
        UserTable.setMaximumSize(new java.awt.Dimension(500, 550));
        UserTable.setMinimumSize(new java.awt.Dimension(500, 550));
        UserTable.setPreferredSize(new java.awt.Dimension(500, 550));
        UserTable.setShowGrid(true);
        UserTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(UserTable);

        javax.swing.GroupLayout UTableLayout = new javax.swing.GroupLayout(UTable);
        UTable.setLayout(UTableLayout);
        UTableLayout.setHorizontalGroup(
            UTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        UTableLayout.setVerticalGroup(
            UTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout usersInterfaceLayout = new javax.swing.GroupLayout(usersInterface);
        usersInterface.setLayout(usersInterfaceLayout);
        usersInterfaceLayout.setHorizontalGroup(
            usersInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersInterfaceLayout.createSequentialGroup()
                .addComponent(UserInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(UTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        usersInterfaceLayout.setVerticalGroup(
            usersInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersInterfaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usersInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("users", usersInterface);

        staffInterface.setToolTipText("");
        staffInterface.setFocusable(false);
        staffInterface.setMaximumSize(new java.awt.Dimension(1000, 550));
        staffInterface.setMinimumSize(new java.awt.Dimension(1000, 550));
        staffInterface.setName(""); // NOI18N
        staffInterface.setRequestFocusEnabled(false);
        staffInterface.setVerifyInputWhenFocusTarget(false);

        StaffInformation.setPreferredSize(new java.awt.Dimension(500, 550));

        sID.setText("ID");

        sName.setText("Name");

        sDOB.setText("Date of Birth");

        sPhone.setText("Phone Number");

        sAddress.setText("Address");

        sAdd.setText("Add");
        sAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sAdd.setMaximumSize(new java.awt.Dimension(100, 25));
        sAdd.setMinimumSize(new java.awt.Dimension(100, 25));
        sAdd.setPreferredSize(new java.awt.Dimension(100, 25));

        sUpdate.setText("Update");
        sUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sUpdate.setMaximumSize(new java.awt.Dimension(100, 25));
        sUpdate.setMinimumSize(new java.awt.Dimension(100, 25));
        sUpdate.setPreferredSize(new java.awt.Dimension(100, 25));

        sDelete.setText("Delete");
        sDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sDelete.setMaximumSize(new java.awt.Dimension(100, 25));
        sDelete.setMinimumSize(new java.awt.Dimension(100, 25));
        sDelete.setPreferredSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout StaffInformationLayout = new javax.swing.GroupLayout(StaffInformation);
        StaffInformation.setLayout(StaffInformationLayout);
        StaffInformationLayout.setHorizontalGroup(
            StaffInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffInformationLayout.createSequentialGroup()
                .addGap(69, 69, 69)
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
                .addContainerGap(69, Short.MAX_VALUE))
        );
        StaffInformationLayout.setVerticalGroup(
            StaffInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffInformationLayout.createSequentialGroup()
                .addGap(119, 119, 119)
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
                .addContainerGap(173, Short.MAX_VALUE))
        );

        STable.setPreferredSize(new java.awt.Dimension(500, 550));
        STable.setRequestFocusEnabled(false);

        jScrollPane3.setMaximumSize(new java.awt.Dimension(500, 550));
        jScrollPane3.setMinimumSize(new java.awt.Dimension(500, 550));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(500, 550));

        StaffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        StaffTable.setMaximumSize(new java.awt.Dimension(500, 550));
        StaffTable.setMinimumSize(new java.awt.Dimension(500, 550));
        StaffTable.setPreferredSize(new java.awt.Dimension(500, 550));
        StaffTable.setShowGrid(true);
        StaffTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(StaffTable);

        javax.swing.GroupLayout STableLayout = new javax.swing.GroupLayout(STable);
        STable.setLayout(STableLayout);
        STableLayout.setHorizontalGroup(
            STableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        STableLayout.setVerticalGroup(
            STableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout staffInterfaceLayout = new javax.swing.GroupLayout(staffInterface);
        staffInterface.setLayout(staffInterfaceLayout);
        staffInterfaceLayout.setHorizontalGroup(
            staffInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffInterfaceLayout.createSequentialGroup()
                .addComponent(StaffInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(STable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        staffInterfaceLayout.setVerticalGroup(
            staffInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffInterfaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(staffInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(STable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StaffInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("tab3", staffInterface);

        computerInterface.setToolTipText("");
        computerInterface.setFocusable(false);
        computerInterface.setMaximumSize(new java.awt.Dimension(1000, 550));
        computerInterface.setMinimumSize(new java.awt.Dimension(1000, 550));
        computerInterface.setName(""); // NOI18N
        computerInterface.setRequestFocusEnabled(false);
        computerInterface.setVerifyInputWhenFocusTarget(false);

        ComputerInformation6.setPreferredSize(new java.awt.Dimension(500, 550));

        cID6.setText("ID");

        cStatus6.setText("Status");

        cON6.setText("ON");

        cOFF6.setText("OFF");

        cUserID6.setText("User ID");

        cTime6.setText("Start Time");

        cAdd6.setText("Add");
        cAdd6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cAdd6.setMaximumSize(new java.awt.Dimension(100, 25));
        cAdd6.setMinimumSize(new java.awt.Dimension(100, 25));
        cAdd6.setPreferredSize(new java.awt.Dimension(100, 25));

        cUpdate6.setText("Update");
        cUpdate6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cUpdate6.setMaximumSize(new java.awt.Dimension(100, 25));
        cUpdate6.setMinimumSize(new java.awt.Dimension(100, 25));
        cUpdate6.setPreferredSize(new java.awt.Dimension(100, 25));

        cDelete6.setText("Delete");
        cDelete6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cDelete6.setMaximumSize(new java.awt.Dimension(100, 25));
        cDelete6.setMinimumSize(new java.awt.Dimension(100, 25));
        cDelete6.setPreferredSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout ComputerInformation6Layout = new javax.swing.GroupLayout(ComputerInformation6);
        ComputerInformation6.setLayout(ComputerInformation6Layout);
        ComputerInformation6Layout.setHorizontalGroup(
            ComputerInformation6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputerInformation6Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(ComputerInformation6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ComputerInformation6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cTime6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cAdd6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cUserID6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cID6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cStatus6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(ComputerInformation6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ComputerInformation6Layout.createSequentialGroup()
                        .addComponent(cUpdate6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(cDelete6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cuseridText6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctimeText6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ComputerInformation6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cidText6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ComputerInformation6Layout.createSequentialGroup()
                            .addComponent(cON6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cOFF6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        ComputerInformation6Layout.setVerticalGroup(
            ComputerInformation6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputerInformation6Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(ComputerInformation6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cID6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidText6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ComputerInformation6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cStatus6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cON6)
                    .addComponent(cOFF6))
                .addGap(12, 12, 12)
                .addGroup(ComputerInformation6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cUserID6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuseridText6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ComputerInformation6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cTime6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctimeText6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(ComputerInformation6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cAdd6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cUpdate6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cDelete6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(211, Short.MAX_VALUE))
        );

        CTable.setPreferredSize(new java.awt.Dimension(500, 550));
        CTable.setRequestFocusEnabled(false);

        jScrollPane4.setMaximumSize(new java.awt.Dimension(500, 550));
        jScrollPane4.setMinimumSize(new java.awt.Dimension(500, 550));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(500, 550));

        ComputerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ComputerTable.setMaximumSize(new java.awt.Dimension(500, 550));
        ComputerTable.setMinimumSize(new java.awt.Dimension(500, 550));
        ComputerTable.setPreferredSize(new java.awt.Dimension(500, 550));
        ComputerTable.setShowGrid(true);
        ComputerTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(ComputerTable);

        javax.swing.GroupLayout CTableLayout = new javax.swing.GroupLayout(CTable);
        CTable.setLayout(CTableLayout);
        CTableLayout.setHorizontalGroup(
            CTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        CTableLayout.setVerticalGroup(
            CTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout computerInterfaceLayout = new javax.swing.GroupLayout(computerInterface);
        computerInterface.setLayout(computerInterfaceLayout);
        computerInterfaceLayout.setHorizontalGroup(
            computerInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(computerInterfaceLayout.createSequentialGroup()
                .addComponent(ComputerInformation6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        computerInterfaceLayout.setVerticalGroup(
            computerInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(computerInterfaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(computerInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComputerInformation6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("tab4", computerInterface);

        serviceInterface.setToolTipText("");
        serviceInterface.setFocusable(false);
        serviceInterface.setMaximumSize(new java.awt.Dimension(1000, 550));
        serviceInterface.setMinimumSize(new java.awt.Dimension(1000, 550));
        serviceInterface.setName(""); // NOI18N
        serviceInterface.setRequestFocusEnabled(false);
        serviceInterface.setVerifyInputWhenFocusTarget(false);

        ServiceInformation.setPreferredSize(new java.awt.Dimension(500, 550));

        svID.setText("ID");

        svPrice.setText("Price");

        svDescription.setText("Description");

        svType.setText("Type");

        svAdd.setText("Add");
        svAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        svAdd.setMaximumSize(new java.awt.Dimension(100, 25));
        svAdd.setMinimumSize(new java.awt.Dimension(100, 25));
        svAdd.setPreferredSize(new java.awt.Dimension(100, 25));

        svUpdate.setText("Update");
        svUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        svUpdate.setMaximumSize(new java.awt.Dimension(100, 25));
        svUpdate.setMinimumSize(new java.awt.Dimension(100, 25));
        svUpdate.setPreferredSize(new java.awt.Dimension(100, 25));

        svDelete.setText("Delete");
        svDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        svDelete.setMaximumSize(new java.awt.Dimension(100, 25));
        svDelete.setMinimumSize(new java.awt.Dimension(100, 25));
        svDelete.setPreferredSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout ServiceInformationLayout = new javax.swing.GroupLayout(ServiceInformation);
        ServiceInformation.setLayout(ServiceInformationLayout);
        ServiceInformationLayout.setHorizontalGroup(
            ServiceInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServiceInformationLayout.createSequentialGroup()
                .addGap(69, 69, 69)
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
                .addContainerGap(69, Short.MAX_VALUE))
        );
        ServiceInformationLayout.setVerticalGroup(
            ServiceInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServiceInformationLayout.createSequentialGroup()
                .addGap(119, 119, 119)
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
                .addContainerGap(211, Short.MAX_VALUE))
        );

        SerTable.setPreferredSize(new java.awt.Dimension(500, 550));
        SerTable.setRequestFocusEnabled(false);

        jScrollPane5.setMaximumSize(new java.awt.Dimension(500, 550));
        jScrollPane5.setMinimumSize(new java.awt.Dimension(500, 550));
        jScrollPane5.setPreferredSize(new java.awt.Dimension(500, 550));

        ServiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ServiceTable.setMaximumSize(new java.awt.Dimension(500, 550));
        ServiceTable.setMinimumSize(new java.awt.Dimension(500, 550));
        ServiceTable.setPreferredSize(new java.awt.Dimension(500, 550));
        ServiceTable.setShowGrid(true);
        ServiceTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(ServiceTable);

        javax.swing.GroupLayout SerTableLayout = new javax.swing.GroupLayout(SerTable);
        SerTable.setLayout(SerTableLayout);
        SerTableLayout.setHorizontalGroup(
            SerTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SerTableLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SerTableLayout.setVerticalGroup(
            SerTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout serviceInterfaceLayout = new javax.swing.GroupLayout(serviceInterface);
        serviceInterface.setLayout(serviceInterfaceLayout);
        serviceInterfaceLayout.setHorizontalGroup(
            serviceInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serviceInterfaceLayout.createSequentialGroup()
                .addComponent(ServiceInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SerTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        serviceInterfaceLayout.setVerticalGroup(
            serviceInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serviceInterfaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(serviceInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SerTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ServiceInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("tab5", serviceInterface);

        orderInterface.setToolTipText("");
        orderInterface.setFocusable(false);
        orderInterface.setMaximumSize(new java.awt.Dimension(1000, 550));
        orderInterface.setMinimumSize(new java.awt.Dimension(1000, 550));
        orderInterface.setName(""); // NOI18N
        orderInterface.setRequestFocusEnabled(false);
        orderInterface.setVerifyInputWhenFocusTarget(false);

        OrderInformation.setPreferredSize(new java.awt.Dimension(500, 550));

        oID.setText("ID");

        oStaffID.setText("Staff ID");

        oOderDate.setText("Order Date");

        oUserID.setText("User ID");

        oAdd.setText("Add");
        oAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        oAdd.setMaximumSize(new java.awt.Dimension(100, 25));
        oAdd.setMinimumSize(new java.awt.Dimension(100, 25));
        oAdd.setPreferredSize(new java.awt.Dimension(100, 25));

        oUpdate.setText("Update");
        oUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        oUpdate.setMaximumSize(new java.awt.Dimension(100, 25));
        oUpdate.setMinimumSize(new java.awt.Dimension(100, 25));
        oUpdate.setPreferredSize(new java.awt.Dimension(100, 25));

        oDelete.setText("Delete");
        oDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        oDelete.setMaximumSize(new java.awt.Dimension(100, 25));
        oDelete.setMinimumSize(new java.awt.Dimension(100, 25));
        oDelete.setPreferredSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout OrderInformationLayout = new javax.swing.GroupLayout(OrderInformation);
        OrderInformation.setLayout(OrderInformationLayout);
        OrderInformationLayout.setHorizontalGroup(
            OrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderInformationLayout.createSequentialGroup()
                .addGap(69, 69, 69)
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
                .addContainerGap(69, Short.MAX_VALUE))
        );
        OrderInformationLayout.setVerticalGroup(
            OrderInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderInformationLayout.createSequentialGroup()
                .addGap(119, 119, 119)
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
                .addContainerGap(211, Short.MAX_VALUE))
        );

        OTable.setPreferredSize(new java.awt.Dimension(500, 550));
        OTable.setRequestFocusEnabled(false);

        jScrollPane6.setMaximumSize(new java.awt.Dimension(500, 550));
        jScrollPane6.setMinimumSize(new java.awt.Dimension(500, 550));
        jScrollPane6.setPreferredSize(new java.awt.Dimension(500, 550));

        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        OrderTable.setMaximumSize(new java.awt.Dimension(500, 550));
        OrderTable.setMinimumSize(new java.awt.Dimension(500, 550));
        OrderTable.setPreferredSize(new java.awt.Dimension(500, 550));
        OrderTable.setShowGrid(true);
        OrderTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(OrderTable);

        javax.swing.GroupLayout OTableLayout = new javax.swing.GroupLayout(OTable);
        OTable.setLayout(OTableLayout);
        OTableLayout.setHorizontalGroup(
            OTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        OTableLayout.setVerticalGroup(
            OTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout orderInterfaceLayout = new javax.swing.GroupLayout(orderInterface);
        orderInterface.setLayout(orderInterfaceLayout);
        orderInterfaceLayout.setHorizontalGroup(
            orderInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderInterfaceLayout.createSequentialGroup()
                .addComponent(OrderInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(OTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        orderInterfaceLayout.setVerticalGroup(
            orderInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderInterfaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrderInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("tab6", orderInterface);

        orderDetailInterface.setToolTipText("");
        orderDetailInterface.setFocusable(false);
        orderDetailInterface.setMaximumSize(new java.awt.Dimension(1000, 550));
        orderDetailInterface.setMinimumSize(new java.awt.Dimension(1000, 550));
        orderDetailInterface.setName(""); // NOI18N
        orderDetailInterface.setRequestFocusEnabled(false);
        orderDetailInterface.setVerifyInputWhenFocusTarget(false);

        OrderDetaiInformation.setPreferredSize(new java.awt.Dimension(500, 550));

        odOderID.setText("Order ID");

        odServiceID.setText("Service ID");

        odQuantity.setText("Quantity");

        odAdd.setText("Add");
        odAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        odAdd.setMaximumSize(new java.awt.Dimension(100, 25));
        odAdd.setMinimumSize(new java.awt.Dimension(100, 25));
        odAdd.setPreferredSize(new java.awt.Dimension(100, 25));

        odUpdate.setText("Update");
        odUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        odUpdate.setMaximumSize(new java.awt.Dimension(100, 25));
        odUpdate.setMinimumSize(new java.awt.Dimension(100, 25));
        odUpdate.setPreferredSize(new java.awt.Dimension(100, 25));

        odDelete.setText("Delete");
        odDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        odDelete.setMaximumSize(new java.awt.Dimension(100, 25));
        odDelete.setMinimumSize(new java.awt.Dimension(100, 25));
        odDelete.setPreferredSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout OrderDetaiInformationLayout = new javax.swing.GroupLayout(OrderDetaiInformation);
        OrderDetaiInformation.setLayout(OrderDetaiInformationLayout);
        OrderDetaiInformationLayout.setHorizontalGroup(
            OrderDetaiInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderDetaiInformationLayout.createSequentialGroup()
                .addGap(69, 69, 69)
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
                .addContainerGap(69, Short.MAX_VALUE))
        );
        OrderDetaiInformationLayout.setVerticalGroup(
            OrderDetaiInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderDetaiInformationLayout.createSequentialGroup()
                .addGap(119, 119, 119)
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
                .addContainerGap(249, Short.MAX_VALUE))
        );

        ODTable.setPreferredSize(new java.awt.Dimension(500, 550));
        ODTable.setRequestFocusEnabled(false);

        jScrollPane7.setMaximumSize(new java.awt.Dimension(500, 550));
        jScrollPane7.setMinimumSize(new java.awt.Dimension(500, 550));
        jScrollPane7.setPreferredSize(new java.awt.Dimension(500, 550));

        OrderDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        OrderDetailTable.setMaximumSize(new java.awt.Dimension(500, 550));
        OrderDetailTable.setMinimumSize(new java.awt.Dimension(500, 550));
        OrderDetailTable.setPreferredSize(new java.awt.Dimension(500, 550));
        OrderDetailTable.setShowGrid(true);
        OrderDetailTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(OrderDetailTable);

        javax.swing.GroupLayout ODTableLayout = new javax.swing.GroupLayout(ODTable);
        ODTable.setLayout(ODTableLayout);
        ODTableLayout.setHorizontalGroup(
            ODTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ODTableLayout.setVerticalGroup(
            ODTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout orderDetailInterfaceLayout = new javax.swing.GroupLayout(orderDetailInterface);
        orderDetailInterface.setLayout(orderDetailInterfaceLayout);
        orderDetailInterfaceLayout.setHorizontalGroup(
            orderDetailInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderDetailInterfaceLayout.createSequentialGroup()
                .addComponent(OrderDetaiInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ODTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        orderDetailInterfaceLayout.setVerticalGroup(
            orderDetailInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderDetailInterfaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderDetailInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ODTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrderDetaiInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("tab7", orderDetailInterface);

        billInterface.setToolTipText("");
        billInterface.setFocusable(false);
        billInterface.setMaximumSize(new java.awt.Dimension(1000, 550));
        billInterface.setMinimumSize(new java.awt.Dimension(1000, 550));
        billInterface.setName(""); // NOI18N
        billInterface.setRequestFocusEnabled(false);
        billInterface.setVerifyInputWhenFocusTarget(false);

        BillInformation.setPreferredSize(new java.awt.Dimension(500, 550));

        bID.setText("ID");

        bOderID.setText("Order ID");

        bPaymentDay.setText("Payment Day");

        bPaymentMethod.setText("Payment Method");

        bAdd.setText("Add");
        bAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAdd.setMaximumSize(new java.awt.Dimension(100, 25));
        bAdd.setMinimumSize(new java.awt.Dimension(100, 25));
        bAdd.setPreferredSize(new java.awt.Dimension(100, 25));

        bUpdate.setText("Update");
        bUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bUpdate.setMaximumSize(new java.awt.Dimension(100, 25));
        bUpdate.setMinimumSize(new java.awt.Dimension(100, 25));
        bUpdate.setPreferredSize(new java.awt.Dimension(100, 25));

        bDelete.setText("Delete");
        bDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bDelete.setMaximumSize(new java.awt.Dimension(100, 25));
        bDelete.setMinimumSize(new java.awt.Dimension(100, 25));
        bDelete.setPreferredSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout BillInformationLayout = new javax.swing.GroupLayout(BillInformation);
        BillInformation.setLayout(BillInformationLayout);
        BillInformationLayout.setHorizontalGroup(
            BillInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillInformationLayout.createSequentialGroup()
                .addGap(69, 69, 69)
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
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addGroup(BillInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillInformationLayout.createSequentialGroup()
                                .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bpaymentmethodText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        BillInformationLayout.setVerticalGroup(
            BillInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillInformationLayout.createSequentialGroup()
                .addGap(119, 119, 119)
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
                    .addComponent(bpaymentmethodText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(BillInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(211, Short.MAX_VALUE))
        );

        BTable.setPreferredSize(new java.awt.Dimension(500, 550));
        BTable.setRequestFocusEnabled(false);

        jScrollPane8.setMaximumSize(new java.awt.Dimension(500, 550));
        jScrollPane8.setMinimumSize(new java.awt.Dimension(500, 550));
        jScrollPane8.setPreferredSize(new java.awt.Dimension(500, 550));

        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        BillTable.setMaximumSize(new java.awt.Dimension(500, 550));
        BillTable.setMinimumSize(new java.awt.Dimension(500, 550));
        BillTable.setPreferredSize(new java.awt.Dimension(500, 550));
        BillTable.setShowGrid(true);
        BillTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(BillTable);

        javax.swing.GroupLayout BTableLayout = new javax.swing.GroupLayout(BTable);
        BTable.setLayout(BTableLayout);
        BTableLayout.setHorizontalGroup(
            BTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BTableLayout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BTableLayout.setVerticalGroup(
            BTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout billInterfaceLayout = new javax.swing.GroupLayout(billInterface);
        billInterface.setLayout(billInterfaceLayout);
        billInterfaceLayout.setHorizontalGroup(
            billInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billInterfaceLayout.createSequentialGroup()
                .addComponent(BillInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        billInterfaceLayout.setVerticalGroup(
            billInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billInterfaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(billInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BillInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("tab8", billInterface);

        takeCareInterface.setToolTipText("");
        takeCareInterface.setFocusable(false);
        takeCareInterface.setMaximumSize(new java.awt.Dimension(1000, 550));
        takeCareInterface.setMinimumSize(new java.awt.Dimension(1000, 550));
        takeCareInterface.setName(""); // NOI18N
        takeCareInterface.setRequestFocusEnabled(false);
        takeCareInterface.setVerifyInputWhenFocusTarget(false);

        TakeCareInformation.setPreferredSize(new java.awt.Dimension(500, 550));

        tcUserID.setText("User ID");

        tcStaffID.setText("Staff ID");

        tcRate.setText("Rate");

        tcAdd.setText("Add");
        tcAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tcAdd.setMaximumSize(new java.awt.Dimension(100, 25));
        tcAdd.setMinimumSize(new java.awt.Dimension(100, 25));
        tcAdd.setPreferredSize(new java.awt.Dimension(100, 25));

        tcUpdate.setText("Update");
        tcUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tcUpdate.setMaximumSize(new java.awt.Dimension(100, 25));
        tcUpdate.setMinimumSize(new java.awt.Dimension(100, 25));
        tcUpdate.setPreferredSize(new java.awt.Dimension(100, 25));

        tcDelete.setText("Delete");
        tcDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tcDelete.setMaximumSize(new java.awt.Dimension(100, 25));
        tcDelete.setMinimumSize(new java.awt.Dimension(100, 25));
        tcDelete.setPreferredSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout TakeCareInformationLayout = new javax.swing.GroupLayout(TakeCareInformation);
        TakeCareInformation.setLayout(TakeCareInformationLayout);
        TakeCareInformationLayout.setHorizontalGroup(
            TakeCareInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TakeCareInformationLayout.createSequentialGroup()
                .addGap(69, 69, 69)
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
                .addContainerGap(69, Short.MAX_VALUE))
        );
        TakeCareInformationLayout.setVerticalGroup(
            TakeCareInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TakeCareInformationLayout.createSequentialGroup()
                .addGap(119, 119, 119)
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
                .addContainerGap(249, Short.MAX_VALUE))
        );

        TCTable.setPreferredSize(new java.awt.Dimension(500, 550));
        TCTable.setRequestFocusEnabled(false);

        jScrollPane9.setMaximumSize(new java.awt.Dimension(500, 550));
        jScrollPane9.setMinimumSize(new java.awt.Dimension(500, 550));
        jScrollPane9.setPreferredSize(new java.awt.Dimension(500, 550));

        TakeCareTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TakeCareTable.setMaximumSize(new java.awt.Dimension(500, 550));
        TakeCareTable.setMinimumSize(new java.awt.Dimension(500, 550));
        TakeCareTable.setPreferredSize(new java.awt.Dimension(500, 550));
        TakeCareTable.setShowGrid(true);
        TakeCareTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(TakeCareTable);

        javax.swing.GroupLayout TCTableLayout = new javax.swing.GroupLayout(TCTable);
        TCTable.setLayout(TCTableLayout);
        TCTableLayout.setHorizontalGroup(
            TCTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        TCTableLayout.setVerticalGroup(
            TCTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout takeCareInterfaceLayout = new javax.swing.GroupLayout(takeCareInterface);
        takeCareInterface.setLayout(takeCareInterfaceLayout);
        takeCareInterfaceLayout.setHorizontalGroup(
            takeCareInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(takeCareInterfaceLayout.createSequentialGroup()
                .addComponent(TakeCareInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TCTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        takeCareInterfaceLayout.setVerticalGroup(
            takeCareInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(takeCareInterfaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(takeCareInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TCTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TakeCareInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("tab9", takeCareInterface);

        jPanel.add(jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseClicked
        menuSize(true);
    }//GEN-LAST:event_menuButtonMouseClicked

    private void usersButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersButtonMouseClicked
        jTabbedPane.setSelectedIndex(1);
        connect.displayData("SELECT * FROM Users");
        DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
        model.setDataVector(connect.rowData, connect.columnName);
        menuSize(false);
    }//GEN-LAST:event_usersButtonMouseClicked

    private void staffButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffButtonMouseClicked
        jTabbedPane.setSelectedIndex(2);
        connect.displayData("SELECT * FROM Staff");
        DefaultTableModel model = (DefaultTableModel) StaffTable.getModel();
        model.setDataVector(connect.rowData, connect.columnName);
        menuSize(false);
    }//GEN-LAST:event_staffButtonMouseClicked

    private void computerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_computerButtonMouseClicked
        jTabbedPane.setSelectedIndex(3);
        connect.displayData("SELECT * FROM Computer");
        DefaultTableModel model = (DefaultTableModel) ComputerTable.getModel();
        model.setDataVector(connect.rowData, connect.columnName);
        menuSize(false);
    }//GEN-LAST:event_computerButtonMouseClicked

    private void serviceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceButtonMouseClicked
        jTabbedPane.setSelectedIndex(4);
        connect.displayData("SELECT * FROM Service");
        DefaultTableModel model = (DefaultTableModel) ServiceTable.getModel();
        model.setDataVector(connect.rowData, connect.columnName);
        menuSize(false);
    }//GEN-LAST:event_serviceButtonMouseClicked

    private void ordersButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersButtonMouseClicked
        jTabbedPane.setSelectedIndex(5);
        connect.displayData("SELECT * FROM Orders");
        DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();
        model.setDataVector(connect.rowData, connect.columnName);
        menuSize(false);
    }//GEN-LAST:event_ordersButtonMouseClicked

    private void orderDetailButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderDetailButtonMouseClicked
        jTabbedPane.setSelectedIndex(6);
        connect.displayData("SELECT * FROM OrderDetail");
        DefaultTableModel model = (DefaultTableModel) OrderDetailTable.getModel();
        model.setDataVector(connect.rowData, connect.columnName);
        menuSize(false);
    }//GEN-LAST:event_orderDetailButtonMouseClicked

    private void billButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billButtonMouseClicked
        jTabbedPane.setSelectedIndex(7);
        connect.displayData("SELECT * FROM Bill");
        DefaultTableModel model = (DefaultTableModel) BillTable.getModel();
        model.setDataVector(connect.rowData, connect.columnName);
        menuSize(false);
    }//GEN-LAST:event_billButtonMouseClicked

    private void takeCareButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_takeCareButtonMouseClicked
        jTabbedPane.setSelectedIndex(8);
        connect.displayData("SELECT * FROM TakeCare");
        DefaultTableModel model = (DefaultTableModel) TakeCareTable.getModel();
        model.setDataVector(connect.rowData, connect.columnName);
        menuSize(false);
    }//GEN-LAST:event_takeCareButtonMouseClicked

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        jTabbedPane.setSelectedIndex(0);
        menuSize(false);
    }//GEN-LAST:event_homeButtonMouseClicked

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        jTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void SearchBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchBoxFocusGained
        if (SearchBox.getText().trim().equals("Search...")) {
            SearchBox.setText("");
            SearchBox.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        }
    }//GEN-LAST:event_SearchBoxFocusGained

    private void SearchBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchBoxFocusLost
        if (SearchBox.getText().trim().equals("")) {
            SearchBox.setText("Search...");
            SearchBox.setFont(new Font("Segoe UI", Font.ITALIC, 12));
        }
    }//GEN-LAST:event_SearchBoxFocusLost

    private void SearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBoxActionPerformed
        if (SearchBox.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please input query string!", "Message", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SearchBoxActionPerformed

    private void SearchBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchBoxKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER && !SearchBox.getText().equals("")){
            String cmd = SearchBox.getText();
            connect.displayData(cmd);
            DefaultTableModel model = (DefaultTableModel) Table.getModel();
            model.setDataVector(connect.rowData, connect.columnName);
            jScrollPane1.setViewportView(Table);

            if (connect.status){
                SearchBox.setSize(700, 30);
                SearchBox.setLocation(148, 40);
                jScrollPane1.setSize(700, 300);
                jScrollPane1.setLocation(148, 110);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect syntax, please enter again!", "Message", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_SearchBoxKeyPressed
    
    private void menuSize(boolean status){
        if (status) {
            submenu.setSize(150, 340);
        }
        else {
            submenu.setSize(0,0);
        }
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
        new Internet_cafe().setVisible(true);
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Internet_cafe.class.getName()).log(java.util.logging.Level.SEVERE, null,
//                    ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Internet_cafe.class.getName()).log(java.util.logging.Level.SEVERE, null,
//                    ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Internet_cafe.class.getName()).log(java.util.logging.Level.SEVERE, null,
//                    ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Internet_cafe.class.getName()).log(java.util.logging.Level.SEVERE, null,
//                    ex);
//        }
//        // </editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new Internet_cafe().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BTable;
    private javax.swing.JPanel Bar;
    private javax.swing.JPanel BillInformation;
    private javax.swing.JTable BillTable;
    private javax.swing.JPanel CTable;
    private javax.swing.JPanel ComputerInformation;
    private javax.swing.JPanel ComputerInformation1;
    private javax.swing.JPanel ComputerInformation2;
    private javax.swing.JPanel ComputerInformation3;
    private javax.swing.JPanel ComputerInformation4;
    private javax.swing.JPanel ComputerInformation6;
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
    private javax.swing.JTextField bpaymentmethodText;
    private javax.swing.JButton cAdd;
    private javax.swing.JButton cAdd1;
    private javax.swing.JButton cAdd2;
    private javax.swing.JButton cAdd3;
    private javax.swing.JButton cAdd4;
    private javax.swing.JButton cAdd6;
    private javax.swing.JButton cDelete;
    private javax.swing.JButton cDelete1;
    private javax.swing.JButton cDelete2;
    private javax.swing.JButton cDelete3;
    private javax.swing.JButton cDelete4;
    private javax.swing.JButton cDelete6;
    private javax.swing.JLabel cID;
    private javax.swing.JLabel cID1;
    private javax.swing.JLabel cID2;
    private javax.swing.JLabel cID3;
    private javax.swing.JLabel cID4;
    private javax.swing.JLabel cID6;
    private javax.swing.JRadioButton cOFF;
    private javax.swing.JRadioButton cOFF1;
    private javax.swing.JRadioButton cOFF2;
    private javax.swing.JRadioButton cOFF3;
    private javax.swing.JRadioButton cOFF4;
    private javax.swing.JRadioButton cOFF6;
    private javax.swing.JRadioButton cON;
    private javax.swing.JRadioButton cON1;
    private javax.swing.JRadioButton cON2;
    private javax.swing.JRadioButton cON3;
    private javax.swing.JRadioButton cON4;
    private javax.swing.JRadioButton cON6;
    private javax.swing.JLabel cStatus;
    private javax.swing.JLabel cStatus1;
    private javax.swing.JLabel cStatus2;
    private javax.swing.JLabel cStatus3;
    private javax.swing.JLabel cStatus4;
    private javax.swing.JLabel cStatus6;
    private javax.swing.JLabel cTime;
    private javax.swing.JLabel cTime1;
    private javax.swing.JLabel cTime2;
    private javax.swing.JLabel cTime3;
    private javax.swing.JLabel cTime4;
    private javax.swing.JLabel cTime6;
    private javax.swing.JButton cUpdate;
    private javax.swing.JButton cUpdate1;
    private javax.swing.JButton cUpdate2;
    private javax.swing.JButton cUpdate3;
    private javax.swing.JButton cUpdate4;
    private javax.swing.JButton cUpdate6;
    private javax.swing.JLabel cUserID;
    private javax.swing.JLabel cUserID1;
    private javax.swing.JLabel cUserID2;
    private javax.swing.JLabel cUserID3;
    private javax.swing.JLabel cUserID4;
    private javax.swing.JLabel cUserID6;
    private javax.swing.JTextField cidText;
    private javax.swing.JTextField cidText1;
    private javax.swing.JTextField cidText2;
    private javax.swing.JTextField cidText3;
    private javax.swing.JTextField cidText4;
    private javax.swing.JTextField cidText6;
    private javax.swing.JButton computerButton;
    private javax.swing.JPanel computerInterface;
    private javax.swing.JTextField ctimeText;
    private javax.swing.JTextField ctimeText1;
    private javax.swing.JTextField ctimeText2;
    private javax.swing.JTextField ctimeText3;
    private javax.swing.JTextField ctimeText4;
    private javax.swing.JTextField ctimeText6;
    private javax.swing.JTextField cuseridText;
    private javax.swing.JTextField cuseridText1;
    private javax.swing.JTextField cuseridText2;
    private javax.swing.JTextField cuseridText3;
    private javax.swing.JTextField cuseridText4;
    private javax.swing.JTextField cuseridText6;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel homeInterface;
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