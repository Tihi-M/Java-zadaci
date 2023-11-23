import java.util.Scanner;
//Petar je posmatrao fudbalsku utakmicu i na papiru zapisivao rezultat sa 
//semafora poslije svakog gola. Npr. mogući zapis je: 1:0, 1:1, 1:2, 2:2, 2:3. 
//Zatim je Petar sabrao sve zapisane brojeve: 1+0+1+1+1+2+2+2+2+3=15. Na 
//osnovu datog zbira, napišite program koji određuje koliko je golova bilo na 
//utakmici.
public class LinearniZad16 {

	public static void main(String[] args) {
		System.out.println("Zbir stanja na semaforu : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int i = 0;
		int zbirG = 0;
		while(zbirG != n) {
			i++;
			zbirG+=i;
			
		}
		System.out.println("Broj golova na mecu: " + i);
	}

}
