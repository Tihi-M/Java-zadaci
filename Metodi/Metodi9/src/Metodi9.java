import java.util.Scanner;

public class Metodi9 {
	public static int najvecaCifra(int n) {
		int najCif=0;
		while (n > 0) {
			if (najCif<n%10) {
				najCif = n%10;
			}
			n /= 10;
		}
		return najCif;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int n = sc.nextInt();	
		sc.close();
		System.out.println("Najveca cifra je: " + najvecaCifra(n));

	}
}