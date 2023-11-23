import java.util.Scanner;
public class Metodi8 {
	public static int zbirCifara(int n) {
		int zbirCif=0;
		while (n > 0) {
			zbirCif +=n%10;
			n /=10;
		}
		return zbirCif;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println("Zbir cifara je: " + zbirCifara(n));
	}

}
