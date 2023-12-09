
public class Complex {
	private double re;
	private double im;
	public Complex(){
		this.re = 0;
		this.im = 0;
	}
	public Complex(double re,double im) {
		this.re = re;
		this.im = im;
	}
	public double getRe() {
		return re;
	}
	public void setRe(double re) {
		this.re = re;
	}
	public double getIm() {
		return im;
	}
	public void setIm(double im) {
		this.im = im;
	}
	public Complex plus(Complex c) {
		return new Complex(c.re + this.re,c.im+this.im);
	}
	//public Complex puta(Complex c) {
		
	//}
	
	
}
