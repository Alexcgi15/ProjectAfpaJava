package DAO;


import Principale.Connexion;
import Classe.IdentiteEmployeur;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author afpa
 */
public class IdentiteEmployeurDAO {
    Connection conn = null;

    public IdentiteEmployeurDAO() {
        Connexion connexion = new Connexion();
        this.conn = connexion.getConnexion();
    }

    public List<IdentiteEmployeur> list() {
        List<IdentiteEmployeur> resultat = new ArrayList<IdentiteEmployeur>();

        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM identite_employeur");
            
            while (rs.next()) {
                IdentiteEmployeur employeur = new IdentiteEmployeur(rs.getInt("id"), rs.getString("nom"), rs.getString("adresse"), rs.getInt("cp"), rs.getString("ville"), rs.getInt("n_siret"), rs.getInt("code_ape_naf"), rs.getString("intitule_convention_collective"), rs.getString("nom_entrprise"));
                resultat.add(employeur);
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
    
    //public Client Find(int id) {
    
    //}
    
    public void Insert(IdentiteEmployeur employeur) {

        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("INSERT INTO identite_employeur (nom, adresse, cp, ville, n_siret, code_ape_naf, intitule_convention_collective, nom_entrprise) values (?,?,?,?,?,?,?,?)");
            stmt.setString(1, employeur.getNom());
            stmt.setString(2, employeur.getAdresse());
            stmt.setString(3, String.valueOf(employeur.getCp()));
            stmt.setString(4, employeur.getVille());
            stmt.setString(5, String.valueOf(employeur.getN_siret()));
            stmt.setString(6, String.valueOf(employeur.getCode_ape_naf()));
            stmt.setString(7, employeur.getIntitule_convention_collective());
            stmt.setString(8, employeur.getNom_entrprise());
            stmt.executeUpdate();

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }
    
    public IdentiteEmployeur find(int id){
        Statement stmt = null;
        ResultSet rs = null;
        IdentiteEmployeur resultat = new IdentiteEmployeur();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM identite_employeur WHERE id=" + id);
            
            while (rs.next()) {
                resultat = new IdentiteEmployeur(rs.getInt("id"), rs.getString("nom"), rs.getString("adresse"), rs.getInt("cp"), rs.getString("ville"), rs.getInt("n_siret"), rs.getInt("code_ape_naf"), rs.getString("intitule_convention_collective"), rs.getString("nom_entrprise"));
                
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
    
    public void update(IdentiteEmployeur employeur){
        
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("UDPATE INTO identite_employeur (nom, adresse, cp, ville, n_siret, code_ape_naf, intitule_convention_collective, nom_entrprise) WHERE id=" + employeur.getId() + " values (?,?,?,?,?,?,?,?)");
            stmt.setString(1, employeur.getNom());
            stmt.setString(2, employeur.getAdresse());
            stmt.setString(3, String.valueOf(employeur.getCp()));
            stmt.setString(4, employeur.getVille());
            stmt.setString(5, String.valueOf(employeur.getN_siret()));
            stmt.setString(6, String.valueOf(employeur.getCode_ape_naf()));
            stmt.setString(7, employeur.getIntitule_convention_collective());
            stmt.setString(8, employeur.getNom_entrprise());
            stmt.executeUpdate();
            
        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }
    
    public void delete(IdentiteEmployeur employeur){
        
        Statement stmt = null;
        
        try {
            stmt = conn.createStatement();
            stmt.executeQuery("DELETE FROM identite_employeur WHERE id=" + employeur.getId());
            
        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }
}
