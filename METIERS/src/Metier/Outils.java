/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.time.Instant;
import java.sql.Date;

/**
 *
 * @author afpa
 */
public class Outils {
    
    static public boolean Validationconges(Date d1,Date f1,Date d2, Date f2){
    
        if (d1.getTime() == d2.getTime() || d1.getTime()==f2.getTime() || f1.getTime() == d2.getTime() || f1.getTime()==f2.getTime()) {
            return false;
        }
        
        if (d1.getTime() < d2.getTime() && f1.getTime()>f2.getTime()) {
            return false;
        }
        
        if (d1.getTime() > d2.getTime() && f1.getTime()<f2.getTime()) {
            return false;
        }
        
        if (d1.getTime() > d2.getTime() && f1.getTime()>f2.getTime() && d1.getTime()<f2.getTime()){
            return false;
        }
        
        if (d1.getTime() < d2.getTime() && f1.getTime()<f2.getTime() && d2.getTime()<f1.getTime()){
            return false;
        }
        
        return true;
    }
    
    
    public static void main(String args[]) {

          
    }
    
}
