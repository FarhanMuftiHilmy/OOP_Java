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
public class Main {
    public static void main(String[] args){
        Mahasiswa st1 = new Mahasiswa("Mr X satu");
        System.out.println(st1.getProdi());
        System.out.println(st1.getNama());
        Mahasiswa st2 = new Mahasiswa("Mr X dua");
        System.out.println(st2.getProdi());
        System.out.println(st2.getNama());
        
        st1.setProdi("Teknologi RPL");
        st1.setNama("Agus");
        st2.setProdi("Teknologi Rekayasa Perangkat Lunak");
        st2.setNama("Budi");
        
        System.out.println(st1.getProdi());
        System.out.println(st1.getNama());
        
        System.out.println(st2.getProdi());
        System.out.println(st2.getNama());
    }
}
