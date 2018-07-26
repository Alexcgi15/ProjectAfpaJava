package Classe;


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
public class Personnel {
    	private int id;
	private String nom;
	private String prenom;
	private String sexe;
	private String adresse;
	private int cp;
	private String ville;
	private String statut;
	private Date date_naissance;
	private String lieu_naissance;
        private String telephone;  
	private String mail;
        private String situation_perso;
        private int nb_enfant;
	private Date date_embauche;
        private int solde_RTT;
        private int solde_CP;
	private String poste;
	private String qualification;
	private String specialite;
	private String commentaire;
	private String identifiant;
	private String mdp;
        private String type_contrat;
        private Date date_fin_embauche;
	private int id_centre_cout;

    public Personnel(String nom, String prenom, String sexe, String adresse, int cp, String ville, String statut, Date date_naissance, String lieu_naissance, String telephone, String mail, String situation_perso, int nb_enfant, Date date_embauche, int solde_RTT, int solde_CP, String poste, String qualification, String specialite, String commentaire, String identifiant, String mdp, String type_contrat, Date date_fin_embauche, int id_centre_cout) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.statut = statut;
        this.date_naissance = date_naissance;
        this.lieu_naissance = lieu_naissance;
        this.telephone = telephone;
        this.mail = mail;
        this.situation_perso = situation_perso;
        this.nb_enfant = nb_enfant;
        this.date_embauche = date_embauche;
        this.solde_RTT = solde_RTT;
        this.solde_CP = solde_CP;
        this.poste = poste;
        this.qualification = qualification;
        this.specialite = specialite;
        this.commentaire = commentaire;
        this.identifiant = identifiant;
        this.mdp = mdp;
        this.type_contrat = type_contrat;
        this.date_fin_embauche = date_fin_embauche;
        this.id_centre_cout = id_centre_cout;
    }

    public Personnel(int id, String nom, String prenom, String sexe, String adresse, int cp, String ville, String statut, Date date_naissance, String lieu_naissance, String telephone, String mail, String situation_perso, int nb_enfant, Date date_embauche, int solde_RTT, int solde_CP, String poste, String qualification, String specialite, String commentaire, String identifiant, String mdp, String type_contrat, Date date_fin_embauche, int id_centre_cout) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.statut = statut;
        this.date_naissance = date_naissance;
        this.lieu_naissance = lieu_naissance;
        this.telephone = telephone;
        this.mail = mail;
        this.situation_perso = situation_perso;
        this.nb_enfant = nb_enfant;
        this.date_embauche = date_embauche;
        this.solde_RTT = solde_RTT;
        this.solde_CP = solde_CP;
        this.poste = poste;
        this.qualification = qualification;
        this.specialite = specialite;
        this.commentaire = commentaire;
        this.identifiant = identifiant;
        this.mdp = mdp;
        this.type_contrat = type_contrat;
        this.date_fin_embauche = date_fin_embauche;
        this.id_centre_cout = id_centre_cout;
    }

      public Personnel() {
    }

    public Personnel(String text, String text0, String sexe, String text1, int code_postale, String text2, String statut, java.util.Date date_naissance, String text3, String text4, String text5, String situation, int nb_enfant, String date_embauche, int rtt, int cp, String text6, String text7, String text8, String text9, String text10, String text11, int typecontrat, String date_fin_contrat, int service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getLieu_naissance() {
        return lieu_naissance;
    }

    public void setLieu_naissance(String lieu_naissance) {
        this.lieu_naissance = lieu_naissance;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSituation_perso() {
        return situation_perso;
    }

    public void setSituation_perso(String situation_perso) {
        this.situation_perso = situation_perso;
    }

    public int getNb_enfant() {
        return nb_enfant;
    }

    public void setNb_enfant(int nb_enfant) {
        this.nb_enfant = nb_enfant;
    }

    public Date getDate_embauche() {
        return date_embauche;
    }

    public void setDate_embauche(Date date_embauche) {
        this.date_embauche = date_embauche;
    }

    public int getSolde_RTT() {
        return solde_RTT;
    }

    public void setSolde_RTT(int solde_RTT) {
        this.solde_RTT = solde_RTT;
    }

    public int getSolde_CP() {
        return solde_CP;
    }

    public void setSolde_CP(int solde_CP) {
        this.solde_CP = solde_CP;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getType_contrat() {
        return type_contrat;
    }

    public void setType_contrat(String type_contrat) {
        this.type_contrat = type_contrat;
    }

    public Date getDate_fin_embauche() {
        return date_fin_embauche;
    }

    public void setDate_fin_embauche(Date date_fin_embauche) {
        this.date_fin_embauche = date_fin_embauche;
    }

    public int getId_centre_cout() {
        return id_centre_cout;
    }

    public void setId_centre_cout(int id_centre_cout) {
        this.id_centre_cout = id_centre_cout;
    }
}