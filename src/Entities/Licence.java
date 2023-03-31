/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Poste de travail
 */
public class Licence {
    private int codeL;
    private int codeM;
    private int codeC;
    
    public Licence(int unCodeLicence, int unCodeMoniteur, int unCodeCategorie){
        this.codeL = unCodeLicence;
        this.codeM = unCodeMoniteur;
        this.codeL = unCodeLicence;
    }

    /**
     * @return the codeL
     */
    public int getCodeL() {
        return codeL;
    }

    /**
     * @return the codeM
     */
    public int getCodeM() {
        return codeM;
    }

    /**
     * @return the codeC
     */
    public int getCodeC() {
        return codeC;
    }
}
