package m2;

public class milestone3 {

	public static void main(String[] args) throws InterruptedException {
//		En quest exercici es proposa un exercici complex de comprovacions i bucles
//		per crear un rellotge digital que mostra l'hora sense parar. A més té un segon
//		d'espera per més realisme. 
//		Només necessites 3 variables int (hour, minutes, seconds) 
//		El rellotge ha de tenir 6 dígits en tot moment: 00:00:00 
//		L’aplicació no ha de finalitzar mai. 
//		Per que el rellotge trigui un segon has d’implementar: Thread.sleep(1000); 

		int hour = 23;
		int minutes = 59;
		int seconds = 55;
		while (0 <= seconds) {

			if (seconds < 60) {

				System.out.print(String.format("%02d", hour) + ":" + String.format("%02d", minutes) + ":"
						+ String.format("%02d", seconds));
				seconds++;
				Thread.sleep(1000);
				System.out.println(new String(new char[50]).replace("\0", "\r\n"));
			} else if (minutes < 59) {
				seconds = 0;
				minutes++;
			} else if (hour < 23) {
				seconds = 0;
				minutes = 0;
				hour++;
			} else {
				seconds = 0;
				minutes = 0;
				hour = 0;
			}

		}

	}

}
