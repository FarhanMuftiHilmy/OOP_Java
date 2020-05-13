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
public class Tabung {
    int r, tinggi;
    String bahan, warna;

    public Tabung(int r, int tinggi, String bahan, String warna) {
        this.r = r;
        this.tinggi = tinggi;
        this.bahan = bahan;
        this.warna = warna;
    }
    
    //SETTER GETTER
    public int getR(){
        return r;
    }
    public void setR(int r){
        if(r > 0){
            this.r = r;
        }
        
    }
    public double getVolume(){
        return (3.14*r*r)*tinggi;
    }

    @Override
    public String toString() {
        return "Tabung{" + "r=" + r + ", tinggi=" + tinggi + ", bahan=" + bahan + ", warna=" + warna + '}';
    }
}
