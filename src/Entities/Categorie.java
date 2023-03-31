/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Poste de travail
 */
public class Categorie {
    private int codeCategorie;
    private String libelleCategorie;
    private double prix;
    
    public Categorie() {
    }
    
    public Categorie(int unCodeCategorie, String unLibelleCategorie, double unPrix) {
        this.codeCategorie = unCodeCategorie;
        this.libelleCategorie = unLibelleCategorie;
        this.prix = unPrix;
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
     * @return the libelleCategorie
     */
    public String getLibelleCategorie() {
        return libelleCategorie;
    }

    /**
     * @param libelleCategorie the libelleCategorie to set
     */
    public void setLibelleCategorie(String libelleCategorie) {
        this.libelleCategorie = libelleCategorie;
    }

    /**
     * @return the prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

}
