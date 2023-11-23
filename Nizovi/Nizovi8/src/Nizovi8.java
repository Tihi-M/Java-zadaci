import java.util.Scanner;
public class Nizovi8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza:");
		int arrLength = sc.nextInt();
		int[] arr = new int[arrLength];
		for(int i = 0;i<arrLength;i++) {
			System.out.println("Unesite clan niza:");
			arr[i]=sc.nextInt();
		}
		int firstNum = arr[0];
		for(int i = 0;i<arrLength;i++) {
			if(i==arrLength-1) {
				arr[arrLength-1]=firstNum;
			}
			else {
			arr[i]=arr[i+1];
			}			
	}
		System.out.println("Pomjeren uleijevo za desno niz je: ");
		for(int i = 0;i<arrLength;i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
}
	}
