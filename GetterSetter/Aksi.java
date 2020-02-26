public class Aksi{
	String noPlat;
	private int gigi;
	private int kecepatan;
	
	public Aksi(String noPlat){
		this.noPlat = noPlat;
		gigi = 0; 		// gigi dan kecepatan didefinisikan = 0, jadi tidak didefinisikan pada fungsi main
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
	public void Gas(){ // fungsi untuk menambah 1 kecepatan 
		kecepatan++;
	}
	
	public void Rem(){ // fungsi untuk mengurangi 1 kecepatan
		kecepatan--;
	}
	public void NaikkanGigi(){ //fungsi menaikkan gigi
		if(kecepatan == 0 && gigi == 4){ // gigi akan = 0 jika kecepatannya 0 dan giginya 4
			gigi = 0;
		} else if(kecepatan > 0){ // jika kecepatan lebih dari 0 gigi akan berubah menjadi 4
			gigi = 4;
		}else{ // selain itu gigi akan bertambah 1
			gigi++;
		}
		
	}
	public void TurunkanGigi(){ //fungis menurunkan gigi
		if(gigi == 0){ // gigi akan = 4 jika gigi = 0
			gigi = 4;
		}else{
			gigi--; // selain itu gigi bertambah 1
		}
		
	}
	public String toString(){
		return " Motor memiliki nomer plat "+noPlat+" gigi "+gigi+" dan kecepatan "+kecepatan;
	}
	
}
