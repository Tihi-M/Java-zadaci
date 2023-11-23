import java.util.Scanner;
public class Metodi7 {
	
	public static int zbirDjelilaca(int n) {
		int zbirDjelilaca = 0;
		if(n<0) {
			n = n*(-1);
		}
		for (int i=1;i <= n/2;i++) {
			if(n % i == 0) {
			zbirDjelilaca += i;
			}
		}
		return zbirDjelilaca+n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println("Zbir djelilaca broja "+n+" je: "+zbirDjelilaca(n));
	}

}
