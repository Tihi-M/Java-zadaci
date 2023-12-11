
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automobil a1 = new Automobil("Bmw", 230,(float)2.5,20,true);
		Automobil a2 = new Automobil("Mercedes", 220,(float)2.2,24,false);
		Automobil a3 = new Automobil("Toyota", 180,(float)2.5,25,true);
		
		Trka t = new Trka(3,5000,120);
		t.addRacer(a1);
		t.addRacer(a2);
		t.addRacer(a3);
		System.out.println(t.findWinner());
		t.printResults();
	}

}
