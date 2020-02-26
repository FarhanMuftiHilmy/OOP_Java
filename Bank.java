public class Bank {
	public static void main(String [] args){
		Rekening r1 = new Rekening(122, "Rudi", 300000); // definisikan objek : no 122, nama Rudi dan awal saldo 300000
		System.out.println(r1.ambilUang(100000)); // ambil uang sebanyak 100000, saldo akan berkurang jadi 200000
		System.out.println(r1);
		System.out.println(r1.simpanUang(50000)); // simpan uang sebanyak 50000, saldo akan bertambah jadi 250000
		System.out.println(r1);
		System.out.println(r1.ambilUang(500000)); // ambil uang sebanyak 500000, false karena uang yang diambil melebihi saldo
		System.out.println(r1);
		System.out.println(r1.getName()); // munculkan nama objek yang telah didefinisikan sebelumnya
		System.out.println(r1);
	}
	
}
