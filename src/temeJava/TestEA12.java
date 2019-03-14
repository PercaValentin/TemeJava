package temeJava;

public class TestEA12 {
	public static int[] removePosition(int[] arr, int pos) {
		if (pos > arr.length) {
			return null;
		}
		if (pos < arr.length && pos >= 0 && arr.length > 0) {
			int[] sirnou = new int[arr.length - 1];
			int j = 0;

			for (int i = 0; i < arr.length; i++) {
				if (i != pos) {
					sirnou[j] = arr[i];
					j++;

				}
			}
			return sirnou;
		}

		return null;
	}
}
