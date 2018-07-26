package DAO;

import Principale.Connexion;
import Classe.Hs_hm;
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
public class Hs_hmDAO {
    
                Connection conn = null;
                
    public Hs_hmDAO(){
        Connexion connexion = new Connexion();
        this.conn = connexion.getConnexion();
    }
    
    public List<Hs_hm> list() {
        List<Hs_hm> resultat = new ArrayList<Hs_hm>();

        Statement stmt = null;
        ResultSet rs = null;

        try {
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Hs_hm");

        while (rs.next()) {
            Hs_hm h = new Hs_hm(rs.getInt("id"),rs.getDate("date_hs_hm"),rs.getDouble("nbre_hs_hm"),rs.getString("commentaire"));
            resultat.add(h);
        }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
    
    public void insert(Hs_hm h){
        
            PreparedStatement stmt = null;
            
        try {
            stmt = conn.prepareStatement("insert into hs_hm(date_hm_hm,nbre_hs_hm,commentaire) values (?,?,?)");
            stmt.setDate(1, h.getDate_hs_hm());
            stmt.setDouble(2, h.getNbre_hs_hm());
            stmt.setString(3, h.getCommentaire());
             stmt.executeUpdate();
        }
        catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
    
    public void update(Hs_hm h){
    
            PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("update hs_hm set date_hs_hm,nbre_hs_hm,commentaire where id=?");
            stmt.setDate(1, h.getDate_hs_hm());
            stmt.setDouble(2, h.getNbre_hs_hm());
            stmt.setString(3, h.getCommentaire());
            stmt.setInt(4, h.getId());
            stmt.executeUpdate();

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }
    
    public void delete(Hs_hm h){
     
        PreparedStatement stmt = null;
    
        try{
    
         stmt = conn.prepareStatement("delete * from hs_hm where id=?");
         stmt.setInt(1, h.getId());
         stmt.executeUpdate();
         
        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }
    
    public Hs_hm find(int id){
        
            Statement stmt = null;
            ResultSet rs = null;
            Hs_hm resultat = new Hs_hm();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM hs_hm WHERE id=" + id);
            
            while (rs.next()) {
                resultat = new Hs_hm(rs.getInt("id"),rs.getDate("date_hs_hm"),rs.getDouble("nbre_hs_hm"),rs.getString("commentaire"));
                
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
}
