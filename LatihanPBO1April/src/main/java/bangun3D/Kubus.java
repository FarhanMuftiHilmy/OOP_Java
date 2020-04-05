/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun3D;
import bangun2D.Persegi;
/**
 *
 * @author HILMI
 */
public class Kubus extends Persegi{
    public Kubus(double sisi){
        super(sisi);
    }
    @Override
    public double getLuas(){
        return 6*super.getLuas();
    }    
    @Override
    public double getKeliling(){
        return 12*getSisi();
    }
    
    public double getLuasAlas(){
        return super.getLuas();
    }
    
    public double getVolume(){
        return super.getLuas()*getSisi();
    }
    
    @Override
    public String toString(){
        return "Kubus{" + "sisi" + getSisi() + '}';
    }
}
