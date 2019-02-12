package temeJava;

import java.util.Arrays;

public class ArraysFill {

	public static void main(String[] args) {

		int[] Numere = { 5, 7, 0, 45, 98 };

		String[] Masini = { "BMW", "Mercedes", "Audi" };

		Arrays.fill(Numere, 66);

		for (int i = 0; i < Numere.length; i++) {

			System.out.println(Arrays.toString(Numere) + "");

		}

		// umple numai anumite indexuri cu un numar

		Arrays.fill(Numere, 0, 2, 33);

		// 0= index inceput

		// 2 = numarul de indexuri

		// 33 = numarul cu care umple

		for (int i = 0; i < Numere.length; i++) {

			System.out.println(Arrays.toString(Numere) + "");

		}

		// imi sterge toate itemele din Array

		Arrays.fill(Masini, "");

		for (int i = 0; i < Masini.length; i++) {

			System.out.println(Masini[i]);

		}

	}

}
