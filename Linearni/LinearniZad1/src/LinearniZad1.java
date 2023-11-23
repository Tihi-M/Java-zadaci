//1. Data je stranica kvadrata a. Naći njegov obim i površinu.  
import java.util.Scanner;

public class LinearniZad1 {

	public static void main(String[] args) {
		System.out.println("Unesite str kvadrata: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int obimKvadrata = 4*a;
		int povrsinaKvadrata = a*a;
		System.out.println("Obim: " + obimKvadrata);
		System.out.println("Povrsina: " + povrsinaKvadrata);
	}

}
