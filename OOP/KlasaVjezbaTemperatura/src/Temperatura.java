
public class Temperatura {
	private float stepen;
	private int grad; 
	private char znak;
	private char jedinica;
	public boolean validChar(char sign) {
		if(sign == 'C' || sign == 'F')return true;
		else return false;	
	}
	public boolean validSign(char ch) {
		if(ch == '+' || ch == '-') return true;
		else return false;
	}
	public boolean validStepen(float st) {
		if(st<0)return false;
		return true;
	}
	public boolean validGrade(int g) {
		if(g >= 0 && g<100) return true;
		else return false;
	}
	public float getStepen() {
		return stepen;
	}
	public void setStepen(float stepen) {
		if(validStepen(stepen)) {
		this.stepen = stepen;
		}else System.out.println("Los unos");
	}
	public int getGrad() {
		return grad;
	}
	public void setGrad(int grad) {
		if(validGrade(grad)) {
		this.grad = grad;
		}else System.out.println("Los unos");
	}
	public char getZnak() {
		return znak;
	}
	public Temperatura() {
		this.znak = '+';
		this.jedinica = 'C';
		this.stepen = 0;
	}
	public boolean isValidInput(float s, int g, char z, char j) {
		if (validStepen(s) && validGrade(g) && validSign(z) && validChar(j)) return true;
		else return false;
	}
	public Temperatura(float stepen,int grad,char znak, char jedinica) {
		if (isValidInput(stepen,grad,znak,jedinica)) {
			this.stepen = stepen;
			this.grad = grad;
			this.znak = znak;
			this.jedinica = jedinica;
		}
	}
	public void convertToC() {
		if (this.jedinica == 'F') {
			this.jedinica = 'C';
			this.stepen =Math.round((this.stepen - 32)/1.8);
		}else System.out.println("Temp je vec izrazena preko C");
	}
	public void convertToF() {
		if (this.jedinica == 'C') {
			this.jedinica = 'F';
			this.stepen =Math.round(this.stepen * 1.8 +32);
		}else System.out.println("Temp je vec izrazena preko F");
	}
	public void print() {
		System.out.println(this.znak+this.stepen+" " +this.jedinica);
	}
	public boolean sameChar(Temperatura t) {
		if(this.jedinica == t.jedinica) return true;
		else return false;
	}
	public boolean sameSign(Temperatura t ) {
		if(this.znak == t.znak) return true;
		else return false;
	}
	private int smallCompare(Temperatura t) {
		if(sameSign(t) && t.znak == '+') {
			if(t.stepen < this.stepen) return 1;
			else if (t.stepen == this.stepen) return 0;
			else return -1;
		}else if(sameSign(t)&& t.znak == '-') {
			if(t.stepen > this.stepen) return 1;
			else if (t.stepen == this.stepen) return 0;
			else return -1;
		}
		else if(t.znak == '+' && this.znak =='-') return -1;
		else return 1;
	}
	public int compareTo(Temperatura t) {
		int res;
		if (sameChar(t)) {
			res = this.smallCompare(t);
		}
		else {
			if(this.jedinica == 'C') {
				t.convertToC();
				res = this.smallCompare(t);
			}
			else {
				t.convertToF();
				res = this.smallCompare(t);
			}
		}
		return res;
	}
}
