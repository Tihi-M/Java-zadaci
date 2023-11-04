import java.util.Scanner;
public class Nizovi2D5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite dimenzije matrice n i m: ");
		int redovi = sc.nextInt();
		int kolone = sc.nextInt();
		int[][] matrica = new int[redovi][kolone];
		int element = 0;
		for(int i = 0; i<redovi;i++) {
			if(i%2==0) {
				for(int j = 0; j<kolone;j++) {
					matrica[i][j]=element;
					element++;
				}
				
			}
			else {
				for(int j = kolone-1; j >= 0; j--) {
					matrica[i][j]=element;
					element++;
				}
			}
		}
		sc.close();
		
		for(int i = 0; i<redovi;i++) {
			for(int j = 0; j<kolone;j++) {
				System.out.print(matrica[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
