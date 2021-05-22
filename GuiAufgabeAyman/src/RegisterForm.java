
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayman
 */



public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
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

        jPanel1 = new javax.swing.JPanel();
        BankLogo = new javax.swing.JLabel();
        ExitButton = new javax.swing.JLabel();
        MinimiseButton = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        UserNameTextField = new javax.swing.JTextField();
        FamilyName = new javax.swing.JLabel();
        FirstName = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        FamilyNameTextField = new javax.swing.JTextField();
        Adresse = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AdresseTextArea = new javax.swing.JTextArea();
        Register = new javax.swing.JLabel();
        AccountType = new javax.swing.JLabel();
        AccountTypeComboBox = new javax.swing.JComboBox<>();
        Deposit = new javax.swing.JLabel();
        CreatButton = new javax.swing.JButton();
        PasswordTextField = new javax.swing.JTextField();
        DepositTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        BankLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bank_Icon.png"))); // NOI18N

        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("X");
        ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
        });

        MinimiseButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        MinimiseButton.setForeground(new java.awt.Color(255, 255, 255));
        MinimiseButton.setText("-");
        MinimiseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MinimiseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimiseButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(BankLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(MinimiseButton)
                .addGap(18, 18, 18)
                .addComponent(ExitButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(BankLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExitButton)
                            .addComponent(MinimiseButton))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 82));

        Username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("User Name:");

        Password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password:");

        UserNameTextField.setBackground(new java.awt.Color(108, 122, 137));
        UserNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UserNameTextField.setForeground(new java.awt.Color(255, 255, 255));

        FamilyName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FamilyName.setForeground(new java.awt.Color(255, 255, 255));
        FamilyName.setText("Family Name:");

        FirstName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FirstName.setForeground(new java.awt.Color(255, 255, 255));
        FirstName.setText("First Name:");

        FirstNameTextField.setBackground(new java.awt.Color(108, 122, 137));
        FirstNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FirstNameTextField.setForeground(new java.awt.Color(255, 255, 255));

        FamilyNameTextField.setBackground(new java.awt.Color(108, 122, 137));
        FamilyNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FamilyNameTextField.setForeground(new java.awt.Color(255, 255, 255));

        Adresse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Adresse.setForeground(new java.awt.Color(255, 255, 255));
        Adresse.setText("Adresse:");

        AdresseTextArea.setBackground(new java.awt.Color(108, 122, 137));
        AdresseTextArea.setColumns(20);
        AdresseTextArea.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        AdresseTextArea.setForeground(new java.awt.Color(255, 255, 255));
        AdresseTextArea.setRows(5);
        jScrollPane1.setViewportView(AdresseTextArea);

        Register.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Register.setForeground(new java.awt.Color(255, 255, 255));
        Register.setText("click here to login");
        Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
        });

        AccountType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AccountType.setForeground(new java.awt.Color(255, 255, 255));
        AccountType.setText("Account type:");

        AccountTypeComboBox.setBackground(new java.awt.Color(51, 51, 51));
        AccountTypeComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AccountTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giro", "Depot", "" }));
        AccountTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountTypeComboBoxActionPerformed(evt);
            }
        });

        Deposit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Deposit.setForeground(new java.awt.Color(255, 255, 255));
        Deposit.setText("Deposit:");

        CreatButton.setBackground(new java.awt.Color(34, 167, 240));
        CreatButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CreatButton.setForeground(new java.awt.Color(255, 255, 255));
        CreatButton.setText("Creat");
        CreatButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatButtonActionPerformed(evt);
            }
        });

        PasswordTextField.setBackground(new java.awt.Color(108, 122, 137));
        PasswordTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PasswordTextField.setForeground(new java.awt.Color(255, 255, 255));

        DepositTextField.setBackground(new java.awt.Color(108, 122, 137));
        DepositTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DepositTextField.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Password)
                            .addComponent(Username)
                            .addComponent(AccountType)
                            .addComponent(Adresse)
                            .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Deposit))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(AccountTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(CreatButton))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DepositTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FirstName)
                            .addComponent(FamilyName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FamilyNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FirstNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstName)
                    .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FamilyName)
                    .addComponent(FamilyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username)
                    .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password)
                    .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountType)
                    .addComponent(AccountTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Deposit)
                    .addComponent(DepositTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Adresse))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Register)
                    .addComponent(CreatButton))
                .addGap(92, 92, 92))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void MinimiseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimiseButtonMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimiseButtonMouseClicked

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked
        LoginForm lgf = new LoginForm();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_RegisterMouseClicked

    private void CreatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatButtonActionPerformed
        
        StringBuilder warnings = new StringBuilder();
        String firstName = "", familyName = "", userName = "", password = "", deposit = "", adresse = "";
        
        //verify first name field
        if (FirstNameTextField.getText().isEmpty()){
            warnings.append("first name must not be empty.\n");
        } else {
            firstName = FirstNameTextField.getText();
        }
        
         //verify family name field
        if (FamilyNameTextField.getText().isEmpty()){
            warnings.append("family name must not be empty.\n");
        } else {
            familyName = FamilyNameTextField.getText();
        }
        
         //verify uer name field
        if (UserNameTextField.getText().isEmpty()){
            warnings.append("user name must not be empty.\n");
        } else {
            userName = UserNameTextField.getText();
        }
        
        //verify paswprd
        if (!PasswordTextField.getText().matches("(\\d{3}-?){2}\\d{4}")){
            warnings.append("password number must be 10 digit, dashes are acceptable");
        } else {
            password = PasswordTextField.getText().replace("-", "");
        }
        
       
       
          //verify deposit field
        if (DepositTextField.getText().isEmpty()){
            warnings.append("deposit must not be empty.\n");
        } else {
            deposit = DepositTextField.getText();
        }
        
          //verify adresse field
        if (AdresseTextArea.getText().isEmpty()){
            warnings.append("Adresse must not be empty.\n");
        } else {
            adresse = AdresseTextArea.getText();
        }
       
        if (warnings.length()>0){
            JOptionPane.showConfirmDialog(this, warnings.toString(), "Input warnings", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showConfirmDialog(this, "Your account has already been created");
            System.exit(0);
        
        
        //KontoForm kf = new KontoForm();
        //kf.setVisible(true);
        //kf.pack();
        //kf.setLocationRelativeTo(null);
       // kf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // this.dispose();
        }
        
    }//GEN-LAST:event_CreatButtonActionPerformed

    private void AccountTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountTypeComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountType;
    private javax.swing.JComboBox<String> AccountTypeComboBox;
    private javax.swing.JLabel Adresse;
    private javax.swing.JTextArea AdresseTextArea;
    private javax.swing.JLabel BankLogo;
    public javax.swing.JButton CreatButton;
    private javax.swing.JLabel Deposit;
    private javax.swing.JTextField DepositTextField;
    private javax.swing.JLabel ExitButton;
    private javax.swing.JLabel FamilyName;
    private javax.swing.JTextField FamilyNameTextField;
    private javax.swing.JLabel FirstName;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JLabel MinimiseButton;
    private javax.swing.JLabel Password;
    private javax.swing.JTextField PasswordTextField;
    private javax.swing.JLabel Register;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JLabel Username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
