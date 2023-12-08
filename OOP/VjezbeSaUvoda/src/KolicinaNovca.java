
public class KolicinaNovca {
	private int id;
	private double kolicina;
	private double kurs;
	public KolicinaNovca(int id, double kolicina, double kurs) {
		this.id = id;
		this.kolicina = kolicina;
		this.kurs = kurs;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getKolicina() {
		return kolicina;
	}
	public void setKolicina(double kolicina) {
		if(kolicina>0) {
			this.kolicina = kolicina;
		}else System.out.println("Los unos");
	}
	public double getKurs() {
		return kurs;
	}
	public void setKurs(double kurs) {
		double changeRate;
		if(kurs > 0) {
			changeRate = this.kurs/kurs;
			this.kurs = kurs;
			this.kolicina = this.kolicina*changeRate;
		}else System.out.println("Los unos");
	}
	public KolicinaNovca add(KolicinaNovca k) {
			KolicinaNovca temp = new KolicinaNovca(k.id,k.kolicina,k.kurs);
			temp.setKurs(k.kurs);
			temp.id = k.id;
			temp.kolicina += this.kolicina;
			return temp;
	}
	public String toString() {
		return kolicina+" "+kolicina*kurs;
	}
	public int compareTo(KolicinaNovca k) {
		if(this.kolicina*kurs == k.kolicina*k.kurs) {
			return 0;
		}else if (this.kolicina*this.kurs > k.kolicina*k.kurs) {
			return 1;
		}else return -1;
	}
	
}
