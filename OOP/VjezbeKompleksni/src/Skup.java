
public class Skup {
	private Complex[] data;
	private int kapacitet;
	private int brElementa;
	public Skup(int kapacitet) {
		this.kapacitet = kapacitet;
		this.data = new Complex[kapacitet];
		this.brElementa = 0;
	}
	public Skup() {
		this.kapacitet = 10;
		this.data = new Complex[kapacitet];
		this.brElementa = 0;
	}
	public void setData(int n,Complex[] data) {
		this.data = new Complex[n];
		for(int i = 0; i<data.length;i++) {
			this.data[i] = data[i];
		}
	}
	
	public void dodaj(Complex c) {
		if(this.brElementa < this.kapacitet){
			this.data[brElementa] = c;
			this.brElementa++;
		}else {
			this.setData(this.kapacitet+1, this.data);
		}
	}
}
