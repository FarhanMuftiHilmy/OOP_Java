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
public class SegitigaSamaSisi extends Segitiga {
    
    public SegitigaSamaSisi(double sisi){
        super(sisi, 0);
        super.setTinggi(getTinggi());
    }
    
    @Override
    public double getTinggi(){
        return Matematika.getLurus(getLuas(), getLuas()/2);
    }
    
    @Override
    public void setTinggi(double tinggi){
        double alasBaru = Math.sqrt((4.0/3) * tinggi * tinggi);
        setAlas(alasBaru);
    }
    
    @Override
    public double getKeliling(){
        return 3 * getAlas();
    }
    
    @Override
    public String toString(){
        return "SegitigaSamaSisi{" + "sisi=" + getAlas() + '}';
    }
    
    
    
}
