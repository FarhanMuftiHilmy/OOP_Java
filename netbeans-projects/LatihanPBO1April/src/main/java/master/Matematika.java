/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master;

/**
 *
 * @author HILMI
 */
public class Matematika {
    public static final double phi = 22.0/7;
    public static double getMiring(double a, double b){
        double miring =  a*a + b*b;
        return Math.sqrt(miring);
    }
    public static double getLurus(double miring, double a){
        double b = miring*miring - a*a;
        return Math.sqrt(b);
    }
}
