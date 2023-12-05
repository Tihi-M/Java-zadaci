import java.util.Scanner;

public class Nizovi18 {
	public static Scanner sc = new Scanner(System.in);
	public static void print(int [] arr) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]!=0) System.out.print(arr[i]+" ");
		}
	}
	public static void inputValues(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
	}
	public static double aritmetickaSredina(int []arr) {
		int suma=0;
		for(int i = 0; i<arr.length;i++) {
			suma+=arr[i];
		}
		return suma/arr.length;
	}
	
	public static int[] updatedArray(int []arr,int eps) {
		double arSr = aritmetickaSredina(arr);
		int[] updatedArr = new int[arr.length];
		for(int i = 0; i<arr.length;i++) {
			if(Math.abs(arr[i]-arSr)<eps) {
				updatedArr[i] = arr[i];
			}
		}
		return updatedArr;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		int e = sc.nextInt();
		inputValues(arr);
		sc.close();
		print(updatedArray(arr,e));
	}
}
