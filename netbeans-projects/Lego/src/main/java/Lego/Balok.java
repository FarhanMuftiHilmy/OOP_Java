/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lego;

/**
 *
 * @author HILMI
 */
public class Balok {
    
    int panjang, lebar, tinggi;
    String bahan, warna;
    
    public Balok(int panjang, int lebar, int tinggi, String bahan, String warna){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.bahan = bahan;
        this.warna = warna;
    }
    
    
    
    // GETTER DAN SETTER
    public int getP(){
         return panjang;
    }
    public void setP(int panjang){
        if(panjang > lebar){
            this.panjang = panjang;
        }      
    }    
    public void setL(int lebar){
        if(lebar <= panjang){
            this.lebar = lebar;
        }         
    }
    
    public int getL(){
        return lebar;
    }
    public double getVolume(){
        return panjang*lebar*tinggi;
    }

    @Override
    public String toString() {
        return "Balok{" + "p=" + panjang + ", l=" + lebar + ", t=" + tinggi + ", bahan=" + bahan + ", warna=" + warna + '}';
    }
    
}
