import java.util.Scanner;
public class Nizovi7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int arrLength = sc.nextInt();
		int[] arr= new int[arrLength];
		int maxOdd = 0;
		int tempMax = 0;
		for(int i = 0;i<arrLength;i++) {
			System.out.println("Unesite clan niza: ");
			arr[i] = sc.nextInt();
			if((arr[i])%2 != 0) {
				tempMax++;
			}
			else {
				
				maxOdd = tempMax;
			}
		}
		sc.close();
		System.out.println("Najduzi segment neparnih brojeva je: "+ maxOdd);

	}

}
