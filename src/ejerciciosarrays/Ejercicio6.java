package ejerciciosarrays;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		int numero[] = new int[8];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < numero.length; i++) {
			System.out.println("Introduce un número --> ");
			numero[i] = sc.nextInt();

		}

		for (int i = 0; i < numero.length; i++) {
			if (numero[i] % 2 == 0) {
				System.out.println("Es par --> " + numero[i]);
			} else {
				System.out.println("Es impar --> " + numero[i]);
			}

		}
		sc.close();
	}

}
