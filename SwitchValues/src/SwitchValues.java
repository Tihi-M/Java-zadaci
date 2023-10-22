//Ako je x=5 i y=7 stampati x=7 i y=5
import java.util.Scanner;
public class SwitchValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite X i Y:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Sada je x = " + x + ", a y = " + y);

	}

}
