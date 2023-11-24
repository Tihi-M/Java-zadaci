import java.util.Scanner;

public class Metodi31 {
	public static boolean isHemings(int n) {
		while(n%2==0){
			n/=2;
		}
		while(n%3==0) {
			n/=3;
		}
		while(n%5==0) {
			n/=5;
		}
		if(n!=1) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n");
		int n = sc.nextInt();
		sc.close();
		if (isHemings(n)) 
			System.out.println("Jeste Hemingov");
		else
			System.out.println("Nije Hemingov");
	}

}
