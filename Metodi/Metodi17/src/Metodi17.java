import java.util.Scanner;
public class Metodi17 {
	public static double duzinaStranice(double x1,double y1,double x2,double y2) {
		double duzina;
		duzina = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
		return duzina;
	}
	public static boolean trougaoPostoji(double x1,double y1,double x2, double y2, double x3, double y3) {
		double strA = duzinaStranice(x1,y1,x2,y2);
		double strB = duzinaStranice(x2,y2,x3,y3);
		double strC = duzinaStranice(x3,y3,x1,y1);
		if((strA >= strB + strC) || (strB >= strA + strC ) || (strC >= strA + strB)){
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koordinate prve tacke:");
		int tackaX1 = sc.nextInt();
		int tackaY1 = sc.nextInt();
		System.out.println("Unesite koordinate druge tacke:");
		int tackaX2 = sc.nextInt();
		int tackaY2 = sc.nextInt();
		System.out.println("Unesite koordinate trece tacke:");
		int tackaX3 = sc.nextInt();
		int tackaY3 = sc.nextInt();
		
		if (trougaoPostoji(tackaX1,tackaY1,tackaX2,tackaY2,tackaX3,tackaY3)) {
			System.out.println("Trougao postoji");
		}
		else {
			System.out.println("Trougao ne postoji");
		}
		sc.close();
		
	}

}
