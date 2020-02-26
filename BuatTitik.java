public class BuatTitik {
	int x;
	int y;
	//KONSTRUKTOR 1, buat titik secara kostum ketika memanggil konstruktor ini
	public BuatTitik(int x, int y){
		this.x = x;
		this.y = y;
	}
	//KONSTRUKTOR 2 , buat titik secara default ketika konstruktor ini dipanggil
	public BuatTitik(){
		x = 0;
		y = 0;
	}
	
	public void naik(){ // fungsi untuk menaikan titik, y menjadi bertambah 1
		y++;
	}
	
	public void kanan(){ // fungsi untuk membuat titik ke kanan, x menjadi bertambah 1
		x++;
	}
	
	public void turun(){ // fungsi untuk membuat titik turun, y menjadi berkurang 1
		y--;
	}
	
	public void kiri(){ // fungsi untuk membuat titik ke kiri, x menjadi berkurang 1
		x--; 
	}
	
	public void njumbul(double tinggi){
		y+=tinggi;  // fungsi untuk membuat titik naik dengan nilai y naik sebanyak inputan tinggi
	}
	
	
	public String toString(){
		return "Titik dengan koordinat x dan y = ( "+x+" , "+y+" )";
	}
	
}
