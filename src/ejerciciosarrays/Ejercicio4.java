package ejerciciosarrays;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos una tabla llamada "num" con una longitud determinada (12).
		int num[] = new int[12];

		// Aqui indicamos el valor que le damos a cada indice en la tabla num.
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;

		// Imprimimos la tabla para comprobar si los valores introducidos estan en el
		// indice indicado por el usuario y tambien comprobamos que ocurre en los demas
		// huecos en los que no hemos rellenado nada. Y comprobamos que los demas huecos
		// se completan con "0".
		System.out.println(Arrays.toString(num));

	}

}
