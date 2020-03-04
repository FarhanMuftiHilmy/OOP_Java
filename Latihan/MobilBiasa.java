public class MobilBiasa {
    String noPlat;
    private int kecepatan;
    private char perseneleng;
    public MobilBiasa(String noPlat){
        this.noPlat = noPlat;
        this.kecepatan = 0;
        this.perseneleng = 'N';
    }
    //GETTER noPlat
    public String getPlat(){
        return noPlat;
    }
    //GETTER kecepatan
    public int getKecepatan(){
        return kecepatan;
    }
    //GETTER perseneleng
    public char getPerseneleng(){
        return perseneleng;
    }
    //METHOD UNTUK GAS
    public void gas(){
        if(((perseneleng == '1') || (perseneleng == '2') || (perseneleng == '3')||(perseneleng == '4')||(perseneleng == '5')) && (kecepatan >= 0)){
            kecepatan+=5;
        }else if((perseneleng == 'R') && (kecepatan <= 0)){
            kecepatan-=5;
        }else{
            kecepatan=0;
        }
    }
    //METHOD UNTUK REM
    public void rem(){
        if(kecepatan >= 0){
            kecepatan-=5;
        }else if(kecepatan < 0){
            kecepatan+=5;
        }
        
    }
    //METHOD UNTUK PINDAH PERSENELENG
    public void oper(char perseneleng_baru){
        if(((kecepatan > 0) || (kecepatan == 0)) && (perseneleng_baru != 'R')){
            perseneleng = perseneleng_baru;            
            
        } else if(((kecepatan < 0) || (kecepatan == 0)) && (perseneleng_baru == 'R')){
            perseneleng = perseneleng_baru;
        }        
    }
    
    //METHOD OUTPUT
    public String toString(){
        return "Mobil dengan "+noPlat+" mempunyai kecepatan "+kecepatan+" dan perseneleng "+perseneleng;
    }
    
}
