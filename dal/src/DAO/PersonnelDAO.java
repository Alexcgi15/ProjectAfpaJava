package DAO;

import Principale.Connexion;
import Classe.Personnel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class PersonnelDAO {
       Connection conn = null;

    public PersonnelDAO() {
        Connexion connexion = new Connexion();
        this.conn = connexion.getConnexion();
    }

    public List<Personnel> List() {
        List<Personnel> resultat = new ArrayList<Personnel>();

        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM personnel");
            
            while (rs.next()) {
                Personnel P = new Personnel(rs.getInt("id"), rs.getString("nom"), rs.getString(("prenom"))
                , rs.getString(("sexe")), rs.getString(("adresse")), rs.getInt(("cp")), rs.getString(("ville"))
                , rs.getString(("statut")), rs.getDate(("date_naissance")), rs.getString(("lieu_naissance")),rs.getString(("telephone"))
                , rs.getString(("mail")),rs.getString(("situation_perso")),rs.getInt(("nb_enfant")), rs.getDate(("date_embauche")), rs.getInt(("solde_RTT")),rs.getInt("solde_CP"), rs.getString(("poste")), rs.getString(("qualification"))
                , rs.getString(("specialite")), rs.getString(("commentaire")), rs.getString(("identifiant")), rs.getString(("mdp")),rs.getString("type_contrat"),rs.getDate(("date_fin_embauche"))
                , rs.getInt(("id_centre_cout")));
                resultat.add(P);
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    } 
    
        public void Insert(Personnel P) {

        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("INSERT INTO personnel (nom, prenom,sexe, adresse, cp, ville, statut, date_naissance, lieu_naissance, telephone, mail,situation_perso,nb_enfant, date_embauche,solde_RTT,solde_CP, poste, qualification, specialite, commentaire, identifiant, mdp, type_contrat, date_fin_embauche, id_centre_cout) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, P.getNom());
            stmt.setString(2, P.getPrenom());
            stmt.setString(3, P.getSexe());
            stmt.setString(4, P.getAdresse());
            stmt.setInt(5, P.getCp());
            stmt.setString(6, P.getVille());
            stmt.setString(7, P.getStatut());
            stmt.setDate(8, P.getDate_naissance());
            stmt.setString(9, P.getLieu_naissance());
            stmt.setString(10, P.getTelephone());
            stmt.setString(11, P.getMail());
            stmt.setString(12, P.getSituation_perso());
            stmt.setInt(13, P.getNb_enfant());
            stmt.setDate(14, P.getDate_embauche());
            stmt.setInt(15, P.getSolde_RTT());
            stmt.setInt(16, P.getSolde_CP());
            stmt.setString(17, P.getPoste());
            stmt.setString(18, P.getQualification());
            stmt.setString(19, P.getSpecialite());
            stmt.setString(20, P.getCommentaire());
            stmt.setString(21, P.getIdentifiant());
            stmt.setString(22, P.getMdp());
            stmt.setString(23, P.getType_contrat());
            stmt.setDate(24, P.getDate_fin_embauche());
            stmt.setInt(25, P.getId_centre_cout());
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
    
    public List<Personnel> List_By_Name(String nom) {
        List<Personnel> resultat = new ArrayList<Personnel>();

        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM personnel where nom like '%"+nom+"%'");
            
            while (rs.next()) {
                Personnel P = new Personnel(rs.getInt("id"), rs.getString("nom"), rs.getString(("prenom"))
                , rs.getString(("sexe")), rs.getString(("adresse")), rs.getInt(("cp")), rs.getString(("ville"))
                , rs.getString(("statut")), rs.getDate(("date_naissance")), rs.getString(("lieu_naissance")),rs.getString(("telephone"))
                , rs.getString(("mail")),rs.getString(("situation_perso")),rs.getInt(("nb_enfant")), rs.getDate(("date_embauche")), rs.getInt(("solde_RTT")),rs.getInt("solde_CP"), rs.getString(("poste")), rs.getString(("qualification"))
                , rs.getString(("specialite")), rs.getString(("commentaire")), rs.getString(("identifiant")), rs.getString(("mdp")),rs.getString("type_contrat"),rs.getDate(("date_fin_embauche"))
                , rs.getInt(("id_centre_cout")));
                resultat.add(P);
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
    
    public Personnel List_By_id(int id) {
        Personnel resultat = null;

        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM personnel where id like '%"+id+"%'");
            
            while (rs.next()) {
                resultat = new Personnel(rs.getInt("id"), rs.getString("nom"), rs.getString(("prenom"))
                , rs.getString(("sexe")), rs.getString(("adresse")), rs.getInt(("cp")), rs.getString(("ville"))
                , rs.getString(("statut")), rs.getDate(("date_naissance")), rs.getString(("lieu_naissance")),rs.getString(("telephone"))
                , rs.getString(("mail")),rs.getString(("situation_perso")),rs.getInt(("nb_enfant")), rs.getDate(("date_embauche")), rs.getInt(("solde_RTT")),rs.getInt("solde_CP"), rs.getString(("poste")), rs.getString(("qualification"))
                , rs.getString(("specialite")), rs.getString(("commentaire")), rs.getString(("identifiant")), rs.getString(("mdp")),rs.getString("type_contrat"),rs.getDate(("date_fin_embauche"))
                , rs.getInt(("id_centre_cout")));
                //resultat.add(P);
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
    
    public List<Personnel> List_By_id_centre_cout(int id_centre_cout) {
        List<Personnel> resultat = new ArrayList<Personnel>();

        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM personnel where id_centre_cout like '%"+id_centre_cout+"%'");
            
            while (rs.next()) {
                Personnel P = new Personnel(rs.getInt("id"), rs.getString("nom"), rs.getString(("prenom"))
                , rs.getString(("sexe")), rs.getString(("adresse")), rs.getInt(("cp")), rs.getString(("ville"))
                , rs.getString(("statut")), rs.getDate(("date_naissance")), rs.getString(("lieu_naissance")),rs.getString(("telephone"))
                , rs.getString(("mail")),rs.getString(("situation_perso")),rs.getInt(("nb_enfant")), rs.getDate(("date_embauche")), rs.getInt(("solde_RTT")),rs.getInt("solde_CP"), rs.getString(("poste")), rs.getString(("qualification"))
                , rs.getString(("specialite")), rs.getString(("commentaire")), rs.getString(("identifiant")), rs.getString(("mdp")),rs.getString("type_contrat"),rs.getDate(("date_fin_embauche"))
                , rs.getInt(("id_centre_cout")));
                resultat.add(P);
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
    
    public List<Personnel> List_By_nom_centre_cout(String nom_centre_cout) {
        List<Personnel> resultat = new ArrayList<Personnel>();

        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT personnel.* FROM personnel join centre_cout on personnel.id_centre_cout=centre_cout.id where centre_cout.service like '%"+nom_centre_cout+"%'");
            
            while (rs.next()) {
                Personnel P = new Personnel(rs.getInt("id"), rs.getString("nom"), rs.getString(("prenom"))
                , rs.getString(("sexe")), rs.getString(("adresse")), rs.getInt(("cp")), rs.getString(("ville"))
                , rs.getString(("statut")), rs.getDate(("date_naissance")), rs.getString(("lieu_naissance")),rs.getString(("telephone"))
                , rs.getString(("mail")),rs.getString(("situation_perso")),rs.getInt(("nb_enfant")), rs.getDate(("date_embauche")), rs.getInt(("solde_RTT")),rs.getInt("solde_CP"), rs.getString(("poste")), rs.getString(("qualification"))
                , rs.getString(("specialite")), rs.getString(("commentaire")), rs.getString(("identifiant")), rs.getString(("mdp")),rs.getString("type_contrat"),rs.getDate(("date_fin_embauche"))
                , rs.getInt(("id_centre_cout")));
                resultat.add(P);
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
        
    public void Update(Personnel P) {

        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("update personnel set nom=?, prenom=?,sexe=?, adresse=?, cp=?, ville=?, statut=?, date_naissance=?, lieu_naissance=?, telephone=?, mail=?, situation_perso=?, nb_enfant=?, date_embauche=?,solde_RTT=?,solde_CP=?, poste=?, qualification=?, specialite=?, commentaire=?, identifiant=?, mdp=?, type_contrat=?, date_fin_embauche=?, id_centre_cout=? where id=?");
            stmt.setString(1, P.getNom());
            stmt.setString(2, P.getPrenom());
            stmt.setString(3, P.getSexe());
            stmt.setString(4, P.getAdresse());
            stmt.setInt(5, P.getCp());
            stmt.setString(6, P.getVille());
            stmt.setString(7, P.getStatut());
            stmt.setDate(8, P.getDate_naissance());
            stmt.setString(9, P.getLieu_naissance());
            stmt.setString(10, P.getTelephone());
            stmt.setString(11, P.getMail());
            stmt.setString(12, P.getSituation_perso());
            stmt.setInt(13, P.getNb_enfant());
            stmt.setDate(14, P.getDate_embauche());
            stmt.setInt(15, P.getSolde_RTT());
            stmt.setInt(16, P.getSolde_CP());
            stmt.setString(17, P.getPoste());
            stmt.setString(18, P.getQualification());
            stmt.setString(19, P.getSpecialite());
            stmt.setString(20, P.getCommentaire());
            stmt.setString(21, P.getIdentifiant());
            stmt.setString(22, P.getMdp());
            stmt.setString(23, P.getType_contrat());
            stmt.setDate(24, P.getDate_fin_embauche());
            stmt.setInt(25, P.getId_centre_cout());
            stmt.setInt(26, P.getId());
            stmt.executeUpdate();

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }
        public void Delete(Personnel P) {

        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("delete from personnel  where id=?"); 
            stmt.setInt(1, P.getId());
            stmt.executeUpdate();

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }
            public Personnel find(int id){
        Statement stmt = null;
        ResultSet rs = null;
        Personnel resultat = new Personnel();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM personnel WHERE id=" + id);
            
            while (rs.next()) {
                resultat = new Personnel(rs.getInt("id"), rs.getString("nom"), rs.getString(("prenom"))
                , rs.getString(("sexe")), rs.getString(("adresse")), rs.getInt(("cp")), rs.getString(("ville"))
                , rs.getString(("statut")), rs.getDate(("date_naissance")), rs.getString(("lieu_naissance")),rs.getString(("telephone"))
                , rs.getString(("mail")),rs.getString(("situation_perso")),rs.getInt(("nb_enfant")), rs.getDate(("date_embauche")), rs.getInt(("solde_RTT")),rs.getInt("solde_CP"), rs.getString(("poste")), rs.getString(("qualification"))
                , rs.getString(("specialite")), rs.getString(("commentaire")), rs.getString(("identifiant")), rs.getString(("mdp")),rs.getString("type_contrat"),rs.getDate(("date_fin_embauche"))
                , rs.getInt(("id_centre_cout")));
                
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
    public Personnel find(String nom){
        Statement stmt = null;
        ResultSet rs = null;
        Personnel resultat = new Personnel();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM personnel WHERE nom=" + nom);
            
            while (rs.next()) {
                resultat = new Personnel(rs.getInt("id"), rs.getString("nom"), rs.getString(("prenom"))
                , rs.getString(("sexe")), rs.getString(("adresse")), rs.getInt(("cp")), rs.getString(("ville"))
                , rs.getString(("statut")), rs.getDate(("date_naissance")), rs.getString(("lieu_naissance")),rs.getString(("telephone"))
                , rs.getString(("mail")),rs.getString(("situation_perso")),rs.getInt(("nb_enfant")), rs.getDate(("date_embauche")), rs.getInt(("solde_RTT")),rs.getInt("solde_CP"), rs.getString(("poste")), rs.getString(("qualification"))
                , rs.getString(("specialite")), rs.getString(("commentaire")), rs.getString(("identifiant")), rs.getString(("mdp")),rs.getString("type_contrat"),rs.getDate(("date_fin_embauche"))
                , rs.getInt(("id_centre_cout")));
                
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
    
    public Personnel findIdentifiant(String identifiant){
        Statement stmt = null;
        ResultSet rs = null;
        Personnel resultat = new Personnel();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM personnel WHERE identifiant=" + identifiant);
            
            while (rs.next()) {
                resultat = new Personnel(rs.getInt("id"), rs.getString("nom"), rs.getString(("prenom"))
                , rs.getString(("sexe")), rs.getString(("adresse")), rs.getInt(("cp")), rs.getString(("ville"))
                , rs.getString(("statut")), rs.getDate(("date_naissance")), rs.getString(("lieu_naissance")),rs.getString(("telephone"))
                , rs.getString(("mail")),rs.getString(("situation_perso")),rs.getInt(("nb_enfant")), rs.getDate(("date_embauche")), rs.getInt(("solde_RTT")),rs.getInt("solde_CP"), rs.getString(("poste")), rs.getString(("qualification"))
                , rs.getString(("specialite")), rs.getString(("commentaire")), rs.getString(("identifiant")), rs.getString(("mdp")),rs.getString("type_contrat"),rs.getDate(("date_fin_embauche"))
                , rs.getInt(("id_centre_cout")));
                
            }

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 

        return resultat;
    }
}
