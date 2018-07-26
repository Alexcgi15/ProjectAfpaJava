package Principale;


import Classe.Personnel;
import DAO.PersonnelDAO;
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonnelDAO repo = new PersonnelDAO();
        
        //Personnel personnel = new Personnel("","fghfgh","","",0,"","",new Date(1,1,1),"","","",new Date(1,1,1),0,"","","","","","",new Date(1,1,1),"",0);
        
        //repo.Insert(personnel);
        
        for (Personnel p : repo.List()) {
            System.out.println(p.getNom());
        }
    }
}