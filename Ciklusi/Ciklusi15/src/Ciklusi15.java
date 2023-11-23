/*Prirodan broj n je savršen ako je jednak zbiru svih svojih pozitivnih djelilaca koji su manji od n. 
Npr. broj 6 je savršen, jer su djelioci broja 6 redom 1, 2 i 3 i važi 1+2+3=6. Napisati program 
koji za dati broj n provjerava da li je savršen, i ako jeste, štampa poruku “Savršen”, a ako nije 
savršen, štampa “Nije savršen”. 
 */
import java.util.Scanner;

public class Ciklusi15 {

	public static void main(String[] args) {
		System.out.println("Unesite zeljeni broj: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 0) {
			n = -1 * n;
		}
		int i = 1;
		int zbirDjelilaca=0;
		while(i <= n/2) {
			if(n%i == 0) {
				zbirDjelilaca +=i;
			}
			i++;
		}
		if(zbirDjelilaca == n) {
			System.out.println("Broj je savrsen ");
		}
		else {
			System.out.println("Broj nije savrsen");
		}

	}

}
