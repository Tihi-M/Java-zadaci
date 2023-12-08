
public class DatumStack {
	private int kapacitet;
	private Datum[] niz;
	private int brElem;
	public DatumStack() {
		this.kapacitet = 100;
		this.niz = new Datum[kapacitet];
	}
	public DatumStack(int k) {
		this.kapacitet =k;
		this.brElem = 0;
		this.niz = new Datum[kapacitet];
	}
	public void push(Datum d) {
		if (this.brElem == this.kapacitet) {
			this.kapacitet+=10;
			Datum[] oldArr = this.niz;
			this.niz = new Datum[kapacitet];
			this.brElem  = 0;
			for(int i = 0; i < oldArr.length;i++) {
				this.niz[i] = oldArr[i];
				brElem++;
			}
		}
		else if(this.brElem < this.kapacitet) {
			this.niz[brElem] = d;
			brElem++;
		}
		else System.out.println("Niz je pun");
	}
	public void pop() {
		Datum[] oldArr = this.niz;
		this.niz = new Datum[kapacitet];
		this.brElem=0;
		for(int i = 0; i < oldArr.length-1;i++) {
			this.niz[i] = oldArr[i];
			brElem++;
		}
	}
}