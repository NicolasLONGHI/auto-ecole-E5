/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Entities.Moniteur;
import Tools.ConnexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author Poste de travail
 */
public class CtrlLecon {
    
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public CtrlLecon(){
        cnx = ConnexionBDD.getCnx();
    }
    
    
    public int GetNbLeconsTerminees(int idEleve){
        int leconsTerminees = 0;
        try {
            ps = cnx.prepareStatement("SELECT COUNT(codeLecon) AS nbLeconsTerminees FROM Lecon WHERE codeEleve = ? AND date < SYSDATE();");
            ps.setInt(1, idEleve);
            rs = ps.executeQuery();
            if(rs.next()){
                leconsTerminees = rs.getInt(1);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return leconsTerminees;
    }
    
    public int GetNbLeconsNonFaites(int idEleve){
        int leconsPasFaites = 0;
        try {
            ps = cnx.prepareStatement("SELECT COUNT(codeLecon) AS nbLeconsPasFaites FROM Lecon WHERE codeEleve = ? AND date > SYSDATE();");
            ps.setInt(1, idEleve);
            rs = ps.executeQuery();
            if(rs.next()){
                leconsPasFaites = rs.getInt(1);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return leconsPasFaites;
    }
   
    
    public double GetPrixRestantAPayer(int idEleve){
        double prixAPayer = 0.00;
        try {
            ps = cnx.prepareStatement("SELECT COUNT(lecon.codeLecon)*categorie.prix FROM lecon JOIN Vehicule ON lecon.immatriculation = vehicule.immatriculation JOIN Categorie ON vehicule.codeCategorie = categorie.codeCategorie WHERE lecon.CodeEleve = ? AND lecon.reglee = 0;");
            ps.setInt(1, idEleve);
            rs = ps.executeQuery();
            while(rs.next()){
                prixAPayer += rs.getDouble(1);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prixAPayer;
    }   
    
    public double GetPrixPaye(int idEleve){
        double prixPaye = 0.00;
        try {
            ps = cnx.prepareStatement("SELECT COUNT(lecon.codeLecon)*categorie.prix FROM lecon JOIN vehicule ON lecon.immatriculation = vehicule.immatriculation JOIN categorie ON vehicule.codeCategorie = categorie.codeCategorie WHERE lecon.CodeEleve = ? AND lecon.reglee = 1;");
            ps.setInt(1, idEleve);
            rs = ps.executeQuery();
            while(rs.next()){
                prixPaye += rs.getDouble(1);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prixPaye;
    }
    
    
    public void InitialiserCboHeure(JComboBox<String> uneCBox){
        ArrayList<String> heuresLibres = new ArrayList<>();
        heuresLibres.add("08:00:00");
        heuresLibres.add("09:00:00");
        heuresLibres.add("10:00:00");
        heuresLibres.add("11:00:00");
        heuresLibres.add("13:00:00");
        heuresLibres.add("14:00:00");
        heuresLibres.add("15:00:00");
        heuresLibres.add("16:00:00");
        heuresLibres.add("17:00:00");
        heuresLibres.add("18:00:00");
        for (String uneHeure : heuresLibres) {
            uneCBox.addItem(uneHeure);
        }
    }
    
    public double GetChiffreDAffaire(int idMoniteur, String date1, String date2){
        double CA = 0.00;
        try {
            ps = cnx.prepareStatement("SELECT SUM(categorie.prix) AS CA FROM lecon JOIN vehicule ON vehicule.Immatriculation = lecon.Immatriculation JOIN categorie ON categorie.CodeCategorie = vehicule.CodeCategorie WHERE lecon.Reglee = 1 AND lecon.CodeMoniteur = ? AND lecon.Date BETWEEN ? AND  ?;");
            ps.setInt(1, idMoniteur);
            ps.setString(2, date1);
            ps.setString(3, date2);
            rs = ps.executeQuery();
            rs.next();
            CA = rs.getDouble(1);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CA;
    }
    
    public int GetNbLeconTotalMoniteur(int idMoniteur, String date1, String date2){
        int nbLecons = 0;
        try {
            ps = cnx.prepareStatement("SELECT COUNT(codeLecon) AS nbLeconsTotal FROM Lecon WHERE codeMoniteur = ? AND lecon.Date BETWEEN ? AND  ?;");
            ps.setInt(1, idMoniteur);
            ps.setString(2, date1);
            ps.setString(3, date2);
            rs = ps.executeQuery();
            rs.next();
            nbLecons = rs.getInt(1);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nbLecons;
    } 
          
    public void AjouterLecon(String unDate, String uneHeure, int unCodeMoniteur, int unCodeEleve, String uneImmatriculation){
        try {
            ps = cnx.prepareStatement("INSERT INTO lecon (date, heure, CodeMoniteur, CodeEleve, Immatriculation, Reglee) VALUES (?, ?, ?, ?, ?, 0)");
            ps.setString(1, unDate);
            ps.setString(2, uneHeure);
            ps.setInt(3, unCodeMoniteur);
            ps.setInt(4, unCodeEleve);
            ps.setString(5, uneImmatriculation);
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   

}
