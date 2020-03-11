/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praktikan
 */
public class BukuNovel extends Buku{
    public BukuNovel(String judulBuku, int jumlahHalaman, String penulis, String penerbit){
        super(judulBuku, jumlahHalaman, penulis, penerbit);
    }
    public String toString(){
        return "buku novel judul buku = "+judulBuku+" jumlah halaman = "+jumlahHalaman+" penulis = "+penulis+" dan penerbit = "+penerbit;
    }
    
}
