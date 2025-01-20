package com.mattressapp.view;

import com.mattressapp.controller.algorithms.SelectionSort;
import com.mattressapp.model.MattressModel;
import com.mattressapp.util.ValidationUtil;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import com.mattressapp.controller.algorithms.InsertionSort;
import com.mattressapp.controller.algorithms.MergeSort;
import com.mattressapp.controller.algorithms.BinarySearch;

/**
 *
 * @author 23048585ManishDhakal
 */
public class MattressApp extends javax.swing.JFrame {

    private java.awt.CardLayout cardLayout;
    private final Color errorColor = new Color(255, 51, 0);
    private final Color grayColor = new Color(155,155,155);
    private final SelectionSort selectionSort;
    private final InsertionSort insertionSort = new InsertionSort();
    private final MergeSort mergeSort = new MergeSort();
    private final BinarySearch binarySearch = new BinarySearch();


    /**
     * Creates new form MattressApp
     */
    public MattressApp() {
        initComponents();
        //validationUtil = new ValidationUtil();
        initializeLayout(); // Set up CardLayout and add screens
        
        startProgress(); // Show loading screen and initiate progress  
        selectionSort = new SelectionSort();
        preloadTableData();
        setupRowSelectionListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainScreen = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        tabPaneMain = new javax.swing.JTabbedPane();
        pnlHome = new javax.swing.JPanel();
        lblHomebg = new javax.swing.JLabel();
        bthAboutUS = new javax.swing.JButton();
        lblCompanySlogan = new javax.swing.JLabel();
        lblOurProducts = new javax.swing.JLabel();
        lblSoft = new javax.swing.JLabel();
        lblHard = new javax.swing.JLabel();
        lblMemory = new javax.swing.JLabel();
        lblPillows = new javax.swing.JLabel();
        lblSoftdesc = new javax.swing.JLabel();
        lblHarddesc = new javax.swing.JLabel();
        lblMemorydesc = new javax.swing.JLabel();
        lblpillowdesc = new javax.swing.JLabel();
        pnlAboutUs = new javax.swing.JPanel();
        lblAboutUs = new javax.swing.JLabel();
        lblAboutUsheading = new javax.swing.JLabel();
        lblAboutUsbg = new javax.swing.JLabel();
        pnlProductList = new javax.swing.JPanel();
        spTblOrder = new javax.swing.JScrollPane();
        ProductTbl = new javax.swing.JTable();
        lblTblCartTitle = new javax.swing.JLabel();
        PnlDeliveredForm = new javax.swing.JPanel();
        TxtProductID = new javax.swing.JTextField();
        TxtCustName = new javax.swing.JTextField();
        TxtQuantity = new javax.swing.JTextField();
        TxtCustAddress = new javax.swing.JTextField();
        TxtCustPh = new javax.swing.JTextField();
        lblErrorMsgProductID = new javax.swing.JLabel();
        lblErrorMsgCustName = new javax.swing.JLabel();
        lblErrorMsgAddress = new javax.swing.JLabel();
        lblErrorMsgCustPh = new javax.swing.JLabel();
        lblErrorMsgQuantity = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        ComboProName = new javax.swing.JComboBox<>();
        ProductNameLbl = new javax.swing.JLabel();
        ProductPriceLbl = new javax.swing.JLabel();
        ComboProPrice = new javax.swing.JComboBox<>();
        ClearBtn = new javax.swing.JButton();
        lblErrorMsgProName = new javax.swing.JLabel();
        lblErrorMsgProPrice = new javax.swing.JLabel();
        ComboSort = new javax.swing.JComboBox<>();
        lblSort = new javax.swing.JLabel();
        btnSortAscending = new javax.swing.JButton();
        btnSortDescending = new javax.swing.JButton();
        LblSearchCustName = new javax.swing.JLabel();
        TxtSearchCustName = new javax.swing.JTextField();
        BtnSearchCustName = new javax.swing.JButton();
        lblErrorMsgSearch = new javax.swing.JLabel();
        lblErrorMsgSort = new javax.swing.JLabel();
        lblDeliveredData = new javax.swing.JLabel();
        lblSlogan = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        pnlLoginScreen = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblLoginTitle = new javax.swing.JLabel();
        txtFldLoginUsername = new javax.swing.JTextField();
        pwdFldLogin = new javax.swing.JPasswordField();
        lblLoginSubTitle = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblLoginError = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlLoadingScreen = new javax.swing.JPanel();
        pgBarSplashScreen = new javax.swing.JProgressBar(0,100);
        lblLoading = new javax.swing.JLabel();
        lblMainLogo = new javax.swing.JLabel();

        pnlMainScreen.setBackground(new java.awt.Color(153, 153, 153));
        pnlMainScreen.setMaximumSize(new java.awt.Dimension(1116, 735));
        pnlMainScreen.setMinimumSize(new java.awt.Dimension(1116, 735));
        pnlMainScreen.setPreferredSize(new java.awt.Dimension(1116, 735));
        pnlMainScreen.setRequestFocusEnabled(false);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mattressapp/resources/image-removebg-preview (2) (1).png"))); // NOI18N

        tabPaneMain.setBackground(new java.awt.Color(204, 204, 204));
        tabPaneMain.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabPaneMain.setMaximumSize(new java.awt.Dimension(1130, 514));
        tabPaneMain.setMinimumSize(new java.awt.Dimension(1130, 514));
        tabPaneMain.setPreferredSize(new java.awt.Dimension(1130, 514));

        pnlHome.setBackground(new java.awt.Color(51, 51, 51));
        pnlHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 192, 32)));
        pnlHome.setPreferredSize(new java.awt.Dimension(1101, 621));
        pnlHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHomebg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mattressapp/resources/Bed Mattress 3D Model and Animation Commercial Video  (1).gif"))); // NOI18N
        pnlHome.add(lblHomebg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 410));
        lblHomebg.getAccessibleContext().setAccessibleName("");

        bthAboutUS.setBackground(new java.awt.Color(102, 0, 102));
        bthAboutUS.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        bthAboutUS.setForeground(new java.awt.Color(255, 255, 255));
        bthAboutUS.setText("Learn More");
        bthAboutUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthAboutUSActionPerformed(evt);
            }
        });
        pnlHome.add(bthAboutUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, 150, 40));

        lblCompanySlogan.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblCompanySlogan.setForeground(new java.awt.Color(255, 255, 255));
        lblCompanySlogan.setText("Radiant Dreams - Better Sleep, Healthier Life");
        pnlHome.add(lblCompanySlogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, -1, -1));

        lblOurProducts.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblOurProducts.setForeground(new java.awt.Color(255, 255, 255));
        lblOurProducts.setText("Our Products");
        pnlHome.add(lblOurProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        lblSoft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mattressapp/resources/normal mattress.png"))); // NOI18N
        lblSoft.setText("jLabel10");
        pnlHome.add(lblSoft, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 120, 120));

        lblHard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mattressapp/resources/hard mattress.png"))); // NOI18N
        lblHard.setText("jLabel11");
        pnlHome.add(lblHard, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 120, 120));

        lblMemory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mattressapp/resources/memoryfoam.png"))); // NOI18N
        lblMemory.setText("jLabel12");
        pnlHome.add(lblMemory, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 120, 120));

        lblPillows.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mattressapp/resources/pillowsandbeddings.png"))); // NOI18N
        lblPillows.setText("jLabel13");
        pnlHome.add(lblPillows, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 120, 120));

        lblSoftdesc.setForeground(new java.awt.Color(204, 204, 204));
        lblSoftdesc.setText("<html>Name: Soft Mattress<br>Price: 20000");
        pnlHome.add(lblSoftdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        lblHarddesc.setForeground(new java.awt.Color(204, 204, 204));
        lblHarddesc.setText("<html>Name: Hard Mattress\n<br>Price: 15000");
        pnlHome.add(lblHarddesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, -1, -1));

        lblMemorydesc.setForeground(new java.awt.Color(204, 204, 204));
        lblMemorydesc.setText("<html>Name: Memory Foam Mattress<br>Price: 40000");
        pnlHome.add(lblMemorydesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, -1, -1));

        lblpillowdesc.setForeground(new java.awt.Color(204, 204, 204));
        lblpillowdesc.setText("<html>Name: Pillows and Bedding<br>Price: 10000");
        pnlHome.add(lblpillowdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, -1, -1));

        tabPaneMain.addTab("Home", pnlHome);

        pnlAboutUs.setBackground(new java.awt.Color(255, 255, 255));
        pnlAboutUs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 192, 32)));
        pnlAboutUs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAboutUs.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAboutUs.setText("<html>Welcome to Radiant Dreams, your trusted partner for a better sleep experience.<br> We specialize in providing high-quality mattresses and bedding products tailored to suit your needs. <br>Our mission is to ensure you wake up feeling refreshed and ready to take on the day.<br> With a wide range of products, exceptional customer service, and a commitment to quality, <br>Radiant Dreams strives to make every night a restful one.<br><br> <br>  Explore our app to find the perfect mattress and bedding solutions designed just for you!");
        pnlAboutUs.add(lblAboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, 260));

        lblAboutUsheading.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAboutUsheading.setText("ABOUT US");
        pnlAboutUs.add(lblAboutUsheading, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        lblAboutUsbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mattressapp/resources/About us.png"))); // NOI18N
        lblAboutUsbg.setText("jLabel7");
        pnlAboutUs.add(lblAboutUsbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1100, 670));

        tabPaneMain.addTab("About Us", pnlAboutUs);

        pnlProductList.setBackground(new java.awt.Color(204, 204, 204));

        ProductTbl.setBackground(new java.awt.Color(204, 204, 204));
        ProductTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Customer Name", "Customer Ph.No.", "Customer Address", "Product Quantity", "Product Name", "Product Price"
            }
        ));
        ProductTbl.setGridColor(new java.awt.Color(0, 0, 0));
        ProductTbl.setSelectionBackground(new java.awt.Color(0, 0, 0));
        ProductTbl.setSelectionForeground(new java.awt.Color(234, 192, 32));
        ProductTbl.setShowGrid(true);
        ProductTbl.getTableHeader().setReorderingAllowed(false);
        spTblOrder.setViewportView(ProductTbl);
        if (ProductTbl.getColumnModel().getColumnCount() > 0) {
            ProductTbl.getColumnModel().getColumn(0).setResizable(false);
            ProductTbl.getColumnModel().getColumn(1).setResizable(false);
            ProductTbl.getColumnModel().getColumn(2).setResizable(false);
            ProductTbl.getColumnModel().getColumn(3).setResizable(false);
            ProductTbl.getColumnModel().getColumn(4).setResizable(false);
            ProductTbl.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        lblTblCartTitle.setBackground(new java.awt.Color(234, 192, 32));
        lblTblCartTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        PnlDeliveredForm.setBackground(new java.awt.Color(255, 255, 255));
        PnlDeliveredForm.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2), "Products Ordered By Customers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        TxtProductID.setForeground(new java.awt.Color(153, 153, 153));
        TxtProductID.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2), "Product ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        TxtProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtProductIDActionPerformed(evt);
            }
        });

        TxtCustName.setForeground(new java.awt.Color(153, 153, 153));
        TxtCustName.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2), "Customer Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        TxtQuantity.setForeground(new java.awt.Color(153, 153, 153));
        TxtQuantity.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2), "Quantity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        TxtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtQuantityActionPerformed(evt);
            }
        });

        TxtCustAddress.setForeground(new java.awt.Color(153, 153, 153));
        TxtCustAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true), "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        TxtCustAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCustAddressActionPerformed(evt);
            }
        });

        TxtCustPh.setForeground(new java.awt.Color(153, 153, 153));
        TxtCustPh.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2), "Customer Ph.No.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        TxtCustPh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCustPhActionPerformed(evt);
            }
        });

        lblErrorMsgProductID.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblErrorMsgProductID.setForeground(new java.awt.Color(255, 51, 0));

        lblErrorMsgCustName.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblErrorMsgCustName.setForeground(new java.awt.Color(255, 51, 0));

        lblErrorMsgAddress.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblErrorMsgAddress.setForeground(new java.awt.Color(255, 51, 0));

        lblErrorMsgCustPh.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblErrorMsgCustPh.setForeground(new java.awt.Color(255, 51, 0));

        lblErrorMsgQuantity.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblErrorMsgQuantity.setForeground(new java.awt.Color(255, 51, 0));

        btnUpdate.setBackground(new java.awt.Color(153, 153, 153));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(153, 153, 153));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 153, 153));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        ComboProName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Soft Mattress", "Hard Mattress", "Memory Foam Mattress", "Pillows and Bedding" }));
        ComboProName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboProNameActionPerformed(evt);
            }
        });

        ProductNameLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProductNameLbl.setForeground(new java.awt.Color(153, 153, 153));
        ProductNameLbl.setText("Product Name");

        ProductPriceLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProductPriceLbl.setForeground(new java.awt.Color(153, 153, 153));
        ProductPriceLbl.setText("Product Price");

        ComboProPrice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "20000", "15000", "40000", "10000" }));
        ComboProPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboProPriceActionPerformed(evt);
            }
        });

        ClearBtn.setBackground(new java.awt.Color(153, 153, 153));
        ClearBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ClearBtn.setText("Clear");
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        lblErrorMsgProName.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblErrorMsgProName.setForeground(new java.awt.Color(255, 51, 0));

        lblErrorMsgProPrice.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblErrorMsgProPrice.setForeground(new java.awt.Color(255, 51, 0));

        ComboSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Sort by Product ID", "Sort by Customer Name", "Sort by Customer Address", "" }));
        ComboSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboSortActionPerformed(evt);
            }
        });

        lblSort.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSort.setForeground(new java.awt.Color(153, 153, 153));
        lblSort.setText("Sort By:");

        btnSortAscending.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSortAscending.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mattressapp/resources/ascending-sort.png"))); // NOI18N
        btnSortAscending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortAscendingActionPerformed(evt);
            }
        });

        btnSortDescending.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSortDescending.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mattressapp/resources/descendingsort.png"))); // NOI18N
        btnSortDescending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortDescendingActionPerformed(evt);
            }
        });

        LblSearchCustName.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblSearchCustName.setForeground(new java.awt.Color(153, 153, 153));
        LblSearchCustName.setText("Search Customer name");

        TxtSearchCustName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSearchCustNameActionPerformed(evt);
            }
        });

        BtnSearchCustName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnSearchCustName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mattressapp/resources/search (1).png"))); // NOI18N
        BtnSearchCustName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchCustNameActionPerformed(evt);
            }
        });

        lblErrorMsgSearch.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        lblErrorMsgSort.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        javax.swing.GroupLayout PnlDeliveredFormLayout = new javax.swing.GroupLayout(PnlDeliveredForm);
        PnlDeliveredForm.setLayout(PnlDeliveredFormLayout);
        PnlDeliveredFormLayout.setHorizontalGroup(
            PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDeliveredFormLayout.createSequentialGroup()
                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblErrorMsgProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorMsgCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtCustPh, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorMsgCustPh, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtCustAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorMsgAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                                .addComponent(LblSearchCustName)
                                .addGap(98, 98, 98)
                                .addComponent(lblSort, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                                .addComponent(TxtSearchCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnSearchCustName)
                                .addGap(30, 30, 30)
                                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblErrorMsgSort, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboSort, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate))
                            .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                                .addComponent(ClearBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete))))
                    .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnSortAscending, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSortDescending)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(52, 52, 52))
            .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblErrorMsgProName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProductNameLbl)
                            .addComponent(ComboProName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ProductPriceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboProPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblErrorMsgProPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                        .addComponent(TxtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(lblErrorMsgSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblErrorMsgQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlDeliveredFormLayout.setVerticalGroup(
            PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCustPh, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCustAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblErrorMsgCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblErrorMsgProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblErrorMsgAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                                        .addComponent(lblErrorMsgCustPh, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ClearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDeliveredFormLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDeliveredFormLayout.createSequentialGroup()
                                .addComponent(TxtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDeliveredFormLayout.createSequentialGroup()
                                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                                        .addComponent(ComboSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblErrorMsgSort, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnSortDescending, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(btnSortAscending, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31))))
                    .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                        .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LblSearchCustName)
                                    .addComponent(lblSort))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtSearchCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnSearchCustName))
                                .addGap(2, 2, 2)
                                .addComponent(lblErrorMsgSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(PnlDeliveredFormLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ProductNameLbl)
                                    .addComponent(ProductPriceLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ComboProName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboProPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblErrorMsgProName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDeliveredFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblErrorMsgQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblErrorMsgProPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
        );

        lblDeliveredData.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDeliveredData.setForeground(new java.awt.Color(204, 204, 204));
        lblDeliveredData.setText("Delivered Orders Data");

        javax.swing.GroupLayout pnlProductListLayout = new javax.swing.GroupLayout(pnlProductList);
        pnlProductList.setLayout(pnlProductListLayout);
        pnlProductListLayout.setHorizontalGroup(
            pnlProductListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProductListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProductListLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblDeliveredData))
                    .addGroup(pnlProductListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PnlDeliveredForm, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, Short.MAX_VALUE)
                        .addComponent(spTblOrder)
                        .addComponent(lblTblCartTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pnlProductListLayout.setVerticalGroup(
            pnlProductListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductListLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(PnlDeliveredForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTblCartTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeliveredData)
                .addGap(4, 4, 4)
                .addComponent(spTblOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        tabPaneMain.addTab("Admin Dashboard", pnlProductList);

        lblSlogan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSlogan.setText("Radiant Dreams:  BETTER SLEEP, HEALTHIER LIFE");

        btnLogout.setBackground(new java.awt.Color(102, 102, 102));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainScreenLayout = new javax.swing.GroupLayout(pnlMainScreen);
        pnlMainScreen.setLayout(pnlMainScreenLayout);
        pnlMainScreenLayout.setHorizontalGroup(
            pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainScreenLayout.createSequentialGroup()
                .addComponent(tabPaneMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlMainScreenLayout.createSequentialGroup()
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSlogan, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194)
                .addComponent(btnLogout)
                .addGap(35, 35, 35))
        );
        pnlMainScreenLayout.setVerticalGroup(
            pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainScreenLayout.createSequentialGroup()
                .addGroup(pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSlogan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLogout)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPaneMain, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pnlLoginScreen.setBackground(new java.awt.Color(255, 255, 255));
        pnlLoginScreen.setMaximumSize(new java.awt.Dimension(1130, 514));
        pnlLoginScreen.setMinimumSize(new java.awt.Dimension(1130, 514));
        pnlLoginScreen.setPreferredSize(new java.awt.Dimension(1100, 735));
        pnlLoginScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLoginTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblLoginTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginTitle.setText("Sign in to Application");
        lblLoginTitle.setDoubleBuffered(true);
        jPanel2.add(lblLoginTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 36));

        txtFldLoginUsername.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFldLoginUsername.setText("admin");
        txtFldLoginUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtFldLoginUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldLoginUsernameActionPerformed(evt);
            }
        });
        jPanel2.add(txtFldLoginUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 230, 40));

        pwdFldLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pwdFldLogin.setText("admin");
        pwdFldLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.add(pwdFldLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 230, 40));

        lblLoginSubTitle.setBackground(new java.awt.Color(234, 192, 32));
        lblLoginSubTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLoginSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginSubTitle.setText("Please enter your login details below .");
        jPanel2.add(lblLoginSubTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 359, -1));

        btnLogin.setBackground(new java.awt.Color(102, 0, 102));
        btnLogin.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 240, 45));

        lblLoginError.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLoginError.setForeground(new java.awt.Color(255, 0, 0));
        lblLoginError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblLoginError, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 240, 14));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Username");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        pnlLoginScreen.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 400, 370));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mattressapp/resources/mat bg blur .png"))); // NOI18N
        pnlLoginScreen.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1100, 770));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1130, 514));
        setSize(new java.awt.Dimension(1130, 514));

        pnlLoadingScreen.setBackground(new java.awt.Color(255, 255, 255));
        pnlLoadingScreen.setPreferredSize(new java.awt.Dimension(1130, 500));

        pgBarSplashScreen.setStringPainted(true);
        pgBarSplashScreen.setForeground(new java.awt.Color(0, 0, 0));

        lblLoading.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLoading.setText("Loading...");

        lblMainLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mattressapp/resources/image-removebg-preview (2).png"))); // NOI18N

        javax.swing.GroupLayout pnlLoadingScreenLayout = new javax.swing.GroupLayout(pnlLoadingScreen);
        pnlLoadingScreen.setLayout(pnlLoadingScreenLayout);
        pnlLoadingScreenLayout.setHorizontalGroup(
            pnlLoadingScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoadingScreenLayout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addGroup(pnlLoadingScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoadingScreenLayout.createSequentialGroup()
                        .addComponent(lblMainLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(293, 293, 293))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoadingScreenLayout.createSequentialGroup()
                        .addGroup(pnlLoadingScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pgBarSplashScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLoading))
                        .addGap(340, 340, 340))))
        );
        pnlLoadingScreenLayout.setVerticalGroup(
            pnlLoadingScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoadingScreenLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblMainLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLoading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgBarSplashScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLoadingScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLoadingScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void preloadTableData() {
    DefaultTableModel model = (DefaultTableModel) ProductTbl.getModel();

    // Predefined data for the table
    MattressModel[] data = {
        new MattressModel(1001, "Ram Dhakal", "9800000001", "Kathmandu", (short) 2, "Soft Mattress", 20000),
        new MattressModel(1002, "Hari Dulal", "9800000002", "Pokhara", (short) 1, "Hard Mattress", 15000),
        new MattressModel(1003, "Suman Raut", "9800000003", "Lalitpur", (short) 3, "Memory Foam Mattress", 40000),
        new MattressModel(1004, "Shyam Shrestha", "9800000004", "Biratnagar", (short) 4, "Pillows and Bedding", 10000),
        new MattressModel(1005, "Sita Khatiwada", "9800000005", "Bhaktapur", (short) 2, "Hard Mattress", 15000),
        new MattressModel(1006, "Gita Singh", "9800000006", "Dharan", (short) 1, "Soft Mattress", 20000),
        new MattressModel(1007, "Subin Dulal", "9800000007", "Hetauda", (short) 5, "Memory Foam Mattress", 40000),
        new MattressModel(1008, "Bimarsha Pandey", "9800000008", "Chitwan", (short) 2, "Pillows and Bedding", 10000),
        new MattressModel(1009, "Raunak Ghale", "9800000009", "Birgunj", (short) 3, "Soft Mattress", 20000),
        new MattressModel(1010, "Munal Thakuri", "9800000010", "Itahari", (short) 4, "Hard Mattress", 15000)
    };

    // Populate the table using MattressModel getters
    for (MattressModel mattress : data) {
        model.addRow(new Object[]{
            mattress.getProductId(),
            mattress.getCustomerName(),
            mattress.getCustomerPhone(),
            mattress.getCustomerAddress(),
            mattress.getQuantity(),
            mattress.getProductName(),
            mattress.getProductPrice()
        });
    }
}


    /**
     * Initializes the layout of the application by setting up the CardLayout
     * and adding panels for different screens. Each panel is uniquely
     * identified for easy navigation between screens.
     */
    private void initializeLayout() {
        cardLayout = new java.awt.CardLayout();
        getContentPane().setLayout(cardLayout);

        // Add panels with unique identifiers
        getContentPane().add(pnlLoadingScreen, "LoadingScreen");
        getContentPane().add(pnlLoginScreen, "LoginScreen");
        getContentPane().add(pnlMainScreen, "MainScreen");

        // Start with the loading screen
        loadScreen("LoadingScreen");
    }

    /**
     * Initializes the application's data, including the student list and table.
     * Populates the student list with sample data for demonstration purposes.
     */

    /**
     * Simulates the loading progress using a SwingWorker thread. Updates a
     * progress bar incrementally and switches to the login screen upon
     * completion.
     */
    private void startProgress() {
        pgBarSplashScreen.setBackground(java.awt.Color.LIGHT_GRAY);

        javax.swing.SwingWorker<Void, Integer> worker = new javax.swing.SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(30); // Simulated delay for progress bar
                    publish(i); // Publish progress
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                int progress = chunks.get(chunks.size() - 1);
                pgBarSplashScreen.setValue(progress);
            }

            @Override
            protected void done() {
                loadScreen("LoginScreen"); // Switch to login screen
            }
        };
        worker.execute(); // Start the worker thread
    }



   //Switches the application screen to the specified screen name.

    private void loadScreen(String screenName) {
        cardLayout.show(getContentPane(), screenName);
    }

    /**
     * Event handler for the Add button action. Validates input fields, creates
     * a new student record if valid, and checks for duplicate LMU IDs before
     * adding the record to the student list.
     *
     
     */
    private boolean validateInputs() {
    boolean isValid = true;
    // Validate Product ID
    isValid &= validateField(TxtProductID, "Product ID", lblErrorMsgProductID,
            "<html>Must be a 4-digit number,<br>starting from 1.</html>",
            errorColor, grayColor, ValidationUtil.isValidProductId(TxtProductID.getText())
    );

    // Validate Customer Name
    isValid &= validateField(TxtCustName, "Customer Name", lblErrorMsgCustName, "Must contain only alphabets.",
            errorColor, grayColor, ValidationUtil.isValidCustomerName(TxtCustName.getText())
    );

    // Validate Customer Phone Number
    isValid &= validateField(TxtCustPh, "Customer Ph.No.", lblErrorMsgCustPh, "Must start with 98 and have 10 digits.",
            errorColor, grayColor, ValidationUtil.isValidContact(TxtCustPh.getText())
    );

    // Validate Address
    isValid &= validateField(TxtCustAddress, "Address", lblErrorMsgAddress, "<html>Address cannot contain number.</html>",
            errorColor, grayColor, !TxtCustAddress.getText().trim().isEmpty() && !TxtCustAddress.getText().matches(".*\\d.*")
    );

    // Validate Quantity
    try {
        short quantity = Short.parseShort(TxtQuantity.getText().trim());
        isValid &= validateField(TxtQuantity, "Quantity", lblErrorMsgQuantity, "Must be a valid number less than 20.",
                errorColor, grayColor, quantity > 0 && quantity <= 20
        );
    } catch (NumberFormatException e) {
        validateField(TxtQuantity, "Quantity", lblErrorMsgQuantity, "Must be a valid number.", errorColor, grayColor, false);
        isValid = false;
    }

    // Validate Product Name Combo Box
    if (ComboProName.getSelectedIndex() == 0) {
        lblErrorMsgProName.setText("Please select a product name.");
        lblErrorMsgProName.setVisible(true);
        isValid = false;
    } else {
        lblErrorMsgProName.setVisible(false);
    }

    // Validate Product Price Combo Box
    if (ComboProPrice.getSelectedIndex() == 0) {
        lblErrorMsgProPrice.setText("Please select a product price.");
        lblErrorMsgProPrice.setVisible(true);
        isValid = false;
    } else {
        lblErrorMsgProPrice.setVisible(false);
    }

    return isValid;
}

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

    if (validateInputs()) { // Validate input fields
        DefaultTableModel model = (DefaultTableModel) ProductTbl.getModel();

        // Create a MattressModel instance
        MattressModel newMattress = new MattressModel(
            Integer.parseInt(TxtProductID.getText().trim()),             // Product ID
            TxtCustName.getText().trim(),                               // Customer Name
            TxtCustPh.getText().trim(),                                 // Customer Phone
            TxtCustAddress.getText().trim(),                            // Customer Address
            Short.parseShort(TxtQuantity.getText().trim()),             // Quantity
            ComboProName.getSelectedItem().toString().trim(),           // Product Name
            Integer.parseInt(ComboProPrice.getSelectedItem().toString().trim()) // Product Price
        );

        // Check for duplicate Product ID
        boolean isDuplicate = false;
        for (int i = 0; i < model.getRowCount(); i++) {
            if (Integer.parseInt(model.getValueAt(i, 0).toString()) == newMattress.getProductId()) {
                isDuplicate = true;
                break;
            }
        }

        if (isDuplicate) {
            // Show a message to update instead of adding
            int response = JOptionPane.showConfirmDialog(
                this,
                "Product ID already exists. Would you like to update the existing entry?",
                "Duplicate Product ID",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
            );

            if (response == JOptionPane.YES_OPTION) {
                // Select the row with the duplicate Product ID for editing
                for (int i = 0; i < model.getRowCount(); i++) {
                    if (Integer.parseInt(model.getValueAt(i, 0).toString()) == newMattress.getProductId()) {
                        ProductTbl.setRowSelectionInterval(i, i);
                        break;
                    }
                }
            } else {
                // Clear row selection and form fields
                ProductTbl.clearSelection();
                clearForm();
            }
        } else {
            // Add a new row to the table
            model.addRow(new Object[]{
                newMattress.getProductId(),
                newMattress.getCustomerName(),
                newMattress.getCustomerPhone(),
                newMattress.getCustomerAddress(),
                newMattress.getQuantity(),
                newMattress.getProductName(),
                newMattress.getProductPrice()
            });

            // Clear form fields after adding
            clearForm();
            showDialogBox("Product added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
                                         
    // Get the selected row index
    int selectedRowIndex = ProductTbl.getSelectedRow();

    if (selectedRowIndex != -1) {
        // Confirm deletion with the user
        int confirmation = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete the selected product?",
                "Delete Confirmation",
                JOptionPane.YES_NO_OPTION
        );

        // If user confirms, delete the row
        if (confirmation == JOptionPane.YES_OPTION) {
            DefaultTableModel model = (DefaultTableModel) ProductTbl.getModel();
            model.removeRow(selectedRowIndex);

            JOptionPane.showMessageDialog(this, "Product deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
        // Show an error if no row is selected
        JOptionPane.showMessageDialog(this, "Please select a product to delete.", "No Selection", JOptionPane.ERROR_MESSAGE);
    }
       clearForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void TxtCustAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCustAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCustAddressActionPerformed

    private void TxtProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtProductIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtProductIDActionPerformed

    /**
     * Handles the login button action. Validates the username and password
     * input and navigates to the main screen if credentials are correct.
     * Displays appropriate error messages otherwise.
     *
     * @param evt The action event triggered by the login button.
     */
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Get the username and password input
        String username = txtFldLoginUsername.getText();
        String password = new String(pwdFldLogin.getPassword());

        // Check if username or password is empty
        if (username.isEmpty() || password.isEmpty()) {
            lblLoginError.setText("Please enter your username and password.");
        } // Check if username and password are incorrect
        else if (!username.equals("admin") || !password.equals("admin")) {
            lblLoginError.setText("Username and password mismatch.");
        } // If credentials are correct, proceed to load the main screen
        else {
            lblLoginError.setText(""); // Clear any previous error messages
            loadScreen("MainScreen"); // Load the main screen
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
    // Reset all input fields
    TxtProductID.setText("");
    TxtCustName.setText("");
    TxtCustPh.setText("");
    TxtCustAddress.setText("");
    TxtQuantity.setText("");
    TxtSearchCustName.setText("");
    // Reset combo boxes to the first option
    ComboProName.setSelectedIndex(0);
    ComboProPrice.setSelectedIndex(0);
    ComboSort.setSelectedIndex(0);
    // Optionally, clear any error messages
    lblErrorMsgProductID.setText("");
    lblErrorMsgCustName.setText("");
    lblErrorMsgCustPh.setText("");
    lblErrorMsgAddress.setText("");
    lblErrorMsgQuantity.setText("");
    lblErrorMsgProName.setText("");
    lblErrorMsgProPrice.setText("");
    lblErrorMsgSearch.setText("");
    lblErrorMsgSort.setText("");  
    TxtProductID.setBorder(createTitledBorder(Color.GRAY, "Product ID"));
    TxtCustName.setBorder(createTitledBorder(Color.GRAY, "Customer Name"));
    TxtCustPh.setBorder(createTitledBorder(Color.GRAY, "Customer Phone"));
    TxtCustAddress.setBorder(createTitledBorder(Color.GRAY, "Customer Address"));
    TxtQuantity.setBorder(createTitledBorder(Color.GRAY, "Quantity"));
    ProductTbl.clearSelection();
    }//GEN-LAST:event_ClearBtnActionPerformed
private void setupRowSelectionListener() {
    ProductTbl.getSelectionModel().addListSelectionListener(event -> {
        if (!event.getValueIsAdjusting()) {
            int selectedRowIndex = ProductTbl.getSelectedRow();
            if (selectedRowIndex != -1) {
                DefaultTableModel model = (DefaultTableModel) ProductTbl.getModel();

                // Populate the input fields with selected row data
                TxtProductID.setText(model.getValueAt(selectedRowIndex, 0).toString());
                TxtCustName.setText(model.getValueAt(selectedRowIndex, 1).toString());
                TxtCustPh.setText(model.getValueAt(selectedRowIndex, 2).toString());
                TxtCustAddress.setText(model.getValueAt(selectedRowIndex, 3).toString());
                TxtQuantity.setText(model.getValueAt(selectedRowIndex, 4).toString());

                // Set combo box values based on the selected row data
                String productName = model.getValueAt(selectedRowIndex, 5).toString();
                String productPrice = model.getValueAt(selectedRowIndex, 6).toString();

                ComboProName.setSelectedItem(productName);
                ComboProPrice.setSelectedItem(productPrice);
            }
        }
    });
}


    private void TxtCustPhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCustPhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCustPhActionPerformed

    private void ComboProNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboProNameActionPerformed
                  // TODO add your handling code here:
    }//GEN-LAST:event_ComboProNameActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
                                         
    int selectedRowIndex = ProductTbl.getSelectedRow();

    if (selectedRowIndex != -1) {
        if (validateInputs()) {
            DefaultTableModel model = (DefaultTableModel) ProductTbl.getModel();

            // Get values from input fields
            String newProductId = TxtProductID.getText().trim();
            String newName = TxtCustName.getText().trim();
            String newContact = TxtCustPh.getText().trim();
            String newAddress = TxtCustAddress.getText().trim();
            String newQuantity = TxtQuantity.getText().trim();
            String newProductName = ComboProName.getSelectedItem().toString();
            String newProductPrice = ComboProPrice.getSelectedItem().toString();

            // Get current values in the row
            String currentProductId = model.getValueAt(selectedRowIndex, 0).toString();
            String currentName = model.getValueAt(selectedRowIndex, 1).toString();
            String currentContact = model.getValueAt(selectedRowIndex, 2).toString();
            String currentAddress = model.getValueAt(selectedRowIndex, 3).toString();
            String currentQuantity = model.getValueAt(selectedRowIndex, 4).toString();
            String currentProductName = model.getValueAt(selectedRowIndex, 5).toString();
            String currentProductPrice = model.getValueAt(selectedRowIndex, 6).toString();
            
            // Check for duplicate Product ID (excluding the current row)
            if (!currentProductId.equals(newProductId)) {
                for (int i = 0; i < model.getRowCount(); i++) {
                    if (i != selectedRowIndex && model.getValueAt(i, 0).toString().equals(newProductId)) {
                        JOptionPane.showMessageDialog(
                                this,
                                "Product ID already exists in the table. Product ID cannot be updated to an existing ID.",
                                "Duplicate Product ID",
                                JOptionPane.ERROR_MESSAGE
                        );
                        return; // Exit if duplicate Product ID is found
                    }
                }
            }
            // Check if any field has changed
            if (currentProductId.equals(newProductId) &&
                currentName.equals(newName) &&
                currentContact.equals(newContact) &&
                currentAddress.equals(newAddress) &&
                currentQuantity.equals(newQuantity) &&
                currentProductName.equals(newProductName) &&
                currentProductPrice.equals(newProductPrice)) {
                JOptionPane.showMessageDialog(this, "No changes detected. Update not performed.", "No Changes", JOptionPane.WARNING_MESSAGE);
            } else {
                // Update the table with new values
                model.setValueAt(newProductId, selectedRowIndex, 0);
                model.setValueAt(newName, selectedRowIndex, 1);
                model.setValueAt(newContact, selectedRowIndex, 2);
                model.setValueAt(newAddress, selectedRowIndex, 3);
                model.setValueAt(newQuantity, selectedRowIndex, 4);
                model.setValueAt(newProductName, selectedRowIndex, 5);
                model.setValueAt(newProductPrice, selectedRowIndex, 6);

                // Clear selection and refresh the table
                ProductTbl.clearSelection();
                ProductTbl.repaint();

                JOptionPane.showMessageDialog(this, "Product updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                clearForm();
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a product to update.", "No Selection", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtFldLoginUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldLoginUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldLoginUsernameActionPerformed

    private void bthAboutUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthAboutUSActionPerformed
        tabPaneMain.setSelectedIndex(1);      // TODO add your handling code here:
    }//GEN-LAST:event_bthAboutUSActionPerformed

    private void TxtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtQuantityActionPerformed

    private void ComboProPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboProPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboProPriceActionPerformed

    private void btnSortAscendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortAscendingActionPerformed
        // TODO add your handling code here:
     if (!validateSortSelection()) {
        return; // Stop further execution if validation fails
    }
    if ("Sort by Product ID".equals(ComboSort.getSelectedItem().toString())) {
        DefaultTableModel model = (DefaultTableModel) ProductTbl.getModel();
        selectionSort.sortByProductId(model, 0, false); // Ascending order
    }

    if (ComboSort.getSelectedItem().toString().equals("Sort by Customer Name")) {
        DefaultTableModel model = (DefaultTableModel) ProductTbl.getModel();
        insertionSort.sortByCustomerName(model, 1, false); // Ascending order
    }


    if (ComboSort.getSelectedItem().toString().equals("Sort by Customer Address")) {
        DefaultTableModel model = (DefaultTableModel) ProductTbl.getModel();
        mergeSort.sortByCustomerAddress(model, 3, false); // Ascending order
    }


    }//GEN-LAST:event_btnSortAscendingActionPerformed

    private void ComboSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboSortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboSortActionPerformed

    private void btnSortDescendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortDescendingActionPerformed
        // TODO add your handling code here:
    if (!validateSortSelection()) {
        return; // Stop further execution if validation fails
    }
    if ("Sort by Product ID".equals(ComboSort.getSelectedItem().toString())) {
        DefaultTableModel model = (DefaultTableModel) ProductTbl.getModel();
        selectionSort.sortByProductId(model, 0, true); // Descending order
    }

    if (ComboSort.getSelectedItem().toString().equals("Sort by Customer Name")) {
        DefaultTableModel model = (DefaultTableModel) ProductTbl.getModel();
        insertionSort.sortByCustomerName(model, 1, true); // Descending order
    }

    if (ComboSort.getSelectedItem().toString().equals("Sort by Customer Address")) {
        DefaultTableModel model = (DefaultTableModel) ProductTbl.getModel();
        mergeSort.sortByCustomerAddress(model, 3, true); // Descending order
    }

    }//GEN-LAST:event_btnSortDescendingActionPerformed

    private void TxtSearchCustNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSearchCustNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSearchCustNameActionPerformed
private void sortTableByCustomerName() {
    DefaultTableModel model = (DefaultTableModel) ProductTbl.getModel();
    insertionSort.sortByCustomerName(model, 1, false); // Sort by Customer Name in ascending order
}

    private void BtnSearchCustNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchCustNameActionPerformed
        // TODO add your handling code here:

    String searchName = TxtSearchCustName.getText().trim(); // Get the text from the search field
        // Check if search text is empty
    if (searchName.isEmpty()) {
        lblErrorMsgSearch.setText("Search text cannot be empty.");
        lblErrorMsgSearch.setForeground(Color.RED);
        return; // Stop further execution
    }
     if (searchName.matches("\\d+")) {
        lblErrorMsgSearch.setText("Search text cannot be a number.");
        lblErrorMsgSearch.setForeground(Color.RED);
        return; // Stop further execution
    }else {
        lblErrorMsgSearch.setText(""); // Clear the error message
    }
    DefaultTableModel model = (DefaultTableModel) ProductTbl.getModel();

    // Step 1: Sort the table by Customer Name
    sortTableByCustomerName();

    // Step 2: Perform binary search
    int foundIndex = binarySearch.search(model, searchName, 1); // Column index 1 is Customer Name

    if (foundIndex != -1) {
        // Construct a message with customer details
        StringBuilder details = new StringBuilder();
        details.append("Product ID: ").append(model.getValueAt(foundIndex, 0)).append("\n");
        details.append("Customer Name: ").append(model.getValueAt(foundIndex, 1)).append("\n");
        details.append("Customer Phone: ").append(model.getValueAt(foundIndex, 2)).append("\n");
        details.append("Customer Address: ").append(model.getValueAt(foundIndex, 3)).append("\n");
        details.append("Quantity: ").append(model.getValueAt(foundIndex, 4)).append("\n");
        details.append("Product Name: ").append(model.getValueAt(foundIndex, 5)).append("\n");
        details.append("Product Price: ").append(model.getValueAt(foundIndex, 6)).append("\n");

        // Show the details in a dialog box
        JOptionPane.showMessageDialog(
            this,
            details.toString(),
            "Customer Details",
            JOptionPane.INFORMATION_MESSAGE
        );
    } else  {
        // Show a dialog if the name is not found
        JOptionPane.showMessageDialog(
            this,
            "Customer name \"" + searchName + "\" not found in the table.",
            "Search Result",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
    }//GEN-LAST:event_BtnSearchCustNameActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        
     loadScreen("LoginScreen");
    }//GEN-LAST:event_btnLogoutActionPerformed


    /**
     * Validates a single input field based on specific criteria and updates its
     * visual state.
     *
     * @param textField the JTextField to validate
     * @param fieldName the name of the field for error display
     * @param errorLbl the JLabel to show error messages
     * @param errorMsg the error message to display for invalid input
     * @param errorColor the color for error borders and text
     * @param successColor the color for successful validation borders
     * @param isValidFormat whether the input satisfies the field-specific
     * validation criteria
     * @return true if the field passes validation, false otherwise
     */
    private boolean validateField(JTextField textField, String fieldName, JLabel errorLbl, String errorMsg, 
            Color errorColor, Color successColor, boolean isValidFormat) {
        if (ValidationUtil.isNullOrEmpty(textField.getText())) {
            textField.setBorder(createTitledBorder(errorColor, fieldName));
            errorLbl.setText("Field cannot be empty!");
            errorLbl.setVisible(true);
            return false;
        } else if (!isValidFormat) {
            textField.setBorder(createTitledBorder(errorColor, fieldName));
            errorLbl.setText(errorMsg);
            errorLbl.setVisible(true);
            return false;
        } else {
            textField.setBorder(createTitledBorder(successColor, fieldName));
            errorLbl.setVisible(false);
            return true;
        }
    }
private boolean validateSortSelection() {
    if (ComboSort.getSelectedIndex() == 0) {
        lblErrorMsgSort.setText("Please select a valid sort option.");
        lblErrorMsgSort.setForeground(Color.RED);
        return false;
    } else {
        lblErrorMsgSort.setText(""); // Clear the error message
        return true;
    }
}
    /**
     * Creates a custom TitledBorder with specified color and title.
     *
     * @param color the color for the border and title
     * @param title the title text for the border
     * @return a TitledBorder instance
     */
    private javax.swing.border.TitledBorder createTitledBorder(Color color, String title) {
        return javax.swing.BorderFactory.createTitledBorder(
                javax.swing.BorderFactory.createLineBorder(color, 2),
                title,
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 1, 12),
                color
        );
    }

    /**
     * Displays a message dialog box with the given message, title, and type.
     *
     * @param message the message to display
     * @param title the title of the dialog box
     * @param messageType the type of message (e.g., information, warning, or
     * error)
     */
    private void showDialogBox(String message, String title, int messageType) {
        JOptionPane.showMessageDialog(this, message, title, messageType);
    }

    /**
     * Clears all input fields in the student form. Resets each field's value to
     * an empty string.
     */
    private void clearForm() {  
        TxtProductID.setText("");
        TxtCustName.setText("");
        TxtCustAddress.setText("");
        TxtCustPh.setText("");
        TxtQuantity.setText("");
        ComboProName.setSelectedIndex(0);
        ComboProPrice.setSelectedIndex(0);
        TxtSearchCustName.setText("");
    TxtProductID.setBorder(createTitledBorder(Color.GRAY, "Product ID"));
    TxtCustName.setBorder(createTitledBorder(Color.GRAY, "Customer Name"));
    TxtCustPh.setBorder(createTitledBorder(Color.GRAY, "Customer Phone"));
    TxtCustAddress.setBorder(createTitledBorder(Color.GRAY, "Customer Address"));
    TxtQuantity.setBorder(createTitledBorder(Color.GRAY, "Quantity"));
    
    }

   

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
            java.util.logging.Logger.getLogger(MattressApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MattressApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MattressApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MattressApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        MattressApp app = new MattressApp();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            app.setVisible(true);
        });

        app.startProgress();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSearchCustName;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JComboBox<String> ComboProName;
    private javax.swing.JComboBox<String> ComboProPrice;
    private javax.swing.JComboBox<String> ComboSort;
    private javax.swing.JLabel LblSearchCustName;
    private javax.swing.JPanel PnlDeliveredForm;
    private javax.swing.JLabel ProductNameLbl;
    private javax.swing.JLabel ProductPriceLbl;
    private javax.swing.JTable ProductTbl;
    private javax.swing.JTextField TxtCustAddress;
    private javax.swing.JTextField TxtCustName;
    private javax.swing.JTextField TxtCustPh;
    private javax.swing.JTextField TxtProductID;
    private javax.swing.JTextField TxtQuantity;
    private javax.swing.JTextField TxtSearchCustName;
    private javax.swing.JButton bthAboutUS;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSortAscending;
    private javax.swing.JButton btnSortDescending;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAboutUs;
    private javax.swing.JLabel lblAboutUsbg;
    private javax.swing.JLabel lblAboutUsheading;
    private javax.swing.JLabel lblCompanySlogan;
    private javax.swing.JLabel lblDeliveredData;
    private javax.swing.JLabel lblErrorMsgAddress;
    private javax.swing.JLabel lblErrorMsgCustName;
    private javax.swing.JLabel lblErrorMsgCustPh;
    private javax.swing.JLabel lblErrorMsgProName;
    private javax.swing.JLabel lblErrorMsgProPrice;
    private javax.swing.JLabel lblErrorMsgProductID;
    private javax.swing.JLabel lblErrorMsgQuantity;
    private javax.swing.JLabel lblErrorMsgSearch;
    private javax.swing.JLabel lblErrorMsgSort;
    private javax.swing.JLabel lblHard;
    private javax.swing.JLabel lblHarddesc;
    private javax.swing.JLabel lblHomebg;
    private javax.swing.JLabel lblLoading;
    private javax.swing.JLabel lblLoginError;
    private javax.swing.JLabel lblLoginSubTitle;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMainLogo;
    private javax.swing.JLabel lblMemory;
    private javax.swing.JLabel lblMemorydesc;
    private javax.swing.JLabel lblOurProducts;
    private javax.swing.JLabel lblPillows;
    private javax.swing.JLabel lblSlogan;
    private javax.swing.JLabel lblSoft;
    private javax.swing.JLabel lblSoftdesc;
    private javax.swing.JLabel lblSort;
    private javax.swing.JLabel lblTblCartTitle;
    private javax.swing.JLabel lblpillowdesc;
    private javax.swing.JProgressBar pgBarSplashScreen;
    private javax.swing.JPanel pnlAboutUs;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlLoadingScreen;
    private javax.swing.JPanel pnlLoginScreen;
    private javax.swing.JPanel pnlMainScreen;
    private javax.swing.JPanel pnlProductList;
    private javax.swing.JPasswordField pwdFldLogin;
    private javax.swing.JScrollPane spTblOrder;
    private javax.swing.JTabbedPane tabPaneMain;
    private javax.swing.JTextField txtFldLoginUsername;
    // End of variables declaration//GEN-END:variables
}
