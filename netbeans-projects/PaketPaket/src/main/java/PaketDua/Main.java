/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HILMI
 */
public class PaketDua {
    public class Main(){
        public static void main(String[] args){
            Tumbuhan pad = new Padi(5, 3);
            Tumbuhan piss = new Pisang(4, 9);
            System.out.println("1."+Tumbuhan.getPemilik());
            System.out.println("2."+pad.getPemilik());
            for(int i=0; i<5; i++){
                pad.tumbuh();
                piss.tumbuh();
            }
            System.out.println("3."+pad);
            System.out.println("4."+pad.getCaraBerkembangBiak());
            System.out.println("5."+pad.getJenisBatang());
            System.out.println("6."+piss);
            System.out.println("7."+piss.getCaraBerkembangBiak());
            System.out.println("8."+piss.getJenisBatang());
        }
    }
}
