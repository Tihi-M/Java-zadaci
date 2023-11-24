import java.util.Scanner;
import java.lang.Math;

public class Metodi27 {

	public static boolean jeProst(int n) {
		for (int i = 2; i <= Math.sqrt(n);i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void stampajProste(int odA, int doB) {
		for(int i = odA; i <= doB ;i++) {
			if (jeProst(i)) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite granice intervala:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		stampajProste(a,b);
		sc.close();
	}
}
