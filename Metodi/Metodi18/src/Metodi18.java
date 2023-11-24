import java.util.Scanner;
import java.lang.Math;
public class Metodi18 {
	public static double redEX(double x, double n) {
		double suma=1;
		double sabirak = 1;
		int fact = 1;
		for (int i=1;sabirak <= n; i++ ) {
			sabirak = Math.pow(x,i)/fact;
			suma+=sabirak;
			fact *= i;
		}
		return suma;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite x , i eps:" );
		double x = sc.nextDouble();
		double eps = sc.nextDouble();
		System.out.println("Suma je: " + redEX(x,eps));
		sc.close();
	}

}
