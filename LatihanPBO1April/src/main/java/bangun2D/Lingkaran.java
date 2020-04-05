/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun2D;
import master.Matematika;
/**
 *
 * @author HILMI
 */
public class Lingkaran {
    private double r;
    
    public Lingkaran(double r){
        this.r = r;
    }
    
    public double getR(){
        return r;
    }
    
    public void setR(double r){
        this.r = r;
    }
    
    public double getLuas(){
        return Matematika.phi*r*r;
    }
    
    public double getKeliling(){
        return 2*Matematika.phi*r;
    }
    
    @Override
    public String toString(){
        return "Lingkarna{" + "r=" + r + '}';
    }
    
    
}
