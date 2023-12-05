import java.util.Scanner;
import java.lang.Math;
public class Nizovi11 {
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
		for(int i = 2; i <= Math.sqrt(num);i++) {
			if(num % i == 0 )return false;
		}
		return true;
	}
	public static boolean je2kOblika(int num) {
		while(num>=2) {
			if( num % 2 != 0) return false;
			else {
				num /=2;
			}
		}
		return true;
	}
	public static void uslov(int [] arr) {
		for(int i = 0; i < arr.length;i++) {
			if (je2kOblika(arr[i]) || jeProst(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		inputValues(arr);
		sc.close();
		uslov(arr);
	}

}
