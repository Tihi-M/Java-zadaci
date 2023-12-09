
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VelikiBroj k1 = new VelikiBroj(121);
		k1.print();
		System.out.println(k1.findOgNum());
		VelikiBroj k2 = new VelikiBroj(933);
		VelikiBroj k3 = k1.plus(k2);
		k3.print();
		k1.print();
		k2.print();
		VelikiBroj k4 =k1.minus(k2);
		k4.print();
		VelikiBroj k5 = k1.proizvod(k2);
		k5.print();
		

}
}