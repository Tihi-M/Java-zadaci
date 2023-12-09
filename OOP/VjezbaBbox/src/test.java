
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bbox b1 = new Bbox(0,0,2,2);
		Bbox b2 = new Bbox(1,1,3,3);
		System.out.println(b1.povrsinaPresjeka(b2));
		System.out.println(b1.povrsinaUnije(b2));
		System.out.println(b1.iou(b2));
	}

}
