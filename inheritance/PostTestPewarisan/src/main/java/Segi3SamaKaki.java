/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praktikan
 */
public class Segi3SamaKaki extends Segi3{    
    double panjangKaki;
    public Segi3SamaKaki(){
        super();
        a=6;
        t=4;
    }
    public Segi3SamaKaki(double a, double t){
        super(a, t);
    }
    public double getKeliling(){
        panjangKaki = Math.pow((Math.pow(a/2, 2) + Math.pow(t, 2)),0.5);
        keliling = a + 2*panjangKaki;
        return keliling;
    }
    public String toString(){
        return "a="+a+", t="+t;
    }
}
