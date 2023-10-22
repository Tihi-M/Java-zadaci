/*Unosi se cio broj n, a zatim n cijelih brojeva, 
po apsolutnoj vrijednosti manjih od 100000. 
Štampati najmanji od njih. 
 */
import java.util.Scanner;
public class Ciklusi18 {

	public static void main(String[] args) {
		System.out.println("Unesite broj n: ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int najmanjiBr = 1000000;
		int uneseniBr;
		int i = 0;
		while(i<n) {
			System.out.println("Unesite neki broj:");
			uneseniBr = sc.nextInt();
			i++;
			if(uneseniBr<najmanjiBr) {
				najmanjiBr = uneseniBr;
			}
			
		}
		sc.close();
		System.out.println("Najmanji br je: " + najmanjiBr);
	}

}
