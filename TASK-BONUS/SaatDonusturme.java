public class SaatDönüştürme {
	public static void main(String [] args) {
		int toplamSaniye = 3665;
        int saat = toplamSaniye / 3600;
        int kalan = toplamSaniye % 3600;
        int dakika = kalan / 60;
        int saniye = kalan % 60;

        System.out.println(toplamSaniye + " saniye = " + saat + ":" + dakika + ":" + saniye);
	}

}
