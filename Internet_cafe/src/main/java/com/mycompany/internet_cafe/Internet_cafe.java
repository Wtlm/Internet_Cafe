package com.mycompany.internet_cafe;

import Database.Connect;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        Bar = new javax.swing.JPanel();
        Menu = new javax.swing.JButton();
        Name = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Home = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        SearchBox = new javax.swing.JTextField();
        User = new javax.swing.JPanel();
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
        Staff = new javax.swing.JPanel();
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
        Computer = new javax.swing.JPanel();
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
        Service = new javax.swing.JPanel();
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
        Order = new javax.swing.JPanel();
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
        OrderDetail = new javax.swing.JPanel();
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
        Bill = new javax.swing.JPanel();
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
        TakeCare = new javax.swing.JPanel();
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
        MenuBar = new javax.swing.JPanel();
        HomeButton = new javax.swing.JButton();
        UserButton = new javax.swing.JButton();
        StaffButton = new javax.swing.JButton();
        ComputerButton = new javax.swing.JButton();
        ServiceButton = new javax.swing.JButton();
        OrderButton = new javax.swing.JButton();
        OrderDetailButton = new javax.swing.JButton();
        BillButton = new javax.swing.JButton();
        TakeCareButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();

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
                .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                .addContainerGap())
        );
        BarLayout.setVerticalGroup(
            BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Menu)
                    .addComponent(Name))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel.add(Bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1071, 50));

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(1000, 800));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1000, 800));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1000, 800));

        Home.setToolTipText("");
        Home.setMaximumSize(new java.awt.Dimension(1000, 550));
        Home.setMinimumSize(new java.awt.Dimension(1000, 550));
        Home.setPreferredSize(new java.awt.Dimension(1000, 550));

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
        Table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

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

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addComponent(SearchBox))
                .addGap(162, 162, 162))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", Home);

        User.setToolTipText("");
        User.setFocusable(false);
        User.setMaximumSize(new java.awt.Dimension(1000, 550));
        User.setMinimumSize(new java.awt.Dimension(1000, 550));
        User.setName(""); // NOI18N
        User.setPreferredSize(new java.awt.Dimension(1000, 550));
        User.setRequestFocusEnabled(false);
        User.setVerifyInputWhenFocusTarget(false);

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
        UserTable.setColumnSelectionAllowed(true);
        UserTable.setMaximumSize(new java.awt.Dimension(500, 550));
        UserTable.setMinimumSize(new java.awt.Dimension(500, 550));
        UserTable.setPreferredSize(new java.awt.Dimension(500, 550));
        UserTable.setShowGrid(true);
        UserTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(UserTable);
        UserTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

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

        javax.swing.GroupLayout UserLayout = new javax.swing.GroupLayout(User);
        User.setLayout(UserLayout);
        UserLayout.setHorizontalGroup(
            UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserLayout.createSequentialGroup()
                .addComponent(UserInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(UTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UserLayout.setVerticalGroup(
            UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", User);

        Staff.setToolTipText("");
        Staff.setFocusable(false);
        Staff.setMaximumSize(new java.awt.Dimension(1000, 550));
        Staff.setMinimumSize(new java.awt.Dimension(1000, 550));
        Staff.setName(""); // NOI18N
        Staff.setRequestFocusEnabled(false);
        Staff.setVerifyInputWhenFocusTarget(false);

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
        StaffTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

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

        javax.swing.GroupLayout StaffLayout = new javax.swing.GroupLayout(Staff);
        Staff.setLayout(StaffLayout);
        StaffLayout.setHorizontalGroup(
            StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffLayout.createSequentialGroup()
                .addComponent(StaffInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(STable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        StaffLayout.setVerticalGroup(
            StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(STable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StaffInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", Staff);

        Computer.setToolTipText("");
        Computer.setFocusable(false);
        Computer.setMaximumSize(new java.awt.Dimension(1000, 550));
        Computer.setMinimumSize(new java.awt.Dimension(1000, 550));
        Computer.setName(""); // NOI18N
        Computer.setRequestFocusEnabled(false);
        Computer.setVerifyInputWhenFocusTarget(false);

        ComputerInformation.setPreferredSize(new java.awt.Dimension(500, 550));

        cID.setText("ID");

        cStatus.setText("Status");

        cON.setText("ON");

        cOFF.setText("OFF");

        cUserID.setText("User ID");

        cTime.setText("Start Time");

        cAdd.setText("Add");
        cAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cAdd.setMaximumSize(new java.awt.Dimension(100, 25));
        cAdd.setMinimumSize(new java.awt.Dimension(100, 25));
        cAdd.setPreferredSize(new java.awt.Dimension(100, 25));

        cUpdate.setText("Update");
        cUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cUpdate.setMaximumSize(new java.awt.Dimension(100, 25));
        cUpdate.setMinimumSize(new java.awt.Dimension(100, 25));
        cUpdate.setPreferredSize(new java.awt.Dimension(100, 25));

        cDelete.setText("Delete");
        cDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cDelete.setMaximumSize(new java.awt.Dimension(100, 25));
        cDelete.setMinimumSize(new java.awt.Dimension(100, 25));
        cDelete.setPreferredSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout ComputerInformationLayout = new javax.swing.GroupLayout(ComputerInformation);
        ComputerInformation.setLayout(ComputerInformationLayout);
        ComputerInformationLayout.setHorizontalGroup(
            ComputerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputerInformationLayout.createSequentialGroup()
                .addGap(69, 69, 69)
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
                    .addGroup(ComputerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cidText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ComputerInformationLayout.createSequentialGroup()
                            .addComponent(cON, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cOFF, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        ComputerInformationLayout.setVerticalGroup(
            ComputerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputerInformationLayout.createSequentialGroup()
                .addGap(119, 119, 119)
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
        ComputerTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

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

        javax.swing.GroupLayout ComputerLayout = new javax.swing.GroupLayout(Computer);
        Computer.setLayout(ComputerLayout);
        ComputerLayout.setHorizontalGroup(
            ComputerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputerLayout.createSequentialGroup()
                .addComponent(ComputerInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ComputerLayout.setVerticalGroup(
            ComputerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ComputerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComputerInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", Computer);

        Service.setToolTipText("");
        Service.setFocusable(false);
        Service.setMaximumSize(new java.awt.Dimension(1000, 550));
        Service.setMinimumSize(new java.awt.Dimension(1000, 550));
        Service.setName(""); // NOI18N
        Service.setRequestFocusEnabled(false);
        Service.setVerifyInputWhenFocusTarget(false);

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
        ServiceTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

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

        javax.swing.GroupLayout ServiceLayout = new javax.swing.GroupLayout(Service);
        Service.setLayout(ServiceLayout);
        ServiceLayout.setHorizontalGroup(
            ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServiceLayout.createSequentialGroup()
                .addComponent(ServiceInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SerTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ServiceLayout.setVerticalGroup(
            ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServiceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SerTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ServiceInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", Service);

        Order.setToolTipText("");
        Order.setFocusable(false);
        Order.setMaximumSize(new java.awt.Dimension(1000, 550));
        Order.setMinimumSize(new java.awt.Dimension(1000, 550));
        Order.setName(""); // NOI18N
        Order.setRequestFocusEnabled(false);
        Order.setVerifyInputWhenFocusTarget(false);

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
        OrderTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

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

        javax.swing.GroupLayout OrderLayout = new javax.swing.GroupLayout(Order);
        Order.setLayout(OrderLayout);
        OrderLayout.setHorizontalGroup(
            OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderLayout.createSequentialGroup()
                .addComponent(OrderInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(OTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OrderLayout.setVerticalGroup(
            OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrderInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab6", Order);

        OrderDetail.setToolTipText("");
        OrderDetail.setFocusable(false);
        OrderDetail.setMaximumSize(new java.awt.Dimension(1000, 550));
        OrderDetail.setMinimumSize(new java.awt.Dimension(1000, 550));
        OrderDetail.setName(""); // NOI18N
        OrderDetail.setRequestFocusEnabled(false);
        OrderDetail.setVerifyInputWhenFocusTarget(false);

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
        OrderDetailTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

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

        javax.swing.GroupLayout OrderDetailLayout = new javax.swing.GroupLayout(OrderDetail);
        OrderDetail.setLayout(OrderDetailLayout);
        OrderDetailLayout.setHorizontalGroup(
            OrderDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderDetailLayout.createSequentialGroup()
                .addComponent(OrderDetaiInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ODTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OrderDetailLayout.setVerticalGroup(
            OrderDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OrderDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ODTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrderDetaiInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab7", OrderDetail);

        Bill.setToolTipText("");
        Bill.setFocusable(false);
        Bill.setMaximumSize(new java.awt.Dimension(1000, 550));
        Bill.setMinimumSize(new java.awt.Dimension(1000, 550));
        Bill.setName(""); // NOI18N
        Bill.setRequestFocusEnabled(false);
        Bill.setVerifyInputWhenFocusTarget(false);

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
        BillTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

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

        javax.swing.GroupLayout BillLayout = new javax.swing.GroupLayout(Bill);
        Bill.setLayout(BillLayout);
        BillLayout.setHorizontalGroup(
            BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillLayout.createSequentialGroup()
                .addComponent(BillInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BillLayout.setVerticalGroup(
            BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BillInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab8", Bill);

        TakeCare.setToolTipText("");
        TakeCare.setFocusable(false);
        TakeCare.setMaximumSize(new java.awt.Dimension(1000, 550));
        TakeCare.setMinimumSize(new java.awt.Dimension(1000, 550));
        TakeCare.setName(""); // NOI18N
        TakeCare.setRequestFocusEnabled(false);
        TakeCare.setVerifyInputWhenFocusTarget(false);

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
        TakeCareTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

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

        javax.swing.GroupLayout TakeCareLayout = new javax.swing.GroupLayout(TakeCare);
        TakeCare.setLayout(TakeCareLayout);
        TakeCareLayout.setHorizontalGroup(
            TakeCareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TakeCareLayout.createSequentialGroup()
                .addComponent(TakeCareInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TCTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TakeCareLayout.setVerticalGroup(
            TakeCareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TakeCareLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TakeCareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TCTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TakeCareInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab9", TakeCare);

        jPanel.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 790));

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
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MenuBar, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBoxActionPerformed
        if (SearchBox.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please input query string!", "Message", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SearchBoxActionPerformed

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

    private void SearchBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchBoxKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER && !SearchBox.getText().equals("")){
                              
            SearchBox.setSize(700, 30);
            SearchBox.setLocation(148, 40);
            jScrollPane1.setSize(650, 350);
            jScrollPane1.setLocation(148, 110);

            String cmd = SearchBox.getText();
            connect.displayData(cmd);
            DefaultTableModel model = (DefaultTableModel) Table.getModel();
            model.setDataVector(connect.rowData, connect.columnName);
            jScrollPane1.setViewportView(Table);
        }
    }//GEN-LAST:event_SearchBoxKeyPressed

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {
        openMenuBar();
    }

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {
        closeMenuBar();
    }

    private void TakeCareButtonMouseClicked(java.awt.event.MouseEvent evt) {  
        jTabbedPane1.setSelectedIndex(8);
        connect.displayData("SELECT * FROM TakeCare");
        DefaultTableModel model = (DefaultTableModel) TakeCareTable.getModel();
        model.setDataVector(connect.rowData, connect.columnName);
    }

    private void OrderDetailButtonMouseClicked(java.awt.event.MouseEvent evt) {       
        jTabbedPane1.setSelectedIndex(6);
        connect.displayData("SELECT * FROM OrderDetail");
        DefaultTableModel model = (DefaultTableModel) OrderDetailTable.getModel();
        model.setDataVector(connect.rowData, connect.columnName);
    }

    private void HomeButtonMouseClicked(java.awt.event.MouseEvent evt) {
        jTabbedPane1.setSelectedIndex(0);
    }

    private void UserButtonMouseClicked(java.awt.event.MouseEvent evt) {
        jTabbedPane1.setSelectedIndex(1);
        connect.displayData("SELECT * FROM Users");
        DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
        model.setDataVector(connect.rowData, connect.columnName);
    }

    private void OrderButtonMouseClicked(java.awt.event.MouseEvent evt) {
        jTabbedPane1.setSelectedIndex(5);
        connect.displayData("SELECT * FROM Orders");
        DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();
        model.setDataVector(connect.rowData, connect.columnName);
    }

    private void BillButtonMouseClicked(java.awt.event.MouseEvent evt) {
        jTabbedPane1.setSelectedIndex(7);
        connect.displayData("SELECT * FROM Bill");
        DefaultTableModel model = (DefaultTableModel) BillTable.getModel();
        model.setDataVector(connect.rowData, connect.columnName);
    }

    private void ServiceButtonMouseClicked(java.awt.event.MouseEvent evt) {
        jTabbedPane1.setSelectedIndex(4);
        connect.displayData("SELECT * FROM Service");
        DefaultTableModel model = (DefaultTableModel) ServiceTable.getModel();
        model.setDataVector(connect.rowData, connect.columnName);
    }

    private void ComputerButtonMouseClicked(java.awt.event.MouseEvent evt) {
        jTabbedPane1.setSelectedIndex(3);
        connect.displayData("SELECT * FROM Computer");
        DefaultTableModel model = (DefaultTableModel) ComputerTable.getModel();
        model.setDataVector(connect.rowData, connect.columnName);
    }

    private void StaffButtonMouseClicked(java.awt.event.MouseEvent evt) {
        jTabbedPane1.setSelectedIndex(2);
        connect.displayData("SELECT * FROM Staff");
        DefaultTableModel model = (DefaultTableModel) StaffTable.getModel();
        model.setDataVector(connect.rowData, connect.columnName);
    }

    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {
        BackButton.setForeground(new Color(216, 174, 94));
        BackButton.setBackground(new Color(59, 59, 59));
    }

    private void BackButtonMouseReleased(java.awt.event.MouseEvent evt) {
        BackButton.setBackground(new Color(51, 51, 51));
        BackButton.setForeground(new Color(204, 204, 204));
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
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel Bar;
    private javax.swing.JPanel Bill;
    private javax.swing.JButton BillButton;
    private javax.swing.JPanel BillInformation;
    private javax.swing.JTable BillTable;
    private javax.swing.JPanel CTable;
    private javax.swing.JPanel Computer;
    private javax.swing.JButton ComputerButton;
    private javax.swing.JPanel ComputerInformation;
    private javax.swing.JTable ComputerTable;
    private javax.swing.JPanel Home;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton Menu;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JLabel Name;
    private javax.swing.JPanel ODTable;
    private javax.swing.JPanel OTable;
    private javax.swing.JPanel Order;
    private javax.swing.JButton OrderButton;
    private javax.swing.JPanel OrderDetaiInformation;
    private javax.swing.JPanel OrderDetail;
    private javax.swing.JButton OrderDetailButton;
    private javax.swing.JTable OrderDetailTable;
    private javax.swing.JPanel OrderInformation;
    private javax.swing.JTable OrderTable;
    private javax.swing.JPanel STable;
    private javax.swing.JTextField SearchBox;
    private javax.swing.JPanel SerTable;
    private javax.swing.JPanel Service;
    private javax.swing.JButton ServiceButton;
    private javax.swing.JPanel ServiceInformation;
    private javax.swing.JTable ServiceTable;
    private javax.swing.JPanel Staff;
    private javax.swing.JButton StaffButton;
    private javax.swing.JPanel StaffInformation;
    private javax.swing.JTable StaffTable;
    private javax.swing.JPanel TCTable;
    private javax.swing.JTable Table;
    private javax.swing.JPanel TakeCare;
    private javax.swing.JButton TakeCareButton;
    private javax.swing.JPanel TakeCareInformation;
    private javax.swing.JTable TakeCareTable;
    private javax.swing.JPanel UTable;
    private javax.swing.JPanel User;
    private javax.swing.JButton UserButton;
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
    private javax.swing.JTextField boderidText;
    private javax.swing.JTextField bpaymentdayText;
    private javax.swing.JTextField bpaymentmethodText;
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
    private javax.swing.JTextField ctimeText;
    private javax.swing.JTextField cuseridText;
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
    private javax.swing.JTabbedPane jTabbedPane1;
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
    private javax.swing.JTextField sidText;
    private javax.swing.JTextField snameText;
    private javax.swing.JTextField sphoneText;
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
    private javax.swing.JTextField utimeText;
    // End of variables declaration//GEN-END:variables

    private void openMenuBar() {      
        MenuBar.setSize(130, 600);
        Bar.setLocation(130, 0);
    }

    private void closeMenuBar() {
        MenuBar.setSize(0, 600);
        Bar.setLocation(0, 0);
    }
    
}
