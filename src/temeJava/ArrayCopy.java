package temeJava;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

        int[] array1 = { 6, 7, 8, 9, 0 };

        System.arraycopy(array, 2, array1, 3, 2);

        System.out.println("Array sursa = " + Arrays.toString(array));

        System.out.println("Array destinatie = " + Arrays.toString(array1));

        System.out.println("Array destinatie dupa copiere = " + Arrays.toString((array1)));

	}

}
