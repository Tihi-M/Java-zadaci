//Unosi se neki broj 10010100 i iz binarnog ga pretvara u dekadni
//??Mozda iz bilo kog u bilo koji 
import java.util.Scanner;
import java.lang.Math;
public class BrojniSistemi {
	
	public static boolean provjeriUnos(int uneseniBroj, int baza) {
		int cifra;
		if(baza == 1) {
			while(uneseniBroj>1) {
				cifra = uneseniBroj%10;
				uneseniBroj/=10;
				if(cifra != 0 && cifra != 1) {
					return false;
				}
			}
			return true;
		}
		else if(baza == 2){
			while(uneseniBroj>1) {
				cifra = uneseniBroj%10;
				uneseniBroj/=10;
				if(cifra < 0 || cifra > 7) {
					return false;
				}
			}
			return true;
		}
		return true;
	}
	
	public static int izXuD(int uneseniBroj, int baza) {
		int dekadniBr = 0;
		int stepen = 0;
		while(uneseniBroj>=1) {
			if(baza == 1) {
				dekadniBr += (uneseniBroj%10)*Math.pow(2,stepen);
			}
			else if(baza == 2) {
				dekadniBr += (uneseniBroj%10)*Math.pow(8,stepen);
			}
			uneseniBroj/=10;
			stepen++;
		}
		return dekadniBr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Izaberite brojni sistem:\n"
				          +"1. Binarni\n" 
				          +"2. Oktalni\n"
				          +"3. Heksadecimalni\n");
		int brojniSistem = sc.nextInt();
		while(brojniSistem != 1 && brojniSistem !=2 && brojniSistem!=3 ) {
			System.out.println("Unesite broj 1 - 3");
			brojniSistem = sc.nextInt();
		}
		
		
		System.out.println("Unesite zeljeni broj: ");
		int uneseniBr = sc.nextInt();
		while(provjeriUnos(uneseniBr, brojniSistem)==false) {
			if(brojniSistem == 1) {
				System.out.println("Unesite binarni broj (0,1): ");
				uneseniBr = sc.nextInt();
			}else if(brojniSistem ==2) {
				System.out.println("Unesite oktalni broj (0-7): ");
				uneseniBr = sc.nextInt();
			}
			
		}
		System.out.println("U dekakadnom brojnom sistemu broj " + uneseniBr + " je: "+ izXuD(uneseniBr, brojniSistem));
		sc.close();

	}

}
