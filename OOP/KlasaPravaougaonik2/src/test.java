
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pravougaonik p1 = new Pravougaonik(0,0,2,2);
		Pravougaonik p2 = new Pravougaonik(1,1,3,3);
		Pravougaonik presjekP1P2 = p1.presjek(p2);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(presjekP1P2);
		System.out.println(p2.PovrsinaPravougaonika());
		System.out.println(presjekP1P2.PovrsinaPravougaonika());

	}

}
