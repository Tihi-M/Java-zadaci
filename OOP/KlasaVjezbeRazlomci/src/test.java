
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Razlomak r1 = new Razlomak(1,2,'-');
		Razlomak r2 = new Razlomak(1,3,'+');
		Razlomak r3 = new Razlomak(2,8,'+');
		r3.Skrati();
		System.out.println("Nakon skracivanja razlomka 2/8: "+r3);
		Vektor v = new Vektor();
		v.Dodaj(r1);
		v.Dodaj(r2);
		v.Dodaj(r3);
		System.out.println("Suma tri razlomka: " + v.Suma());
	}

}
