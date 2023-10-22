/* Unose se cijeli brojevi iz intervala [0,100], 
 * sve dok se ne unese broj koji ne priprada tom 
intervalu. Odrediti prosječnu vrijednost unijetih brojeva. 
 */
import java.util.Scanner;
public class Ciklusi19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int n = sc.nextInt();
		int zbirUnijetih=0;
		int brojUnijetih=0;
		int prosijecnaVr;
		while(n>= 0 && n<=100) {
			brojUnijetih++;
			zbirUnijetih+=n;
			System.out.println("Unesite broj: ");
			n = sc.nextInt();		
			}
		prosijecnaVr = zbirUnijetih / brojUnijetih;
		System.out.println("Prosijecna vrijednost je: "+prosijecnaVr);
	}

}
