/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praktikan
 */
public class Buku {
    protected String judulBuku;
    protected int jumlahHalaman;
    protected String pemilik;
    protected String penulis;
    protected String penerbit;    
    protected String namaInstansi;
    protected String namaPembimbing;
    protected String merk;
    protected long harga;
    // CONSTRUKTOR UNTUK BUKU NOVEL
    public Buku(String judulBuku, int jumlahHalaman, String penulis, String penerbit){
        this.judulBuku = judulBuku;
        this.jumlahHalaman = jumlahHalaman;
        this.penulis = penulis;
        this.penerbit = penerbit;
    }
    // CONSTRUKTOR UNTUK BUKU TULIS
    public Buku(int jumlahHalaman, String penerbit){
        this.jumlahHalaman = jumlahHalaman;
        this.penerbit = penerbit;
    }
    // CONSTRUKTOR UNTUK BUKU ILMIAH
    public Buku(String judulBuku, String penulis, int jumlahHalaman, String pemilik, String namaInstansi){
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
        this.pemilik = pemilik;
        this.namaInstansi = namaInstansi;
    }
    // CONSTRUKTOR UNTUK BUKU LAPORAN TA
    public Buku(String judulBuku, String penulis, int jumlahHalaman, String pemilik, String namaInstansi, String namaPembimbing){
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
        this.pemilik = pemilik;
        this.namaInstansi = namaInstansi;
        this.namaPembimbing = namaPembimbing;
    }
    // CONSTRUKTOR UNTUK BUKU HALUS
    public Buku(int jumlahHalaman, String pemilik, String merk, long harga){
        this.jumlahHalaman = jumlahHalaman;
        this.pemilik = pemilik;
        this.merk = merk;
        this.harga = harga;
    }
    //STTER GETTER
    public void setNamaPemilik(String pemilik){
        this.pemilik = pemilik;
    }
    public String getJudul(){
        return judulBuku;
    }
    public int getJumlahHalaman(){
        return jumlahHalaman;
    }
    public String getNamaPemilik(){
        return pemilik;
    }
    public String getNamaPenerbit(){
        return penerbit;
    }
    public String getNamaPenulis(){
        return penulis;
    }
    public String getMerk(){
        return merk;
    }
    public long harga(){
        return harga;
    }
}
