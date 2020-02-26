class Kelas{
	public static void main(String [] args){
		
		System.out.println("-----------------ALAT TULIS-----------------");
		//Objek Alat Tulis
		
		//(sebelum ada string to string)		
		AlatTulis pulpen = new AlatTulis(2000, 26, "Snowman");
		System.out.println("Pulpen denga harga " + pulpen.harga + " berjumlah " + pulpen.jumlah + " mereknya " + pulpen.merek);
		AlatTulis buku = new AlatTulis(5000, 26, "Sidu");
		System.out.println("Buku denga harga " + buku.harga + " berjumlah " + buku.jumlah + " mereknya " + buku.merek);
		AlatTulis penghapus = new AlatTulis(2000, 26, "Joyko");
		System.out.println("Penghapus denga harga " + penghapus.harga + " berjumlah " + penghapus.jumlah + " mereknya " + penghapus.merek);
		System.out.println("\n");
		
		System.out.println("-----------------ELEKTRONIK-----------------");
		////Objek Elektronik
		Elektronik komputer = new Elektronik(2000000, 26, "Baik"); 
		System.out.println("Komputer dengan harga " + komputer.harga + " berjumlah " + komputer.jumlah + " kondisinya "+ komputer.kondisi);		
		Elektronik ac = new Elektronik(4000000, 2, "Baik");
		System.out.println("AC dengan harga " + ac.harga + " berjumlah " + ac.jumlah + " kondisinya "+ ac.kondisi);		
		Elektronik lampu = new Elektronik(500000, 8, "Buruk");
		System.out.println("Lampu dengan harga " + lampu.harga + " berjumlah " + lampu.jumlah + " kondisinya "+ lampu.kondisi);
		System.out.println("\n");
		
		System.out.println("-----------------BENDA LAIN-----------------");
		////Objek Kelas
		BendaLain kursi = new BendaLain(50000, 26, "Besi");
		System.out.println("Lampu dengan harga " + kursi.harga + " berjumlah " + kursi.jumlah + " jenisnya "+ kursi.jenis);		
		BendaLain meja = new BendaLain(10000, 26, "Kayu");
		System.out.println("Meja dengan harga " + meja.harga + " berjumlah " + meja.jumlah + " jenisnya "+ meja.jenis);		
		BendaLain pintu = new BendaLain(20000, 2, "Kayu");
		System.out.println("Pintu dengan harga " + pintu.harga + " berjumlah " + pintu.jumlah + " jenisnya "+ pintu.jenis);
		
		
	}
}
