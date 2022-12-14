package stage_4.application.src;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import stage_3.Client;
import stage_3.Product;
import stage_3.Promotion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author kanar
 */
public class ProductFrame extends JFrame {

    /**
     * Creates new form ProductFrame
     */
    public ProductFrame() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productTabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        removeProductIdTxt = new javax.swing.JTextField();
        removeProductButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        searchProductTextField = new javax.swing.JTextField();
        searchProductButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        distributorAddTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        productIdAddTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        productNameAddTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        unitPriceAddTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        quantityAddTxt = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        productModifyProductIDTextField = new javax.swing.JTextField();
        productDistributorModifyTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        findModifyButton = new javax.swing.JButton();
        productNameModifyTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        productUnitPriceModifyTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        productQuantityModifyTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        updateProductButton = new javax.swing.JButton();
        productPanel = new javax.swing.JPanel();
        productjScrollPane = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        productTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                productTabbedPaneStateChanged(evt);
            }
        });

        jLabel2.setText("Enter Product Id :");

        removeProductButton.setText("Remove");
        removeProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeProductButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeProductButton)
                    .addComponent(removeProductIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(330, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(removeProductIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(removeProductButton)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        productTabbedPane.addTab("Remove", jPanel1);

        jLabel3.setText("Enter Product ID: ");

        searchProductTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductTextFieldActionPerformed(evt);
            }
        });

        searchProductButton.setText("Find");
        searchProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchProductButton)
                    .addComponent(searchProductTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchProductTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(searchProductButton)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        productTabbedPane.addTab("Search", jPanel2);

        jLabel4.setText("Distributor");

        jLabel5.setText("Product ID");

        jLabel6.setText("Product Name");

        jLabel7.setText("Unit Price");

        jLabel8.setText("Quantity");

        jButton3.setText("Reset");

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(quantityAddTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60)
                                    .addComponent(unitPriceAddTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60)
                                    .addComponent(productNameAddTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(productIdAddTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(distributorAddTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jButton3)
                        .addGap(33, 33, 33)
                        .addComponent(jButton4)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distributorAddTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productIdAddTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productNameAddTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitPriceAddTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityAddTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(21, 21, 21))
        );

        productTabbedPane.addTab("Add", jPanel3);

        jLabel9.setText("Enter Product ID :");

        jLabel10.setText("New Distributor");

        findModifyButton.setText("Find");
        findModifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findModifyButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("New Product Name");

        jLabel12.setText("New Unit Price");

        jLabel13.setText("New Quantity");

        updateProductButton.setText("Update");
        updateProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProductButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(productModifyProductIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(findModifyButton))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(productDistributorModifyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(productNameModifyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(productUnitPriceModifyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(productQuantityModifyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(updateProductButton)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productModifyProductIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findModifyButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productDistributorModifyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productNameModifyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productUnitPriceModifyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productQuantityModifyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(updateProductButton)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        productTabbedPane.addTab("Modify", jPanel4);

        productTable.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "distributor", "productId", "productName", "unitPrice", "quantity", "promotion_id"
            }
        ));
        productjScrollPane.setViewportView(productTable);

        javax.swing.GroupLayout productPanelLayout = new javax.swing.GroupLayout(productPanel);
        productPanel.setLayout(productPanelLayout);
        productPanelLayout.setHorizontalGroup(
            productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productjScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addContainerGap())
        );
        productPanelLayout.setVerticalGroup(
            productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productjScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        productTabbedPane.addTab("List of product", productPanel);

        jLabel1.setText("Product Management");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productTabbedPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productTabbedPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeProductButtonActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String product_id = removeProductIdTxt.getText();
            ArrayList<Product> products = getProductFromFile("src/data/product.csv");
            if (findProductID(products, product_id)) {
                removeProduct(products, product_id);
                saveListOfProducts(products);
            } else {
                JOptionPane.showMessageDialog(this, "Sorry, the product does not exist");
            }
        } catch (IOException ex) {
            Logger.getLogger(ClientFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_removeProductButtonActionPerformed
    private ArrayList<Product> getProductFromFile(String srcdataclientcsv) throws FileNotFoundException, IOException {
        ArrayList<Product> clients = new ArrayList<>();
        // File path is passed as parameter
        File file = new File(srcdataclientcsv);
        BufferedReader br = new BufferedReader(new FileReader(file));
        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        br.readLine();
        while ((st = br.readLine()) != null) // Print the string
        {
            //firstName,lastName,email,streetAddress,city,zipCode,state,telephone,sales_id,clientId
            String data[] = st.split(",");
            System.out.println("ArraySize " + data.length);
            Product product = new Product(data[0], data[1], data[2], Double.parseDouble(data[3]), Integer.parseInt(data[4]), null);
            clients.add(product);
        }
        return clients;
    }

    private boolean findProductID(ArrayList<Product> products, String product_id) {
        for (Product product : products) {
            if (product.getProductId().equals(product_id)) {
                System.out.println("Find the product");
                return true;
            }
        }
        System.out.println("Did not find the product");
        return false;
    }

    private Product findProductDetails(ArrayList<Product> products, String product_id) {
        for (Product product : products) {
            if (product.getProductId().equals(product_id)) {
                System.out.println("Find the product");
                return product;
            }
        }
        System.out.println("Did not find the product");
        return null;
    }

    private boolean removeProduct(ArrayList<Product> products, String product_id) {
        for (int i = 0; i < products.size(); i++) {
            if (product_id.equals(products.get(i).getProductId())) {
                System.out.println("Remove the product with ID " + product_id);
                products.remove(i);
                return true;
            }
        }
        System.out.println("Did not remove product from the list");
        return false;
    }

    private void saveListOfProducts(ArrayList<Product> products) {
        System.out.println("Saving new product");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/data/product.csv", false));
            writer.append("distributor,productId,productName,unitPrice,quantity,promotion_id\n");
            for (Product product : products) {

                writer.append(product.getDistributor() + ",");
                writer.append(product.getProductId() + ",");
                writer.append(product.getProductName() + ",");
                writer.append(product.getUnitPrice() + ",");
                writer.append(product.getQuantity() + ",");
                writer.append(product.getPromotion() + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(ProductFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void searchProductTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchProductTextFieldActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Product product = new Product(distributorAddTxt.getText(), productIdAddTxt.getText(), productNameAddTxt.getText(),
                Double.parseDouble(unitPriceAddTxt.getText()), Integer.parseInt(quantityAddTxt.getText()), null);
        saveProduct(product);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void searchProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductButtonActionPerformed
        try {
            // TODO add your handling code here:
            ArrayList<Product> products = getProductFromFile("src/data/product.csv");
            Product product = findProductDetails(products, searchProductTextField.getText());
            if (product != null) {
                JOptionPane.showMessageDialog(this, detailsOfProduct(product));
            } else {
                JOptionPane.showMessageDialog(this, detailsOfProduct(product));
            }
        } catch (IOException ex) {
            Logger.getLogger(ProductFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_searchProductButtonActionPerformed

    private void productTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_productTabbedPaneStateChanged
        // TODO add your handling code here:
        int selectTab = productTabbedPane.getSelectedIndex();
        if (selectTab == 4) {
            addRowToJTable();
        }
    }//GEN-LAST:event_productTabbedPaneStateChanged

    private void findModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findModifyButtonActionPerformed
        // TODO add your handling code here:
        try {ArrayList<Product> products = getProductFromFile("src/data/product.csv");
            Product product = findProductDetails(products, productModifyProductIDTextField.getText());
            if (product != null) {
                this.productDistributorModifyTxt.setText(product.getDistributor());
                this.productNameModifyTxt.setText(product.getProductName());
                this.productUnitPriceModifyTxt.setText(product.getUnitPrice()+"");
                this.productQuantityModifyTxt.setText(product.getQuantity()+"");
            } else {
                JOptionPane.showMessageDialog(this, "The Product Does not exist");
            }
        } catch (IOException ex) {
            Logger.getLogger(ProductFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_findModifyButtonActionPerformed

    private void updateProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProductButtonActionPerformed
        // TODO add your handling code here:
       try {
            // TODO add your handling code here:
            String product_id = productModifyProductIDTextField.getText();
            ArrayList<Product> products = getProductFromFile("src/data/product.csv");
            Product product = findProductDetails(products, product_id);
            product.setDistributor(productDistributorModifyTxt.getText());
            product.setProductName(productNameModifyTxt.getText());
            product.setUnitPrice(Double.parseDouble(productUnitPriceModifyTxt.getText()));
            product.setQuantity(Integer.parseInt(productQuantityModifyTxt.getText()));



            if (findProductID(products, product_id)) {
         
                updateProduct(products,product);
                
                saveListOfProducts(products);
            } else {
                JOptionPane.showMessageDialog(this, "Sorry, the product does not exist");
            }
        } catch (IOException ex) {
    
            Logger.getLogger(ProductFrame.class .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateProductButtonActionPerformed
    private void saveProduct(Product product) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/data/product.csv", true));
            //firstName,lastName,email,streetAddress,city,zipCode,state,telephone,sales_id,clientId
            writer.append("\n");
            writer.append(product.getDistributor() + ",");
            writer.append(product.getProductId() + ",");
            writer.append(product.getProductName() + ",");
            writer.append(product.getUnitPrice() + ",");
            writer.append(product.getQuantity() + ",");
            writer.append(product.getPromotion() + "");
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(ProductFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField distributorAddTxt;
    private javax.swing.JButton findModifyButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField productDistributorModifyTxt;
    private javax.swing.JTextField productIdAddTxt;
    private javax.swing.JTextField productModifyProductIDTextField;
    private javax.swing.JTextField productNameAddTxt;
    private javax.swing.JTextField productNameModifyTxt;
    private javax.swing.JPanel productPanel;
    private javax.swing.JTextField productQuantityModifyTxt;
    private javax.swing.JTabbedPane productTabbedPane;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField productUnitPriceModifyTxt;
    private javax.swing.JScrollPane productjScrollPane;
    private javax.swing.JTextField quantityAddTxt;
    private javax.swing.JButton removeProductButton;
    private javax.swing.JTextField removeProductIdTxt;
    private javax.swing.JButton searchProductButton;
    private javax.swing.JTextField searchProductTextField;
    private javax.swing.JTextField unitPriceAddTxt;
    private javax.swing.JButton updateProductButton;
    // End of variables declaration//GEN-END:variables

    private String detailsOfProduct(Product product) {
        if (product != null) {
            String result = "Here are detail of the product : \n";
            result = result + "Product ID : " + product.getProductId() + "\n Product Name : " + product.getProductName()
                    + "\nProduct Distributor " + product.getDistributor();
            return result;
        } else {
            return "The product does not exist";
        }
    }

    private void addRowToJTable() {
        //distributor,productId,productName,unitPrice,quantity,promotion_id
        try {
            DefaultTableModel model = (DefaultTableModel) productTable.getModel();
            ArrayList<Product> list = getProductFromFile("src/data/product.csv");
            Object rowData[] = new Object[6];
            for (int i = 0; i < list.size(); i++) {
                //distributor,productId,productName,unitPrice,quantity,promotion_id

                rowData[0] = list.get(i).getDistributor();
                rowData[1] = list.get(i).getProductId();
                rowData[2] = list.get(i).getProductName();
                rowData[3] = list.get(i).getUnitPrice();
                rowData[4] = list.get(i).getQuantity();
                Promotion p= list.get(i).getPromotion();
                if(p==null){
                     rowData[5] ="Not Available";
                }
                else{
                rowData[5] =list.get(i).getPromotion().getPromotionID();
                }
                model.addRow(rowData);

            }

        } catch (IOException ex) {
            Logger.getLogger(ProductFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void updateProduct(ArrayList<Product> products, Product product) {
     
        for (Product elt : products) {
            if (product.getProductId().equals(elt.getProductId())) {
                System.out.println("Update the product with ID " + product.getProductId());
                elt = product;

            }
        }
        System.out.println("Completed from the list");
     
    }
}
