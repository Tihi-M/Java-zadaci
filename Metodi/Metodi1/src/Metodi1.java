import java.util.Scanner;
public class Metodi1 {

	public static double promjena(double x, double a) {
		if (x>=0) {
			return x*a;
		}else
		{
			return a/x;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite brojeve x i a");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		sc.close();
		System.out.println("Nakon pozivanja funkcije:"+promjena(x,y));		
	}

}
