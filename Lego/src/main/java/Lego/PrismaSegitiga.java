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
public class PrismaSegitiga {
    int alas, tinggiAlas, tinggi;
    String bahan, warna;

    public PrismaSegitiga(int alas, int tinggiAlas, int tinggi, String bahan, String warna) {
        this.alas = alas;
        this.tinggiAlas = tinggiAlas;
        this.tinggi = tinggi;
        this.bahan = bahan;
        this.warna = warna;
        
    }
    // SETTER GETTER

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }
    
    public void setWarna(String warna){
        if (warna.equals("merah")  || warna.equals("kuning") || warna.equals("biru")){
            this.warna = warna;
        } 
    }
    
    public double getVolume(){
        return (0.5*tinggiAlas*alas)*tinggi;
    }

    @Override
    public String toString() {
        return "PrismaSegitiga{" + "alas=" + alas + ", tinggiAlas=" + tinggiAlas + ", tinggi=" + tinggi + ", bahan=" + bahan + ", warna=" + warna + '}';
    }
    
    
}
