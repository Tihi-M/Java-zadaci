import java.util.Scanner;

public class Metodi14 {
	public static boolean jesteStepenDvojke(int n) {
		while(n>1) {
			if(n%2!=0) {
				return false;
			}
			n/=2;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int n = sc.nextInt();
		if (jesteStepenDvojke(n)) {
			System.out.println("Jeste stepen dvojke");
		}
		else{
			System.out.println("Nije stepen dvojke");
		}
		sc.close();
	}

}
