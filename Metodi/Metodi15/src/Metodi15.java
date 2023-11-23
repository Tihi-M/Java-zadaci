import java.util.Scanner;
public class Metodi15 {
	public static int minStepenDvojke(int n) {
		int minStepen=1;
		int proizvod=1;
		for(int i = 1; proizvod<n;++i) {
			proizvod *= 2;
			minStepen = i ;
		}
		return minStepen;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n; ");
		int n = sc.nextInt();
		System.out.println("Najmanji stepen dvojke veci od "+n+" je 2^"+minStepenDvojke(n));
		sc.close();
	}

}
