import java.util.Scanner;
import java.util.Random;
public class Nizovi20 {
	public static Scanner sc = new Scanner(System.in);
	public static void print(int [] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.println(i+1+": "+arr[i]+" ");
		}
	}
	
	public static int[] kockica(int n) {
		Random rand = new Random();
		int randNum;
		int [] vrijednostiKockice= {0,0,0,0,0,0};
		for(int i= 0; i<n;i++) {
			randNum = rand.nextInt(1,6);
			vrijednostiKockice[randNum-1]++;
		}
		return vrijednostiKockice;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brojBacanja = sc.nextInt();
		sc.close();
		print(kockica(brojBacanja));
	}

}
