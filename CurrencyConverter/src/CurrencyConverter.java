
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author admin
 */
public class CurrencyConverter extends javax.swing.JFrame {

    /**
     * Creates new form CurrencyConverter
     */
    public CurrencyConverter() {
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

        textField1 = new java.awt.TextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jtxtamount = new javax.swing.JLabel();
        jtxtfromcurrency = new javax.swing.JLabel();
        jtxttocurrency = new javax.swing.JLabel();
        jtxtamount1 = new javax.swing.JTextField();
        jtxtcombox1 = new javax.swing.JComboBox<>();
        jtxtcombox2 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jbtreset = new javax.swing.JButton();
        jbtexit = new javax.swing.JButton();
        jbtconverter = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jamountconverted = new javax.swing.JLabel();
        jtxtamountconverted = new javax.swing.JTextField();

        textField1.setText("textField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 153, 172), 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Currency Converter");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 80));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 153, 172), 10));

        jtxtamount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtxtamount.setText("Amount");

        jtxtfromcurrency.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtxtfromcurrency.setText("From Currency");

        jtxttocurrency.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtxttocurrency.setText("To Currency");

        jtxtamount1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jtxtcombox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtxtcombox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INR - Indian Rupee", "GBP - British Pound", "CAD - Canadian Dollar", "NGN - Nigerian Naira", "MXN - Mexican Peso", "EUR - Euro", "CHF - Swiss Franc", "AUD - Australian Dollar", "CNY - Chinese Yuan", "USD - US Dollar", "ZMK - Zambian Kwacha", "JPY - Japanese Yen", "BRL - Brazilian Real", "KRW - South Korean Won", "PHP - Philippine Peso", "SEK - Swedish Krona", "NZD - New Zealand Dollar", "SGD - Singapore Dollar", "HKD - Hong Kong Dollar", "AED - UAE Dirham", "SAR - Saudi Riyal" }));

        jtxtcombox2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtxtcombox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INR - Indian Rupee", "GBP - British Pound", "CAD - Canadian Dollar", "NGN - Nigerian Naira", "MXN - Mexican Peso", "EUR - Euro", "CHF - Swiss Franc", "AUD - Australian Dollar", "CNY - Chinese Yuan", "USD - US Dollar", "ZMK - Zambian Kwacha", "JPY - Japanese Yen", "BRL - Brazilian Real", "KRW - South Korean Won", "PHP - Philippine Peso", "SEK - Swedish Krona", "NZD - New Zealand Dollar", "SGD - Singapore Dollar", "HKD - Hong Kong Dollar", "AED - UAE Dirham", "SAR - Saudi Riyal" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtamount)
                    .addComponent(jtxttocurrency)
                    .addComponent(jtxtfromcurrency))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtxtamount1)
                    .addComponent(jtxtcombox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtcombox2, 0, 404, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtamount)
                    .addComponent(jtxtamount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtfromcurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtcombox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtcombox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxttocurrency))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 710, 170));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 153, 172), 10));

        jbtreset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtreset.setText("Reset");
        jbtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtresetActionPerformed(evt);
            }
        });

        jbtexit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtexit.setText("Exit");
        jbtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtexitActionPerformed(evt);
            }
        });

        jbtconverter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtconverter.setText("Converter");
        jbtconverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtconverterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jbtconverter, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jbtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jbtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtconverter, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 710, 100));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 153, 172), 10));

        jLabel5.setText("jLabel1");

        jamountconverted.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jamountconverted.setText("Amount Converted");

        jtxtamountconverted.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jamountconverted, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jtxtamountconverted, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jamountconverted, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtamountconverted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 710, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtresetActionPerformed
        jtxtamount1.setText("");
        jtxtamountconverted.setText("");
        jtxtcombox1.setSelectedIndex(-1);
        jtxtcombox2.setSelectedIndex(-1);
    }//GEN-LAST:event_jbtresetActionPerformed
    public double convertCurrency(double amount, String fromCurrency, String toCurrency)
    {
        Map<String, Double> conversionRate = new HashMap<>();
        conversionRate.put("INR", 100.72);  // Indian Rupee
        conversionRate.put("GBP", 1.0);     // British Pound
        conversionRate.put("CAD", 1.64);    // Canadian Dollar
        conversionRate.put("NGN", 1038.42); // Nigerian Naira
        conversionRate.put("MXN", 22.83);   // Mexican Peso
        conversionRate.put("EUR", 1.15);    // Euro
        conversionRate.put("CHF", 1.06);    // Swiss Franc
        conversionRate.put("AUD", 1.89);    // Australian Dollar
        conversionRate.put("CNY", 8.89);    // Chinese Yuan
        conversionRate.put("USD", 1.21);    // US Dollar
        conversionRate.put("ZMK", 26.11);   // Zambian Kwacha
        conversionRate.put("JPY", 183.55);  // Japanese Yen
        conversionRate.put("BRL", 6.17);    // Brazilian Real
        conversionRate.put("KRW", 1613.84); // South Korean Won
        conversionRate.put("PHP", 67.34);   // Philippine Peso
        conversionRate.put("SEK", 14.09);   // Swedish Krona
        conversionRate.put("NZD", 1.92);    // New Zealand Dollar
        conversionRate.put("SGD", 1.65);    // Singapore Dollar
        conversionRate.put("HKD", 9.47);    // Hong Kong Dollar
        conversionRate.put("AED", 4.45);    // UAE Dirham
        conversionRate.put("SAR", 4.53);    // Saudi Riyal


             
           
        if(!conversionRate.containsKey(fromCurrency) || !conversionRate.containsKey(toCurrency)){
            throw new IllegalArgumentException("Invalid currency code.");
        }
        
        return amount * conversionRate.get(toCurrency)/ conversionRate.get(fromCurrency);
    }
 
    private void jbtconverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtconverterActionPerformed
        double amount;
        String fromCurrency;
        String toCurrency;
        double convertAmount;
        
        try{
            amount = Double.parseDouble(jtxtamount1.getText());
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Please enter a valid number","Exclamation", JOptionPane.ERROR_MESSAGE);
            jtxtamount1.setText("");
            jtxtamount1.requestFocus();
            return;
        }
        fromCurrency = jtxtcombox1.getSelectedItem().toString().substring(0, 3);
        toCurrency = jtxtcombox2.getSelectedItem().toString().substring(0, 3);
        
        convertAmount = convertCurrency(amount , fromCurrency, toCurrency);
        
        jtxtamountconverted.setText(amount + " " + fromCurrency + " = " + convertAmount + " " + toCurrency);
    }//GEN-LAST:event_jbtconverterActionPerformed
private JFrame frame;
    private void jbtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtexitActionPerformed
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame, "confirm if you want to exit","Currency Conveter",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtexitActionPerformed

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
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jamountconverted;
    private javax.swing.JButton jbtconverter;
    private javax.swing.JButton jbtexit;
    private javax.swing.JButton jbtreset;
    private javax.swing.JLabel jtxtamount;
    private javax.swing.JTextField jtxtamount1;
    private javax.swing.JTextField jtxtamountconverted;
    private javax.swing.JComboBox<String> jtxtcombox1;
    private javax.swing.JComboBox<String> jtxtcombox2;
    private javax.swing.JLabel jtxtfromcurrency;
    private javax.swing.JLabel jtxttocurrency;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}