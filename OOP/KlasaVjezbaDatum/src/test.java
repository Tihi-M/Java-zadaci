
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datum d1 = new Datum(2,5,2004);
		Datum d2 = new Datum(14,9,2004);
		Datum d3 = new Datum(30,11,2023);
		System.out.println(d1.compareTo(d2.getD(), d2.getM(), d2.getG()));
		d1.setD(-1);
		d1.print();
		d2.print();
		System.out.println(d3.doKrajaGod());
	}

}
