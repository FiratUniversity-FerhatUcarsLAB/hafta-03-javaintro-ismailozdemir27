
public class BMIHesaplama {
	public static void main(String [] args) {
		double kilo = 65.0;
		double boy = 1.70;
		double bmi = kilo/(boy*boy);
		
		System.out.println("Kilo: " + kilo + "kg");
		System.out.println("Boy: " + boy + "m");
		System.out.println("BMI: " + bmi);
	}

}
