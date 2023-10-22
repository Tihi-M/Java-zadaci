//	Učitati ocjene a ispisati prosječnu ocjenu i uspjeh. 
//Ako se učita 1 kao ocjena prosjek je 1. Proces se prikida učitavanjem 0.
package prosjekOcjena;
import java.util.Scanner;
public class prosjekOcjena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ocjena;
		int brOcjena = 0;
		int sumaOcjena = 0;
		float prosjek = 1;
		System.out.println("Unesite ocjenu: ");
		ocjena = sc.nextInt();
		while( ocjena != 0) {
			if(ocjena == 1) {
				prosjek = 1;
				brOcjena =1;
				sumaOcjena=1;
				break;
			}else if(ocjena<1 || ocjena>5) {
				while(ocjena<1 || ocjena>5) {
					System.out.println("Unesite ocjenu od 1 do 5 :/ ");
					ocjena = sc.nextInt();
				}
				if(ocjena == 1 || ocjena==0) {
					if(ocjena == 1) {
						prosjek = 1;
						sumaOcjena = 1;
						brOcjena =1;
						break;
					}
					break;
				}
			}
			sumaOcjena +=ocjena;
			brOcjena++;
			ocjena = sc.nextInt();
		}
		sc.close();
		float suma = sumaOcjena;
		float br = brOcjena;
		prosjek = suma / br;
		if(prosjek<= 5 && prosjek >=4.5) {
			System.out.println("Imas odlican prosjek :D : " + prosjek);
		}
		else if(prosjek<4.5 && prosjek >=3.5) {
			System.out.println("Imas vrlo dobar prosjek :) : "+ prosjek);
		}
		else if(prosjek <3.5 && prosjek >= 2.5) {
			System.out.println("Imas dobar prosjek :l : "+ prosjek);
		}
		else if(prosjek<2.5 && prosjek >=1.5) {
			System.out.println("Imas dovoljan prosjek :/ : " + prosjek);
		}else {
			System.out.println("Nedovoljan si :C");
		}

	}}