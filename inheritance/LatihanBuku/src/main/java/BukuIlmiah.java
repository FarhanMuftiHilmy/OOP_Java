/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praktikan
 */
public class BukuIlmiah extends Buku {
    public BukuIlmiah(String judulBuku, String penulis, int jumlahHalaman, String pemilik, String namaInstansi){
        super(judulBuku, penulis, jumlahHalaman, pemilik, namaInstansi);
    }
    public String toString(){
        return "buku ilmiah judul buku = "+judulBuku+" penulis = "+penulis+" jumlah halaman = "+jumlahHalaman+" pemilik = "+pemilik+" dan nama Instansi = "+namaInstansi;
    }
}
