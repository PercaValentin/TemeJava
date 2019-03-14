package temeJava;

public class Recursivitate {

	public static String sirInvers(String s) {
		if (s.length() == 1) {
			return s;
		}
		return s.charAt(s.length() - 1) + sirInvers(s.substring(0, s.length() - 1));

	}

	public static void main(String[] args) {

		System.out.println(sirInvers(("12345" )));
	}
}
