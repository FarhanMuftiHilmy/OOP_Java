public class Motor{
	public static void main(String [] args){
		Aksi bebek = new Aksi("AA1653BB");
		bebek.Gas();
		bebek.Gas();
		bebek.Gas();
		bebek.Gas();
		System.out.println(bebek);	// gas sebanyak 10 kali maka kecepatan akan bertambah 10 dari 0
		bebek.Gas(); 
		bebek.Gas();
		bebek.Gas();
		bebek.Gas();
		bebek.Gas();
		bebek.Gas();
		bebek.NaikkanGigi();	//naikkan gigi maka gigi akan bertambah 1
		bebek.TurunkanGigi(); //turunkan gigi maka gigi akan berkurang 1
		
		System.out.println(bebek);
	}
	
}
