/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Poste de travail
 */
public class Vehicule {
    private String immatriculation;
    private String marque;
    private String modele;
    private int annee;
    private int codeCategorie;
    private String nomCategorie;

    public Vehicule(String uneImmatriculation, String uneMarque, String unModele, int uneAnnee, int unCodeCategorie){
        this.immatriculation = uneImmatriculation;
        this.marque = uneMarque;
        this.modele = unModele;
        this.annee = uneAnnee;
        this.codeCategorie = unCodeCategorie;
    }
    
    public Vehicule(String uneImmatriculation, String uneMarque, String unModele, int uneAnnee, int unCodeCategorie, String unNomCategorie){
        this.immatriculation = uneImmatriculation;
        this.marque = uneMarque;
        this.modele = unModele;
        this.annee = uneAnnee;
        this.codeCategorie = unCodeCategorie;
        this.nomCategorie = unNomCategorie;
    }
    
    /**
     * @return the immatriculation
     */
    public String getImmatriculation() {
        return immatriculation;
    }

    /**
     * @return the marque
     */
    public String getMarque() {
        return marque;
    }

    /**
     * @param marque the marque to set
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     * @return the modele
     */
    public String getLeModele() {
        return getModele();
    }

    /**
     * @param modele the modele to set
     */
    public void setLeModele(String modele) {
        this.setModele(modele);
    }

    /**
     * @return the annee
     */
    public int getAnnee() {
        return annee;
    }

    /**
     * @param annee the annee to set
     */
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    /**
     * @return the codeCategorie
     */
    public int getCodeCategorie() {
        return codeCategorie;
    }

    /**
     * @param codeCategorie the codeCategorie to set
     */
    public void setCodeCategorie(int codeCategorie) {
        this.codeCategorie = codeCategorie;
    }

    /**
     * @return the nomCategorie
     */
    public String getNomCategorie() {
        return nomCategorie;
    }

    /**
     * @param nomCategorie the nomCategorie to set
     */
    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    /**
     * @return the modele
     */
    public String getModele() {
        return modele;
    }

    /**
     * @param modele the modele to set
     */
    public void setModele(String modele) {
        this.modele = modele;
    }
}
