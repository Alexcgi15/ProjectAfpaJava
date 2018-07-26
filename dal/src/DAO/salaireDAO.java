package DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Principale.Connexion;
import Classe.salaire;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author afpa
 */
public class salaireDAO {
    
            Connection conn = null;
    
    public salaireDAO() {
        Connexion connexion = new Connexion();
        this.conn = connexion.getConnexion();
    }
    
    public List<salaire> list() {
            List<salaire> resultat = new ArrayList<salaire>();
            
            Statement stmt = null;
            ResultSet rs = null;
            
            try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM salaire");
            
            while (rs.next()) {
                salaire s = new salaire(rs.getInt("id"), rs.getDouble("salaire_annuel_brut"), rs.getInt("taux_horaire"),rs.getInt("base_horaire"),rs.getDouble("prime"),rs.getDate("date_prime"),
                rs.getDouble("AI"),rs.getDate("date_AI"),rs.getDouble("AG"),rs.getDate("date_AG"),rs.getString("type_de_contrat"),rs.getString("nom_entrprise"),rs.getInt("id_personnel"),rs.getInt("id_charges_cotisations"),rs.getInt("id_grille_salaire"),rs.getInt("id_hs_hm"),rs.getInt("id_identite_employeur"));
                resultat.add(s);
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
    
    public void insert(salaire s){
            
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("insert into salaire (salaire_annuel_brut,taux_horaire,base_horaire,prime,date_prime,AI,date_AI,AG,date_AG,type_de_contrat,nom_entrprise) values (?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setDouble(1, s.getSalaire_annuel_brut());
            stmt.setInt(2, s.getTaux_horaire());
            stmt.setInt(3, s.getBase_horaire());
            stmt.setDouble(4, s.getPrime());
            stmt.setDate(5, s.getDate_prime());
            stmt.setDouble(6, s.getAI());
            stmt.setDate(7, s.getDate_AI());
            stmt.setDouble(8, s.getAG());
            stmt.setDate(9, s.getDate_AG());
            stmt.setString(10, s.getType_de_contrat());
            stmt.setString(11, s.getNom_entrprise());
            stmt.executeUpdate();

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }
    
    public void update(salaire s){
    
            PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("update salaire set salaire_annuel_brut=?, taux_horaire=?, base_horaire=?, prime=?, date_prime=?, AI=?, date_AI=?, AG=?, date_AG=?, type_de_contrat=?, nom_entrprise=? where id=?");
            stmt.setDouble(1, s.getSalaire_annuel_brut());
            stmt.setInt(2, s.getTaux_horaire());
            stmt.setInt(3, s.getBase_horaire());
            stmt.setDouble(4, s.getPrime());
            stmt.setDate(5, s.getDate_prime());
            stmt.setDouble(6, s.getAI());
            stmt.setDate(7, s.getDate_AI());
            stmt.setDouble(8, s.getAG());
            stmt.setDate(9, s.getDate_AG());
            stmt.setString(10, s.getType_de_contrat());
            stmt.setString(11, s.getNom_entrprise());
            stmt.setInt(12, s.getId());
            stmt.executeUpdate();

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }
    
    public void delete(salaire s){
     
        PreparedStatement stmt = null;
    
        try{
    
         stmt = conn.prepareStatement("delete * from salaire where id=?");
         stmt.setInt(1, s.getId());
         stmt.executeUpdate();
         
        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }
    
    public salaire find(int id){
        
            Statement stmt = null;
            ResultSet rs = null;
            salaire resultat = new salaire();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM salaire WHERE id=" + id);
            
            while (rs.next()) {
                resultat = new salaire(rs.getInt("id"),rs.getDouble("salaire_annuel_brut"),rs.getInt("taux_horaire"),
                        rs.getInt("base_horaire"),rs.getDouble("prime"),rs.getDate("date_prime"),rs.getDouble("AI"),rs.getDate("date_AI"),
                        rs.getDouble("AG"),rs.getDate("date_AG"),rs.getString("type_de_contrat"),rs.getString("nom_entrprise"),
                        rs.getInt("id_personnel"),rs.getInt("id_charges_cotisations"),rs.getInt("id_grille_salaire"),rs.getInt("id_hs_hm"),rs.getInt("id_identite_employeur"));
                
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
}
