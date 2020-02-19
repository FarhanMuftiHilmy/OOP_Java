class PapanTulis{
	int panjang;
	int lebar;
	String warna;
	
	//Constructor
	public PapanTulis(int panjang, int lebar, String warna){
		this.panjang = panjang;
		this.lebar = lebar;
		this.warna= warna;
	}
	public PapanTulis(int panjang, int lebar){
		this.panjang = panjang;
		this.lebar = lebar;
		warna = "Putih";
	}
	public String toString(){
		return "Papan dengan panjang " + panjang + " dan lebar " + 
						lebar + " berwarna " + warna + "\n";
	}
}
