import java.util.Scanner;
public class Nizovi16 {
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
	public static int maxCifra(int num) {
		int max = -999999;
		while(num > 0) {
			if(num%10 > max) max = num%10;
			num/=10;
		}
		
		return max;
	}
	public static int[] updatedArray(int []arr) {
		int[] updatedArr = new int[arr.length];
		for(int i = 0; i<arr.length;i++) {
			updatedArr[i] = maxCifra(arr[i]);
		}
		return updatedArr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		inputValues(arr);
		sc.close();
		print(updatedArray(arr));
	}

}
