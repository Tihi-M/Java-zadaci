import java.util.Scanner;

public class Metodi30 {
	public static boolean jeArmstrongov(int n) {
		int sumaKubova = 0;
		int tempn = n;
		int cif;
		while (tempn>0) {
			cif = tempn%10;
			sumaKubova += cif*cif*cif;  
			tempn/=10;
		}
		if(sumaKubova == n)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		System.out.println("Unesite broj n");
		int n = sc.nextInt();
		if (jeArmstrongov(n))
			System.out.println("Jeste Armstrongov");
		else
			System.out.println("Nije Armstrongov");
		sc.close();
			
	}

}
