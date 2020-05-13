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
public class SegitigaSiku extends Segitiga {
    public SegitigaSiku(double a, double t){
        super(a, t);
    }
    
    @Override
    public double getKeliling(){
        return getAlas() + getTinggi() + getSisiMiring();
    }
    public double getSisiMiring(){
        return Matematika.getMiring(getAlas(), getTinggi());
    }
    @Override
    public String toString(){
        return "SegitigaSiku{" + "a=" + getAlas() + ", t=" + getTinggi() + '}';
    }
}
