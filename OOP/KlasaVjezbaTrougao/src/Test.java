
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trougao t1 = new Trougao(0,0,1,1,10,0);
		t1.print();
		System.out.println(t1.getArea());
		System.out.println(t1.getDistance(t1.getPoint1(), t1.getPoint2()));
		t1.translate(5, 0);
		t1.print();
		System.out.println(t1.obimTrougla());
	}

}
