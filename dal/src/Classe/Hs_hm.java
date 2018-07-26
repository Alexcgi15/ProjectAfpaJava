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
public class Hs_hm {
    private int id;
    private Date date_hs_hm;
    private Double nbre_hs_hm;
    private String commentaire;

    public Hs_hm(Date date_hs_hm, Double nbre_hs_hm, String commentaire) {
        this.date_hs_hm = date_hs_hm;
        this.nbre_hs_hm = nbre_hs_hm;
        this.commentaire = commentaire;
    }

    public Hs_hm(int id, Date date_hs_hm, Double nbre_hs_hm, String commentaire) {
        this.id = id;
        this.date_hs_hm = date_hs_hm;
        this.nbre_hs_hm = nbre_hs_hm;
        this.commentaire = commentaire;
    }
    
    public Hs_hm(){
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate_hs_hm() {
        return date_hs_hm;
    }

    public void setDate_hs_hm(Date date_hs_hm) {
        this.date_hs_hm = date_hs_hm;
    }

    public Double getNbre_hs_hm() {
        return nbre_hs_hm;
    }

    public void setNbre_hs_hm(Double nbre_hs_hm) {
        this.nbre_hs_hm = nbre_hs_hm;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
