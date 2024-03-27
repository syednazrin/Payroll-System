package client;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import server.appinterface;

public class HRAdminHome extends javax.swing.JFrame {
    
    private static appinterface app;

    public HRAdminHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        verticarborder1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        AccountRequest = new javax.swing.JLabel();
        AccountRequest3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ClaimRequesr = new javax.swing.JLabel();
        AccountRequest4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        AccountRequest1 = new javax.swing.JLabel();
        AccountRequest5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel19 = new javax.swing.JPanel();
        AccountRequest6 = new javax.swing.JLabel();
        AccountRequest7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        AccountRequestjPanel1 = new javax.swing.JPanel();
        AccountRequest8 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        AccountRequestjPanel = new javax.swing.JPanel();
        AccountRequest2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        AccountRequest_jPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AccountRequestTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel20 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        PersonalInfo_panel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        personalInfoInnerPanel = new javax.swing.JPanel();
        EmpInfo_jLabel = new javax.swing.JLabel();
        efirst = new javax.swing.JLabel();
        elast = new javax.swing.JLabel();
        ephone = new javax.swing.JLabel();
        eemail = new javax.swing.JLabel();
        EmployeeInfoPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        EmployeeInfoInnerPanel = new javax.swing.JPanel();
        EmpInfo_jLabel1 = new javax.swing.JLabel();
        edepartment = new javax.swing.JLabel();
        eID = new javax.swing.JLabel();
        PaymentInfojPanel = new javax.swing.JPanel();
        PaymentInfoInnerPanek = new javax.swing.JPanel();
        EmpInfo_jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        esalary = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        ebankno = new javax.swing.JLabel();
        ebankID = new javax.swing.JLabel();
        RejectRequest_jButton = new javax.swing.JButton();
        AcceptRequest_jButton = new javax.swing.JButton();
        ClaimsRequestjPanel = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        OtherClaimsRequestTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        OvertimeClaimsRequestTable = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        RejectOvertimeClaimsButton = new javax.swing.JButton();
        AcceptOtherClaimsButton = new javax.swing.JButton();
        AcceptOvertimeClaimsButton = new javax.swing.JButton();
        RejectOtherClaimsButton = new javax.swing.JButton();
        PaymentSettingsjPanel = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel17 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        OvertimeRatiotextfield = new javax.swing.JTextField();
        OvertimeRatioUpdatejButton = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        KWSPUpdatejButton = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        KWSPjTextField = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        MTDUpdatejButton = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        MTDjTextField = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        AbsentWithoutleaveRatiojTextField = new javax.swing.JTextField();
        AbsentWithoutLeaveRatiojButton = new javax.swing.JButton();
        RegistredUserListJpanel = new javax.swing.JPanel();
        RegistredUserListLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        RegistredUserList = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        PersonalInfo_panel1 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        personalInfoInnerPanel1 = new javax.swing.JPanel();
        EmpInfo_jLabel3 = new javax.swing.JLabel();
        empFirst = new javax.swing.JLabel();
        empLast = new javax.swing.JLabel();
        empPhone = new javax.swing.JLabel();
        empEmail = new javax.swing.JLabel();
        EmployeeInfoPanel1 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        EmployeeInfoInnerPanel1 = new javax.swing.JPanel();
        EmpInfo_jLabel4 = new javax.swing.JLabel();
        empDept = new javax.swing.JLabel();
        empID = new javax.swing.JLabel();
        PaymentInfojPanel1 = new javax.swing.JPanel();
        PaymentInfoInnerPanek1 = new javax.swing.JPanel();
        EmpInfo_jLabel5 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        empHourly = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        empBankNo = new javax.swing.JLabel();
        empBankID = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        empSalary = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        UpdateAccountButton = new javax.swing.JButton();
        DeleteAccountButton = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        CurrentAbsentWOLeavcejTextField = new javax.swing.JTextField();
        CurrentUnpaidLeavejTextField = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        AddDaysWOleavejTextField = new javax.swing.JTextField();
        AddUnpaidLeavejTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ShowFirstNamejLabel = new javax.swing.JLabel();
        ShowLasttNamejLabel1 = new javax.swing.JLabel();
        ShowEmpIDjLabel2 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        WelcomeBack = new javax.swing.JLabel();
        jLabelHR_Admin_name = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        LogOutIcon = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        verticarborder1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        AccountRequest.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AccountRequest.setForeground(new java.awt.Color(255, 255, 255));
        AccountRequest.setText("Account ");

