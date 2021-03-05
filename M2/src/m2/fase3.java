package m2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class fase3 {
	// Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades
	// que apareixen.

	public static void main(String[] args) {
		System.out.println("Introdueix el teu nom");
		Scanner scan = new Scanner(System.in);
		String name = scan.next().toUpperCase();
		Map<Character, Integer> numLletres = new HashMap<Character, Integer>();
		for (int i = 0; i < name.length(); ++i) {
			char lletra = name.charAt(i);
			if (!numLletres.containsKey(lletra)) {
				numLletres.put(lletra, 1);
			} else {
				numLletres.put(lletra, numLletres.get(lletra) + 1);
			}

		}
		System.out.println(numLletres);
		scan.close();
	}
}
