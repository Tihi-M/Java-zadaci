/*Prirodan broj n je Hemingov ako svi njegovi prosti djelioci pripadaju skupu {2,3,5}. Prvi 
Hemingov broj je 2, pa zatim idu 3, 4=2*2, 5, 6=2*3, 8=2*2*2, 9=3*3, 10=2*5, 12=2*2*3, 
15=3*5, itd. Npr. 14 nije Hemingov broj jer je 14=2*7, pa prosti djelioci broja 14 su 2 i 7 , a 7 
ne pripada skupu {2, 3, 5}. Napisati program koji za dati broj n provjerava da li je Hemingov, i 
ako jeste, štampa poruku “Hemingov”, a ako nije, štampa “Nije Hemingov”.
*/
import java.util.Scanner;

public class Ciklusi17 {

	public static void main(String[] args) {
		System.out.println("Unesite zeljeni broj: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean check = true;
		while(n!=0 && check) {
			if(n%2==0) {
			System.out.println("2");
			n/=2;
		} else if(n%3==0) {
			System.out.println("3");
			n/=3;
		} else if(n%5==0) {
			System.out.println("5");
			n/=5;
		}
		else {
			check=false;
		}
	}
		if(n == 1) {
			System.out.println("Jeste Hemingov");
		}
		else {
			System.out.println("Nije Hemingov");
		}
}
}
