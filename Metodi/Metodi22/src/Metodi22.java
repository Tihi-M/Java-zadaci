import java.util.Scanner;
public class Metodi22 {
	public static int nadjiZbir(int n) {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		for (int i = 0;i<n;i++) {
		suma += sc.nextInt();
		}
		sc.close();
		return suma;
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int n = sc.nextInt();
		System.out.println("Suma: "+nadjiZbir(n));
		sc.close();
	}

}
