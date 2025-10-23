public class UcgenAlani {
    public static void main(String[] args) {
        // Kenarlar  tanımlandı
        int a = 3;
        int b = 4;
        int c = 5;

            double s = (a + b + c) / 2.0; 
            double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            //Sonucu yazdır
            System.out.printf("Üçgenin alanı: %.2f n", alan);
        
    }
}
