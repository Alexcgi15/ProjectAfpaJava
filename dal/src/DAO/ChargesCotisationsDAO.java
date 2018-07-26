package DAO;


import Classe.ChargesCotisations;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class ChargesCotisationsDAO {
    
           Connection conn = null;

    public ChargesCotisationsDAO() {
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            conn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-M42SCP62;databaseName=GRH;user=sa;password=GRH");

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (Exception ex) {
            // handle any errors
            System.out.println(ex.getMessage());
        }
    }
    public List<ChargesCotisations> List() {
        List<ChargesCotisations> resultat = new ArrayList<ChargesCotisations>();

        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM charges_cotisations");
            
            while (rs.next()) {
                ChargesCotisations C = new ChargesCotisations (rs.getInt("id"), rs.getDouble("sante")
                , rs.getDouble("ss"), rs.getDouble("comp_incap_Inval_deces"), rs.getDouble("comp_sante"), rs.getDouble("at_mp")
                , rs.getDouble("retraite"), rs.getDouble("ss_plaf"), rs.getDouble("ss_deplaf"), rs.getDouble("comp_ta")
                , rs.getDouble("comp_gmp"), rs.getDouble("comp_tb"), rs.getDouble("comp_tc"), rs.getDouble("comp_t1")
                , rs.getDouble("comp_t2"), rs.getDouble("sup"), rs.getDouble("famille_ss"), rs.getDouble("assu_chom")
                , rs.getDouble("chomage"), rs.getDouble("apec"), rs.getDouble("cotisations_statutaires"), rs.getDouble("autres_contribution")
                , rs.getDouble("csg_non_ir"), rs.getDouble("csg_crds_ir"), rs.getDouble("allegement_cotisations"));
                resultat.add(C);
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    } 
        public void Insert(ChargesCotisations C) {

        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("insert into personnel (sante, ss,comp_incap_Inval_deces, comp_sante, at_mp, retraite, ss_plaf, ss_deplaf, comp_ta, comp_gmp, comp_tb, comp_tc,comp_t1, comp_t2, sup, famille_ss, assu_chom, chomage, apec, cotisations_statutaires, autres_contribution, csg_non_ir,csg_crds_ir,allegement_cotisations) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setDouble(1, C.getSante());
            stmt.setDouble(2, C.getSs());
            stmt.setDouble(3, C.getComp_incap_inval_deces());
            stmt.setDouble(4, C.getComp_sante());
            stmt.setDouble(5, C.getAt_mp());
            stmt.setDouble(6, C.getRetraite());
            stmt.setDouble(7, C.getSs_plaf());
            stmt.setDouble(8, C.getSs_deplaf());
            stmt.setDouble(9, C.getComp_ta());
            stmt.setDouble(10, C.getComp_gmp());
            stmt.setDouble(11, C.getComp_tb());
            stmt.setDouble(12, C.getComp_tc());
            stmt.setDouble(13, C.getComp_t1());
            stmt.setDouble(14, C.getComp_t2());
            stmt.setDouble(15, C.getSup());
            stmt.setDouble(16, C.getFamille_ss());
            stmt.setDouble(17, C.getAssu_chom());
            stmt.setDouble(18, C.getChomage());
            stmt.setDouble(19, C.getApec());
            stmt.setDouble(20, C.getCotisations_statutaires());
            stmt.setDouble(21, C.getAutres_contribution());
            stmt.setDouble(22, C.getCsg_non_ir());
            stmt.setDouble(23, C.getCsg_crds_ir());
            stmt.setDouble(24, C.getAllegement_cotisations());
            stmt.executeUpdate();

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode()); 
        } catch (Exception ex) {
            // handle any errors
            System.out.println(ex.getMessage());
        }
    }
            
        public void Update(ChargesCotisations C) {

        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("update personnel set sante=?, ss=?,comp_incap_Inval_deces=?, comp_sante=?, at_mp=?, retraite=?, ss_plaf=?, ss_deplaf=?, comp_ta=?, comp_gmp=?, comp_tb=?, comp_tc=?,comp_t1=?, comp_t2=?, sup=?, famille_ss=?, assu_chom=?, chomage=?, apec=?, cotisations_statutaires=?, autres_contribution=?, csg_non_ir=?,csg_crds_ir=?,allegement_cotisations=? where id=?");
            stmt.setDouble(1, C.getSante());
            stmt.setDouble(2, C.getSs());
            stmt.setDouble(3, C.getComp_incap_inval_deces());
            stmt.setDouble(4, C.getComp_sante());
            stmt.setDouble(5, C.getAt_mp());
            stmt.setDouble(6, C.getRetraite());
            stmt.setDouble(7, C.getSs_plaf());
            stmt.setDouble(8, C.getSs_deplaf());
            stmt.setDouble(9, C.getComp_ta());
            stmt.setDouble(10, C.getComp_gmp());
            stmt.setDouble(11, C.getComp_tb());
            stmt.setDouble(12, C.getComp_tc());
            stmt.setDouble(13, C.getComp_t1());
            stmt.setDouble(14, C.getComp_t2());
            stmt.setDouble(15, C.getSup());
            stmt.setDouble(16, C.getFamille_ss());
            stmt.setDouble(17, C.getAssu_chom());
            stmt.setDouble(18, C.getChomage());
            stmt.setDouble(19, C.getApec());
            stmt.setDouble(20, C.getCotisations_statutaires());
            stmt.setDouble(21, C.getAutres_contribution());
            stmt.setDouble(22, C.getCsg_non_ir());
            stmt.setDouble(23, C.getCsg_crds_ir());
            stmt.setDouble(24, C.getAllegement_cotisations());
            stmt.executeUpdate();

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    } 
        
        public void Delete(ChargesCotisations C) {

        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("delete from charges_cotisations  where id=?"); 
            stmt.setInt(1, C.getId());
            stmt.executeUpdate();

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }
        public ChargesCotisations find(int id){
        Statement stmt = null;
        ResultSet rs = null;
        ChargesCotisations resultat = new ChargesCotisations();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM charges_cotisations WHERE id=" + id);
            
            while (rs.next()) {
                resultat = new ChargesCotisations (rs.getInt("id"), rs.getDouble("sante")
                , rs.getDouble("ss"), rs.getDouble("comp_incap_Inval_deces"), rs.getDouble("comp_sante"), rs.getDouble("at_mp")
                , rs.getDouble("retraite"), rs.getDouble("ss_plaf"), rs.getDouble("ss_deplaf"), rs.getDouble("comp_ta")
                , rs.getDouble("comp_gmp"), rs.getDouble("comp_tb"), rs.getDouble("comp_tc"), rs.getDouble("comp_t1")
                , rs.getDouble("comp_t2"), rs.getDouble("sup"), rs.getDouble("famille_ss"), rs.getDouble("assu_chom")
                , rs.getDouble("chomage"), rs.getDouble("apec"), rs.getDouble("cotisations_statutaires"), rs.getDouble("autres_contribution")
                , rs.getDouble("csg_non_ir"), rs.getDouble("csg_crds_ir"), rs.getDouble("allegement_cotisations"));
                
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
        return resultat;
    }
        
}