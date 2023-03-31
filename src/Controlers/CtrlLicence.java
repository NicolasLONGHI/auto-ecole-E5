/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Tools.ConnexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nicol
 */
public class CtrlLicence {
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;
    
    
    public CtrlLicence() {
        cnx = ConnexionBDD.getCnx();
    }
    
    
    public void AjouterLicence(int idMoniteur, int idCategorie, String dateObtention){
        try {
            ps = cnx.prepareStatement("INSERT INTO Licence(codeMoniteur, codeCategorie, dateObtention) VALUES(?, ?, ?);");
            ps.setInt(1, idMoniteur);
            ps.setInt(2, idCategorie);
            ps.setString(3, dateObtention);
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLicence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int GetIdCategorieByName(String nomCategorie) {
        int numCategorie = 0;
        try {
            ps = cnx.prepareStatement("SELECT categorie.CodeCategorie FROM categorie WHERE categorie.Libelle = ?");
            ps.setString(1, nomCategorie);
            rs = ps.executeQuery();
            rs.next();
            numCategorie = rs.getInt(1);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLicence.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numCategorie;
    }
}
