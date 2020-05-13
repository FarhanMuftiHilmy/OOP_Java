/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lego;

/**
 *
 * @author HILMI
 */
public class Main {
    public static void main(String[] args) { 
        Balok b = new Balok(10, 4, 3, "kayu", "merah"); 
        PrismaSegitiga ps3 = new PrismaSegitiga(5, 3, 10, "besi", "kuning");
        Tabung t = new Tabung(7, 10, "kayu", "biru"); 
        
        System.out.println(b);
        System.out.println(ps3);
        System.out.println(t);
        b.setP(3); 
        b.setL(13); 
        ps3.setWarna("ijo"); 
        ps3.setWarna("awan");
        t.setR(14);
        t.setR(0);
        System.out.println(b.getVolume()); 
        System.out.println(ps3.getVolume());
        System.out.println(t.getVolume()); 
        System.out.println(b); 
        System.out.println(ps3); 
        System.out.println(t); 
        
    }
}


