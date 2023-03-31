/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Entities.User;
import Tools.ConnexionBDD;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
public class CtrlUser {
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;

    public CtrlUser() {
        cnx = ConnexionBDD.getCnx();
    }
    
    public User GetConnexionEleve(String unLogin, String unMdp){
        User monUser = null;
        try {
            ps = cnx.prepareStatement("SELECT CodeEleve, Nom, Prenom, Sexe, DateDeNaissance, Adresse1, CodePostal, Ville, Telephone FROM eleve WHERE login = ? AND mdp = ?");
            ps.setString(1, unLogin);
            ps.setString(2, unMdp);
            rs = ps.executeQuery();
            if(rs.next()){
                String dateNaissance = "";
                if (rs.getDate(5) != null) {
                    dateNaissance = rs.getDate(5).toString();
                }
                monUser = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), dateNaissance, rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), 0);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return monUser;
    }
    
    public User GetConnexionMoniteur(String unLogin, String unMdp){
        User monUser = null;
        try {
            ps = cnx.prepareStatement("SELECT CodeMoniteur, Nom, Prenom, Sexe, DateDeNaissance, Adresse1, CodePostal, Ville, Telephone FROM moniteur WHERE login = ? AND mdp = ?");
            ps.setString(1, unLogin);
            ps.setString(2, unMdp);
            rs = ps.executeQuery();
            if(rs.next()){
                String dateNaissance = "";
                if (rs.getDate(5) != null) {
                    dateNaissance = rs.getDate(5).toString();
                }
                monUser = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), dateNaissance, rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), 1);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return monUser;
    }
    
    public User GetConnexionResponsable(String unLogin, String unMdp){
        User monUser = null;
        try {
            ps = cnx.prepareStatement("SELECT CodeResponsable, Nom, Prenom, Sexe, DateDeNaissance, Adresse1, CodePostal, Ville, Telephone FROM responsable WHERE login = ? AND mdp = ?");
            ps.setString(1, unLogin);
            ps.setString(2, unMdp);
            rs = ps.executeQuery();
            if(rs.next()){
                String dateNaissance = "";
                if (rs.getDate(5) != null) {
                    dateNaissance = rs.getDate(5).toString();
                }
                monUser = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), dateNaissance, rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), 2);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return monUser;
    }
            
    public void MaJInfos(User unUser) {
        try {
            String requete;
            if (unUser.getStatut() == 0) {
                requete = "UPDATE eleve SET eleve.Nom = ?, eleve.Prenom = ?, eleve.Sexe = ?, eleve.DateDeNaissance = ?, eleve.Adresse1 = ?, eleve.CodePostal = ?, eleve.Ville = ?, eleve.Telephone = ? WHERE eleve.CodeEleve = ?;";
            }
            else if (unUser.getStatut() == 1) {
                requete = "UPDATE moniteur SET moniteur.Nom = ?, moniteur.Prenom = ?, moniteur.Sexe = ?, moniteur.DateDeNaissance = ?, moniteur.Adresse1 = ?, moniteur.CodePostal = ?, moniteur.Ville = ?, moniteur.Telephone = ? WHERE moniteur.CodeMoniteur = ?;";
            }
            else {
                requete = "UPDATE responsable SET responsable.Nom = ?, responsable.Prenom = ?, responsable.Sexe = ?, responsable.DateDeNaissance = ?, responsable.Adresse1 = ?, responsable.CodePostal = ?, responsable.Ville = ?, responsable.Telephone = ? WHERE responsable.CodeResponsable = ?;";
            }
            ps = cnx.prepareStatement(requete);
            ps.setString(1, unUser.getNom());
            ps.setString(2, unUser.getPrenom());
            ps.setInt(3, unUser.getSexe());
            String dateNaissance = null;
            if (unUser.getDateDeNaissance() != "") {
                dateNaissance = unUser.getDateDeNaissance();
            }
            ps.setString(4, dateNaissance);
            ps.setString(5, unUser.getAdresse());
            ps.setString(6, unUser.getCodePostal());
            ps.setString(7, unUser.getVille());
            ps.setString(8, unUser.getTelephone());
            ps.setInt(9, unUser.getCodeUser());
            ps.executeUpdate();
            ps.close();
       } catch (SQLException ex) {
           Logger.getLogger(CtrlUser.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public String md5(String message) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] messageDigest = md.digest(message.getBytes());
        BigInteger bigInt = new BigInteger(1, messageDigest);
        return bigInt.toString(16);
    }
     
    
    public void AjouterEleve(String unNom, String unPrenom, int unSexe, String uneDateDeNaissance, String uneAdresse, String unCodePostal, String uneVille, String unTelephone, String unLogin, String unMdp) {
        try {
            ps = cnx.prepareStatement("INSERT INTO eleve (Nom, Prenom, Sexe, DateDeNaissance, Adresse1, CodePostal, Ville, Telephone, login, mdp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            ps.setString(1, unNom);
            ps.setString(2, unPrenom);
            ps.setInt(3, unSexe);
            ps.setString(4, uneDateDeNaissance);
            ps.setString(5, uneAdresse);
            ps.setString(6, unCodePostal);
            ps.setString(7, uneVille);
            ps.setString(8, unTelephone);
            ps.setString(9, unLogin);
            ps.setString(10, unMdp);
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCategorie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    
    public void AjouterMoniteur(String unNom, String unPrenom, int unSexe, String uneDateDeNaissance, String uneAdresse, String unCodePostal, String uneVille, String unTelephone, String unLogin, String unMdp) {
        try {
            ps = cnx.prepareStatement("INSERT INTO moniteur (Nom, Prenom, Sexe, DateDeNaissance, Adresse1, CodePostal, Ville, Telephone, login, mdp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            ps.setString(1, unNom);
            ps.setString(2, unPrenom);
            ps.setInt(3, unSexe);
            ps.setString(4, uneDateDeNaissance);
            ps.setString(5, uneAdresse);
            ps.setString(6, unCodePostal);
            ps.setString(7, uneVille);
            ps.setString(8, unTelephone);
            ps.setString(9, unLogin);
            ps.setString(10, unMdp);
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCategorie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean VerifIdentifiantExiste (String unIdentifiant) {
        boolean identifiantExiste = true;
        int idEleveExiste = 1;
        int idMoniteurExiste = 1;
        int idResponsableExiste = 1;
        try {
            ps = cnx.prepareStatement("SELECT COUNT(eleve.CodeEleve) FROM eleve WHERE eleve.login = ?;");
            ps.setString(1, unIdentifiant);
            rs = ps.executeQuery();
            rs.next();
            if (rs.getInt(1) == 0) {
                idEleveExiste = 0;
            }
            rs.close();
            ps.close();
            
            
            ps = cnx.prepareStatement("SELECT COUNT(moniteur.CodeMoniteur) FROM moniteur WHERE moniteur.login = ?;");
            ps.setString(1, unIdentifiant);
            rs = ps.executeQuery();
            rs.next();
            if (rs.getInt(1) == 0) {
                idMoniteurExiste = 0;
            }
            rs.close();
            ps.close();
            
            
            ps = cnx.prepareStatement("SELECT COUNT(responsable.CodeResponsable) FROM responsable WHERE responsable.login = ?;");
            ps.setString(1, unIdentifiant);
            rs = ps.executeQuery();
            rs.next();
            if (rs.getInt(1) == 0) {
                idResponsableExiste = 0;
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (idEleveExiste == 0 && idMoniteurExiste == 0 && idResponsableExiste == 0) {
            identifiantExiste = false;
        }
        
        return identifiantExiste;
    }
    
    public ArrayList<User> GetTousLesUsers() {
        ArrayList<User> lesUsers = new ArrayList<>();
        try {
            ps = cnx.prepareStatement("SELECT CodeEleve, Nom, Prenom FROM eleve ORDER BY CodeEleve;");
            rs = ps.executeQuery();
            while(rs.next()){
                User unUser = new User(rs.getInt("CodeEleve"), rs.getString("Nom"), rs.getString("Prenom"));
                lesUsers.add(unUser);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCategorie.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesUsers;
    }
    
}
