package fase1;

public class fase1 {
//	Fase 1
//	Crea tres variables string e inicialitzales amb les dades pertinents (nom, cognom1, cognom2).
//	Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes, any).
//	Mostra per pantalla les variables string concatenant-les en aquest ordre (cognom1 + cognom2, + nom).
//	Mostra per pantalla les variables int concatenant-les amb “/” entre cada una d’elles.
	public static void main(String[] args) {

		String nom = "Cesar";
		String cognom1 = "Armangue";
		String cognom2 = "Soler";
		int dia = 26;
		int mes = 7;
		int any = 1995;

		System.out.println(cognom1 + " " + cognom2 + ", " + nom);
		System.out.println(dia + "/" + mes + "/" + any);
	}
}
