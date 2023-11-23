import java.util.Scanner;
public class Metodi2 {
	public static int zbirIzIntervala(int odA,int doB) {
		int suma = 0;
		for (int i = odA;i<=doB;i++) {
			suma += i;
		}
		return suma;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite a i b: ");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		System.out.println("Suma brojeva u intervalu je: " + zbirIzIntervala(a,b));
	}

}
