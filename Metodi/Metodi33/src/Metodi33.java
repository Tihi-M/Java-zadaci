import java.util.Scanner;
public class Metodi33 {
	public static boolean provjeriUnos(int x, int y) {
		if(x>y)
			return false;
		return true;
	}
	
	public static int presjekIntervala(int odA, int doB,int odC, int doD ) {
		int duzinaPresjeka = 0;
		if(odC > doB)
			return duzinaPresjeka;
		else if (odA > doD)
			return duzinaPresjeka;
		else if(doB>doD) {  
			if(odC<odA) { 
				duzinaPresjeka = doD-odA;
				return duzinaPresjeka;
			}
			else {
				duzinaPresjeka = doB-odA;
			}
		}else {
			if(odC<odA) { 
				duzinaPresjeka = doD-odC;
				return duzinaPresjeka;
			}
			else {
				duzinaPresjeka = doB-odC;
			}
		}
		return duzinaPresjeka;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite granice prvog intervala:");
		int a =sc.nextInt();
		int b = sc.nextInt();
		while(!provjeriUnos(a,b)) {
			System.out.println("A mora biti manje od B");
			a = sc.nextInt();
			b = sc.nextInt();
		}
		System.out.println("Unesite granice drugog intervala:");
		int c = sc.nextInt();
		int d = sc.nextInt();
		while(!provjeriUnos(a,b)) {
			System.out.println("C mora biti manje od D");
			c = sc.nextInt();
			d = sc.nextInt();
		}
		System.out.println("Duzina presjeka intervala: "+presjekIntervala(a,b,c,d));
		sc.close();
	}

}
