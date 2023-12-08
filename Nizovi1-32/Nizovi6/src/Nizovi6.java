import java.util.Scanner;

public class Nizovi6 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void inputValues(int [] arr) {
		int el;
		for(int i=0;i<arr.length;i++) {
			el =sc.nextInt();
			while (el ==0) {
				el = sc.nextInt();
			}
			arr[i] = el;
		}
	}
	
	public static boolean signChanged(int num1, int num2) {
		if (num1*num2<0){
			return true;
		}else return false;
	}
	public static int changeSigns(int[] arr) {
		int numOfChanges =0 ;
		for(int i = 0; i < arr.length;i++) {
			if (i<arr.length-1) {
				if (signChanged(arr[i],arr[i+1])) {
					numOfChanges++;
				}
			}
		}
		return numOfChanges;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		inputValues(arr);
		sc.close();
		System.out.println(changeSigns(arr));
	}
}