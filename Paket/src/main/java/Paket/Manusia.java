/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paket;

/**
 *
 * @author HILMI
 */
public class Manusia {
    private String nama;
    public Manusia(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    @Override
    public String toString(){
        return "Manusia{" + "nama=" + nama + '}';
    }
}
