import java.util.Scanner;

public class Nizovi12 {
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
	public static int brJed(int num) {
		int brJedinica = 0;
		while(num > 0) {
			if (num % 10 == 1) brJedinica++;
			num/=10;
		}
		return brJedinica;
	}
	public static void jedinice(int []arr,int n) {
		for (int i = 0; i < arr.length;i++) {
			if(brJed(arr[i]) == n) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		int n = sc.nextInt();
		inputValues(arr);
		sc.close();
		jedinice(arr,n);
	}

}
