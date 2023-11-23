import java.util.Scanner;

public class Nizovi22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj ucenika: ");
		int resultsNum = sc.nextInt();
		int[] results = new int[resultsNum];
		String[] grades = {"F:","E:","D:","C:","B:","A:"};
		int[][] values = {{0,49},{50,59},{60,69},{70,79},{80,89},{90,100}};
		//put users input in results array
		for(int i = 0; i < resultsNum;i++) {
			System.out.println("Unesite broj poena: ");
			results[i]=sc.nextInt();
			while(results[i]< 0 || results[i]>100 ) {
				System.out.println("Pogresan unos poena, unesite ponovo: ");
				results[i] = sc.nextInt();
			}
		}
		sc.close();
		//add stars to grades array based on points
		for(int i = 0;i<resultsNum;i++) {
			for(int j=0;j<6;j++) {
				if(results[i] <= values[j][1] && results[i]>=values[j][0]) {
					grades[j]+="*";
				}
			}
		}
		//print grades table
		for(int i = 0; i<6;i++) {
			System.out.println(grades[i]);
		}
		
		
	}

}
