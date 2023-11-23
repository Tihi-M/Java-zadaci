import java.util.Scanner;
public class Metodi6 {
	public static int brojDjelilaca(int n) {
		int brDjelilaca = 1;
		if(n<0) {
			n = n*(-1);
		}
		for (int i=1;i <= n/2;i++) {
			if(n % i == 0) {
			brDjelilaca += 1;
			}
		}
		return brDjelilaca;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n:");
		int n = sc.nextInt();
		sc.close();
		System.out.print("Broj djelilaca broja "+n+" je: "+brojDjelilaca(n)+".");
	}

}
