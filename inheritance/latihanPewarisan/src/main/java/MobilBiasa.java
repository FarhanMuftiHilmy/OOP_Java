/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praktikan
 */
public class MobilBiasa extends Mobil{
    
    public MobilBiasa(String noPlat){
        super(noPlat);
    }
    //METHOD UNTUK GAS
    public void gas(){
        if(((getPerseneleng() == '1') || (getPerseneleng() == '2') || (getPerseneleng() == '3')||(getPerseneleng() == '4')||(getPerseneleng() == '5')) && (getKecepatan() >= 0)){
            setKecepatan(getKecepatan()+5);
        }else if((getPerseneleng() == 'R') && (getKecepatan() <= 0)){
            setKecepatan(getKecepatan()-5);
        }else{
            setKecepatan(0);
        }
    }
    public void rem(){
        if(getKecepatan() >= 0){
            setKecepatan(getKecepatan()-5);
        }else if(getKecepatan() < 0){
            setKecepatan(getKecepatan()+5);
        }
        
    }
    //METHOD UNTUK PINDAH PERSENELENG
    public void oper(char perseneleng_baru){
        if(((getKecepatan() > 0) || (getKecepatan() == 0)) && (perseneleng_baru != 'R')){
            setPerseneleng(perseneleng_baru);            
            
        } else if(((getKecepatan() < 0) || (getKecepatan() == 0)) && (perseneleng_baru == 'R')){
            setPerseneleng(perseneleng_baru);         
        }        
    }
    
    //METHOD OUTPUT
    public String toString(){
        return "Mobil dengan "+getPlat()+" mempunyai kecepatan "+getKecepatan()+" dan perseneleng "+getPerseneleng();
    }
}
