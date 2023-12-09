
public class Vektor {
	private Razlomak[] data;
	private int numOfElems;
	public Vektor() {
		this.data = new Razlomak[1000];
		this.numOfElems = 0;
	}
	public void Dodaj(Razlomak r) {
		Razlomak el = new Razlomak(r.getBrojilac(),r.getImenilac(),r.getZnak());
		this.data[numOfElems] = el;
		this.numOfElems++;
	}
	public int najduziRastuciNiz() {
		int max = 0;
		int tempMax =0;
		for(int i = 0;i<this.numOfElems;i++) {
			while(this.data[i].compareTo(this.data[i+1]) == 1 && i != this.numOfElems-1) {
				tempMax++;
			}
			if(tempMax > max) {
				max = tempMax;
			}
			tempMax = 0;
		}
		return max;
	}
	public int findImenilac() {
		int imenilac = 1;
		for(int i = 0; i<this.numOfElems;i++) {
			imenilac = this.data[i].nzs(imenilac);
		}
		return imenilac;
	}
	public int findBrojilac() {
		int brojilac = 0;
		int imenilac = this.findImenilac();
		for(int i = 0; i<this.numOfElems;i++) {
			if(this.data[i].getZnak() == '+')
			brojilac+=this.data[i].getBrojilac()*(imenilac/this.data[i].getImenilac());
			else {
			brojilac -=this.data[i].getBrojilac()*(imenilac/this.data[i].getImenilac());;
			}
		}
		return brojilac;
	}
		
	public Razlomak Suma() {
		int imenilac = this.findImenilac();
		int brojilac = this.findBrojilac();
		if(brojilac > 0)
		return new Razlomak(brojilac,imenilac,'+');
		else return new Razlomak(Math.abs(brojilac),imenilac,'-');
	}
}