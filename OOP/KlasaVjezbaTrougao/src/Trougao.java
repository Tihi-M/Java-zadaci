
public class Trougao {
	private Tacka t1;
	private Tacka t2;
	private Tacka t3;
	public void setDefault() {
		this.t1 = new Tacka(0,0);
		this.t2 = new Tacka(2,0);
		this.t3 = new Tacka(1,0);
	}
	
	public boolean isValid(int x1,int y1, int x2, int y2, int x3, int y3) {
		if ( x1 * (y2 - y3)+ x2 * (y3 - y1)+ x3 * (y1 - y2) == 0) {
			this.setDefault();
			System.out.println("Ne postoji trougao");
			return false;
			}else return true;
	}
	
	public Trougao() {
		this.setDefault();
	}
	
	public Trougao(Tacka t1, Tacka t2, Tacka t3) {
		int x1 = t1.getX();
		int y1 = t1.getY();
		int x2 = t2.getX();
		int y2 = t2.getY();
		int x3 = t3.getX();
		int y3 = t3.getY();
		if(isValid(x1,y1,x2,y2,x3,y3)) {
			this.t1 = new Tacka(x1,y1);
			this.t2 = new Tacka(x2,y2);
			this.t3 = new Tacka(x3,y3);
		}
	}
	
	public Trougao(int x1,int y1,int x2, int y2,int x3,int y3){
		if (isValid(x1,y1,x2,y2,x3,y3)) {
			this.t1 = new Tacka(x1,y1);
			this.t2 = new Tacka(x2,y2);
			this.t3 = new Tacka(x3,y3);
		}
	}
	public void print() {
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
	}
	
	public Tacka getPoint1() {
		return new Tacka(t1.getX(),t1.getY());
	}
	public Tacka getPoint2() {
		return new Tacka(t2.getX(),t2.getY());
	}
	public Tacka getPoint3() {
		return new Tacka(t3.getX(),t3.getY());
	}
	
	public double getDistance(Tacka t1, Tacka t2) {
		double distance = Math.sqrt(Math.pow(t2.getX()-t1.getX(),2)+
				Math.pow(t2.getY()-t1.getY(),2));
		return distance;
	}
	public float getArea() {
		float povrsina = Math.abs((this.t1.getX()*(this.t2.getY()-this.t3.getY())+
				this.t2.getX()*(this.t3.getY()-this.t1.getY())+
				this.t3.getX()*(this.t1.getY()-this.t2.getY())))/2;
		return povrsina;
	}
	public double obimTrougla() {
		double obim = this.getDistance(this.t1, this.t2)+
					this.getDistance(this.t2,this.t3)+
					this.getDistance(this.t3,this.t1);
		return obim;
	}
	public void translate(int x, int y) {
		this.t1.setX(this.t1.getX()+x);
		this.t1.setY(this.t1.getY()+y);
		this.t2.setX(this.t2.getX()+x);
		this.t2.setY(this.t2.getY()+y);
		this.t3.setX(this.t3.getX()+x);
		this.t3.setY(this.t3.getY()+y);
	}
}
