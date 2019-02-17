package temeJava;

import java.util.Arrays;

public class TestBA8 {

	public static int[] reverse(int[] sir) {

		int[] sirInversat = new int[sir.length];
		int i = 0;
		int j = sir.length - 1;
		while (i < sir.length) {
			sirInversat[j] = sir[i];
			i++;
			j--;
		}
		return sirInversat;

	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(reverse(new int[] { 1, 2, 3, 4, 5 })));
	}
}
