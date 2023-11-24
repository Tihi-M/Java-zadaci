import java.util.Scanner;
public class Metodi23 {
	public static int nadjiMax(int n) {
		Scanner sc = new Scanner(System.in);
		int max = -99999;
		int input;
		for (int i = 0;i<n;i++) {
			input = sc.nextInt();
			if (max < input) {
				max = input;
			}	
		}
		sc.close();
		return max;
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int n = sc.nextInt();
		System.out.println("Najveci uneseni broj: "+nadjiMax(n));
		sc.close();
	}

}
