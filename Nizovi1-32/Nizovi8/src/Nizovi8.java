import java.util.Scanner;

public class Nizovi8 {
	public static Scanner sc = new Scanner(System.in);
	public static void print(int [] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void inputValues(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
	}
	public static int[] shiftLeft(int []arr) {
		int	firstDigit = arr[0];
		for(int i=0;i<arr.length-1;i++) {
				arr[i] = arr[i+1];
		}
		arr[arr.length-1] = firstDigit;
		return arr;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		inputValues(arr);
		sc.close();
		arr=shiftLeft(arr);
		print(arr);
	}

}
