package fase4;

public class fase4 {
	public static void main(String[] args) {
//	Creeu una variable on juntareu el nom i els cognoms (tot en una variable) i un altre on juntareu
//	la data de naixement separada per “/” (tot en una variable). Mostreu per consola les variables del
//	nom complet, la data de naixement i si l’any de naixement es de traspàs o no.

		String nom = "Cesar";
		String cognom1 = "Armangue";
		String cognom2 = "Soler";
		String nomComplet = nom + " " + cognom1 + " " + cognom2;
		int dia = 26;
		int mes = 7;
		int any = 1995;
		String dataNaixement = dia + "/" + mes + "/" + any;

		System.out.println("El meu nom és " + nomComplet + "\n" + "Vaig néixer el " + dataNaixement);
		calcularAnyTraspas(any);

	}

	public static void calcularAnyTraspas(int any) {
		int anyNaixement = any;
		int anyInicial = 1948;
		int interval = 4;
		boolean anyTraspas = false;
		String traspas = "el meu any de naixement és de traspàs.";
		String noTraspas = "el meu any de naixement no és de traspàs.";
		for (int i = anyInicial + interval; i <= anyNaixement; i += interval) {
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
