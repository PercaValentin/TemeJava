package temeJava;

public class TestB4Minim {

	public static int min(int[] sir) {
		int minim = sir[0];
		for (int i = 0; i < sir.length; i++) {
			if (sir[i] < minim) {
				minim = sir[i];
			}
		}
		return minim;
	}

	public static void main(String[] args) {
		System.out.println(min(new int[] { 0, 6, 3, 8, 4 }));
		System.out.println(min(new int[] { 1, 10, -5, 7, 20 }));
		System.out.println(min(new int[] { 3 }));

	}

}
