import java.util.Scanner;
public class Nizovi9 {
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
	//public static int powerOfTwo(int []b) {
	//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input= sc.nextInt();
		double stepen2=0.1;
		int i=0;
		while(input!=0) {
			i++;
			stepen2*=2;
			System.out.println("Stepen "+i+":" + stepen2 % 1);
			input=sc.nextInt();
		}
	}
//.......
}
