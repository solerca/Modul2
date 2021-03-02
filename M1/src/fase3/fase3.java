package fase3;

import java.util.Scanner;

public class fase3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		Partint de l’any 1948 heu de fer un bucle for i mostrar els anys de traspàs fins arriba al vostre any de
//		naixement.
//		ATENCIO! Haureu de canviar el tipus de variable de l’any 1948 per poder modificar-la.
//		Creeu una variable bool que sera certa si l’any de naixement és de traspàs o falsa si no ho és.
//		En cas de que la variable bool sigui certa, heu de mostrar per consola una frase on ho digui, en cas de
//		ser falsa mostrareu la frase pertinent. Creeu dues variables string per guardar les frases.

		System.out.println("introdueix el teu any de naixament");
		Scanner reader = new Scanner(System.in);
		int anyNaixement = reader.nextInt();
		int anyInicial = 1948;
		int interval = 4;
		boolean anyTraspas = false;
		String traspas = "l'any " + anyNaixement + " és de traspàs.";
		String noTraspas = "l'any " + anyNaixement + " no és de traspàs.";

		for (int i = anyInicial + interval; i <= anyNaixement; i += interval) {
			System.out.println(i);
			if (i == anyNaixement) {
				anyTraspas = true;
			}
		}
		if (anyTraspas == true) {
			System.out.println(traspas);
		} else {
			System.out.println(noTraspas);
		}

	}
}
