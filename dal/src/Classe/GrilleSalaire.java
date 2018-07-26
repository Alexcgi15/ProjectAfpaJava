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
public class GrilleSalaire {
    private int id;
    private int coefficient;
    private double salaire_min;
    private double salaire_max;


    public GrilleSalaire(int id, int coefficient, double salaire_min, double salaire_max) {
        this.id = id;
        this.coefficient = coefficient;
        this.salaire_min = salaire_min;
        this.salaire_max = salaire_max;
    }

    public GrilleSalaire(int coefficient, double salaire_min, double salaire_max) {
        this.coefficient = coefficient;
        this.salaire_min = salaire_min;
        this.salaire_max = salaire_max;
    }

    public GrilleSalaire() {
    }

    public int getId() {
        return id;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public double getSalaire_min() {
        return salaire_min;
    }

    public void setSalaire_min(double salaire_min) {
        this.salaire_min = salaire_min;
    }

    public double getSalaire_max() {
        return salaire_max;
    }

    public void setSalaire_max(double salaire_max) {
        this.salaire_max = salaire_max;
    }
    
    
}
