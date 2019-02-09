package temeJava;

import java.util.Scanner;
public class TR3 {

	public TR3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt() ;
		System.out.println("Numarul la patrat este : " + n * n);
		System.out.println("Numarul la cub este : " + n * n * n);
		
	scanner.close();
	

	}

}
