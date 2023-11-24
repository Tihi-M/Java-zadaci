import java.util.Scanner;
public class Metodi34 {
	
	public static boolean provjeriUnos(int x, int y) {
		if(x>y)
			return false;
		return true;
	}
	
	public static int unijaIntervala(int odA, int doB,int odC, int doD ) {
		int duzinaIntervala = 0;
		if (doB> doD) {
			if(odA < odC) {
				duzinaIntervala = odA+doB;
				return duzinaIntervala;
			}
			else {
				duzinaIntervala = odC+doB;
				return duzinaIntervala;
				}
			}
			else {
				if(odA < odC) {
					duzinaIntervala = odA+doD;
					return duzinaIntervala;
				}
				else {
					duzinaIntervala = odC+doD;
					return duzinaIntervala;
				}
			}
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
		while(!provjeriUnos(c,d)) {
			System.out.println("C mora biti manje od D");
			c = sc.nextInt();
			d = sc.nextInt();
		}
		System.out.println("Duzina unije intervala: "+unijaIntervala(a,b,c,d));
		sc.close();
		}

	}

