import java.util.Scanner;

public class Metodi24 {
	public static int najNeparniDjelilac(int n) {
		int max = 0;
		for(int i =1; i<n/2;i++) {
			if(n%i==0) 
				if(i > max && i%2 != 0)
					max = i;
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unsite broj n: ");
		int n = sc.nextInt();
		System.out.println("Najveci neparni djelilac: " + najNeparniDjelilac(n));
		sc.close();
	}

}
