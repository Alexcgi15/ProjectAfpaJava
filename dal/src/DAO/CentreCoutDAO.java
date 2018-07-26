package DAO;


import Principale.Connexion;
import Classe.CentreCout;
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
public class CentreCoutDAO {
    Connection conn = null;

    public CentreCoutDAO() {
        Connexion connexion = new Connexion();
        this.conn = connexion.getConnexion();
    }
    
    public List<CentreCout> list() {
        List<CentreCout> resultat = new ArrayList<CentreCout>();
        
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM centre_cout");
            
            while (rs.next()) {
                CentreCout service = new CentreCout(rs.getInt("id"), rs.getString("service"), rs.getInt("code_service"), rs.getInt("id_personnel"));
                resultat.add(service);
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
    
    public CentreCout list_by_nom(String nom) {
        CentreCout resultat = null;
        
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM centre_cout where service like '%"+nom+"%'");
            
            while (rs.next()) {
                resultat = new CentreCout(rs.getInt("id"), rs.getString("service"), rs.getInt("code_service"), rs.getInt("id_personnel"));
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
    
    public CentreCout List_By_id(int id) {
        CentreCout resultat = null;

        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM centre_cout where id like '%"+id+"%'");
            
            while (rs.next()) {
                resultat = new CentreCout(rs.getInt("id"), rs.getString("service"), rs.getInt("code_service"), rs.getInt("id_personnel"));
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
    
    public void Insert(CentreCout service) {

        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("INSERT INTO centre_cout (service, code_service, id_personnel) values (?,?,?)");
            stmt.setString(1, service.getService());
            stmt.setString(2, String.valueOf(service.getCode_service()));
            stmt.setString(3, String.valueOf(service.getId_personnel()));
            stmt.executeUpdate();

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
        
    public CentreCout find(int id){
        Statement stmt = null;
        ResultSet rs = null;
        CentreCout resultat = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM centre_cout WHERE id=" + id);
            
            while (rs.next()) {
                resultat = new CentreCout(rs.getInt("id"), rs.getString("service"), rs.getInt("code_service"), rs.getInt("id_personnel"));
                
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
    
    public void update(CentreCout service){
        
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("UDPATE INTO centre_cout (service, code_service, id_personnel) WHERE id=" + service.getId() + " values (?,?,?)");
            stmt.setString(1, service.getService());
            stmt.setString(2, String.valueOf(service.getCode_service()));
            stmt.setString(3, String.valueOf(service.getId_personnel()));
            stmt.executeUpdate();
            
        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }
    
    public void delete(CentreCout service){
        
        Statement stmt = null;
        
        try {
            stmt = conn.createStatement();
            stmt.executeQuery("DELETE FROM centre_cout WHERE id=" + service.getId());
            
        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }
}
