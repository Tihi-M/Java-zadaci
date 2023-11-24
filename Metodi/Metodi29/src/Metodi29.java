import java.util.Scanner;

public class Metodi29 {
	public static int nzd(int a ,int b) {
		int temp;
		while (b != 0) {
			temp = a;
			a = b;
			b=temp%b;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite brojeve a i b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("NZD brojeva "+a+" i "+b+" je: "+nzd(a,b));
		sc.close();
	}

}
