import java.util.Scanner;
public class Nizovi1 {
	public static Scanner sc = new Scanner(System.in);
	public static void updateArray(int a, int[] b) {
		for(int i = 0; i < b.length;i++) {
			if (b[i]<a )
				b[i] -=a;
			else b[i]+=a;
		}
	}
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int a = sc.nextInt();
		inputValues(arr);
		sc.close();
		updateArray(a,arr);
		print(arr);
	}

}
