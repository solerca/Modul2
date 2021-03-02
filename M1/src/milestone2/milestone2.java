package milestone2;

public class milestone2 {
	public static void main(String[] args) {

//		Declara una variable double. Assigna-li un valor amb 4 decimals
//		Declara variables de tipus: int, float i string
//		Fes un "cast" de la variable double a cada una de les variables que has creat anteriorment
//		per inicialitzar-les i pinta-les per pantalla.
		double d = 4.1312;
		int i;
		float f;
		String s;

		i = (int) d;
		f = (float) d;
		s = String.valueOf(d);

		System.out.println("variable double: " + d + "\n" + "variable int: " + i + "\n" + "variable float: " + f + "\n"
				+ "variable String: " + s);
	}

}
