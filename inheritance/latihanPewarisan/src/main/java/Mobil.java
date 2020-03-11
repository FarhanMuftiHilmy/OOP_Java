/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praktikan
 */
public class Mobil {
    String noPlat;
    protected int kecepatan;
    protected char perseneleng;
    public Mobil(String noPlat){
        this.noPlat = noPlat;
        this.kecepatan = 0;
        this.perseneleng = 'N';
    
    }
    
    //GETTER noPlat
    public String getPlat(){
        return noPlat;
    }
    //GETTER kecepatan
    public int getKecepatan(){
        return kecepatan;
    }
    //GETTER perseneleng
    public char getPerseneleng(){
        return perseneleng;
    }
    //SETTER kecepatan
    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }
    //SETTER perseneleng
    public void setPerseneleng(char perseneleng){
        this.perseneleng = perseneleng;
    }
}
