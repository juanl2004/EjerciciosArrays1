package ejerciciosarrays;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int temperatura[] = new int[12];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < temperatura.length; i++) {
			System.out.println("Introduce la temperatura del mes --> ");
			temperatura[i] = sc.nextInt();
		}

		
		for (int barra : temperatura) {
			for (int i = 1; i <= barra; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
