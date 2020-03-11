/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praktikan
 */
public class MobilMatic extends Mobil {
    public MobilMatic(String noPlat){
        super(noPlat);
    }
    public void gas(){
        if((getPerseneleng() == 'D')&&(getKecepatan()>=0)){
            setKecepatan(getKecepatan()+5);
        } else if((getKecepatan() == 'R')&&(getKecepatan()<=0)){
            setKecepatan(getKecepatan()-5);
        }        
    }
    //METHOD UNTUK REM
    public void rem(){
        if(getKecepatan()>=0){
            setKecepatan(getKecepatan()-5);
        }else if(getKecepatan()<0){
            setKecepatan(getKecepatan()+5);
        }
        
    }
    //METHOD UNTUK PINDAH PERSENELENG
    public void oper(char perseneleng_baru){
        if(((getKecepatan() > 0) || (getKecepatan() == 0))&&(perseneleng_baru=='D')||perseneleng_baru=='N'){
            setPerseneleng(perseneleng_baru);
        } else if(((getKecepatan() < 0) || (getKecepatan() == 0))&&(perseneleng_baru == 'R')||(perseneleng_baru=='N')){
            setPerseneleng(perseneleng_baru);
        }
        
    }
    
    //METHOD OUTPUT
    public String toString(){
        return "Mobil dengan "+getPlat()+" mempunyai kecepatan "+getKecepatan()+" dan perseneleng "+getPerseneleng();
    }
}
