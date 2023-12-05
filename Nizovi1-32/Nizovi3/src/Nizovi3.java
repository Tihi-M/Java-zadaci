import java.util.Scanner;
public class Nizovi3 {
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
	public static int returnMinIndex(int a,int[] b) {
		int min = 999999;
		for(int i=0;i<b.length;i++) {
			if(a<b[i]) {
				if(min > b[i]) {
					min = i;
				}
			}
		}
		if(min == 999999) {
			System.out.println("Nema min");
			return min = -1;
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int a = sc.nextInt();
		inputValues(arr);
		sc.close();
		System.out.println(returnMinIndex(a,arr));
	}

}
