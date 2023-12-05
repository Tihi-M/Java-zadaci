import java.util.Scanner;
public class Nizovi7 {
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
	public static int oddSegments(int [] arr) {
		int tempMax=0;
		int max = -1;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]%2 != 0) {
				tempMax++;
				if(tempMax>max) {
					max=tempMax;
				}
			}else {
				tempMax=0;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		inputValues(arr);
		sc.close();
		System.out.println(oddSegments(arr));
	}

}
