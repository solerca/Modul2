package m2;

import java.util.ArrayList;
import java.util.Scanner;

public class fase2 {

//	Canvia la taula per una llista (List<Character>) 
//	Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’. 
//	Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’. 

	public static void main(String[] args) {
		ArrayList<Character> nom = new ArrayList<Character>();
		System.out.println("Introdueix el teu nom");
		Scanner scan = new Scanner(System.in);
		String name = scan.next().toUpperCase();
		for (int i = 0; i < name.length(); i++) {
			nom.add(name.charAt(i));
		}

		boolean numeroTrobat = false;

		for (int i = 0; i < nom.size(); i++) {

			for (int j = 0; j < nom.size(); j++) {

				if (Character.isDigit(nom.get(j)) == true && numeroTrobat == false) {
					System.out.println("Els noms de persones no contenen números!");
					numeroTrobat = true;
				}
			}

			if (numeroTrobat == false && (nom.get(i) == 'A' || nom.get(i) == 'E' || nom.get(i) == 'I'
					|| nom.get(i) == 'O' || nom.get(i) == 'U')) {
				System.out.println(nom.get(i) + "   VOCAL");
			} else if (numeroTrobat == false) {
				System.out.println(nom.get(i) + "   CONSONANT");
			}
		}
		scan.close();
	}
}
