import java.util.Scanner;
public class Nizovi4 {
	public static Scanner sc = new Scanner(System.in);
	public static void print(int [] arr) {
		for(int i = 0;i<arr.length;i++) {
			if (arr[i] != 0) System.out.print(arr[i]+" ");
		}
	}
	public static void inputValues(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
	}
	public static boolean isValid(int num, int a) {
		if ((num%13 == 0 || num%17 == 0) && (num>a)){
			return true;
		}else return false;
	}
	public static int[] fillThirteenSeventeen(int a,int[] b) {
		int[] updatedArr=new int[b.length];
		int j=0;
		for(int i = 0; i < b.length;i++) {
			if (isValid(b[i],a)) {
				updatedArr[j] = b[i];
				j++;
			}
		}
		return updatedArr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int a = sc.nextInt();
		inputValues(arr);
		sc.close();
		arr = fillThirteenSeventeen(a,arr);
		print(arr);
	}

}
