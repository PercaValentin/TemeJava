package temeJava;

public class TestBA6 {
	public static int arrayToNumber(int[] sir) {

		if (sir.length == 0) {
			return -1;
		}
		int number = 0;
		for (int element : sir) {
			if (element < 0 || element > 9) {
				return -2;
			} else
				number = Integer.valueOf(number + String.valueOf(element));

		}
		return number;

	}

	public static void main(String[] args) {

		System.out.println(arrayToNumber(new int[] { 8, 7, 8 }));
		System.out.println(arrayToNumber(new int[] { 0, 0, 1, 2, 7 }));
		System.out.println(arrayToNumber(new int[] {}));
		System.out.println(arrayToNumber(new int[] { 1, 0, 0 }));
		System.out.println(arrayToNumber(new int[] { 0, 0, 0 }));
		System.out.println(arrayToNumber(new int[] { 0, 11, 2, 3 }));
	}

}
