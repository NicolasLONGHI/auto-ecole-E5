/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Entities.ChiffreAffaireParCategorie;
import Entities.Planning;
import Tools.ConnexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nicol
 */
public class CtrlGraphique {
    
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public CtrlGraphique(){
        cnx = ConnexionBDD.getCnx();
    }
    
    public ArrayList<ChiffreAffaireParCategorie> GetDatasGraphiqueMoniteur(int unCodeMoniteur, String date1, String date2) {
        ArrayList<ChiffreAffaireParCategorie> datas = new ArrayList<>();
        
        try {
            ps = cnx.prepareStatement("SELECT SUM(categorie.prix) AS CA, categorie.Libelle FROM lecon JOIN vehicule ON vehicule.Immatriculation = lecon.Immatriculation JOIN categorie ON categorie.CodeCategorie = vehicule.CodeCategorie WHERE lecon.Reglee = 1 AND lecon.CodeMoniteur = ? AND lecon.Date BETWEEN ? AND  ? GROUP BY categorie.CodeCategorie;");
            ps.setInt(1, unCodeMoniteur);
            ps.setString(2, date1);
            ps.setString(3, date2);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                ChiffreAffaireParCategorie unCAparCategorie = new ChiffreAffaireParCategorie(rs.getDouble(1), rs.getString(2));
                datas.add(unCAparCategorie);
                
            }
            rs.close();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CtrlGraphique.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return datas;
    }
    
    
    public ArrayList<ChiffreAffaireParCategorie> GetDatasGraphiqueResponsable(String date1, String date2) {
        ArrayList<ChiffreAffaireParCategorie> datas = new ArrayList<>();
        
        try {
            ps = cnx.prepareStatement("SELECT SUM(categorie.prix) AS CA, categorie.Libelle FROM lecon JOIN vehicule ON vehicule.Immatriculation = lecon.Immatriculation JOIN categorie ON categorie.CodeCategorie = vehicule.CodeCategorie WHERE lecon.Reglee = 1 AND lecon.Date BETWEEN ? AND ? GROUP BY categorie.CodeCategorie;");
            ps.setString(1, date1);
            ps.setString(2, date2);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                ChiffreAffaireParCategorie unCAparCategorie = new ChiffreAffaireParCategorie(rs.getDouble(1), rs.getString(2));
                datas.add(unCAparCategorie);
                
            }
            rs.close();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CtrlGraphique.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return datas;
    }
    
}
