package DAO;

import Principale.Connexion;
import Classe.Absence;
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
public class AbsenceDAO {
            Connection conn = null;
            
    public AbsenceDAO(){
        Connexion connexion = new Connexion();
        this.conn = connexion.getConnexion();
    }
            
    public List<Absence> list() {
        List<Absence> resultat = new ArrayList<Absence>();

        Statement stmt = null;
        ResultSet rs = null;

        try {
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM absence join personnel where id_personnel = personnel.id");

        while (rs.next()) {
            Absence a = new Absence(rs.getInt("id"),rs.getDate("date_debut"),rs.getDate("date_fin"),rs.getString("type"),rs.getDate("date_pose"),
                    rs.getDate("date_validation"),rs.getDouble("indemnites"),rs.getInt("id_personnel"),rs.getString("nom"));
            resultat.add(a);
        }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
    
    public Absence list_by_id(int id) {
        Absence resultat = null;

        Statement stmt = null;
        ResultSet rs = null;

        try {
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM absence where id like '%"+id+"%'");

        while (rs.next()) {
            resultat = new Absence(rs.getInt("id"),rs.getDate("date_debut"),rs.getDate("date_fin"),rs.getString("type"),rs.getDate("date_pose"),
                    rs.getDate("date_validation"),rs.getDouble("indemnites"),rs.getInt("id_personnel"));
            //resultat.add(a);
        }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
    
    public Absence list_by_centre_cout(int id) {
        Absence resultat = null;

        Statement stmt = null;
        ResultSet rs = null;

        try {
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM absence join personnel on id_personnel = personnel.id"
                + "join centre_cout where personnel.id = centre_cout.id_personnel");

        while (rs.next()) {
            resultat = new Absence(rs.getInt("id"),rs.getDate("date_debut"),rs.getDate("date_fin"),rs.getString("type"),rs.getDate("date_pose"),
                    rs.getDate("date_validation"),rs.getDouble("indemnites"),rs.getInt("id_personnel"));
            //resultat.add(a);
        }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
    
    public void insert(Absence a){
        
            PreparedStatement stmt = null;
            
        try {
            stmt = conn.prepareStatement("insert into absence(date_debut,date_fin,type,date_pose,date_validation,indemnites,id_personnel) values (?,?,?,?,?,?,?)");
            stmt.setDate(1, a.getDate_debut());
            stmt.setDate(2, a.getDate_fin());
            stmt.setString(3, a.getType());
            stmt.setDate(4, a.getDate_pose());
            stmt.setDate(5, a.getDate_validation());
            stmt.setDouble(6, a.getIndemnites());
            stmt.setInt(7, a.getId_personnel());
             stmt.executeUpdate();
        }
        catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
    
    public void update(Absence a){
    
            PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("update absence set date_debut=?,date_fin=?,type=?,date_pose=?,date_validation=?,indemnites=? where id=?");
            stmt.setDate(1, a.getDate_debut());
            stmt.setDate(2, a.getDate_fin());
            stmt.setString(3, a.getType());
            stmt.setDate(4, a.getDate_pose());
            stmt.setDate(5, a.getDate_validation());
            stmt.setDouble(6, a.getIndemnites());
            stmt.setInt(7, a.getId());
            stmt.executeUpdate();

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }
    
    public void delete(Absence a){
     
        PreparedStatement stmt = null;
    
        try{
    
         stmt = conn.prepareStatement("delete from absence where id=?");
         stmt.setInt(1, a.getId());
         stmt.executeUpdate();
         
        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }
    
    public Absence find(int id){
        
            Statement stmt = null;
            ResultSet rs = null;
            Absence resultat = new Absence();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM absence WHERE id=" + id);
            
            while (rs.next()) {
                resultat = new Absence(rs.getInt("id"),rs.getDate("date_debut"),rs.getDate("date_fin"),rs.getString("type"),rs.getDate("date_pose"),
                    rs.getDate("date_validation"),rs.getDouble("indemnites"),rs.getInt("id_personnel"));
                
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
}
