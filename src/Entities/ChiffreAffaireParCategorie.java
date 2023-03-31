/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author nicol
 */
public class ChiffreAffaireParCategorie {
    
    private double chiffreAffaire;
    private String libelleCategorie;
    
    public ChiffreAffaireParCategorie(double unChiffreAffaire, String unLibelleCategorie) {
        chiffreAffaire = unChiffreAffaire;
        libelleCategorie = unLibelleCategorie;
    }

    /**
     * @return the chiffreAffaire
     */
    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    /**
     * @param chiffreAffaire the chiffreAffaire to set
     */
    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
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
    
    
    
}
