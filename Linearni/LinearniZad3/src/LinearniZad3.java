import java.util.Scanner;
//3. Date su osnovice a i b i visina trapeza h. Naći njegovu površinu. 

public class LinearniZad3 {

	public static void main(String[] args) {
		System.out.println("Unesite stranicu a: ");
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		
		System.out.println("Unesite stranicu b: ");
		float b = sc.nextFloat();
		
		System.out.println("Unesite visinu h: ");
		float h = sc.nextFloat();
		
		float povrsinaTrapeza = a*b/2 * h;
		System.out.println("Povrsina trapeza: "+ povrsinaTrapeza);
		sc.close();
	}

}
