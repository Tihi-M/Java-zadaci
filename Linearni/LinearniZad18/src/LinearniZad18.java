/*Domino se igra pločicama pravougaonog oblika, takvim da se na svakoj 
pločici nalaze dvije oznake. Svaka oznaka sastoji se od određenog broja 
tačkica. Broj tačkica zavisi o veličini skupa domina. U skupu domina veličine N 
broj tačkica na jednoj pločici može biti bilo koji broj između 0 i N, uključivo. U 
jednom skupu ne postoje dvije pločice potpuno jednakih oznaka, bez obzira 
na redosljed oznaka na pločici. U potpunom skupu veličine N nalaze se sve 
moguće pločice sa oznakama 0 do N. Npr. potpuni skup domina veličine 2 
sadrži šest pločica.Vaš program treba da učita jedan prirodan broj N (1 ≤ N ≤ 
1000) – veličinu potpunog skupa domina. Program treba da štampa ukupan broj tačkica 
na svim pločicama u potpunom skupu domina veličine N.*/
import java.util.Scanner;

public class LinearniZad18 {

	public static void main(String[] args) {
		System.out.println("Unesite maks br tackica: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int i = 0;
		int j = 0;
		int brojTackica = 0;
		while(j<n) {
			j++;
			i=0;
			while(i<=j) {
				System.out.println("#######");
				System.out.println("#  "+i+"  #");
				System.out.println("#-----#");
				System.out.println("#  "+j+"  #");
				System.out.println("#######" + "\n");
				brojTackica+=i+j;
				i++;
			}
		}
		System.out.println("Zbir tackica na svim dominama je: "+ brojTackica);
		
	}

}
