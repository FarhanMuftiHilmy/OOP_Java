/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoalTitikTitik;

/**
 *
 * @author HILMI
 */
public class Main {
    public static void main(String[] args){
         A1 a1 = new A1();
         A2 a2 = new A2();
         B b1 = new B('B'); 
         b1.cetak(a1);         
         b1.cetak(a2); 
         F fa = new A2();
         System.out.println(fa.f(true));         
         B b2 = new B('B');
         System.out.println(b2.getB1());
         b2.setB1('Z');
         System.out.println(b1.getB1()); 
                 
        
    }
    
    
}
