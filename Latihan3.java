class Latihan3{	
	public static void main(String [] args){
		/*
		int panjang = 16;
		int lebar = 8;
		String warna1 = "Putih";		
		*/
		PapanTulis pp1 = new PapanTulis(16, 8, "Putih");
				
		System.out.print(pp1);
		/*
		panjang2 = 9;
		lebar2 = 1;
		String warna2 = "Biru";
		*/
		PapanTulis pp2 = new PapanTulis(9, 7, "Biru");
		
		System.out.print(pp2);
		/*
		panjang3 = 6;
		lebar3 = 2;		
		String warna3 = "Merah";
		*/
		PapanTulis pp3 = new PapanTulis(6, 2, "Merah");
		
		System.out.print(pp3);
							
		/* pakai array dan for loop
		PapanTulis pp[] = new PapanTulis[3];
		pp[0] = new PapanTulis(16, 8, "putih");
		pp[1] = new PapanTulis(9, 7, "biru");
		pp[2] = new PapanTulis(6, 2);
	
		for(int i=0;i<3;i++){
			System.out.println(pp[i]);
		}
		*/	
		
		
	}
}
