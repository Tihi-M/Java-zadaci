
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
			this.brElem++;
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
	
	public void sort() {
		for(int i = 0; i < this.brElem;i++) {
			for(int j = i;j<this.brElem;j++) {
				if(this.niz[j].doKrajaGod()<this.niz[i].doKrajaGod()) {
					Datum temp = new Datum(this.niz[i].getD(),this.niz[i].getM(),this.niz[i].getG());
					this.niz[i] = new Datum(this.niz[j].getD(),this.niz[j].getM(),this.niz[j].getG());
					this.niz[j] = new Datum(temp.getD(),temp.getM(),temp.getG());
				}
			}
			//Datum temp =new Datum(this.niz[iMin].getD(),this.niz[iMin].getM(),this.niz[iMin].getG());
			//this.niz[iMin] = new Datum(this.niz[i].getD(),this.niz[i].getM(),this.niz[i].getG());
			//this.niz[i] = new Datum(temp.getD(),temp.getM(),temp.getG());
		}
	}
	public void print() {
		System.out.println("----------");
		for(int i = 0; i < this.brElem;i++) {
			this.niz[i].print();
		}
	}
}