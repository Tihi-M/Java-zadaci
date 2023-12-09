
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ugao u1 = new Ugao(45, 59,23);
		Ugao u2 = new Ugao(43,23,1);
		Ugao u3 = u1.plus(u2);
		Ugao u4 = new Ugao (50,20, 1);
		Ugao u5 = new Ugao(60,32 , 12);
		//System.out.println(u1);
		//System.out.println(u2);
		//System.out.println(u3);
		NizUglova  n = new NizUglova();
		n.dodaj(u1);
		n.dodaj(u2);
		n.dodaj(u3);
		n.dodaj(u4);
		n.dodaj(u5);
		n.print();
		Ugao max = n.maxUgao();
		n.print();
		System.out.println(max);
	}

}
