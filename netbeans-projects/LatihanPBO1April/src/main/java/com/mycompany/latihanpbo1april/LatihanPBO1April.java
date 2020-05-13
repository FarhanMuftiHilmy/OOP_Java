/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.latihanpbo1april;
import bangun2D.*;
import bangun3D.PrismaSegitiga;
/**
 *
 * @author HILMI
 */
public class LatihanPBO1April {
    public static void main(String[] args){
        PrismaSegitiga prisma1 = new PrismaSegitiga(null, 10);  
            System.out.println(prisma1);
            System.out.println(prisma1.getVolume());
            System.out.println(prisma1.getDetailAlas());
            System.out.println("-----------------------");       
            
    }
}
