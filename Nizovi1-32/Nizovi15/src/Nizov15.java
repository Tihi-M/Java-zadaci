import java.util.Scanner;
import java.lang.Math;
public class Nizov15 {
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
	public static double aritmetickaSredina(int []arr) {
		int suma=0;
		for(int i = 0; i<arr.length;i++) {
			suma+=arr[i];
		}
		return suma/arr.length;
	}
	public static int minArr(int[] arr) {
		int tempMin=99999;
		double tempRazlika = 99999;
		double arSr = aritmetickaSredina(arr);
		for(int i = 0;i<arr.length;i++) {
			if (Math.abs(arr[i]-arSr)<tempRazlika) {
					tempRazlika = Math.abs(arr[i]-arSr);
					tempMin = arr[i];
				}
			}
		return tempMin;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		inputValues(arr);
		sc.close();
		System.out.println(minArr(arr));
	}

}
