package Classe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author afpa
 */
public class IdentiteEmployeur {
    private int id;
    private String nom;
    private String adresse;
    private int cp;
    private String ville;
    private int n_siret;
    private int code_ape_naf;
    private String intitule_convention_collective;
    private String nom_entrprise;

    public IdentiteEmployeur() {
    }

    public IdentiteEmployeur(String nom, String adresse, int cp, String ville, int n_siret, int code_ape_naf, String intitule_convention_collective, String nom_entrprise) {
        this.nom = nom;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.n_siret = n_siret;
        this.code_ape_naf = code_ape_naf;
        this.intitule_convention_collective = intitule_convention_collective;
        this.nom_entrprise = nom_entrprise;
    }

    public IdentiteEmployeur(int id, String nom, String adresse, int cp, String ville, int n_siret, int code_ape_naf, String intitule_convention_collective, String nom_entrprise) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.n_siret = n_siret;
        this.code_ape_naf = code_ape_naf;
        this.intitule_convention_collective = intitule_convention_collective;
        this.nom_entrprise = nom_entrprise;
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

    public int getN_siret() {
        return n_siret;
    }

    public void setN_siret(int n_siret) {
        this.n_siret = n_siret;
    }

    public int getCode_ape_naf() {
        return code_ape_naf;
    }

    public void setCode_ape_naf(int code_ape_naf) {
        this.code_ape_naf = code_ape_naf;
    }

    public String getIntitule_convention_collective() {
        return intitule_convention_collective;
    }

    public void setIntitule_convention_collective(String intitule_convention_collective) {
        this.intitule_convention_collective = intitule_convention_collective;
    }

    public String getNom_entrprise() {
        return nom_entrprise;
    }

    public void setNom_entrprise(String nom_entrprise) {
        this.nom_entrprise = nom_entrprise;
    }
}
