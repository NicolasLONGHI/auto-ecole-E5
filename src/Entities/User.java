/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.Date;


public class User {
    private int codeUser;
    private String nom;
    private String prenom;
    private int sexe;
    private String dateDeNaissance;
    private String adresse;
    private String codePostal;
    private String ville;
    private String telephone;
    private int statut;

    public User() {
        
    }
    
    public User(int unCodeUser, String unNom, String unPrenom, int unSexe, String uneDateDeNaissance, String uneAdresse, String unCodePostal, String uneVille, String unTelephone, int unStatut) {
        codeUser = unCodeUser;
        nom = unNom;
        prenom = unPrenom;
        sexe = unSexe;
        dateDeNaissance = uneDateDeNaissance;
        adresse = uneAdresse;
        codePostal = unCodePostal;
        ville = uneVille;
        telephone = unTelephone;
        statut = unStatut;
    }
    
    public User(int unCodeUser, String unNom, String unPrenom) {
        codeUser = unCodeUser;
        nom = unNom;
        prenom = unPrenom;
    }
    
    /**
     * @return the codeUser
     */
    public int getCodeUser() {
        return codeUser;
    }
    

    /**
     * @param codeUser the codeUser to set
     */
    public void setCodeUser(int codeUser) {
        this.codeUser = codeUser;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the sexe
     */
    public int getSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(int sexe) {
        this.sexe = sexe;
    }

    /**
     * @return the dateDeNaissance
     */
    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    /**
     * @param dateDeNaissance the dateDeNaissance to set
     */
    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the codePostal
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * @param codePostal the codePostal to set
     */
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    /**
     * @return the ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * @param ville the ville to set
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the statut
     */
    public int getStatut() {
        return statut;
    }

    /**
     * @param statut the statut to set
     */
    public void setStatut(int statut) {
        this.statut = statut;
    }
    
    
}
