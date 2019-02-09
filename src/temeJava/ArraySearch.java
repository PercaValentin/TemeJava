package temeJava;

import java.util.Arrays;

public class ArraySearch {

	public ArraySearch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] numere = { 1, 5, 6 };

        int SearchItem = 5;

        System.out.println("Indexul in array : " + Arrays.binarySearch(numere, SearchItem));

	}

}
