import java.util.Scanner;
public class Metodi11 {
	public static double stepen(double x, int stepen) {
		double proizvod =1;
		if(x == 0) {
			if(stepen == 0)
			return 1;
			return 0;
		}
		else {
		while (stepen > 0) {
				proizvod *=x;
				stepen-=1;
			}
		return proizvod;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite bazu i stepen: ");
		double baza = sc.nextDouble();
		int stepen = sc.nextInt();
		System.out.println("Rezultat: "+stepen(baza,stepen));
		sc.close();
	}

}
