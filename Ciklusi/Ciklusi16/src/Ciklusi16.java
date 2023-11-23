/*Prirodan broj n je Armstrongov ako je jednak zbiru kubova svojih cifara. Npr. 371 je 
Armstrongov jer je 33+73+13=371. Napisati program koji za dati broj n provjerava da li je 
Armstrongov, i ako jeste, štampa poruku “Armstrongov”, a ako nije, štampa “Nije 
//Armstrongov”*/
import java.util.Scanner;
import java.lang.Math;
public class Ciklusi16 {

	public static void main(String[] args) {
		System.out.println("Unesite zeljeni broj: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int sumaKubova = 0;
		int tempN = n;
		int trenutnaCifra = 0;
		while(tempN > 0) {
			trenutnaCifra = tempN % 10;
			sumaKubova += Math.pow(trenutnaCifra,3);
			tempN /= 10;
		}
		if(sumaKubova == n) {
			System.out.println("Vas broj je Armstrongov");
		}
		else {
			System.out.println("Vas broj nije Armstrongov");
		}

	}

}
