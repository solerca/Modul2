package m2;

import java.util.Scanner;

public class milestone2 {
//	Crea una aplicaci� que dibuixi una escala de nombres, sent cada l�nia
//	nombres comen�ant en un i acabant en el nombre de la l�nia. 

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Introdueix l'al�ada");
		int alturaIntroduida = reader.nextInt();

		for (int i = 0; i <= alturaIntroduida; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			System.out.println();
		}
		reader.close();

	}
}
