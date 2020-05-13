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
public class Persegi {
    private double sisi;
    
    public Persegi(double sisi){
        this.sisi = sisi;
    }
    
    public double getSisi(){
        return sisi;
    }
    
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    
    public double getLuas(){
        return sisi*sisi;
    }
    
    public double getKeliling(){
        return 4*sisi;
    }
    
    
}
