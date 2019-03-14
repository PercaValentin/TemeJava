package temeJava;

import java.util.Arrays;

public class TestEA6 {
	public static int[] intToArray(int n) {
		String s = Integer.toString(n);
		int lenght = s.length();
		int[] result = new int[lenght];
		for (int i = result.length - 1; i >= 0; i--) {
			int cifra = n % 10;
			result[i] = cifra;
			n /= 10;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(intToArray(1570)));
	}
}
