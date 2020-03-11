/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praktikan
 */
public class BukuTulis extends Buku{
    public BukuTulis(int jumlahHalaman, String penerbit){
        super(jumlahHalaman, penerbit);
    }
    public String toString(){
        return "buku tulis jumlah halaman = "+jumlahHalaman+" dan penerbit"+penerbit;
    }
}
