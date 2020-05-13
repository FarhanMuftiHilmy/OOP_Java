/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gelas;

/**
 *
 * @author HILMI
 */
public class Gelas {
    int kapasitasTerisi;
    int kapasitasUtama;
        
    public Gelas(int kapasitasTerisi, int kapasitasUtama){
        this.kapasitasTerisi = kapasitasTerisi;
        this.kapasitasUtama = kapasitasUtama;
    }
    public void isiPenuh(){
        this.kapasitasTerisi += this.kapasitasUtama - this.kapasitasTerisi;
    }
    public void tuang(Gelas Tujuan){
       if(Tujuan.kapasitasTerisi == 0){
           Tujuan.kapasitasTerisi += this.kapasitasTerisi;
           this.kapasitasTerisi = 0;
       }else{
           Tujuan.kapasitasTerisi = Tujuan.kapasitasTerisi + Tujuan.kapasitasUtama - this.kapasitasUtama;
           this.kapasitasTerisi -= Tujuan.kapasitasUtama - this.kapasitasUtama;
       }
       
    }
    public void buang(){
        kapasitasTerisi = 0;
    }

    public int getKapasitasTerisi() {
        return kapasitasTerisi;
    }

    public void setKapasitasTerisi(int kapasitasTerisi) {
        this.kapasitasTerisi = kapasitasTerisi;
    }

    public int getKapasitasUtama() {
        return kapasitasUtama;
    }

    public void setKapasitasUtama(int kapasitasUtama) {
        this.kapasitasUtama = kapasitasUtama;
    }

    @Override
    public String toString() {
        return "Gelas{" + "kapasitasTerisi=" + kapasitasTerisi + ", kapasitasUtama=" + kapasitasUtama + '}';
    }
        
}
