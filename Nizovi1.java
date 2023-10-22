/*Napisati metod void updateArray (int a, int [] b)
 * koji svaki element niza b mijenja po sljedećim
 * pravilima: ako je element veći od 0, umanjuje
 * ga za a, a  u suprotnom ga uvećava za a. 
 */
import java.util.Scanner;

public class Nizovi1 {

	public static void main(String[] args) {
		System.out.println("Unesite broj a:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b;
		b = new int[a];
		int n;
		int i = 1;
		while(i < a) {
			n = sc.nextInt();
			b[i]=n;
			if(b[i]>0) {
				b[i]-=a;
			}
			else {
				b[i]+=a;
			}
			i++;
		}
		i = 0;
		while(i < a) {
			System.out.println(b[i]);
			i++;
		}
		sc.close();
	}

}
