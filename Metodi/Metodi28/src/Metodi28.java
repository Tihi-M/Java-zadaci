import java.util.Scanner;
import java.lang.Math;
public class Metodi28 {

	public static boolean jeProst(int n) {
		for (int i = 2; i <= Math.sqrt(n);i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void prostiDjelioci(int n) {
		for(int i = 1; i <= n/2 ;i++) {
			if (n%i == 0 && jeProst(i)) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite broj n:");
		int n = sc.nextInt();
		prostiDjelioci(n);
		sc.close();
	}}
