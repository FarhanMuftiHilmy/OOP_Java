/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun3D;
import bangun2D.*;
/**
 *
 * @author HILMI
 */
public class Limas {
     private Segitiga alas;
     private Lingkaran r;
     private Persegi sisi;
     private double tinggi;

    public Limas(Segitiga alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public Limas(Lingkaran r, double tinggi) {
        this.r = r;
        this.tinggi = tinggi;
    }
    public Limas(Persegi sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    public Lingkaran getR() {
        return r;
    }

    public void setR(Lingkaran r) {
        this.r = r;
    }

    public Persegi getSisi() {
        return sisi;
    }

    public void setSisi(Persegi sisi) {
        this.sisi = sisi;
    }
  
   
    
    public Segitiga getAlas() {
        return alas;
    }

    public void setAlas(Segitiga alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public String getDetailAlas(){
        if(alas instanceof SegitigaSiku){
            return "Segitiga Siku";
        }
        else if(alas instanceof SegitigaSamaKaki){
            return "Segitiga Sama Kaki";
        }
        else if(alas instanceof SegitigaSamaSisi){
            return "Segitiga Sama Sisi";
        }
        else if(r instanceof Lingkaran){
            return "Lingkaran";
        }
        else if(sisi instanceof Persegi){
            return "Persegi";
        }
        else{
            return "Segitiga";
        }
            
            
    }
     
     
    
}
