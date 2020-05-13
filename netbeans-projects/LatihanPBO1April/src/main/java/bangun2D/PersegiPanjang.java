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
public class PersegiPanjang {
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double getPanjang(){
        return panjang;
    }
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    public double getLebar(){
        return lebar;
    }
    public void setLebar(double lebar){
        this.lebar = lebar;
    }
    public double getLuas(){
        return panjang*lebar;
    }
    public double getKeliling(){
        return 2*(panjang+lebar);
    }
    
    @Override
    public String toString(){
        return "PersegiPanjang{" + "panjang=" + panjang + ", lebar=" + lebar + '}';
    }
}
