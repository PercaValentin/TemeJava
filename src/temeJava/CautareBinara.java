package temeJava;

public class CautareBinara {
	private int search(int[] arr, int first, int last, int n) {
		int middle = (first + last) / 2;
		if (first <= last) {
			if (arr[middle] == n) {
				return middle;
			}
			if (arr[middle] > n) {
				return search(arr, first, middle - 1, n);
			} else {
				return search(arr, middle + 1, last, n);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 9, 11, 14, 18, 20, 25 };

		CautareBinara cb = new CautareBinara();
		System.out.println(cb.search(arr, 0, arr.length - 1, 18));
		System.out.println(cb.search(arr, 0, arr.length - 1, 1));
		System.out.println(cb.search(arr, 0, arr.length - 1, 25));

	}
}
