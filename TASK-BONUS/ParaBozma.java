public class ParaBozma {
	public static void main(String [] args) {
		int toplam = 278;
		
		int yüzlük = toplam/100;
		toplam %= 100;
		
		int ellilik = toplam/50;
		toplam %= 50;
		
		int yirmilik = toplam/20;
		toplam %= 20;
		
		int onluk = toplam/10;
		toplam %= 10;
		
		int beşlik = toplam/5;
		toplam %= 5;
		
		int ikilik = toplam/2;
		toplam %= 2;
		
		int birlik = toplam/1;
		toplam %= 1;
		
		System.out.println("278 TL = "
				+ yüzlük + "x100, "
				+ ellilik + "x50, "
				+ yirmilik + "x20, "
				+ onluk + "x10, "
				+ beşlik + "x5, "
				+ ikilik + "x2, "
				+ birlik + "x1, ");
		
		
	}

}
