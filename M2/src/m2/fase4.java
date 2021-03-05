package m2;

import java.util.ArrayList;
import java.util.Scanner;

public class fase4 {

	public static void main(String[] args) {
//		Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra. 
//		Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit
//		entre la primera i la segona. És a dir, partim de la llista name i surname i al acabar
//		l’execució només tindrem una que es dirà fullName. 
		ArrayList<Character> name = new ArrayList<Character>();
		System.out.println("Introdueix el teu nom");
		Scanner scan = new Scanner(System.in);
		String nom = scan.next().toUpperCase();
		for (int i = 0; i < nom.length(); i++) {
			name.add(nom.charAt(i));
		}
		ArrayList<Character> surname = new ArrayList<Character>();
		System.out.println("Introdueix el teu cognom");
		Scanner scan2 = new Scanner(System.in);
		String cognom = scan.next().toUpperCase();
		for (int i = 0; i < cognom.length(); i++) {
			surname.add(cognom.charAt(i));
		}
		ArrayList<Character> fullname = new ArrayList<Character>();
		for (int i = 0; i < name.size() ; i++) {
			fullname.add(name.get(i));	
		}
		fullname.add(' ');
		for (int i = 0; i < surname.size() ; i++) {
			fullname.add(surname.get(i));	
		}
		System.out.println(fullname);
		scan.close();
		scan2.close();
		
	}

}
