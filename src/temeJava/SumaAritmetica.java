package temeJava;

public class SumaAritmetica {

	public static int suma(int[] sir) {

		int suma = 0;

		for (int i = 0; i < sir.length; i++) {
			suma += sir[i];
		}

		return suma;

	}

	public static void main(String[] args) {
		System.out.println(suma(new int[] { 1, 2, 5 }));
	}
}
