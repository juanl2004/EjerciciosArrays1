package ejerciciosarrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		int numero;

		int tabla[] = new int[100];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tabla.length; i++) {
			numero = (int) (1 + Math.random() * 10);
			tabla[i] = numero;
		}

		System.out.println("Introduce un número --> ");
		numero = sc.nextInt();

		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == numero)
			System.out.print(i + ", ");

		}

	}
}
