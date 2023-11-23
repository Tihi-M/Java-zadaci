import java.util.Scanner;
public class LinearniZad12 {

	public static void main(String[] args) {
		System.out.println("Unesite cetvorocifreni br: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n<1000 || n >9999) {
			System.out.println("Unesite cetvorocifreni br: ");
			n = sc.nextInt();
		}
		sc.close();
		int a = n % 10;
		int b = (n/10)%10;
		int c = (n/100)%10;
		int d = n/1000;
		int zbirKvadrata = a*a + b*b + c*c + d*d;
		
		System.out.println("Zbir kvadrata cifara: "+ zbirKvadrata );

	}

}
