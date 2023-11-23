import java.util.Scanner;

public class Metodi5 {

	public static void spisakDjelilaca(int n) {
		if(n<0) {
			n = n*(-1);
		}
		System.out.println("Djelioci broja "+ n +" su: ");
		for (int i=1;i <= n/2;i++) {
			if(n % i == 0) {
			System.out.println(i+",");
			}
		}
		System.out.println(n+".");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int num = sc.nextInt();
		sc.close();
		spisakDjelilaca(num);
	}

}
