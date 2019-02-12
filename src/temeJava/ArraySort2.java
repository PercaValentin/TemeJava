package temeJava;

import java.util.Arrays;

public class ArraySort2 {

	public static void main(String[] args) {
		int Sir[] = { 4, 3, 89, 27, 58, 70 };
		Arrays.sort(Sir);
		System.out.println("Sirul ordonat ascendent : ");
		for (int i = 0; i < Sir.length; i++) {
			System.out.println(Sir[i]);
		}

	}

}
