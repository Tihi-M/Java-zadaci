import java.util.Scanner;

public class Metodi32 {
	public static int kiselina(int vodonik, int kiseonik, int sumpor) {
		int brMolekulaSumporne=0;
		vodonik*=2;
		kiseonik*=2;
		while(vodonik > 0 && kiseonik>0 && sumpor>0 ) {
			brMolekulaSumporne++;
			vodonik-=2;
			kiseonik-=4;
			sumpor-=1;
		}
		return brMolekulaSumporne;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj molekula\nvodonika, kiseonika i sumpora:");
		int h = sc.nextInt();
		int o = sc.nextInt();
		int s = sc.nextInt();
		sc.close();
		System.out.println("Broj molekula sumporne kiseline: "+kiselina(h,o,s));
	}

}
