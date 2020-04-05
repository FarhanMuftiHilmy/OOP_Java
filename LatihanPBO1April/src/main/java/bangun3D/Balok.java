/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun3D;
import bangun2D.PersegiPanjang;
/**
 *
 * @author HILMI
 */
public class Balok extends PersegiPanjang{
    private double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    @Override
    public double getLuas(){
        return 2*(getPanjang()*getLebar()+getPanjang()*tinggi+getLebar()*tinggi);
    }
    @Override
    public double getKeliling(){
        return 4*(getPanjang()+getLebar()+tinggi);
    }
    public double getLuasAlas(){
        return super.getLuas();
    }
    public double getVolume(){
        return super.getLuas()*tinggi;
    }
    
    @Override
    public String toString(){
        return "Balok{" + getPanjang() + ", lebar=" + getLebar() + "tinggi=" + tinggi + '}';
    }
    
}
