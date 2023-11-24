import java.util.Scanner;
import java.lang.Math;
public class Metodi26 {
	public static boolean jeProst(int n) {
		for (int i = 2; i <= Math.sqrt(n);i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite broj n");
		int n = sc.nextInt();
		if (jeProst(n)) {
			System.out.println("Jeste prost");
		}else {
			System.out.println("Nije prost");
		}
		sc.close();
	}

}
