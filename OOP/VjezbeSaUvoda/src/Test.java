
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KolicinaNovca n1 = new KolicinaNovca(1,50,2);
		KolicinaNovca n2 = new KolicinaNovca(2,100,0.5);
		System.out.println(n1);
		System.out.println(n1.compareTo(n2));
		Queue q = new Queue(5);
		q.print();
	}

}
