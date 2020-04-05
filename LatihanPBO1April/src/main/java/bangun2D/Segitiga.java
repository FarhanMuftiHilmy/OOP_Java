/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun2D;

/**
 *
 * @author HILMI
 */
public abstract class Segitiga {
    private double alas;
    private double tinggi;
    
    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public double getAlas(){
        return alas;
    }
    public void setAlas(double alas){
        this.alas = alas;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getLuas(){
        return alas*tinggi/2;
    }
    public abstract double getKeliling();
    @Override
    public String toString(){
        return "Segitiga{" + "alas=" + alas + ", tinggi=" + '}';
    }
    
    
}
