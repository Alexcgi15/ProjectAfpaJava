package DAO;


import Principale.Connexion;
import Classe.GrilleSalaire;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class GrilleSalaireDAO {
    Connection conn = null;

    public GrilleSalaireDAO() {
        Connexion connexion = new Connexion();
        this.conn = connexion.getConnexion();
    }
    
    public List<GrilleSalaire> list() {
        List<GrilleSalaire> resultat = new ArrayList<GrilleSalaire>();
        
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM grille_salaire");
            
            while (rs.next()) {
                GrilleSalaire service = new GrilleSalaire(rs.getInt("id"), rs.getInt("coefficient"), rs.getDouble("salaire_min"), rs.getDouble("salaire_max"));
                resultat.add(service);
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
    
    public void Insert(GrilleSalaire grilleSalaire) {

        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("INSERT INTO grille_salaire (coefficient, salaire_min, salaire_max) values (?,?,?)");
            stmt.setString(1, String.valueOf(grilleSalaire.getCoefficient()));
            stmt.setString(2, String.valueOf(grilleSalaire.getSalaire_min()));
            stmt.setString(3, String.valueOf(grilleSalaire.getSalaire_max()));
            stmt.executeUpdate();

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
    
    public GrilleSalaire find(int id){
        Statement stmt = null;
        ResultSet rs = null;
        GrilleSalaire resultat = new GrilleSalaire();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM grille_salaire WHERE id=" + id);
            
            while (rs.next()) {
                resultat = new GrilleSalaire(rs.getInt("id"), rs.getInt("coefficient"), rs.getDouble("salaire_min"), rs.getDouble("salaire_max"));
                
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
    
    
    public void update(GrilleSalaire grilleSalaire){
        
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("UDPATE INTO grille_salaire (coefficient, salaire_min, salaire_max) WHERE id=" + grilleSalaire.getId() + " values (?,?,?)");
            stmt.setString(1, String.valueOf(grilleSalaire.getCoefficient()));
            stmt.setString(2, String.valueOf(grilleSalaire.getSalaire_min()));
            stmt.setString(3, String.valueOf(grilleSalaire.getSalaire_max()));
            stmt.executeUpdate();
            
        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }
    
    public void delete(GrilleSalaire grilleSalaire){
        
        Statement stmt = null;
        
        try {
            stmt = conn.createStatement();
            stmt.executeQuery("DELETE FROM grille_salaire WHERE id=" + grilleSalaire.getId());
            
        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }
}
