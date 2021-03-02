package milestone3;

public class milestone3 {
	public static void main(String[] args) {

//		Declara un array de numeros int e inicialitzala amb valors del 1 al 10
//		Rota l’array sense utilitzar un array auxiliar ni llibreries. Pots utilizar una variable auxiliar.

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int primerNumero = array[0];
		int i;
		for (i = 0; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		array[i] = primerNumero;

		System.out.println(array[0] + "," + array[1] + "," + array[2] + "," + array[3] + "," + array[4] + "," + array[5]
				+ "," + array[6] + "," + array[7] + "," + array[8] + "," + array[9]);

	}
}
