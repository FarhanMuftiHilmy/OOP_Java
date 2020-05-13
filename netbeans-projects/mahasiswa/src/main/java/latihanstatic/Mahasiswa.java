/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstatic;

/**
 *
 * @author HILMI
 */
public class Mahasiswa {
    private static String prodi = "TRPL";
    private String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public static String getProdi() {
        return prodi;
    }

    public static void setProdi(String prodi) {
        Mahasiswa.prodi = prodi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public static void gantiNama(String namaBaru){
        this.nama = nama;
    }
    public static String tanyaNama(){
        return nama;
    }
    public static String getDetail(){
        return "MahasiswaO(" +  "nama=" + getNama() + 
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nama=" + nama +  "prodi=" + prodi + '}';
    }
    
    
}
