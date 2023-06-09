/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Controlers.CtrlUser;
import Entities.User;
import static Vues.FrmAjouterMoniteur.unUser;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class FrmAjouterEleve extends javax.swing.JFrame {

    
    static User unUser;
    CtrlUser ctrlUser;
    SimpleDateFormat sdf;
    
    /**
     * Creates new form FrmModifierInfos
     */
    public FrmAjouterEleve(User unUser) {
        this.unUser = unUser;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitre = new javax.swing.JLabel();
        lblNom = new javax.swing.JLabel();
        lblSexe = new javax.swing.JLabel();
        lblPrenom = new javax.swing.JLabel();
        lblDateNaissance = new javax.swing.JLabel();
        lblTelephone = new javax.swing.JLabel();
        lblCodePostal = new javax.swing.JLabel();
        lblAdresse = new javax.swing.JLabel();
        lblVille = new javax.swing.JLabel();
        lblAjouter = new javax.swing.JLabel();
        lblRetour = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtPrenom = new javax.swing.JTextField();
        txtVille = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        txtCodePostal = new javax.swing.JTextField();
        txtAdresse = new javax.swing.JTextField();
        rbHomme = new javax.swing.JRadioButton();
        rbFemme = new javax.swing.JRadioButton();
        dcDateNaissance = new com.toedter.calendar.JDateChooser();
        lblLogoAjouter = new javax.swing.JLabel();
        lblLogoRetour = new javax.swing.JLabel();
        txtMdp = new javax.swing.JTextField();
        lblPrenom1 = new javax.swing.JLabel();
        txtIdentifiant = new javax.swing.JTextField();
        lblNom1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Auto NMN");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTitre.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lblTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitre.setText("Ajouter un élève");

        lblNom.setText("Nom");

        lblSexe.setText("Sexe");

        lblPrenom.setText("Prénom");

        lblDateNaissance.setText("Date de naissance");

        lblTelephone.setText("Téléphone");

        lblCodePostal.setText("Code postal");

        lblAdresse.setText("Adresse");

        lblVille.setText("Ville");

        lblAjouter.setForeground(new java.awt.Color(0, 51, 255));
        lblAjouter.setText("Ajouter");
        lblAjouter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAjouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAjouterMouseClicked(evt);
            }
        });

        lblRetour.setForeground(new java.awt.Color(0, 51, 255));
        lblRetour.setText("Retour");
        lblRetour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRetour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRetourMouseClicked(evt);
            }
        });

        buttonGroup1.add(rbHomme);
        rbHomme.setText("Homme");

        buttonGroup1.add(rbFemme);
        rbFemme.setText("Femme");

        lblLogoAjouter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogoAjouter.setPreferredSize(new java.awt.Dimension(25, 25));
        lblLogoAjouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoAjouterMouseClicked(evt);
            }
        });

        lblLogoRetour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogoRetour.setPreferredSize(new java.awt.Dimension(25, 25));
        lblLogoRetour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoRetourMouseClicked(evt);
            }
        });

        lblPrenom1.setText("Mot de passe");

        lblNom1.setText("Identifiant");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(lblTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(lblAdresse)
                                .addGap(43, 43, 43)
                                .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)
                                .addComponent(lblVille)
                                .addGap(32, 32, 32)
                                .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(lblTelephone))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(lblSexe)))
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtTelephone)
                                                .addGap(102, 102, 102)
                                                .addComponent(lblCodePostal))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbHomme)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rbFemme))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblDateNaissance)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblNom)
                                                .addGap(40, 40, 40)
                                                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(123, 123, 123)
                                                .addComponent(lblPrenom))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(lblNom1)
                                        .addGap(40, 40, 40)
                                        .addComponent(txtIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(95, 95, 95)
                                        .addComponent(lblPrenom1)))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCodePostal)
                                        .addComponent(dcDateNaissance, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))))
                        .addGap(0, 97, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogoRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRetour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAjouter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLogoAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNom1)
                                    .addComponent(lblPrenom1))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNom)
                                    .addComponent(lblPrenom))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblSexe))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbFemme)
                                .addComponent(rbHomme)
                                .addComponent(lblDateNaissance))
                            .addComponent(dcDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTelephone))
                            .addComponent(txtCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblCodePostal)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAdresse)
                                    .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(lblVille))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRetour)
                            .addComponent(lblAjouter)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogoRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblLogoAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        dcDateNaissance.setDateFormatString("dd/MM/yyyy");
        ctrlUser = new CtrlUser();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        rbHomme.setSelected(true);
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/valider.png"));
        Image img = icon.getImage();
        img = img.getScaledInstance(lblLogoAjouter.getWidth(), lblLogoAjouter.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic = new ImageIcon(img);
        lblLogoAjouter.setIcon(ic);
        
        icon = new ImageIcon(getClass().getResource("/Images/retour.png"));
        img = icon.getImage();
        img = img.getScaledInstance(lblLogoRetour.getWidth(), lblLogoRetour.getHeight(), Image.SCALE_SMOOTH);
        ic = new ImageIcon(img);
        lblLogoRetour.setIcon(ic);
    }//GEN-LAST:event_formWindowOpened

    private void lblAjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAjouterMouseClicked
        ajouterEleve();
    }//GEN-LAST:event_lblAjouterMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        retour();
    }//GEN-LAST:event_formWindowClosing

    private void lblRetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRetourMouseClicked
        retour();
    }//GEN-LAST:event_lblRetourMouseClicked

    private void lblLogoRetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoRetourMouseClicked
        retour();
    }//GEN-LAST:event_lblLogoRetourMouseClicked

    private void lblLogoAjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoAjouterMouseClicked
        ajouterEleve();
    }//GEN-LAST:event_lblLogoAjouterMouseClicked

    private void ajouterEleve() {
        if (txtIdentifiant.getText().equals("")) {
            txtIdentifiant.requestFocusInWindow();
            JOptionPane.showMessageDialog(this, "Veuillez saisir l'identifiant", "Erreur", JOptionPane.WARNING_MESSAGE);
        }
        else if (txtMdp.getText().equals("")) {
            txtMdp.requestFocusInWindow();
            JOptionPane.showMessageDialog(this, "Veuillez saisir le mot de passe", "Erreur", JOptionPane.WARNING_MESSAGE);
        }
        else if (txtNom.getText().equals("")) {
            txtNom.requestFocusInWindow();
            JOptionPane.showMessageDialog(this, "Veuillez saisir le nom", "Erreur", JOptionPane.WARNING_MESSAGE);
        }
        else if (txtPrenom.getText().equals("")){
            txtPrenom.requestFocusInWindow();
            JOptionPane.showMessageDialog(this, "Veuillez saisir le prénom", "Erreur", JOptionPane.WARNING_MESSAGE);
        }
        else if (txtTelephone.getText().equals("")){
            txtTelephone.requestFocusInWindow();
            JOptionPane.showMessageDialog(this, "Veuillez saisir le numéro de téléphone", "Erreur", JOptionPane.WARNING_MESSAGE);
        }
        else if (ctrlUser.VerifIdentifiantExiste(txtIdentifiant.getText())) {
            txtIdentifiant.requestFocusInWindow();
            JOptionPane.showMessageDialog(this, "L'identifiant existe déjà", "Erreur", JOptionPane.WARNING_MESSAGE);
        }
        else {
            int sexe = 0;
            if (rbFemme.isSelected()) {
                sexe = 1;
            }
            String dateNaissance = null;
            if (dcDateNaissance.getDate() != null) {
               dateNaissance = sdf.format(dcDateNaissance.getDate()); 
            }
            String mdp = null;
            try {
                mdp = ctrlUser.md5(txtMdp.getText());
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(FrmAjouterEleve.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            ctrlUser.AjouterEleve(txtNom.getText(), txtPrenom.getText(), sexe, dateNaissance, txtAdresse.getText(), txtCodePostal.getText(), txtVille.getText(), txtTelephone.getText(), txtIdentifiant.getText(), mdp);
            

            JOptionPane.showMessageDialog(this, "L'élève a bien ajouté", "Ajouté", JOptionPane.INFORMATION_MESSAGE);
            retour();
        }
    }
    
    
    private void retour() {
        FrmInterfaceResponsable frm = new FrmInterfaceResponsable(unUser);
        this.setVisible(false);
        frm.setVisible(true);
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
            java.util.logging.Logger.getLogger(FrmAjouterEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAjouterEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAjouterEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAjouterEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAjouterEleve(unUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dcDateNaissance;
    private javax.swing.JLabel lblAdresse;
    private javax.swing.JLabel lblAjouter;
    private javax.swing.JLabel lblCodePostal;
    private javax.swing.JLabel lblDateNaissance;
    private javax.swing.JLabel lblLogoAjouter;
    private javax.swing.JLabel lblLogoRetour;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblNom1;
    private javax.swing.JLabel lblPrenom;
    private javax.swing.JLabel lblPrenom1;
    private javax.swing.JLabel lblRetour;
    private javax.swing.JLabel lblSexe;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JLabel lblTitre;
    private javax.swing.JLabel lblVille;
    private javax.swing.JRadioButton rbFemme;
    private javax.swing.JRadioButton rbHomme;
    private javax.swing.JTextField txtAdresse;
    private javax.swing.JTextField txtCodePostal;
    private javax.swing.JTextField txtIdentifiant;
    private javax.swing.JTextField txtMdp;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtVille;
    // End of variables declaration//GEN-END:variables
}
