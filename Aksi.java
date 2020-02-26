public class Aksi{
	String noPlat;
	private int gigi;
	private int kecepatan;
	
	public Aksi(String noPlat){
		this.noPlat = noPlat;
		gigi = 0;
		kecepatan = 0;
	}
	//--------------------------------------//
	//SETTER DAN GETTER KECEPATAN DAN GIGI
	//setter
	public void setKecepatan(int kecepatan){
		this.kecepatan = kecepatan;
	}
	public void setGigi(int kecepatan){
		this.gigi = gigi;
	}
	//getter
	public int getKecepatan(){
		return kecepatan;
	}
	public int getGigi(){
		return gigi;
	}
	public String noPlat(){
		return noPlat;
	}
	//-----------------------------//
	public void Gas(){
		kecepatan++;
	}
	
	public void Rem(){
		kecepatan--;
	}
	public void NaikkanGigi(){
		if(kecepatan == 0 && gigi == 4){
			gigi = 0;
		} else if(kecepatan > 0){
			gigi = 4;
		}else{
			gigi++;
		}
		
	}
	public void TurunkanGigi(){
		if(gigi == 0){
			gigi = 4;
		}else{
			gigi--;
		}
		
	}
	public String toString(){
		return " Motor memiliki nomer plat "+noPlat+" gigi "+gigi+" dan kecepatan "+kecepatan;
	}
	
}
