
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ugao u1 = new Ugao(45, 59,23);
		Ugao u2 = new Ugao(46,23,1);
		Ugao u3 = u1.plus(u2);
		Ugao u4 = new Ugao (94,20, 1);
		Ugao u5 = new Ugao(123,32 , 12);
		Ugao u6 = new Ugao(12,32 , 12);
		Ugao u7 = new Ugao (93,20, 1);
		Ugao u8 = new Ugao(91,32 , 12);
		Ugao u9 = new Ugao(127,32 , 12);
		Ugao u10 = new Ugao (184,20, 1);
		Ugao u11 = new Ugao(54,32 , 12);
		Ugao u12 = new Ugao(12,32 , 12);
		//System.out.println(u1);
		//System.out.println(u2);
		//System.out.println(u3);
		NizUglova  n = new NizUglova();
		n.dodaj(u1);
		n.dodaj(u2);
		n.dodaj(u3);
		n.dodaj(u4);
		n.dodaj(u5);
		n.dodaj(u6);
		n.dodaj(u7);
		n.dodaj(u8);
		n.dodaj(u9);
		n.dodaj(u10);
		n.dodaj(u11);
		n.dodaj(u12);
		n.print();

		//System.out.println(max);
		n.veci_devedeset();
	}

}
