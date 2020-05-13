/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun3D;
import master.Matematika;
/**
 *
 * @author HILMI
 */
public class Tabung {
    private double r;
    private double tinggi;
    
    public Tabung(double r, double tinggi){
        this.r = r;
        this.tinggi = tinggi;
    }
    public double getR(){
        return r;
    }
    public void setR(double r){
        this.r = r;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getLuas(){
        return 2*getLuasAlas() + 2*Matematika.phi*r*tinggi;
    }
    public double getLuasAlas(){
        return Matematika.phi*r*r;
    }
    public double getVolume(){
        return Matematika.phi*r*r*tinggi;
    }
    @Override
    public String toString(){
        return "Tabung{" + "r=" + r + "tinggi=" + tinggi + '}';
    }
}

