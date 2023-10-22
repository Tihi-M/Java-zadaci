//Provjeriti da li je godina prestupna

import java.util.Scanner;
public class PrestupnaGod {

	public static void main(String[] args) {
		System.out.println("Unesite zeljenu godinu: ");
		Scanner sc = new Scanner(System.in);
		int godina = sc.nextInt();
		if(godina % 4 == 0) {
			if(godina%100 == 0) {
				if (godina%400 == 0) {
					System.out.println("Godina je prestupna");
				}
				else {
					System.out.println("Godina nije prestupna");
				}
			}
			else {
				System.out.println("Godina je prestupna");
			}
		}else {
			System.out.println("Godina nije prestupna");

		}

	}

}
