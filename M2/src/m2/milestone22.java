package m2;

import java.util.Scanner;

public class milestone22 {

	public static void main(String[] args) {

//		Crea una aplicació que dibuixi una piràmide invertida de asteriscs. 
//		Nosaltres li vam passar l'altura de la piràmide per teclat.

//		Scanner reader = new Scanner(System.in);
//		System.out.println("Introdueix l'alçada");
//		int alturaIntroduida = reader.nextInt();
		Scanner reader = new Scanner(System.in);
		System.out.println("Introdueix l'alçada");
		int altura = reader.nextInt();
		int increment = 2 * altura - 1;

		String asterisc = "*";
		String espai = " ";

		for (int i = 1; i <= increment; i += 2) {

			for (int k = 0; k < i - (k + 1); k++) {
				System.out.print(espai);
			}

			for (int j = increment; j >= i; j--) {
				System.out.print(asterisc);
			}
			System.out.println();
		}
		reader.close();
	}

}
