/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import Entities.Categorie;
import Entities.Moniteur;
import Entities.Planning;
import Entities.User;
import Entities.Vehicule;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author jacqu
 */
public class ModelJTable  extends AbstractTableModel 
{

    private String[] nomsColonnes;
    private Object[][] rows;
    
    
    @Override
    public int getRowCount() {
        return rows.length;
    }

    @Override
    public int getColumnCount() {
        return nomsColonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows[rowIndex][columnIndex];
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return nomsColonnes[columnIndex];
    }
    
    
    public void LoadDataPlanning(ArrayList<Planning> uneListe) {
        nomsColonnes = new String[]{"Catégorie", "Nom", "Prénom", "Date", "Heure", "Prix", "Réglée"};
        rows = new Object[uneListe.size()][7];
        int i = 0;
        for (Planning unPlanning : uneListe) {
            rows[i][0] = unPlanning.getLibelle();
            rows[i][1] = unPlanning.getNom();
            rows[i][2] = unPlanning.getPrenom();
            rows[i][3] = unPlanning.getDate();
            rows[i][4] = unPlanning.getHeure();
            rows[i][5] = unPlanning.getPrix() + " €";
            rows[i][6] = unPlanning.getReglee();
            i++;
        }
        fireTableChanged(null);
    }
    
    public void LoadDataCategorie(ArrayList<Categorie> uneListe, String uneRecherche) {
        nomsColonnes = new String[]{"Libellé", "Prix"};
        int i = 0;
        Object[][] rowsReelles = new Object[uneListe.size()][2];
        
        for (Categorie uneCategorie : uneListe) {
            if (uneCategorie.getLibelleCategorie().toLowerCase().contains(uneRecherche.toLowerCase()) || String.valueOf(uneCategorie.getPrix()).contains(uneRecherche) || uneRecherche.equals("")) {
                rowsReelles[i][0] = uneCategorie.getLibelleCategorie();
                rowsReelles[i][1] = uneCategorie.getPrix();
                i++;
            }
        }
        
        rows = new Object[i][2];
        for(int j = 0 ; j < i ; j++) {
            rows[j] = rowsReelles[j];
        }
        
        fireTableChanged(null);
    }
    
    public void LoadDataVehicule(ArrayList<Vehicule> uneListe, String uneRecherche) {
        nomsColonnes = new String[]{"Immatriculation", "Marque", "Modèle", "Année", "Catégorie"};
        int i = 0;
        Object[][] rowsReelles = new Object[uneListe.size()][5];
        
        for (Vehicule unVehicule : uneListe) {
            if (unVehicule.getImmatriculation().toLowerCase().contains(uneRecherche.toLowerCase()) || unVehicule.getMarque().toLowerCase().contains(uneRecherche.toLowerCase()) || unVehicule.getModele().toLowerCase().contains(uneRecherche.toLowerCase()) || String.valueOf(unVehicule.getAnnee()).contains(uneRecherche) || unVehicule.getNomCategorie().toLowerCase().contains(uneRecherche.toLowerCase()) || uneRecherche.equals("")) {
                rowsReelles[i][0] = unVehicule.getImmatriculation();
                rowsReelles[i][1] = unVehicule.getMarque();
                rowsReelles[i][2] = unVehicule.getModele();
                rowsReelles[i][3] = unVehicule.getAnnee();
                rowsReelles[i][4] = unVehicule.getNomCategorie();
                i++;
            }
        }
        
        rows = new Object[i][5];
        for(int j = 0 ; j < i ; j++) {
            rows[j] = rowsReelles[j];
        }
        
        fireTableChanged(null);
        
    }
    
    public void LoadDataMoniteur(ArrayList<Moniteur> uneListe, String uneRecherche) {
        nomsColonnes = new String[]{"Code", "Nom", "Prénom"};
        int i = 0;
        Object[][] rowsReelles = new Object[uneListe.size()][3];
        
        for (Moniteur unMoniteur : uneListe) {
            if (String.valueOf(unMoniteur.getCodeMoniteur()).contains(uneRecherche) || unMoniteur.getNom().toLowerCase().contains(uneRecherche.toLowerCase()) || unMoniteur.getPrenom().toLowerCase().contains(uneRecherche.toLowerCase())){
                rowsReelles[i][0] = unMoniteur.getCodeMoniteur();
                rowsReelles[i][1] = unMoniteur.getNom();
                rowsReelles[i][2] = unMoniteur.getPrenom();

                i++;
            }
        }
        
        rows = new Object[i][3];
        for(int j = 0 ; j < i ; j++) {
            rows[j] = rowsReelles[j];
        }
        
        fireTableChanged(null);
    }
        
    public void LoadDataUser(ArrayList<User> uneListe, String uneRecherche) {
        nomsColonnes = new String[]{"Code", "Nom", "Prénom"};
        int i = 0;
        Object[][] rowsReelles = new Object[uneListe.size()][3];
        
        for (User unUser : uneListe) {
            if (String.valueOf(unUser.getCodeUser()).contains(uneRecherche) || unUser.getNom().toLowerCase().contains(uneRecherche.toLowerCase()) || unUser.getPrenom().toLowerCase().contains(uneRecherche.toLowerCase())){
                rowsReelles[i][0] = unUser.getCodeUser();
                rowsReelles[i][1] = unUser.getNom();
                rowsReelles[i][2] = unUser.getPrenom();
                i++;
            }
        }
        
        rows = new Object[i][3];
        for(int j = 0 ; j < i ; j++) {
            rows[j] = rowsReelles[j];
        }
        
        fireTableChanged(null);
    }
}
