import java.util.Scanner;
public class Nizovi19 {
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
	public static boolean notRepetition(int[] arr, int index, int num) {
		for(int i = 0; i<index;i++ ) {
			if(arr[i]==num) {
				return false;
			}
		}
		return true;
	}
	public static int numOfSameEl(int []arr, int el) {
		int reps=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i] == el) {
				reps++;
			}
		}
		return reps;
	}
	public static void frekvencije(int [] arr) {
		for (int i=0; i<arr.length;i++) {
			if(notRepetition(arr,i,arr[i])) {
				System.out.println(arr[i]+": "+numOfSameEl(arr,arr[i]));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[10];
		inputValues(arr);
		sc.close();
		frekvencije(arr);
	}

}
