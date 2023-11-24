import java.util.Scanner;

public class Metodi21 {
	public static void manjiOdX(int x) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int brojParnih=0;
		int brojUnijetih = 1;
		int sumaUnijetih = 0;
		while (input < x) {
			brojUnijetih++;
			sumaUnijetih +=input;
			if(input%2==0) {
				brojParnih++;
			}
			input=sc.nextInt();
		}
		System.out.println("Uneseno brojeva: " + brojUnijetih);
		System.out.println("Od toga je parnih: " + brojParnih);
		System.out.println("Suma svih unesenih: " + sumaUnijetih);
		sc.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj x: ");
		int x = sc.nextInt();
		manjiOdX(x);
		sc.close();
	}

}
