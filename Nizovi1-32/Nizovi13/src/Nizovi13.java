import java.util.Scanner;

public class Nizovi13 {
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
	public static int brParnih(int num) {
		int brParnih = 0;
		while(num > 0) {
			if ((num % 10)%2 == 0) brParnih++;
			num/=10;
		}
		return brParnih;
	}
	public static int parneCifre(int []arr,int n) {
		int parnih = 0;
		for (int i = 0; i < arr.length;i++) {
			if(brParnih(arr[i]) == n) {
				parnih++;
			}
		}
		return parnih;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		int a = sc.nextInt();
		inputValues(arr);
		System.out.println(parneCifre(arr,a));
	}

}
