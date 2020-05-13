/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaketSatu;

/**
 *
 * @author HILMI
 */
public class Tumbuhan implements MH{
     private (4)_______ tinggi;
     private static (5)__________ pemilik;
     public (6)____________( (7)_____ tinggi) {
         this.tinggi = tinggi;
     } 
      public double getTinggi(){
          return tinggi;
      }
      public static void setPemilik(String pemilik){
          __.pemilik = pemilik;
      }
      public void tumbuh(){
          tinggi++;
      }
      __abstract String getJenisBatang();
      public String toString(){
          return "Tumbuhan{"+tinggi+'}';
      }
      
}
