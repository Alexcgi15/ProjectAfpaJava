package Principale;


import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class Connexion {
    private Connection connexion;

    public Connexion() {
        this.connexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/grh?user=root&password=");
        } catch ( SQLException ex ) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (Exception ex) {
            // handle any errors
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnexion() {
        return connexion;
    }
}
