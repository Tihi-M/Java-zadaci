import java.util.Scanner;
import java.lang.Math;

public class Metodi25 {
	public static boolean trougaoPostoji(int strA, int strB, int strC) {
		if(strA>strB+strC || strB>strA+strC || strC>strB+strA) {
			return false;
		}
		return true;
	}
	
	public static double povrsinaTrougla(int strA,int strB, int strC) {
		double s = (strA+strB+strC)/2;
		double povrsina = Math.sqrt(s*(s-strA)*(s-strB)*(s-strC));
		return povrsina;
	}
	
	public static double najTrougao(int n) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		int maxA,maxB,maxC;
		maxA=0;
		maxB=0;
		maxC=0;
		double povrsina;
		double max = 0;
		for (int i = 0;i < n;i++) {
			System.out.println("Unesite stranice trougla:");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if(trougaoPostoji(a,b,c)) {
				povrsina = povrsinaTrougla(a,b,c);
				if ( max < povrsina) {
					max = povrsina;
					maxA = a;
					maxB = b;
					maxC = c;
				}
			}
		}
		sc.close();
		System.out.println("Stranice najveceg trougla su: "+maxA+" "+maxB+" "+maxC);
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int n = sc.nextInt();
		System.out.println("Povrsina je: "+najTrougao(n));
		sc.close();
	}

}
