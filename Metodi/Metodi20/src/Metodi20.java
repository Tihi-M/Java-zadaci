import java.util.Scanner;
public class Metodi20 {
	public static double prosjekOcjena(int n) {
		Scanner sc = new Scanner(System.in);
		double prosjek=0;
		double ocjena,brOcjena;
		double sumaOcjena = 0;
		brOcjena = 0;
		if(n <= 0) {
			sc.close();
			System.out.println("Pogresan unos.");
			return prosjek;
		}else {
			System.out.println("Unosenje ocjena:");
			for(int i=1; i<= n; ++i) {
				ocjena = sc.nextInt();
				sumaOcjena += ocjena;
				brOcjena=i;
			}
			prosjek = sumaOcjena/brOcjena;
			sc.close();
			return prosjek;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite neki broj n");
		int n = sc.nextInt();
		System.out.println("Prosjek ocjena je: " + prosjekOcjena(n));
		sc.close();
	}

}
