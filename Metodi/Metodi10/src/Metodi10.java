import java.util.Scanner;

public class Metodi10 {
	public static int minMax(int n) {
		int najCif=0;
		int minCif=10;
		while (n > 0) {
			if (najCif<n%10) {
				najCif = n%10;
			}
			else if(minCif>n%10) {
				minCif = n%10;
			}
			n /= 10;
		}
		return najCif+minCif;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int n = sc.nextInt();	
		sc.close();
		System.out.println("Zbir najvece i najmanje cifre  je: " + minMax(n));

}
}
