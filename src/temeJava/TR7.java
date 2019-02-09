package temeJava;

public class TR7 {

	public static double fahrenheitToCelsius (double temperature) {
		double tempCelsius = (temperature - 32) * 5/9;
		
		
		
		return tempCelsius;
		
		
	}
	public static void main(String[] args) {
		System.out.println(fahrenheitToCelsius (0));
	}
	
}
