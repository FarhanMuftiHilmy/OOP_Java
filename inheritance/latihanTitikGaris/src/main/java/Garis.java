/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praktikan
 */
import java.lang.Math;
public class Garis {
    Titik titikAwal;
    Titik titikAkhir;
    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }
    public Titik getTitikAwal(){
        return titikAwal;
    }
    public Titik getTitikAkhir(){
        return titikAkhir;
    }
    public double getPanjang(){
        double jarak;
        double jarakX;
        double jarakY;
        jarakX = Math.pow((titikAkhir.getKoordX()-titikAwal.getKoordX()),2);
	jarakY = Math.pow((titikAkhir.getKoordY()-titikAwal.getKoordY()),2);
	jarak = Math.pow((jarakX+jarakY),0.5);
        return jarak;
    }
    public String toString(){
        return "garis dari "+getTitikAwal()+" sampai "+getTitikAkhir();
    }
}
