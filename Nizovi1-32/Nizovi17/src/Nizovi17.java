import java.util.Scanner;
import java.lang.Math;
public class Nizovi17 {
	public static Scanner sc = new Scanner(System.in);
	public static void print(double [] arr) {
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
	
	public static double[] updatedArray(int []arr) {
		double arSr = aritmetickaSredina(arr);
		double[] updatedArr = new double[arr.length];
		for(int i = 0; i<arr.length;i++) {
			updatedArr[i] = Math.abs(arr[i]-arSr);
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