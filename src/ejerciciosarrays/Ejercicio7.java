package ejerciciosarrays;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Creamos una tabla con una longitud determinada en este caso "12".
		int temperatura[] = new int[12];

		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);

		// Con este for le pedimos un número al usuario y lo guardamos en la tabla tanta
		// veces como sea necesario para completar cada hueco de la tabla.
		for (int i = 0; i < temperatura.length; i++) {
			System.out.println("Introduce la temperatura del mes --> ");
			temperatura[i] = sc.nextInt();
		}

		// El bucle for-each recorre cada uno de los elementos de la tabla. Gracias a
		// esto podemos ir comparando cada uno de los valores de la tabla.
		for (int barra : temperatura) {
			// Con este for imprimimos tantos asteriscos como sea el valor del indice con el
			// que nos estemos comparando en el momento.
			for (int i = 1; i <= barra; i++) {
				System.out.print("*");
			}
			//Salto de linea.
			System.out.println("");
		}

		//Cierre de Scanner
		sc.close();
	}

}
