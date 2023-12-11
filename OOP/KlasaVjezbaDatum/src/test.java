
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datum d1 = new Datum(2,5,2004);
		Datum d2 = new Datum(14,9,2004);
		Datum d3 = new Datum(30,11,2023);
		Datum d4 = new Datum(12, 12, 2045);
		Datum d5 = new Datum(12,4,1993);
		//System.out.println(d1.compareTo(d2.getD(), d2.getM(), d2.getG()));
		//d1.setD(-1);
		//d1.print();
		//d2.print();
		//System.out.println(d3.doKrajaGod());
		DatumStack s = new DatumStack();
		s.push(d1);
		s.push(d2);
		s.push(d3);
		s.push(d4);
		s.push(d5);
		s.print();
		s.sort();
		s.print();
	}

}
