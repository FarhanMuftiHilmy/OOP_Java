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
public class Kerucut extends Tabung{
    public Kerucut(double r, double tinggi){
        super(r, tinggi);
    }
    public double getLuas(){
        return getLuasAlas() + Matematika.phi*getR()*getSisiMiring();
    }
    public double getSisiMiring(){
        return Matematika.getMiring(getR(), getTinggi());
    }
    public double getVolume(){
        return super.getVolume()/3; // atau bisa juga phi*getR()*getR()*getTinggi();
    }

    @Override
    public String toString() {
        return "Kerucut{" + "r=" + getR() + "tinggi="+ getTinggi() + '}';
    }

    
}
