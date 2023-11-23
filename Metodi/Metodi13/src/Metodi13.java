import java.util.Scanner;
public class Metodi13 {
	public static long factorial(int n) {
		long fact = 1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println("Faktroijel broja n: " + factorial(n));
	}

}
