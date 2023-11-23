import java.util.Scanner;

public class Metodi12 {
	public static void print3k(int odA, int doB) {
		for (int i = odA; i <= doB;i++) {
			if((i - 1) % 3 == 0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite granice intervala:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		print3k(a ,b);
		sc.close();
	}

}
