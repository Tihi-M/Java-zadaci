import java.util.Scanner;
public class Nizovi20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Koliko puta bacate kockicu? ");
		int cubesNum = sc.nextInt();
		sc.close();
		
		int[] cubeValues = {1, 2 ,3 ,4 ,5 ,6};
		int[] valuesCounter = new int[6];
		for(int i = 0; i < cubesNum;i++) {
			int round = 1 + (int)(Math.random()*6);
			for(int j:cubeValues) {
				if(j==round) {
				System.out.println("#######");
				System.out.println("#     #");
				System.out.println("#  "+round+"  #");
				System.out.println("#     #");
				System.out.println("#######");
				System.out.println();
				}
			}
			valuesCounter[round-1]++;
		}
		System.out.println("Rezultati: ");
		String[] text = {"jedinica", "dvojki", "trojki", "cetvorki","petica","sestica"};
		for(int i = 0;i<=5;i++) {
			System.out.println("Broj "+text[i]+": " +valuesCounter[i]);
		}

	}

}