/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praktikan
 */
public class MainSegi3 {
    	
    public static void main(String [] Args){
        Segi3Siku siku1 = new Segi3Siku();
        Segi3Siku siku2 = new Segi3Siku(6,8);
        Segi3SamaKaki smk1 = new Segi3SamaKaki();
        Segi3SamaKaki smk2 = new Segi3SamaKaki(3,8);
        System.out.println(siku1);//a=4, t=3
        System.out.println(siku2);//a=6, t=8
        System.out.println(smk1);//a=6, t=4
        System.out.println(smk2);//a=3, t=8
        System.out.println(siku1.getLuas());//6
        System.out.println(siku2.getLuas());//24
        System.out.println(smk1.getLuas());//12
        System.out.println(smk2.getLuas());//12
        System.out.println(siku1.getKeliling());//12
        System.out.println(siku2.getKeliling());//24
        System.out.println(smk1.getKeliling());//16
        System.out.println(smk2.getKeliling());//13
    }
}
