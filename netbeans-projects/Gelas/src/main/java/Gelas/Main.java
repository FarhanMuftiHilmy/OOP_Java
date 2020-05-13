/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gelas;

/**
 *
 * @author HILMI
 */
public class Main {
    
    public static void main(String[] args){
        Gelas a = new Gelas(0, 7);
        Gelas b = new Gelas(0, 9);
        System.out.println("Initial value");
        System.out.println(a);
        System.out.println(b);
        a.isiPenuh();
        a.tuang(b);    
        System.out.println("Move 1");
        System.out.println(a);
        System.out.println(b);
        a.isiPenuh();
        a.tuang(b);  
        System.out.println("Move 2");
        System.out.println(a);
        System.out.println(b);
        b.buang();
        a.tuang(b);
        System.out.println("Move 3");
        System.out.println(a);
        System.out.println(b);
        
    }
}
