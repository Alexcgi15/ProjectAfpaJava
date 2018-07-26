/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Metier.Outils;
import java.sql.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author afpa
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
     @Test
     public void test1() {
     boolean resultat = Outils.Validationconges(new Date(2018, 1,5),new Date(2018, 1,12),new Date(2018,3,3),new Date(2018,3,4));
     
     assertEquals(resultat,true);
     }
     @Test
     public void test2(){
     boolean resultat = Outils.Validationconges(new Date(2018, 3,5),new Date(2018, 3,12),new Date(2018,1,3),new Date(2018,1,4));
     
     assertEquals(resultat,true);
     }
     @Test
     public void test3(){
     boolean resultat = Outils.Validationconges(new Date(2018, 1,4),new Date(2018, 1,10),new Date(2018,1,3),new Date(2018,1,6));
     
     assertEquals(resultat,false);
     }
      @Test
     public void test4(){
     boolean resultat = Outils.Validationconges(new Date(2018, 1,4),new Date(2018, 1,10),new Date(2018,1,6),new Date(2018,1,13));
     
     assertEquals(resultat,false);
     }
       @Test
     public void test5(){
     boolean resultat = Outils.Validationconges(new Date(2018, 1,4),new Date(2018, 1,10),new Date(2018,1,2),new Date(2018,1,12));
     
     assertEquals(resultat,false);
     }
        @Test
     public void test6(){
     boolean resultat = Outils.Validationconges(new Date(2018, 1,4),new Date(2018, 1,10),new Date(2018,1,6),new Date(2018,1,8));
         
     assertEquals(resultat,false);   
     }
}
