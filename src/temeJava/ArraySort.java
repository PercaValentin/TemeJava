package temeJava;

public class ArraySort {

	public static void main(String[] args) {

		int[] Sir = { 5, 3, 58, 42, 36, 99 };

		// Printam elementele sirului
		System.out.println("Elementele sirului sunt : ");
		for (int i = 0; i < Sir.length; i++) {
			System.out.println(Sir[i]);
			// i =index, temp - ca sa nu-mi stearga valorile din index
		}
		int i, j, temp = 0;
		// Aranjare in ordine crescatoare
		System.out.println("Sirul aranjat in ordine crescatoare este : ");
		for (i = 0; i < Sir.length; i++) {
			for (j = i + 1; j < Sir.length; j++) {
				if (Sir[i] > Sir[j]) {
					temp = Sir[i];
					Sir[i] = Sir[j];
					Sir[j] = temp;
				}

			}
			System.out.println(Sir[i]);
		}

		// Aranjare in ordine descrescatoare
		System.out.println("Sirul aranjat in ordine descrescatoare este : ");

		for (i = 0; i < Sir.length; i++) {
			for (j = i + 1; j < Sir.length; j++) {
				if (Sir[i] < Sir[j]) {
					temp = Sir[i];
					Sir[i] = Sir[j];
					Sir[j] = temp;
				}

			}
			System.out.println(Sir[i]);

		}
	}
}
