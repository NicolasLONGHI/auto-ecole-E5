/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.Date;

/**
 *
 * @author nicol
 */
public class Planning {
    private String libelle;
    private String nom;
    private String prenom;
    private String date;
    private String heure;
    private double prix;
    private String reglee;
    
    public Planning (String unLibelle, String unNom, String unPrenom, String uneDate, String uneHeure, double unPrix, String unReglee) {
        libelle = unLibelle;
        nom = unNom;
        prenom = unPrenom;
        date = uneDate;
        heure = uneHeure;
        prix = unPrix;
        reglee = unReglee;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the heure
     */
    public String getHeure() {
        return heure;
    }

    /**
     * @param heure the heure to set
     */
    public void setHeure(String heure) {
        this.heure = heure;
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

    /**
     * @return the reglee
     */
    public String getReglee() {
        return reglee;
    }

    /**
     * @param reglee the reglee to set
     */
    public void setReglee(String reglee) {
        this.reglee = reglee;
    }
}
