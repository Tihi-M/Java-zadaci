//Unosi se neki broj 10010100 i iz binarnog ga pretvara u dekadni
//??Mozda iz bilo kog u bilo koji 
import java.util.Scanner;
import java.lang.Math;
public class BrojniSistemi {
	
	public static boolean provjeriUnos(int bBroj) {
		int cifra;
		while(bBroj>1) {
			cifra = bBroj%10;
			bBroj/=10;
			if(cifra != 0 && cifra != 1) {
				return false;
			}
		}
		return true;
	}
	public static int izBuD(int binarniBroj) {
		int dekadniBr = 0;
		int stepen = 0;
		while(binarniBroj>=1) {
			if(binarniBroj%10 == 1) {
				dekadniBr += Math.pow(2,stepen);
			}
			binarniBroj/=10;
			stepen++;
		}
		return dekadniBr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite binarni broj: ");
		int binarniBr = sc.nextInt();
		while(provjeriUnos(binarniBr)==false) {
			System.out.println("Unesite binarni broj (0,1): ");
			binarniBr = sc.nextInt();
		}
		System.out.println("U dekakadnom brojnom sistemu " + binarniBr + " je "+ izBuD(binarniBr));
		sc.close();

	}

}
