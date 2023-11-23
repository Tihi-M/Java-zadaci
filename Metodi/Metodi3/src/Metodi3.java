import java.lang.Math;
import java.util.Scanner;

public class Metodi3 {
	public static double duzinaDuzi(double x1,double y1,double x2,double y2) {
		double duzina;
		duzina = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
		return duzina;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double tacka1_x, tacka1_y,tacka2_x,tacka2_y;
		System.out.println("Unesite koordinate prve tacke:");
		tacka1_x=sc.nextDouble();
		tacka1_y=sc.nextDouble();
		System.out.println("Unesite koordinate druge tacke:");
		tacka2_x=sc.nextDouble();
		tacka2_y=sc.nextDouble();
		sc.close();
		
		System.out.println("Duzina duzi: "+duzinaDuzi(tacka1_x, tacka1_y,tacka2_x,tacka2_y));
		
	}

}
