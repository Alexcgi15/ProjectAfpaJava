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
public class Absence {
    
    private int id;
    private Date date_debut;
    private Date date_fin;
    private String type;
    private Date date_pose;
    private Date date_validation;
    private Double indemnites;
    private int id_personnel;
    private String nom;

    public Absence(int id, Date date_debut, Date date_fin, String type, Date date_pose, Date date_validation, Double indemnites, int id_personnel, String nom) {
        this.id = id;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.type = type;
        this.date_pose = date_pose;
        this.date_validation = date_validation;
        this.indemnites = indemnites;
        this.id_personnel = id_personnel;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Absence(Date date_debut, Date date_fin, String type, Date date_pose, Date date_validation, Double indemnites, int id_personnel) {
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.type = type;
        this.date_pose = date_pose;
        this.date_validation = date_validation;
        this.indemnites = indemnites;
        this.id_personnel = id_personnel;
    }

    public Absence(int id, Date date_debut, Date date_fin, String type, Date date_pose, Date date_validation, Double indemnites, int id_personnel) {
        this.id = id;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.type = type;
        this.date_pose = date_pose;
        this.date_validation = date_validation;
        this.indemnites = indemnites;
        this.id_personnel = id_personnel;
    }

    public Absence(){
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate_pose() {
        return date_pose;
    }

    public void setDate_pose(Date date_pose) {
        this.date_pose = date_pose;
    }

    public Date getDate_validation() {
        return date_validation;
    }

    public void setDate_validation(Date date_validation) {
        this.date_validation = date_validation;
    }

    public Double getIndemnites() {
        return indemnites;
    }

    public void setIndemnites(Double indemnites) {
        this.indemnites = indemnites;
    }

    public int getId_personnel() {
        return id_personnel;
    }

    public void setId_personnel(int id_personnel) {
        this.id_personnel = id_personnel;
    }
           
}
