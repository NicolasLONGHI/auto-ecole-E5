/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Entities.Licence;
import Entities.Moniteur;
import Tools.ConnexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JComboBox;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Poste de travail
 */
public class CtrlMoniteur {
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public CtrlMoniteur() {
        cnx = ConnexionBDD.getCnx();
    }
    
    public ArrayList<Moniteur> GetMoniteursDispo(String uneDate, String uneHeure, int unCodeCategorie) {
        ArrayList<Moniteur> lesMoniteurs = new ArrayList<>();
        try {
            ps = cnx.prepareStatement("SELECT moniteur.CodeMoniteur, moniteur.Nom, moniteur.Prenom, moniteur.Sexe, moniteur.DateDeNaissance, moniteur.Adresse1, moniteur.CodePostal, moniteur.Ville, moniteur.Telephone FROM moniteur JOIN lecon ON lecon.CodeMoniteur = moniteur.CodeMoniteur JOIN licence ON licence.CodeMoniteur = moniteur.CodeMoniteur WHERE lecon.CodeMoniteur NOT IN (SELECT lecon.CodeMoniteur FROM lecon WHERE lecon.Date = ? AND lecon.Heure = ?) AND licence.CodeCategorie = ? GROUP BY moniteur.Nom;");
            ps.setString(1, uneDate);
            ps.setString(2, uneHeure);
            ps.setInt(3, unCodeCategorie);
            rs = ps.executeQuery();
            while(rs.next()){
                Moniteur unMoniteur = new Moniteur(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                lesMoniteurs.add(unMoniteur);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlMoniteur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesMoniteurs;
    }
    
    public void InitialiserCboMoniteurDispo(JComboBox<String> uneCBox, ArrayList<Moniteur> lesMoniteurs){
        uneCBox.removeAllItems();
        if (lesMoniteurs.isEmpty()) {
            uneCBox.addItem("Aucun moniteur");
        }
        else {
            for(Moniteur unMoniteur : lesMoniteurs){
                uneCBox.addItem(unMoniteur.getNom().toUpperCase() + " " + unMoniteur.getPrenom());
            }
        }
    }
    
    public ArrayList<Integer> LoadMoniteurCode(ArrayList<Moniteur> lesMoniteurs) {
        ArrayList<Integer> lesCodes = new ArrayList<>();
        for(Moniteur unMoniteur : lesMoniteurs){
            lesCodes.add(unMoniteur.getCodeMoniteur());
        }
        return lesCodes;
    }
    
    public ArrayList<Moniteur> GetTousLesMoniteurs() {
        ArrayList<Moniteur> lesMoniteurs = new ArrayList<>();
        try {
            ps = cnx.prepareStatement("SELECT CodeMoniteur, Nom, Prenom FROM moniteur ORDER BY CodeMoniteur;");
            rs = ps.executeQuery();
            while(rs.next()){
                Moniteur unMoniteur = new Moniteur(rs.getInt("CodeMoniteur"), rs.getString("Nom"), rs.getString("Prenom"));
                lesMoniteurs.add(unMoniteur);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCategorie.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesMoniteurs;
    }
}
