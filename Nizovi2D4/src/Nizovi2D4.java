import java.util.Scanner;

public class Nizovi2D4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n: ");
		int dimenzijaM= sc.nextInt();
		boolean jesteSim = true;
		int[][] matrica = new int[dimenzijaM][dimenzijaM];
		
		for(int i = 0; i < dimenzijaM ; i++) {
			for(int j = 0; j< dimenzijaM; j++) {
				matrica[i][j]=sc.nextInt();
			}
		}
		sc.close();
		
		for(int i = 0; i< dimenzijaM; i++) {
			for(int j = 0; j< dimenzijaM; j++) {
				if((matrica[i][j] != matrica[j][i])&&(i!=j)) {
					jesteSim = false;
				}
			}
		}
		
		if(jesteSim) {
			System.out.println("Matrica je simetricna");
		}
		else {
			System.out.println("Matrica nije simetricna");
		}
		
		

	}

}
