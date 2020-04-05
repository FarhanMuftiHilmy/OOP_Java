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
public class SegitigaSamaKaki extends Segitiga{
    public SegitigaSamaKaki(double a, double t){
        super(a, t);
    }
    
    @Override
    public double getKeliling(){
        return getAlas() + 2*getSisiMiring();
    }
    
    public double getSisiMiring(){
        return Matematika.getMiring(getLuas()/2, getTinggi());
    }
    
    @Override
    public String toString(){
        return "SegitigaSamaKaki{" + "a=" + getAlas() + ", t=" + getTinggi() + '}';
    }
}
