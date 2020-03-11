/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praktikan
 */
public class BukuLaporanTA extends Buku {
    public BukuLaporanTA(String judulBuku, String penulis, int jumlahHalaman, String pemilik, String namaInstansi, String namaPembimbing){
        super(judulBuku, penulis, jumlahHalaman, pemilik, namaInstansi, namaPembimbing);
    }
    public String toString(){
        return "buku laporan TA judul buku = "+judulBuku+" penulis = "+penulis+" jumlah halaman = "+jumlahHalaman+" pemilik = "+pemilik+" nama Instansi = "+namaInstansi+" dan nama pembimbing = "+namaPembimbing;
    }
}
