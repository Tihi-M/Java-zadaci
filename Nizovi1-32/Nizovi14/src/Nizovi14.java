import java.util.Scanner;
import java.lang.Math;
public class Nizovi14 {

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
	public static boolean jeProst(int num) {
		for(int i = 2; i<=Math.sqrt(num);i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean imaProstuCifru(int num) {
		while(num > 0) {
			if (jeProst(num%10)) return true;
			num /= 10;
		}
		return false;
	}
	public static int parneCifre(int []arr) {
		int parnih = 0;
		for (int i = 0; i < arr.length;i++) {
			if(imaProstuCifru(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		}
		return parnih;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		inputValues(arr);
		sc.close();
		parneCifre(arr);
	}

}