        AccountRequest3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AccountRequest3.setForeground(new java.awt.Color(255, 255, 255));
        AccountRequest3.setText("Request");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add-friend.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccountRequest3)
                    .addComponent(AccountRequest))
                .addGap(116, 116, 116))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AccountRequest)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AccountRequest3)
                        .addContainerGap())))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        ClaimRequesr.setBackground(new java.awt.Color(255, 255, 255));
        ClaimRequesr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ClaimRequesr.setForeground(new java.awt.Color(255, 255, 255));
        ClaimRequesr.setText("Claim ");

        AccountRequest4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AccountRequest4.setForeground(new java.awt.Color(255, 255, 255));
        AccountRequest4.setText("Request");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/claim.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClaimRequesr)
                    .addComponent(AccountRequest4))
                .addGap(124, 124, 124))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ClaimRequesr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AccountRequest4)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        AccountRequest1.setBackground(new java.awt.Color(255, 255, 255));
        AccountRequest1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AccountRequest1.setForeground(new java.awt.Color(255, 255, 255));
        AccountRequest1.setText("Payment ");

        AccountRequest5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AccountRequest5.setForeground(new java.awt.Color(255, 255, 255));
        AccountRequest5.setText("Settings");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/setting.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccountRequest5)
                    .addComponent(AccountRequest1))
                .addGap(118, 118, 118))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(AccountRequest1)
                        .addGap(0, 0, 0)
                        .addComponent(AccountRequest5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(0, 0, 0));
        jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel19MouseClicked(evt);
            }
        });

        AccountRequest6.setBackground(new java.awt.Color(255, 255, 255));
        AccountRequest6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AccountRequest6.setForeground(new java.awt.Color(255, 255, 255));
        AccountRequest6.setText("User");

        AccountRequest7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AccountRequest7.setForeground(new java.awt.Color(255, 255, 255));
        AccountRequest7.setText("List");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-group.png"))); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccountRequest6)
                    .addComponent(AccountRequest7))
                .addGap(157, 157, 157))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(AccountRequest6)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AccountRequest7)))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Property of BHEL Solutions");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bhel-high-resolution-logo-transparent-removebg-preview (1).png"))); // NOI18N
        jLabel29.setText("jLabel29");

        AccountRequestjPanel1.setBackground(new java.awt.Color(0, 0, 0));
        AccountRequestjPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AccountRequestjPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountRequestjPanel1MouseClicked(evt);
            }
        });

        AccountRequest8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AccountRequest8.setForeground(new java.awt.Color(255, 255, 255));
        AccountRequest8.setText("DashBoard");

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/statisctics.png"))); // NOI18N

        javax.swing.GroupLayout AccountRequestjPanel1Layout = new javax.swing.GroupLayout(AccountRequestjPanel1);
        AccountRequestjPanel1.setLayout(AccountRequestjPanel1Layout);
        AccountRequestjPanel1Layout.setHorizontalGroup(
            AccountRequestjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccountRequestjPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccountRequest8)
                .addGap(97, 97, 97))
        );
        AccountRequestjPanel1Layout.setVerticalGroup(
            AccountRequestjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccountRequestjPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(AccountRequestjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78)
                    .addComponent(AccountRequest8))
                .addContainerGap())
        );

        AccountRequestjPanel.setBackground(new java.awt.Color(0, 0, 0));
        AccountRequestjPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AccountRequestjPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                AccountRequestjPanelMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AccountRequestjPanelMouseMoved(evt);
            }
        });
        AccountRequestjPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountRequestjPanelMouseClicked(evt);
            }
        });

        AccountRequest2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AccountRequest2.setForeground(new java.awt.Color(255, 255, 255));
        AccountRequest2.setText("Leaves");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/absentism.png"))); // NOI18N

        javax.swing.GroupLayout AccountRequestjPanelLayout = new javax.swing.GroupLayout(AccountRequestjPanel);
        AccountRequestjPanel.setLayout(AccountRequestjPanelLayout);
        AccountRequestjPanelLayout.setHorizontalGroup(
            AccountRequestjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccountRequestjPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(AccountRequest2)
                .addGap(133, 133, 133))
        );
        AccountRequestjPanelLayout.setVerticalGroup(
            AccountRequestjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccountRequestjPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(AccountRequestjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(AccountRequest2))
                .addContainerGap())
        );

        javax.swing.GroupLayout verticarborder1Layout = new javax.swing.GroupLayout(verticarborder1);
        verticarborder1.setLayout(verticarborder1Layout);
        verticarborder1Layout.setHorizontalGroup(
            verticarborder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(verticarborder1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(verticarborder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verticarborder1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(verticarborder1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verticarborder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AccountRequestjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(verticarborder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(verticarborder1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(AccountRequestjPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        verticarborder1Layout.setVerticalGroup(
            verticarborder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verticarborder1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel29)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccountRequestjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(verticarborder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(verticarborder1Layout.createSequentialGroup()
                    .addGap(277, 277, 277)
                    .addComponent(AccountRequestjPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(569, Short.MAX_VALUE)))
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setEnabled(false);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(118, 166, 126));
        jPanel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TOTAL REGISTERED EMPLOYEES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Number of registered users");

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel72)
                .addGap(120, 120, 120))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(193, 193, 193)
                    .addComponent(jLabel73)
                    .addContainerGap(193, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jLabel72)
                .addContainerGap())
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jLabel73)
                    .addContainerGap(64, Short.MAX_VALUE)))
        );

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));

        jPanel11.setBackground(new java.awt.Color(102, 102, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ACCOUNT REQUEST PENDING");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel11)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Account creation request pending ");

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel69)
                .addGap(87, 87, 87))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(190, 190, 190)
                    .addComponent(jLabel76)
                    .addContainerGap(191, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jLabel69)
                .addContainerGap())
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jLabel76)
                    .addContainerGap(64, Short.MAX_VALUE)))
        );

        jPanel12.setBackground(new java.awt.Color(255, 181, 87));

        jPanel13.setBackground(new java.awt.Color(255, 102, 0));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("OVERTIME CLAIM(S) REQUEST PENDING");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Overtime Claims are pending");

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("0");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel71)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(193, 193, 193)
                    .addComponent(jLabel74)
                    .addContainerGap(193, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jLabel71)
                .addContainerGap())
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jLabel74)
                    .addContainerGap(64, Short.MAX_VALUE)))
        );

        jPanel14.setBackground(new java.awt.Color(255, 153, 153));

        jPanel15.setBackground(new java.awt.Color(255, 51, 51));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("OTHER CLAIM(S) REQUESTPENDING");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Other Claims are pending");

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("0");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel70)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(193, 193, 193)
                    .addComponent(jLabel75)
                    .addContainerGap(193, Short.MAX_VALUE)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jLabel70)
                .addContainerGap())
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jLabel75)
                    .addContainerGap(64, Short.MAX_VALUE)))
        );

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel77.setText("HUMAN RESOURCES ADMINISTRATORS DASHBOARD");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel77)))
                .addContainerGap(311, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel77)
                .addGap(40, 40, 40)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(276, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", jPanel7);

        AccountRequest_jPanel.setBackground(new java.awt.Color(255, 255, 255));

        AccountRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        AccountRequestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AccountRequestTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(AccountRequestTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ACCOUNT REQUESTS");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("DETAILS");

        PersonalInfo_panel.setBackground(new java.awt.Color(153, 153, 153));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("First Name:");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Last Name:");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Telephone Num:");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Email:");

        personalInfoInnerPanel.setBackground(new java.awt.Color(0, 0, 0));

        EmpInfo_jLabel.setBackground(new java.awt.Color(255, 255, 255));
        EmpInfo_jLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        EmpInfo_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmpInfo_jLabel.setText("Personal Info");

        javax.swing.GroupLayout personalInfoInnerPanelLayout = new javax.swing.GroupLayout(personalInfoInnerPanel);
        personalInfoInnerPanel.setLayout(personalInfoInnerPanelLayout);
        personalInfoInnerPanelLayout.setHorizontalGroup(
            personalInfoInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalInfoInnerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EmpInfo_jLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        personalInfoInnerPanelLayout.setVerticalGroup(
            personalInfoInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personalInfoInnerPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(EmpInfo_jLabel)
                .addContainerGap())
        );

        efirst.setText("X");

        elast.setText("X");

        ephone.setText("X");

        eemail.setText("X");

        javax.swing.GroupLayout PersonalInfo_panelLayout = new javax.swing.GroupLayout(PersonalInfo_panel);
        PersonalInfo_panel.setLayout(PersonalInfo_panelLayout);
        PersonalInfo_panelLayout.setHorizontalGroup(
            PersonalInfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(personalInfoInnerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PersonalInfo_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PersonalInfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersonalInfo_panelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(efirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16))
                    .addGroup(PersonalInfo_panelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PersonalInfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersonalInfo_panelLayout.createSequentialGroup()
                        .addComponent(ephone, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(PersonalInfo_panelLayout.createSequentialGroup()
                        .addComponent(eemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
        );
        PersonalInfo_panelLayout.setVerticalGroup(
            PersonalInfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonalInfo_panelLayout.createSequentialGroup()
                .addComponent(personalInfoInnerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PersonalInfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel10)
                    .addComponent(efirst)
                    .addComponent(ephone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonalInfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(elast)
                    .addComponent(eemail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EmployeeInfoPanel.setBackground(new java.awt.Color(153, 153, 153));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Employee ID:");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Department/Team:");

        EmployeeInfoInnerPanel.setBackground(new java.awt.Color(0, 0, 0));

        EmpInfo_jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        EmpInfo_jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        EmpInfo_jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        EmpInfo_jLabel1.setText("Employee Info");

        javax.swing.GroupLayout EmployeeInfoInnerPanelLayout = new javax.swing.GroupLayout(EmployeeInfoInnerPanel);
        EmployeeInfoInnerPanel.setLayout(EmployeeInfoInnerPanelLayout);
        EmployeeInfoInnerPanelLayout.setHorizontalGroup(
            EmployeeInfoInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeInfoInnerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EmpInfo_jLabel1)
                .addContainerGap(1091, Short.MAX_VALUE))
        );
        EmployeeInfoInnerPanelLayout.setVerticalGroup(
            EmployeeInfoInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmployeeInfoInnerPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(EmpInfo_jLabel1)
                .addContainerGap())
        );

        edepartment.setText("X");

        eID.setText("X");

        javax.swing.GroupLayout EmployeeInfoPanelLayout = new javax.swing.GroupLayout(EmployeeInfoPanel);
        EmployeeInfoPanel.setLayout(EmployeeInfoPanelLayout);
        EmployeeInfoPanelLayout.setHorizontalGroup(
            EmployeeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EmployeeInfoInnerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EmployeeInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eID, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EmployeeInfoPanelLayout.setVerticalGroup(
            EmployeeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeInfoPanelLayout.createSequentialGroup()
                .addComponent(EmployeeInfoInnerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(EmployeeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(edepartment)
                    .addComponent(eID))
                .addGap(24, 24, 24))
        );

        PaymentInfojPanel.setBackground(new java.awt.Color(153, 153, 153));

        PaymentInfoInnerPanek.setBackground(new java.awt.Color(0, 0, 0));

        EmpInfo_jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        EmpInfo_jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        EmpInfo_jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        EmpInfo_jLabel2.setText("Payment Info");

        javax.swing.GroupLayout PaymentInfoInnerPanekLayout = new javax.swing.GroupLayout(PaymentInfoInnerPanek);
        PaymentInfoInnerPanek.setLayout(PaymentInfoInnerPanekLayout);
        PaymentInfoInnerPanekLayout.setHorizontalGroup(
            PaymentInfoInnerPanekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentInfoInnerPanekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EmpInfo_jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PaymentInfoInnerPanekLayout.setVerticalGroup(
            PaymentInfoInnerPanekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaymentInfoInnerPanekLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(EmpInfo_jLabel2)
                .addContainerGap())
        );

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Bank Account Number:");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Bank ID:");

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Base Salary:");

        esalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esalaryActionPerformed(evt);
            }
        });

        jLabel25.setText("RM");

        ebankno.setText("X");

        ebankID.setText("X");

        javax.swing.GroupLayout PaymentInfojPanelLayout = new javax.swing.GroupLayout(PaymentInfojPanel);
        PaymentInfojPanel.setLayout(PaymentInfojPanelLayout);
        PaymentInfojPanelLayout.setHorizontalGroup(
            PaymentInfojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentInfojPanelLayout.createSequentialGroup()
                .addGroup(PaymentInfojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PaymentInfojPanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(ebankID, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(PaymentInfojPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ebankno, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(esalary, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(541, Short.MAX_VALUE))
            .addComponent(PaymentInfoInnerPanek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PaymentInfojPanelLayout.setVerticalGroup(
            PaymentInfojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentInfojPanelLayout.createSequentialGroup()
                .addComponent(PaymentInfoInnerPanek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PaymentInfojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(esalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(ebankno))
                .addGap(30, 30, 30)
                .addGroup(PaymentInfojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(ebankID))
                .addGap(0, 39, Short.MAX_VALUE))
        );

        RejectRequest_jButton.setText("Reject");
        RejectRequest_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejectRequest_jButtonActionPerformed(evt);
            }
        });

        AcceptRequest_jButton.setText("Accept");
        AcceptRequest_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcceptRequest_jButtonMouseClicked(evt);
            }
        });
        AcceptRequest_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptRequest_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(AcceptRequest_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RejectRequest_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 962, Short.MAX_VALUE))
                    .addComponent(PersonalInfo_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmployeeInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaymentInfojPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PersonalInfo_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmployeeInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PaymentInfojPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AcceptRequest_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RejectRequest_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AccountRequest_jPanelLayout = new javax.swing.GroupLayout(AccountRequest_jPanel);
        AccountRequest_jPanel.setLayout(AccountRequest_jPanelLayout);
        AccountRequest_jPanelLayout.setHorizontalGroup(
            AccountRequest_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountRequest_jPanelLayout.createSequentialGroup()
                .addGroup(AccountRequest_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AccountRequest_jPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(AccountRequest_jPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(AccountRequest_jPanelLayout.createSequentialGroup()
                .addGap(493, 493, 493)
                .addGroup(AccountRequest_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AccountRequest_jPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AccountRequest_jPanelLayout.setVerticalGroup(
            AccountRequest_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccountRequest_jPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", AccountRequest_jPanel);

        ClaimsRequestjPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("CLAIMS REQUESTS");

        OtherClaimsRequestTable.setBackground(new java.awt.Color(204, 204, 255));
        OtherClaimsRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        OtherClaimsRequestTable.setGridColor(new java.awt.Color(204, 204, 255));
        jScrollPane2.setViewportView(OtherClaimsRequestTable);

        OvertimeClaimsRequestTable.setBackground(new java.awt.Color(204, 204, 255));
        OvertimeClaimsRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        OvertimeClaimsRequestTable.setGridColor(new java.awt.Color(204, 204, 255));
        jScrollPane3.setViewportView(OvertimeClaimsRequestTable);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Overtime Claims");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Others Claims");

        RejectOvertimeClaimsButton.setText("Reject");
        RejectOvertimeClaimsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejectOvertimeClaimsButtonActionPerformed(evt);
            }
        });

        AcceptOtherClaimsButton.setText("Accept");
        AcceptOtherClaimsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptOtherClaimsButtonActionPerformed(evt);
            }
        });

        AcceptOvertimeClaimsButton.setText("Accept");
        AcceptOvertimeClaimsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptOvertimeClaimsButtonActionPerformed(evt);
            }
        });

        RejectOtherClaimsButton.setText("Reject");
        RejectOtherClaimsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejectOtherClaimsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClaimsRequestjPanelLayout = new javax.swing.GroupLayout(ClaimsRequestjPanel);
        ClaimsRequestjPanel.setLayout(ClaimsRequestjPanelLayout);
        ClaimsRequestjPanelLayout.setHorizontalGroup(
            ClaimsRequestjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClaimsRequestjPanelLayout.createSequentialGroup()
                .addGroup(ClaimsRequestjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClaimsRequestjPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27))
                    .addGroup(ClaimsRequestjPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(ClaimsRequestjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addGap(18, 18, 18)
                        .addGroup(ClaimsRequestjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ClaimsRequestjPanelLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(AcceptOvertimeClaimsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RejectOvertimeClaimsButton)
                        .addGap(460, 460, 460)
                        .addComponent(AcceptOtherClaimsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RejectOtherClaimsButton)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        ClaimsRequestjPanelLayout.setVerticalGroup(
            ClaimsRequestjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClaimsRequestjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClaimsRequestjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ClaimsRequestjPanelLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ClaimsRequestjPanelLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(ClaimsRequestjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AcceptOtherClaimsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RejectOvertimeClaimsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AcceptOvertimeClaimsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RejectOtherClaimsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", ClaimsRequestjPanel);

        PaymentSettingsjPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("Payment Settings");

        jPanel16.setBackground(new java.awt.Color(236, 236, 246));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel31.setText("Below are the set payment percentages and ratio's in relation to the payment of employees");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Overtime Rate Pay Ratio");

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Ratio towards hourly rate of employee that will be multiplied ");

        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("with the ratio when overtime is incurred.");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText(":");

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Current ");

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Value");

        OvertimeRatiotextfield.setText("0");

        OvertimeRatioUpdatejButton.setText("Update");
        OvertimeRatioUpdatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OvertimeRatioUpdatejButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel33))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel55)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel54)
                                        .addGap(7, 7, 7)))
                                .addComponent(jLabel53)
                                .addGap(18, 18, 18)
                                .addComponent(OvertimeRatiotextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(OvertimeRatioUpdatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel55))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OvertimeRatiotextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(OvertimeRatioUpdatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel22.setBackground(new java.awt.Color(0, 0, 0));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Kumpulan Wang Simpanan Pekerja (KWSP) : ");

        KWSPUpdatejButton.setText("Update");
        KWSPUpdatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KWSPUpdatejButtonActionPerformed(evt);
            }
        });

        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Percentage of base pay to be deduced for national pension fund");

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Current ");

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Value");

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText(":");

        KWSPjTextField.setText("0");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(KWSPUpdatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel32))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel63)
                                    .addComponent(jLabel62))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(KWSPjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel62)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel63)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64)
                            .addComponent(KWSPjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(KWSPUpdatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel18.setBackground(new java.awt.Color(0, 0, 0));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Monthly Tax Deduction Scheme (MTD):");

        MTDUpdatejButton.setText("Update");
        MTDUpdatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MTDUpdatejButtonActionPerformed(evt);
            }
        });

        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Percentage of base pay to be deduced for MTD");

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Current ");

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Value");

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText(":");

        MTDjTextField.setText("0");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(MTDUpdatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel34))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel67)
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(jLabel66)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel68)))
                                .addGap(12, 12, 12)
                                .addComponent(MTDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MTDUpdatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(MTDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel68))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel66)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel67)))
                        .addContainerGap(61, Short.MAX_VALUE))))
        );

        jPanel23.setBackground(new java.awt.Color(0, 0, 0));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Absent Without Leave Ratio");

        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Ratio towards hourly rate of employee that will be multiplied ");

        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("with the ratio when absence without leave is incurred.");

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Current ");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Value");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText(":");

        AbsentWithoutleaveRatiojTextField.setText("0");

        AbsentWithoutLeaveRatiojButton.setText("Update");
        AbsentWithoutLeaveRatiojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbsentWithoutLeaveRatiojButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel44))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel59))
                                .addGap(4, 4, 4)
                                .addComponent(jLabel60)
                                .addGap(18, 18, 18)
                                .addComponent(AbsentWithoutleaveRatiojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(AbsentWithoutLeaveRatiojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel59)
                        .addGap(16, 16, 16)
                        .addComponent(AbsentWithoutLeaveRatiojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AbsentWithoutleaveRatiojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 1136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PaymentSettingsjPanelLayout = new javax.swing.GroupLayout(PaymentSettingsjPanel);
        PaymentSettingsjPanel.setLayout(PaymentSettingsjPanelLayout);
        PaymentSettingsjPanelLayout.setHorizontalGroup(
            PaymentSettingsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentSettingsjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaymentSettingsjPanelLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1074, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        PaymentSettingsjPanelLayout.setVerticalGroup(
            PaymentSettingsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentSettingsjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", PaymentSettingsjPanel);

        RegistredUserListJpanel.setBackground(new java.awt.Color(255, 255, 255));

        RegistredUserListLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RegistredUserListLabel.setText("REGISTERED USER LIST");

        RegistredUserList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        RegistredUserList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegistredUserListMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(RegistredUserList);

        jPanel21.setBackground(new java.awt.Color(236, 236, 246));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("DETAILS");

        PersonalInfo_panel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("First Name:");

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Last Name:");

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Telephone Num:");

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Email:");

        personalInfoInnerPanel1.setBackground(new java.awt.Color(0, 0, 0));

        EmpInfo_jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        EmpInfo_jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        EmpInfo_jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        EmpInfo_jLabel3.setText("Personal Info");

        javax.swing.GroupLayout personalInfoInnerPanel1Layout = new javax.swing.GroupLayout(personalInfoInnerPanel1);
        personalInfoInnerPanel1.setLayout(personalInfoInnerPanel1Layout);
        personalInfoInnerPanel1Layout.setHorizontalGroup(
            personalInfoInnerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalInfoInnerPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EmpInfo_jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        personalInfoInnerPanel1Layout.setVerticalGroup(
            personalInfoInnerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personalInfoInnerPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(EmpInfo_jLabel3)
                .addContainerGap())
        );

        empFirst.setText("X");

        empLast.setText("X");

        empPhone.setText("X");

        empEmail.setText("X");

        javax.swing.GroupLayout PersonalInfo_panel1Layout = new javax.swing.GroupLayout(PersonalInfo_panel1);
        PersonalInfo_panel1.setLayout(PersonalInfo_panel1Layout);
        PersonalInfo_panel1Layout.setHorizontalGroup(
            PersonalInfo_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(personalInfoInnerPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PersonalInfo_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PersonalInfo_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersonalInfo_panel1Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empFirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PersonalInfo_panel1Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonalInfo_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addGroup(PersonalInfo_panel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel41)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PersonalInfo_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersonalInfo_panel1Layout.createSequentialGroup()
                        .addComponent(empPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(empEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(293, 293, 293))
        );
        PersonalInfo_panel1Layout.setVerticalGroup(
            PersonalInfo_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonalInfo_panel1Layout.createSequentialGroup()
                .addComponent(personalInfoInnerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PersonalInfo_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel38)
                    .addComponent(empFirst)
                    .addComponent(empPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonalInfo_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel41)
                    .addComponent(empLast)
                    .addComponent(empEmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EmployeeInfoPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Employee ID:");

        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Department/Team:");

        EmployeeInfoInnerPanel1.setBackground(new java.awt.Color(0, 0, 0));

        EmpInfo_jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        EmpInfo_jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        EmpInfo_jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        EmpInfo_jLabel4.setText("Employee Info");

        javax.swing.GroupLayout EmployeeInfoInnerPanel1Layout = new javax.swing.GroupLayout(EmployeeInfoInnerPanel1);
        EmployeeInfoInnerPanel1.setLayout(EmployeeInfoInnerPanel1Layout);
        EmployeeInfoInnerPanel1Layout.setHorizontalGroup(
            EmployeeInfoInnerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeInfoInnerPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EmpInfo_jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EmployeeInfoInnerPanel1Layout.setVerticalGroup(
            EmployeeInfoInnerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmployeeInfoInnerPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(EmpInfo_jLabel4)
                .addContainerGap())
        );

        empDept.setText("X");

        empID.setText("X");

        javax.swing.GroupLayout EmployeeInfoPanel1Layout = new javax.swing.GroupLayout(EmployeeInfoPanel1);
        EmployeeInfoPanel1.setLayout(EmployeeInfoPanel1Layout);
        EmployeeInfoPanel1Layout.setHorizontalGroup(
            EmployeeInfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EmployeeInfoInnerPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EmployeeInfoPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empID, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empDept, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EmployeeInfoPanel1Layout.setVerticalGroup(
            EmployeeInfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeInfoPanel1Layout.createSequentialGroup()
                .addComponent(EmployeeInfoInnerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(EmployeeInfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(empDept)
                    .addComponent(empID))
                .addGap(24, 24, 24))
        );

        PaymentInfojPanel1.setBackground(new java.awt.Color(153, 153, 153));

        PaymentInfoInnerPanek1.setBackground(new java.awt.Color(0, 0, 0));

        EmpInfo_jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        EmpInfo_jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        EmpInfo_jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        EmpInfo_jLabel5.setText("Payment Info");

        javax.swing.GroupLayout PaymentInfoInnerPanek1Layout = new javax.swing.GroupLayout(PaymentInfoInnerPanek1);
        PaymentInfoInnerPanek1.setLayout(PaymentInfoInnerPanek1Layout);
        PaymentInfoInnerPanek1Layout.setHorizontalGroup(
            PaymentInfoInnerPanek1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentInfoInnerPanek1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EmpInfo_jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PaymentInfoInnerPanek1Layout.setVerticalGroup(
            PaymentInfoInnerPanek1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaymentInfoInnerPanek1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(EmpInfo_jLabel5)
                .addContainerGap())
        );

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Bank Account Number:");

        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Bank Name:");

        empHourly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empHourlyActionPerformed(evt);
            }
        });

        jLabel50.setText("RM");

        empBankNo.setText("X");

        empBankID.setText("X");

        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("Base Salary:");

        jLabel94.setText("RM");

        empSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empSalaryActionPerformed(evt);
            }
        });

        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Base Hourly Rate:");

        javax.swing.GroupLayout PaymentInfojPanel1Layout = new javax.swing.GroupLayout(PaymentInfojPanel1);
        PaymentInfojPanel1.setLayout(PaymentInfojPanel1Layout);
        PaymentInfojPanel1Layout.setHorizontalGroup(
            PaymentInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentInfojPanel1Layout.createSequentialGroup()
                .addGroup(PaymentInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PaymentInfojPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(empBankID, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PaymentInfojPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(empBankNo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(193, 193, 193)
                .addGroup(PaymentInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PaymentInfojPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel94)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PaymentInfojPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empHourly, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(298, Short.MAX_VALUE))
            .addComponent(PaymentInfoInnerPanek1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PaymentInfojPanel1Layout.setVerticalGroup(
            PaymentInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentInfojPanel1Layout.createSequentialGroup()
                .addComponent(PaymentInfoInnerPanek1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PaymentInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(empHourly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50)
                    .addComponent(empBankNo)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PaymentInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaymentInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel93)
                        .addComponent(empSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel94))
                    .addGroup(PaymentInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel47)
                        .addComponent(empBankID)))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        UpdateAccountButton.setText("Update");
        UpdateAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateAccountButtonActionPerformed(evt);
            }
        });

        DeleteAccountButton.setText("Delete");
        DeleteAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(PersonalInfo_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmployeeInfoPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaymentInfojPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addComponent(DeleteAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(UpdateAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PersonalInfo_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EmployeeInfoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PaymentInfojPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout RegistredUserListJpanelLayout = new javax.swing.GroupLayout(RegistredUserListJpanel);
        RegistredUserListJpanel.setLayout(RegistredUserListJpanelLayout);
        RegistredUserListJpanelLayout.setHorizontalGroup(
            RegistredUserListJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistredUserListJpanelLayout.createSequentialGroup()
                .addGroup(RegistredUserListJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistredUserListJpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RegistredUserListLabel))
                    .addGroup(RegistredUserListJpanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(RegistredUserListJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        RegistredUserListJpanelLayout.setVerticalGroup(
            RegistredUserListJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistredUserListJpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegistredUserListLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("", RegistredUserListJpanel);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        EmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        EmployeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EmployeeTableMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(EmployeeTable);

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel79.setText("Leave Management ");

        jLabel80.setText("Employee List");

        jPanel26.setBackground(new java.awt.Color(236, 236, 246));
        jPanel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel81.setText("ABSENCE WITHOUT LEAVE");

        jLabel83.setText("FIRST NAME : ");

        jLabel84.setText("LAST NAME :");

        jLabel85.setText("EMPLOYEE ID:");

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel88.setText("UNPAID LEAVE");

        jLabel89.setText("Current:");

        jLabel90.setText("Current:");

        CurrentAbsentWOLeavcejTextField.setEditable(false);
        CurrentAbsentWOLeavcejTextField.setText("0");
        CurrentAbsentWOLeavcejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrentAbsentWOLeavcejTextFieldActionPerformed(evt);
            }
        });

        CurrentUnpaidLeavejTextField.setEditable(false);
        CurrentUnpaidLeavejTextField.setText("0");
        CurrentUnpaidLeavejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrentUnpaidLeavejTextFieldActionPerformed(evt);
            }
        });

        jLabel91.setText("Add Days without Leave :");

        jLabel92.setText("Add Unpaid Leave :");

        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ShowFirstNamejLabel.setText("X");

        ShowLasttNamejLabel1.setText("X");

        ShowEmpIDjLabel2.setText("X");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ShowLasttNamejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel83, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShowFirstNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ShowEmpIDjLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addGap(555, 555, 555)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18))))
                    .addComponent(jLabel81)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CurrentAbsentWOLeavcejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel91)
                        .addGap(18, 18, 18)
                        .addComponent(AddDaysWOleavejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CurrentUnpaidLeavejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel92)
                        .addGap(26, 26, 26)
                        .addComponent(AddUnpaidLeavejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(ShowFirstNamejLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(ShowLasttNamejLabel1))
                .addGap(13, 13, 13)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(ShowEmpIDjLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel81)
                .addGap(25, 25, 25)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(CurrentAbsentWOLeavcejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91)
                    .addComponent(AddDaysWOleavejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel88)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel90)
                            .addComponent(CurrentUnpaidLeavejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel92)
                            .addComponent(AddUnpaidLeavejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(83, 83, 83))
        );

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel82.setText("Employee Info");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel79)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(jLabel80)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82)
                            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel79)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel82)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", jPanel24);

        WelcomeBack.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        WelcomeBack.setText("WELCOME BACK ");

        jLabelHR_Admin_name.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelHR_Admin_name.setText("HR_ADMIN");

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        LogOutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        LogOutIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verticarborder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(WelcomeBack)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabelHR_Admin_name)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LogOutIcon))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verticarborder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogOutIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(WelcomeBack)
                        .addComponent(jLabelHR_Admin_name)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AccountRequestjPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountRequestjPanelMouseDragged

    }//GEN-LAST:event_AccountRequestjPanelMouseDragged

    private void AccountRequestjPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountRequestjPanelMouseMoved
        
    }//GEN-LAST:event_AccountRequestjPanelMouseMoved

    private void AccountRequestjPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountRequestjPanelMouseClicked
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_AccountRequestjPanelMouseClicked

    private void RejectRequest_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejectRequest_jButtonActionPerformed
        if(AccountRequestTable.getSelectedRow() != -1){
            try {
                app.deleteRequest(eID.getText());
                JOptionPane.showMessageDialog(null,"Rejected Request Successfully!");
            } catch (RemoteException ex) {
                Logger.getLogger(HRAdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please select request!");
        }
    }//GEN-LAST:event_RejectRequest_jButtonActionPerformed

    private void esalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_esalaryActionPerformed

    private void UpdateAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateAccountButtonActionPerformed
        try {
                String ID = (RegistredUserList.getValueAt(RegistredUserList.getSelectedRow(), 0)).toString();
                app.editEmpFile(ID, "salary",empSalary.getText());
                JOptionPane.showMessageDialog(null,"Updated User Successfully!");
            } catch (RemoteException ex) {
                Logger.getLogger(HRAdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_UpdateAccountButtonActionPerformed

    private void empHourlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empHourlyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empHourlyActionPerformed

    private void OvertimeRatioUpdatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OvertimeRatioUpdatejButtonActionPerformed
        try {
                app.editPaymentFile("overtime", OvertimeRatiotextfield.getText());
                JOptionPane.showMessageDialog(null,"Updated Overtime Field Successfully!");
            } catch (RemoteException ex) {
                Logger.getLogger(HRAdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_OvertimeRatioUpdatejButtonActionPerformed

    private void AbsentWithoutLeaveRatiojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbsentWithoutLeaveRatiojButtonActionPerformed
        try {
                app.editPaymentFile("absent", AbsentWithoutleaveRatiojTextField.getText());
                JOptionPane.showMessageDialog(null,"Updated Absent Field Successfully!");
            } catch (RemoteException ex) {
                Logger.getLogger(HRAdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_AbsentWithoutLeaveRatiojButtonActionPerformed

    private void KWSPUpdatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KWSPUpdatejButtonActionPerformed
        try {
                app.editPaymentFile("kwsp", KWSPjTextField.getText());
                JOptionPane.showMessageDialog(null,"Updated KWSP Field Successfully!");
            } catch (RemoteException ex) {
                Logger.getLogger(HRAdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_KWSPUpdatejButtonActionPerformed

    private void MTDUpdatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MTDUpdatejButtonActionPerformed
        try {
                app.editPaymentFile("mtd", MTDjTextField.getText());
                JOptionPane.showMessageDialog(null,"Updated MTD Field Successfully!");
            } catch (RemoteException ex) {
                Logger.getLogger(HRAdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_MTDUpdatejButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(EmployeeTable.getSelectedRow() != -1){
            try {
                String ID = (EmployeeTable.getValueAt(EmployeeTable.getSelectedRow(), 0)).toString();
                String value = Integer.toString(Integer.parseInt(AddUnpaidLeavejTextField.getText())+Integer.parseInt(CurrentUnpaidLeavejTextField.getText()));
                app.editEmpFile(ID, "absent",value);
                JOptionPane.showMessageDialog(null,"Updated User Successfully!");
            } catch (RemoteException ex) {
                Logger.getLogger(HRAdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(EmployeeTable.getSelectedRow() != -1){
            try {
                String ID = (EmployeeTable.getValueAt(EmployeeTable.getSelectedRow(), 0)).toString();
                String value = Integer.toString(Integer.parseInt(AddDaysWOleavejTextField.getText())+Integer.parseInt(CurrentAbsentWOLeavcejTextField.getText()));
                app.editEmpFile(ID, "absent",value);
                JOptionPane.showMessageDialog(null,"Updated User Successfully!");
            } catch (RemoteException ex) {
                Logger.getLogger(HRAdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CurrentAbsentWOLeavcejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrentAbsentWOLeavcejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CurrentAbsentWOLeavcejTextFieldActionPerformed

    private void CurrentUnpaidLeavejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrentUnpaidLeavejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CurrentUnpaidLeavejTextFieldActionPerformed

    private void empSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empSalaryActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            app = (appinterface) Naming.lookup("rmi://localhost:1040/assignment");
        } catch (NotBoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            jLabel76.setText(String.valueOf(app.getNoRequests()));
            jLabel73.setText(String.valueOf(app.getNoEmp()));
            jLabel75.setText(String.valueOf(app.getOtherClaims()));
            jLabel74.setText(String.valueOf(app.getOvertimeClaims()));
            ArrayList<String> paymentInfo = app.getPaymentInfo();
            OvertimeRatiotextfield.setText(paymentInfo.get(0));
            AbsentWithoutleaveRatiojTextField.setText(paymentInfo.get(1));
            KWSPjTextField.setText(paymentInfo.get(2));
            MTDjTextField.setText(paymentInfo.get(3));
            empID.setText("");
            empFirst.setText("");
            empLast.setText("");
            empPhone.setText("");
            empDept.setText("");
            empEmail.setText("");
            empBankNo.setText("");
            empBankID.setText("");
            empSalary.setText("");
            empHourly.setText("");
            CurrentAbsentWOLeavcejTextField.setText("0");
            CurrentUnpaidLeavejTextField.setText("0");
            AddDaysWOleavejTextField.setText("");
            AddUnpaidLeavejTextField.setText("");
            jLabelHR_Admin_name.setText(app.getLoggedUsername());
            
            ExecutorService executor = Executors.newFixedThreadPool(3); 

            executor.submit(() -> {
                try {
                    AccountRequestTable.setModel(new DefaultTableModel());
                    ArrayList<String> content = app.getReqFile();
                    String[] header = content.get(0).trim().split(",");
                    DefaultTableModel model = (DefaultTableModel) AccountRequestTable.getModel();
                    model.setColumnIdentifiers(header);
                    Object[] tableLines = content.subList(1, content.size()).toArray();
                    for (int i = 0; i < tableLines.length; i++) {
                        String line = tableLines[i].toString().trim();
                        String[] dataRow = line.split(",");
                        model.addRow(dataRow);
                    }
                } catch (IOException e) {
                    System.out.println("Incorrect File");
                }
            });

            executor.submit(() -> {
                try {
                    OtherClaimsRequestTable.setModel(new DefaultTableModel());
                    OvertimeClaimsRequestTable.setModel(new DefaultTableModel());
                    ArrayList<String> content = app.getClaimsFile();
                    String[] header = content.get(0).trim().split(",");
                    DefaultTableModel model = (DefaultTableModel) OtherClaimsRequestTable.getModel();
                    model.setColumnIdentifiers(header);
                    DefaultTableModel model2 = (DefaultTableModel) OvertimeClaimsRequestTable.getModel();
                    model2.setColumnIdentifiers(header);
                    Object[] tableLines = content.subList(1, content.size()).toArray();
                    for (int i = 0; i < tableLines.length; i++) {
                        String line = tableLines[i].toString().trim();
                        String[] dataRow = line.split(",");
                        if (dataRow[6].equals("pending")) {
                            if (dataRow[5].equals("other")) {
                                model.addRow(dataRow);
                            } else if (dataRow[5].equals("overtime")) {
                                model2.addRow(dataRow);
                            }
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Incorrect File");
                }
            });

            executor.submit(() -> {
                try {
                    RegistredUserList.setModel(new DefaultTableModel());
                    ArrayList<String> content = app.getEmpFile();
                    String[] header = content.get(0).trim().split(",");
                    DefaultTableModel model = (DefaultTableModel) RegistredUserList.getModel();
                    model.setColumnIdentifiers(header);
                    Object[] tableLines = content.subList(1, content.size()).toArray();
                    for (int i = 0; i < tableLines.length; i++) {
                        String line = tableLines[i].toString().trim();
                        String[] dataRow = line.split(",");
                        model.addRow(dataRow);
                    }
                } catch (IOException e) {
                    System.out.println("Incorrect File");
                }
            });
            
            executor.submit(() -> {
                try {
                    EmployeeTable.setModel(new DefaultTableModel());
                    ArrayList<String> content = app.getEmpFile();
                    String[] header = content.get(0).trim().split(",");
                    header = new String[]{header[0], header[1], header[2], header[11], header[12]};
                    DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
                    model.setColumnIdentifiers(header);
                    Object[] tableLines = content.subList(1, content.size()).toArray();
                    for (int i = 0; i < tableLines.length; i++) {
                        String line = tableLines[i].toString().trim();
                        String[] dataRow = line.split(",");
                        dataRow = new String[]{dataRow[0], dataRow[1], dataRow[2], dataRow[11], dataRow[12]};
                        model.addRow(dataRow);
                    }
                } catch (IOException e) {
                    System.out.println("Incorrect File");
                }
            });

            executor.shutdown();

        } catch (RemoteException ex) {
            Logger.getLogger(HRAdminHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void AccountRequestjPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountRequestjPanel1MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_AccountRequestjPanel1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseClicked
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jPanel19MouseClicked

    private void LogOutIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutIconMouseClicked
        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogOutIconMouseClicked

    private void AccountRequestTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountRequestTableMousePressed
        if(AccountRequestTable.getSelectedRow() != -1){
            eID.setText(AccountRequestTable.getValueAt(AccountRequestTable.getSelectedRow(), 0).toString());
            efirst.setText(AccountRequestTable.getValueAt(AccountRequestTable.getSelectedRow(), 1).toString());
            elast.setText(AccountRequestTable.getValueAt(AccountRequestTable.getSelectedRow(), 2).toString());
            ephone.setText(AccountRequestTable.getValueAt(AccountRequestTable.getSelectedRow(), 3).toString());
            edepartment.setText(AccountRequestTable.getValueAt(AccountRequestTable.getSelectedRow(), 4).toString());
            eemail.setText(AccountRequestTable.getValueAt(AccountRequestTable.getSelectedRow(), 5).toString());
            ebankno.setText(AccountRequestTable.getValueAt(AccountRequestTable.getSelectedRow(), 8).toString());
            ebankID.setText(AccountRequestTable.getValueAt(AccountRequestTable.getSelectedRow(), 9).toString());
        }
    }//GEN-LAST:event_AccountRequestTableMousePressed

    private void AcceptRequest_jButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcceptRequest_jButtonMouseClicked
        String username = (AccountRequestTable.getValueAt(AccountRequestTable.getSelectedRow(), 6)).toString();
        String password = (AccountRequestTable.getValueAt(AccountRequestTable.getSelectedRow(), 7)).toString();
        if(AccountRequestTable.getSelectedRow() != -1){
            try {
                app.acceptEmployee(eID.getText(), efirst.getText(), elast.getText(), ephone.getText(), edepartment.getText(), eemail.getText(), username, password, ebankno.getText(), ebankID.getText(), esalary.getText());
                app.deleteRequest(eID.getText());
                JOptionPane.showMessageDialog(null,"Accepted Request Successfully!");
            } catch (RemoteException ex) {
                Logger.getLogger(HRAdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please select request!");
        }
    }//GEN-LAST:event_AcceptRequest_jButtonMouseClicked

    private void AcceptRequest_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptRequest_jButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AcceptRequest_jButtonActionPerformed

    private void AcceptOvertimeClaimsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptOvertimeClaimsButtonActionPerformed
        if(OvertimeClaimsRequestTable.getSelectedRow() != -1){
            try {
                String ID = (OvertimeClaimsRequestTable.getValueAt(OvertimeClaimsRequestTable.getSelectedRow(), 0)).toString();
                app.editClaimsFile(ID, "accepted");
                JOptionPane.showMessageDialog(null,"Accepted Overtime Claim Successfully!");
            } catch (RemoteException ex) {
                Logger.getLogger(HRAdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please select claim!");
        }
    }//GEN-LAST:event_AcceptOvertimeClaimsButtonActionPerformed

    private void RejectOvertimeClaimsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejectOvertimeClaimsButtonActionPerformed
        if(OvertimeClaimsRequestTable.getSelectedRow() != -1){
            try {
                String ID = (OvertimeClaimsRequestTable.getValueAt(OvertimeClaimsRequestTable.getSelectedRow(), 0)).toString();
                app.editClaimsFile(ID, "rejected");
                JOptionPane.showMessageDialog(null,"Rejected Overtime Claim Successfully!");
            } catch (RemoteException ex) {
                Logger.getLogger(HRAdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please select claim!");
        }
    }//GEN-LAST:event_RejectOvertimeClaimsButtonActionPerformed

    private void AcceptOtherClaimsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptOtherClaimsButtonActionPerformed
        if(OtherClaimsRequestTable.getSelectedRow() != -1){
            try {
                String ID = (OtherClaimsRequestTable.getValueAt(OtherClaimsRequestTable.getSelectedRow(), 0)).toString();
                app.editClaimsFile(ID, "accepted");
                JOptionPane.showMessageDialog(null,"Accepted Other Claim Successfully!");
            } catch (RemoteException ex) {
                Logger.getLogger(HRAdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please select claim!");
        }
    }//GEN-LAST:event_AcceptOtherClaimsButtonActionPerformed

    private void RejectOtherClaimsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejectOtherClaimsButtonActionPerformed
        if(OtherClaimsRequestTable.getSelectedRow() != -1){
            try {
                String ID = (OtherClaimsRequestTable.getValueAt(OtherClaimsRequestTable.getSelectedRow(), 0)).toString();
                app.editClaimsFile(ID, "rejected");
                JOptionPane.showMessageDialog(null,"Rejected Other Claim Successfully!");
            } catch (RemoteException ex) {
                Logger.getLogger(HRAdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please select claim!");
        }
    }//GEN-LAST:event_RejectOtherClaimsButtonActionPerformed

    private void RegistredUserListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistredUserListMousePressed
        if(RegistredUserList.getSelectedRow() != -1){
            empID.setText(RegistredUserList.getValueAt(RegistredUserList.getSelectedRow(), 0).toString());
            empFirst.setText(RegistredUserList.getValueAt(RegistredUserList.getSelectedRow(), 1).toString());
            empLast.setText(RegistredUserList.getValueAt(RegistredUserList.getSelectedRow(), 2).toString());
            empPhone.setText(RegistredUserList.getValueAt(RegistredUserList.getSelectedRow(), 3).toString());
            empDept.setText(RegistredUserList.getValueAt(RegistredUserList.getSelectedRow(), 4).toString());
            empEmail.setText(RegistredUserList.getValueAt(RegistredUserList.getSelectedRow(), 5).toString());
            empBankNo.setText(RegistredUserList.getValueAt(RegistredUserList.getSelectedRow(), 8).toString());
            empBankID.setText(RegistredUserList.getValueAt(RegistredUserList.getSelectedRow(), 9).toString());
            String salary = RegistredUserList.getValueAt(RegistredUserList.getSelectedRow(), 10).toString();
            empSalary.setText(salary);
            empHourly.setText(Integer.toString(Integer.parseInt(salary)/160));
        }
    }//GEN-LAST:event_RegistredUserListMousePressed

    private void DeleteAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAccountButtonActionPerformed
        try {
                String ID = (RegistredUserList.getValueAt(RegistredUserList.getSelectedRow(), 0)).toString();
                app.deleteEmpUser(ID);
                JOptionPane.showMessageDialog(null,"Deleted User Successfully!");
            } catch (RemoteException ex) {
                Logger.getLogger(HRAdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_DeleteAccountButtonActionPerformed

    private void EmployeeTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeTableMousePressed
        if(EmployeeTable.getSelectedRow() != -1){
            ShowEmpIDjLabel2.setText(EmployeeTable.getValueAt(EmployeeTable.getSelectedRow(), 0).toString());
            ShowFirstNamejLabel.setText(EmployeeTable.getValueAt(EmployeeTable.getSelectedRow(), 1).toString());
            ShowLasttNamejLabel1.setText(EmployeeTable.getValueAt(EmployeeTable.getSelectedRow(), 2).toString());
            CurrentAbsentWOLeavcejTextField.setText(EmployeeTable.getValueAt(EmployeeTable.getSelectedRow(), 3).toString());
            CurrentUnpaidLeavejTextField.setText(EmployeeTable.getValueAt(EmployeeTable.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_EmployeeTableMousePressed

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
            java.util.logging.Logger.getLogger(HRAdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HRAdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HRAdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HRAdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HRAdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbsentWithoutLeaveRatiojButton;
    private javax.swing.JTextField AbsentWithoutleaveRatiojTextField;
    private javax.swing.JButton AcceptOtherClaimsButton;
    private javax.swing.JButton AcceptOvertimeClaimsButton;
    private javax.swing.JButton AcceptRequest_jButton;
    private javax.swing.JLabel AccountRequest;
    private javax.swing.JLabel AccountRequest1;
    private javax.swing.JLabel AccountRequest2;
    private javax.swing.JLabel AccountRequest3;
    private javax.swing.JLabel AccountRequest4;
    private javax.swing.JLabel AccountRequest5;
    private javax.swing.JLabel AccountRequest6;
    private javax.swing.JLabel AccountRequest7;
    private javax.swing.JLabel AccountRequest8;
    private javax.swing.JTable AccountRequestTable;
    private javax.swing.JPanel AccountRequest_jPanel;
    private javax.swing.JPanel AccountRequestjPanel;
    private javax.swing.JPanel AccountRequestjPanel1;
    private javax.swing.JTextField AddDaysWOleavejTextField;
    private javax.swing.JTextField AddUnpaidLeavejTextField;
    private javax.swing.JLabel ClaimRequesr;
    private javax.swing.JPanel ClaimsRequestjPanel;
    private javax.swing.JTextField CurrentAbsentWOLeavcejTextField;
    private javax.swing.JTextField CurrentUnpaidLeavejTextField;
    private javax.swing.JButton DeleteAccountButton;
    private javax.swing.JLabel EmpInfo_jLabel;
    private javax.swing.JLabel EmpInfo_jLabel1;
    private javax.swing.JLabel EmpInfo_jLabel2;
    private javax.swing.JLabel EmpInfo_jLabel3;
    private javax.swing.JLabel EmpInfo_jLabel4;
    private javax.swing.JLabel EmpInfo_jLabel5;
    private javax.swing.JPanel EmployeeInfoInnerPanel;
    private javax.swing.JPanel EmployeeInfoInnerPanel1;
    private javax.swing.JPanel EmployeeInfoPanel;
    private javax.swing.JPanel EmployeeInfoPanel1;
    private javax.swing.JTable EmployeeTable;
    private javax.swing.JButton KWSPUpdatejButton;
    private javax.swing.JTextField KWSPjTextField;
    private javax.swing.JLabel LogOutIcon;
    private javax.swing.JButton MTDUpdatejButton;
    private javax.swing.JTextField MTDjTextField;
    private javax.swing.JTable OtherClaimsRequestTable;
    private javax.swing.JTable OvertimeClaimsRequestTable;
    private javax.swing.JButton OvertimeRatioUpdatejButton;
    private javax.swing.JTextField OvertimeRatiotextfield;
    private javax.swing.JPanel PaymentInfoInnerPanek;
    private javax.swing.JPanel PaymentInfoInnerPanek1;
    private javax.swing.JPanel PaymentInfojPanel;
    private javax.swing.JPanel PaymentInfojPanel1;
    private javax.swing.JPanel PaymentSettingsjPanel;
    private javax.swing.JPanel PersonalInfo_panel;
    private javax.swing.JPanel PersonalInfo_panel1;
    private javax.swing.JTable RegistredUserList;
    private javax.swing.JPanel RegistredUserListJpanel;
    private javax.swing.JLabel RegistredUserListLabel;
    private javax.swing.JButton RejectOtherClaimsButton;
    private javax.swing.JButton RejectOvertimeClaimsButton;
    private javax.swing.JButton RejectRequest_jButton;
    private javax.swing.JLabel ShowEmpIDjLabel2;
    private javax.swing.JLabel ShowFirstNamejLabel;
    private javax.swing.JLabel ShowLasttNamejLabel1;
    private javax.swing.JButton UpdateAccountButton;
    private javax.swing.JLabel WelcomeBack;
    private javax.swing.JLabel eID;
    private javax.swing.JLabel ebankID;
    private javax.swing.JLabel ebankno;
    private javax.swing.JLabel edepartment;
    private javax.swing.JLabel eemail;
    private javax.swing.JLabel efirst;
    private javax.swing.JLabel elast;
    private javax.swing.JLabel empBankID;
    private javax.swing.JLabel empBankNo;
    private javax.swing.JLabel empDept;
    private javax.swing.JLabel empEmail;
    private javax.swing.JLabel empFirst;
    private javax.swing.JTextField empHourly;
    private javax.swing.JLabel empID;
    private javax.swing.JLabel empLast;
    private javax.swing.JLabel empPhone;
    private javax.swing.JTextField empSalary;
    private javax.swing.JLabel ephone;
    private javax.swing.JTextField esalary;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabelHR_Admin_name;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel personalInfoInnerPanel;
    private javax.swing.JPanel personalInfoInnerPanel1;
    private javax.swing.JPanel verticarborder1;
    // End of variables declaration//GEN-END:variables
}
