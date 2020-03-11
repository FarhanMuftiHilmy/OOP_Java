/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praktikan
 */

public class Segi3Siku extends Segi3{
    double sisiMiring;
    public Segi3Siku(){
        super();
        a=4;
        t=3;
    }
    public Segi3Siku(double a, double t){
        super(a, t);
    }
    public double getKeliling(){
        sisiMiring = Math.pow((Math.pow(t, 2)+Math.pow(a, 2)), 0.5);
        keliling = a + t + sisiMiring;
        return keliling;
    }
    public String toString(){
        return "a="+a+", t="+t;
    }
}
