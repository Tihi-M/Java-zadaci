import java.util.Scanner;
public class Metodi4 {
	public static boolean pripadaIntervalu(int odA,int doB,int x) {
		if(x>=odA && x<=doB) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,x;
		System.out.println("Unesite granice intervala:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Unesite broj za provjeru: ");
		x = sc.nextInt();
		sc.close();
		
		if (pripadaIntervalu(a,b,x)) {
			System.out.print("Pripada intervalu.");
		}
		else {
			System.out.print("Ne pripada intervalu.");
		}
	}

}
