package Classe;


import java.sql.Date;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author afpa
 */
public class salaire {

    public salaire(double salaire_annuel_brut, int taux_horaire, int base_horaire, double prime, Date date_prime, double AI, Date date_AI, double AG, Date date_AG, String type_de_contrat, String nom_entrprise, int id_personnel, int id_charges_cotisations, int id_grlle_salaire, int id_hi_hm, int id_identite_employeur) {
        this.salaire_annuel_brut = salaire_annuel_brut;
        this.taux_horaire = taux_horaire;
        this.base_horaire = base_horaire;
        this.prime = prime;
        this.date_prime = date_prime;
        this.AI = AI;
        this.date_AI = date_AI;
        this.AG = AG;
        this.date_AG = date_AG;
        this.type_de_contrat = type_de_contrat;
        this.nom_entrprise = nom_entrprise;
        this.id_personnel = id_personnel;
        this.id_charges_cotisations = id_charges_cotisations;
        this.id_grlle_salaire = id_grlle_salaire;
        this.id_hi_hm = id_hi_hm;
        this.id_identite_employeur = id_identite_employeur;
    }

    public salaire(int id, double salaire_annuel_brut, int taux_horaire, int base_horaire, double prime, Date date_prime, double AI, Date date_AI, double AG, Date date_AG, String type_de_contrat, String nom_entrprise, int id_personnel, int id_charges_cotisations, int id_grlle_salaire, int id_hi_hm, int id_identite_employeur) {
        this.id = id;
        this.salaire_annuel_brut = salaire_annuel_brut;
        this.taux_horaire = taux_horaire;
        this.base_horaire = base_horaire;
        this.prime = prime;
        this.date_prime = date_prime;
        this.AI = AI;
        this.date_AI = date_AI;
        this.AG = AG;
        this.date_AG = date_AG;
        this.type_de_contrat = type_de_contrat;
        this.nom_entrprise = nom_entrprise;
        this.id_personnel = id_personnel;
        this.id_charges_cotisations = id_charges_cotisations;
        this.id_grlle_salaire = id_grlle_salaire;
        this.id_hi_hm = id_hi_hm;
        this.id_identite_employeur = id_identite_employeur;
    }
    
    private int id;
    private double salaire_annuel_brut;
    private int taux_horaire;
    private int base_horaire;
    private double prime;
    private Date date_prime;
    private double AI;
    private Date date_AI;
    private double AG;
    private Date date_AG;
    private String type_de_contrat;
    private String nom_entrprise;
    private int id_personnel;
    private int id_charges_cotisations;
    private int id_grlle_salaire;
    private int id_hi_hm;
    private int id_identite_employeur;
    
    public salaire(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalaire_annuel_brut() {
        return salaire_annuel_brut;
    }

    public void setSalaire_annuel_brut(double salaire_annuel_brut) {
        this.salaire_annuel_brut = salaire_annuel_brut;
    }

    public int getTaux_horaire() {
        return taux_horaire;
    }

    public void setTaux_horaire(int taux_horaire) {
        this.taux_horaire = taux_horaire;
    }

    public int getBase_horaire() {
        return base_horaire;
    }

    public void setBase_horaire(int base_horaire) {
        this.base_horaire = base_horaire;
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public Date getDate_prime() {
        return date_prime;
    }

    public void setDate_prime(Date date_prime) {
        this.date_prime = date_prime;
    }

    public double getAI() {
        return AI;
    }

    public void setAI(double AI) {
        this.AI = AI;
    }

    public Date getDate_AI() {
        return date_AI;
    }

    public void setDate_AI(Date date_AI) {
        this.date_AI = date_AI;
    }

    public double getAG() {
        return AG;
    }

    public void setAG(double AG) {
        this.AG = AG;
    }

    public Date getDate_AG() {
        return date_AG;
    }

    public void setDate_AG(Date date_AG) {
        this.date_AG = date_AG;
    }

    public String getType_de_contrat() {
        return type_de_contrat;
    }

    public void setType_de_contrat(String type_de_contrat) {
        this.type_de_contrat = type_de_contrat;
    }

    public String getNom_entrprise() {
        return nom_entrprise;
    }

    public void setNom_entrprise(String nom_entrprise) {
        this.nom_entrprise = nom_entrprise;
    }

    public int getId_personnel() {
        return id_personnel;
    }

    public void setId_personnel(int id_personnel) {
        this.id_personnel = id_personnel;
    }

    public int getId_charges_cotisations() {
        return id_charges_cotisations;
    }

    public void setId_charges_cotisations(int id_charges_cotisations) {
        this.id_charges_cotisations = id_charges_cotisations;
    }

    public int getId_grlle_salaire() {
        return id_grlle_salaire;
    }

    public void setId_grlle_salaire(int id_grlle_salaire) {
        this.id_grlle_salaire = id_grlle_salaire;
    }

    public int getId_hi_hm() {
        return id_hi_hm;
    }

    public void setId_hi_hm(int id_hi_hm) {
        this.id_hi_hm = id_hi_hm;
    }

    public int getId_identite_employeur() {
        return id_identite_employeur;
    }

    public void setId_identite_employeur(int id_identite_employeur) {
        this.id_identite_employeur = id_identite_employeur;
    }
}
