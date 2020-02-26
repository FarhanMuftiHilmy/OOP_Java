public class Titik {
	public static void main(String [] args){
		BuatTitik t1 = new BuatTitik(); //Memanggil Konstruktor 2 (default)
		BuatTitik t2 = new BuatTitik(20,3); // Memanggil Konstruktor 1 (kostum)
		
		System.out.println(t1); // print titik satu semula
		System.out.println(t2); // print titik dua semula
		
		t1.naik(); //titik satu naik dengan koordinat y bertambah 1
		t2.kanan(); //titik dua ke kanan dengnan koordinat x bertambah 1
		t1.njumbul(10); //titik satu naik dengan koordinat y bertambah 10
		
		System.out.println(t1); // print titik satu setelah naik dan njumbul 
		System.out.println(t2); // print titik dua setelah ke kanan
	}
	
}
