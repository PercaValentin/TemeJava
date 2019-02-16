package temeJava;

public class TestBA2 {

	public static int countNegatives(int[] sir) {

		int countNegatives = 0;
		for (int element : sir) {
			if (element < 0) {
				countNegatives++;
			}

		}

		return countNegatives;

	}

	public static void main(String[] args) {
		System.out.println(countNegatives(new int[] { 10, 14, -21, -4, 0, 2, -3 }));
		System.out.println(countNegatives(new int[] { -1, 7, -3, 6 }));
		System.out.println(countNegatives(new int[] { 1, 2 }));
		System.out.println(countNegatives(new int[] {}));
	}
}
