/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praktikan
 */
public class MainMobil {
    public static void main(String [] args){
        MobilBiasa mb1 = new MobilBiasa("AA1234EJ");
        MobilMatic mt1 = new MobilMatic("AA1560EJ");
        System.out.println("TEST CASE MOBIL BIASA");
        mb1.oper('N');
        mb1.gas(); // test saat perseneling n tidak bisa di gas
        System.out.println(mb1);
        mb1.oper('1'); // test ketika mobil kecepatan maju dan perseneling 1-5 atau N maka gas bertambah 5 / semakin positif
        mb1.gas();
        System.out.println(mb1);
        mb1.oper('R'); // test ketika mobil kecepatan maju maka tidak bisa diganti R
        System.out.println(mb1);
        mb1.rem();
        mb1.oper('R'); // test ketika meobil kecepatan 0 maka perseneling bisa diganti R
        System.out.println(mb1); 
        mb1.gas(); //test ketika mobil kecepatan mundur maka gas berkurang 5 / semakin negatif
        System.out.println(mb1);
                                
        
        
        System.out.println("TEST CASE MOBIL MATIC");
        mt1.oper('N');
        mt1.gas(); // test saat perseneling n tidak bisa di gas
        System.out.println(mt1);
        mt1.oper('D'); // test ketika mobil kecepatan maju dan perseneling D maka gas bertambah 5 / semakin positif
        mt1.gas();
        System.out.println(mt1);
        mt1.oper('R'); // test ketika mobil kecepatan maju maka tidak bisa diganti R
        System.out.println(mt1);
        mt1.rem();
        mt1.oper('R'); // test ketika meobil kecepatan 0 maka perseneling bisa diganti R
        System.out.println(mt1); 
        mt1.gas(); //test ketika mobil kecepatan mundur maka gas berkurang 5 / semakin negatif
        System.out.println(mt1); 
    }
}

