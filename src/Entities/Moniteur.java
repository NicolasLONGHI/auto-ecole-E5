/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Poste de travail
 */
public class Moniteur {
    private int codeMoniteur;
    private String nom;
    private String prenom;
    private int sexe;
    private String dateNaissance;
    private String adresse;
    private String codePostal;
    private String ville;
    private String telephone;

    
    public Moniteur(int unCodeM, String unNom, String unPrenom, int unSexe, String uneDateNaissance, String uneAdr, String unCodePostal, String uneVille, String unTelephone){
        this.codeMoniteur = unCodeM;
        this.nom = unNom;
        this.prenom = unPrenom;
        this.sexe = unSexe;
        this.dateNaissance = uneDateNaissance;
        this.adresse = uneAdr;
        this.codePostal = unCodePostal;
        this.ville = uneVille;
        this.telephone = unTelephone;
    }
    
    public Moniteur(int unCodeM, String unNom, String unPrenom){
        this.codeMoniteur = unCodeM;
        this.nom = unNom;
        this.prenom = unPrenom;
    }

    /**
     * @return the codeMoniteur
     */
    public int getCodeMoniteur() {
        return codeMoniteur;
    }

    /**
     * @param codeMoniteur the codeMoniteur to set
     */
    public void setCodeMoniteur(int codeMoniteur) {
        this.codeMoniteur = codeMoniteur;
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
     * @return the dateNaissance
     */
    public String getDateNaissance() {
        return dateNaissance;
    }

    /**
     * @param dateNaissance the dateNaissance to set
     */
    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
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
    
    
}
