public class Rekening {
	int no;
	String nama;
	int saldo;
	int uang;
	
	
	public Rekening(int no, String nama, int saldo){
		this.no = no;
		this.nama = nama;
		this.saldo = saldo;
	}
	
	//GETTER DAN SETTER UANG DAN NAMA
	//setter
	public void setUang(int u){
		uang = u;
	}
	//getter
	public int getUang(){
		return uang;
	}
	//setter
	public void setName(String n){
		nama = n;
	}
	//getter
	public String getName(){
		return nama;
	}
	
	
	public boolean ambilUang(int uang){ // konstruktor untuk ambil uang
		boolean syarat = uang < saldo; // syarat benar jika uang yang diambil kurang dari saldo
		if(syarat == true){	
			saldo -= uang; // jika syarat benar maka saldo akan terkurang sebanyak uang yang diambil
		} else{
			return false; // jik syarat tidak terpenuhi akan muncul output false pada layar
		}
		return true; 
	}
	
	public boolean simpanUang(int uang){ // konstruktor untuk simpan uang
		saldo += uang; // saldo akan bertambah sebanyak uang yang dimasukkan
		return true;
	}
	
	
	
	
	
	// fungsi agar objek dapat dipanggil dengan cara System.out.println(nama objek);
	public String toString(){
		return "No Rekening : "+no+" memiliki saldo "+saldo;
	}
}
