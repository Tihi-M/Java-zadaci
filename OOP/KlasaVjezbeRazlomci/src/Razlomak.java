
public class Razlomak {
	private int brojilac;
	private int imenilac;
	private char znak;
	private boolean validBr(int n) {
		if(n>=0) return true;
		else return false;
	}
	private boolean validI(int n) {
		if(n>0) return true;
		else return false;
	}
	private boolean validSign(char c) {
		if(c=='+'||c=='-')return true;
		else return false;
	}
	public int getBrojilac() {
		return brojilac;
	}
	public void setBrojilac(int brojilac) {
		if(validBr(brojilac))
		this.brojilac = brojilac;
		else System.out.println("Invalid input");
	}
	public int getImenilac() {
		return imenilac;
	}
	public void setImenilac(int imenilac) {
		if(validI(imenilac))
		this.imenilac = imenilac;
		else System.out.println("Invalid input");
	}
	public char getZnak() {
		return znak;
	}
	public void setZnak(char znak) {
		if (validSign(znak))
		this.znak = znak;
		else System.out.println("Invalid input");
	}
	public Razlomak() {
		this.brojilac = 0;
		this.imenilac = 1;
		this.znak = '+';
	}
	public Razlomak(int brojilac,int imenilac,char znak) {
		if(validI(imenilac)&&validBr(brojilac)&&validSign(znak)) {
			this.imenilac = imenilac;
			this.brojilac = brojilac;
			this.znak = znak;
		}
		else System.out.println("Invalid input");
	}
	private int nzd() {
		int a=this.brojilac;
		int b=this.imenilac;
		int temp;
		while(b!=0) {
			temp = a;
			a = b;
			b = temp%b;
		}
		return a;
	}
	private int nzd(int imenilac) {
		int a=this.imenilac;
		int b=imenilac;
		int temp;
		while(b!=0) {
			temp = a;
			a = b;
			b = temp%b;
		}
		return a;
	}
	protected int nzs(int imenilac) {
		int nzd = this.nzd(imenilac);
		return this.imenilac/nzd*imenilac;
	}
	
	public void Skrati() {
		int nzd = this.nzd();
		if(nzd!=1) {
			this.brojilac = this.brojilac/nzd;
			this.imenilac /=nzd;
		}
		else System.out.println("Ne moze se skratiti razlomak");
	}
	
	public int compareTo(Razlomak r){
		if (r.znak=='+' && this.znak =='+' ) {
			if(this.brojilac*r.imenilac>r.brojilac*this.imenilac) return 1;
			else if (this.brojilac*r.imenilac==r.brojilac*this.imenilac) return 0;
			else return -1;
		}
		else if(r.znak=='-' && this.znak =='-') {
			if(this.brojilac*r.imenilac<r.brojilac*this.imenilac) return 1;
			else if (this.brojilac*r.imenilac==r.brojilac*this.imenilac) return 0;
			else return -1;
		}
		else if(r.znak == '+'&&this.znak =='-') return -1;
		else return 1;
	}
	public String toString() {
		return this.brojilac +"/"+this.imenilac;
	}
}