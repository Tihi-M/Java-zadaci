import java.util.Scanner;

public class Nizovi19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int arrLength = sc.nextInt();
		int[] arr = new int[arrLength];
		for(int i = 0; i < arrLength;i++) {
			System.out.println("Unesite clan niza: ");
			arr[i] = sc.nextInt();
		}
		sc.close();
		int counter = 0;
		int[] repCount = new int[arrLength];
		for(int i=0; i < arrLength ;i++) {
			for(int j=0; j < arrLength;j++) {
				if(arr[j] == arr[i]) {
				counter++;
				}
			}
			repCount[i] = counter;
			counter=0;
		}
		for(int i=0; i < arrLength; i++) {
			System.out.println("Broj ponavljanja " + (i+1) + ". clana: " + repCount[i]);			
		}
}
	}
