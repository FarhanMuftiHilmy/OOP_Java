/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praktikan
 */
public class Segi3 {
    protected double a, t, luas, keliling;
    // CONSTRUCTOR DEFAULT
    public Segi3(){
        this.a = 0;
        this.t = 0;
    }
    // CONSTRUCTOR UNTUK SEGI3 DAN SEGI3SAMAKAKI
    public Segi3(double a, double t){
        this.a = a;
        this.t = t;
    }
    //SETTER GETTER
    public void setA(double a){
        this.a = a;
    }
    public void setT(double t){
        this.t = t;
    }
    public double getA(){
        return a;
    }
    public double getT(){
        return t;
    }
    public double getLuas(){
        luas = a*t*0.5;
        return luas;
    }
    
}
