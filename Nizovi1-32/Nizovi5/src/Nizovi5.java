import java.util.Scanner;
public class Nizovi5 {
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
	
	public static boolean isValidPair(int num1, int num2) {
		if ((num1 % 10 == 0) && (num2 % 10==0)) {
			return true;
		}else return false;
	}
	
	public static int zeroEl(int [] arr) {
		int pairsNum=0;
		for (int i = 0; i< arr.length; i++) {
			if (i < arr.length-1) {
				if (isValidPair(arr[i],arr[i+1])) {
					pairsNum ++;
				}
			}
		}
		return pairsNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		inputValues(arr);
		sc.close();
		System.out.println(zeroEl(arr));
	}

}
