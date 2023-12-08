
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pravougaonik p = new Pravougaonik(0,0,3,3);
		Pravougaonik p1 = new Pravougaonik(1,1,2,2);
		System.out.println(p.contains(p1));
		System.out.println(p.povrsina()+" "+p1.povrsina());
		System.out.println(p.obim()+" "+p1.obim());
	}

}
