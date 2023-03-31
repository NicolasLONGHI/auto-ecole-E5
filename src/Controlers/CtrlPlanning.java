/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;
//test

import Entities.Planning;
import Tools.ConnexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class CtrlPlanning {
    
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;
    private SimpleDateFormat sdf;
    
    public CtrlPlanning () {
        cnx = ConnexionBDD.getCnx();
    }
    
    
    public ArrayList<Planning> GetPlanningByMoniteurId(int unIdMoniteur) {
        ArrayList<Planning> lesPlanning = new ArrayList<>();
        try {
            ps = cnx.prepareStatement("SELECT categorie.Libelle, eleve.Nom, eleve.Prenom, lecon.Date, lecon.Heure, categorie.Prix, lecon.Reglee FROM lecon JOIN eleve ON eleve.CodeEleve = lecon.CodeEleve JOIN vehicule ON vehicule.Immatriculation = lecon.Immatriculation JOIN categorie ON categorie.CodeCategorie = vehicule.CodeCategorie WHERE lecon.CodeMoniteur = ? ORDER BY lecon.Date DESC");
            ps.setInt(1, unIdMoniteur);
            rs = ps.executeQuery();
            sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            while (rs.next()) {
                String msgReglee = "Non";
                if (rs.getInt(7) == 1) {
                    msgReglee = "Oui";
                }
                Planning unPlanning = new Planning(rs.getString(1), rs.getString(2), rs.getString(3), sdf.format(rs.getDate(4)), rs.getString(5), rs.getDouble(6), msgReglee);
                lesPlanning.add(unPlanning);
                
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlPlanning.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lesPlanning;
    }
    
    public ArrayList<Planning> GetPlanningByEleveId(int unIdEleve) {
        ArrayList<Planning> lesPlanning = new ArrayList<>();
        try {
            ps = cnx.prepareStatement("SELECT categorie.Libelle, moniteur.Nom, moniteur.Prenom, lecon.Date, lecon.Heure, categorie.Prix, lecon.Reglee FROM lecon JOIN moniteur ON moniteur.CodeMoniteur = lecon.CodeMoniteur JOIN vehicule ON vehicule.Immatriculation = lecon.Immatriculation JOIN categorie ON categorie.CodeCategorie = vehicule.CodeCategorie WHERE lecon.CodeEleve = ? ORDER BY lecon.date DESC");
            ps.setInt(1, unIdEleve);
            rs = ps.executeQuery();
            sdf = new SimpleDateFormat("dd/MM/yyyy");

            while (rs.next()) {
                String msgReglee = "Non";
                if (rs.getInt(7) == 1) {
                    msgReglee = "Oui";
                }
                Planning unPlanning = new Planning(rs.getString(1), rs.getString(2), rs.getString(3), sdf.format(rs.getDate(4)), rs.getString(5), rs.getDouble(6), msgReglee);
                lesPlanning.add(unPlanning);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlPlanning.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesPlanning;
    }
    
   
}
