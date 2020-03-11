/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praktikan
 */
public class BukuHalus extends Buku {
    public BukuHalus(int jumlahHalaman, String pemilik, String merk, long harga){
        super(jumlahHalaman, pemilik, merk, harga);
    }
    public String toString(){
        return "buku halus jumlah halaman = "+jumlahHalaman+" pemilik = "+pemilik+" merk = "+merk+" dan harga = "+harga;
    }
}
