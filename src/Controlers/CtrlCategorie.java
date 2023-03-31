/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Entities.Categorie;
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
 * @author nicol
 */
public class CtrlCategorie {
    
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public CtrlCategorie(){
        cnx = ConnexionBDD.getCnx();
    }
    
    public boolean VerifCategorieExiste(String unLibelleCategorie){
        boolean categorieExiste = true;
        try {
            ps = cnx.prepareStatement("SELECT COUNT(categorie.CodeCategorie) FROM categorie WHERE categorie.Libelle = ?;");
            ps.setString(1, unLibelleCategorie);
            rs = ps.executeQuery();
            rs.next();
            if (rs.getInt(1) == 0) {
                categorieExiste = false;
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCategorie.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categorieExiste;
    }
    
    public void AjouterCategorie(String unLibelle, double unPrix){
        try {
            ps = cnx.prepareStatement("INSERT INTO categorie (Libelle, Prix) VALUES (?, ?);");
            ps.setString(1, unLibelle);
            ps.setDouble(2, unPrix);
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCategorie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ModifierCategorie(String unAncienLibelle, String unLibelle, double unPrix){
        try {
            ps = cnx.prepareStatement("UPDATE categorie SET Libelle = ?, Prix = ? WHERE Libelle = ?");
            ps.setString(1, unLibelle);
            ps.setDouble(2, unPrix);
            ps.setString(3, unAncienLibelle);
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCategorie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Categorie> GetToutesLesCategories(){
        ArrayList<Categorie> lesCategories = new ArrayList<>();
        try {
            ps = cnx.prepareStatement("SELECT codeCategorie, libelle, prix FROM Categorie ORDER BY codeCategorie");
            rs = ps.executeQuery();
            while(rs.next()){
                Categorie uneCategorie = new Categorie(rs.getInt(1), rs.getString(2), rs.getDouble(3));
                lesCategories.add(uneCategorie);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCategorie.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesCategories;
    }
    
    public void InitialiserCboCategories(JComboBox<String> uneCBox, ArrayList<Categorie> lesCategories){
        for(Categorie uneCategorie : lesCategories){
            uneCBox.addItem(uneCategorie.getLibelleCategorie());
        }
    }
    
    public ArrayList<Categorie> GetLicenceNonAjoutees(int unCodeMoniteur){
	ArrayList<Categorie> licencesManquantes = new ArrayList<>();
	try {
            ps = cnx.prepareStatement("SELECT DISTINCT categorie.codeCategorie, libelle, prix FROM categorie JOIN licence ON categorie.codeCategorie = licence.codeCategorie WHERE categorie.codeCategorie NOT IN (SELECT codeCategorie FROM licence WHERE codeMoniteur = ?);");
            ps.setInt(1, unCodeMoniteur);
            rs = ps.executeQuery();
            while(rs.next()){
                Categorie uneCategorie = new Categorie(rs.getInt(1), rs.getString(2), rs.getDouble(3));
                licencesManquantes.add(uneCategorie);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCategorie.class.getName()).log(Level.SEVERE, null, ex);
        }
	return licencesManquantes;
}
}
