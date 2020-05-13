/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HILMI
 */
public abstract class A implements Pahlawan, Penduduk{
     public void terbang(){
         System.out.println("Tebang");
     }
         
    public void berlari(){
        
    }
}

interface A1{
    public void a();
}
interface A2{
    public void a();
}

A1 implements A2