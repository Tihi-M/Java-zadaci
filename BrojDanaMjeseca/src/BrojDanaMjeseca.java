/*Napisati kod koji za dati redni broj mjeseca 
 * (od 1 do 12) i datu godinu štampa broja dana u 
	datom mjesecu.
 */
import java.util.Scanner;

public class BrojDanaMjeseca {

	public static boolean prestupnaGod(int godina) {
		boolean prestupna = false;
		if(godina % 4 == 0) {
			if(godina%100 == 0) {
				if (godina%400 == 0) {
					return true;
				}
				else {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Unesite mjesec i godinu: ");
		Scanner sc = new Scanner(System.in);
		int mjesec = sc.nextInt();
		int godina = sc.nextInt();
		int brDana = 0;
		while(mjesec<1 || mjesec>12) {
			System.out.println("Unesite mjesec ponovo: ");
			mjesec = sc.nextInt();
		}
		sc.close();
		switch(mjesec) {
		case 1:
			brDana = 31;
			break;
		case 2:
			if(prestupnaGod(godina)) {
				brDana =29;
				break;
			}
			else {
				brDana = 28;
				break;
			}
		case 3:
			brDana = 31;
			break;
		case 4:
			brDana = 30;
			break;
		case 5:
			brDana = 31;
			break;
		case 6:
			brDana = 30;
			break;
		case 7:
			brDana = 31;
			break;
		case 8:
			brDana = 31;
			break;
		case 9:
			brDana = 30;
			break;
		case 10:
			brDana = 31;
			break;
		case 11:
			brDana = 30;
			break;
		case 12:
			brDana = 31;
			break;
		default:
			break;
		}
		System.out.println("Broj dana u mjesecu: " + mjesec +" godine: " + godina + " je: "+brDana);
	}

}
