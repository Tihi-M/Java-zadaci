
public class Pravougaonik {
	private Tacka t1;
	private Tacka t2;
	private boolean isValid(int x1,int y1,int x2, int y2) {
		if(x1<x2 && y1<y2) return true;
		else return false;
	}
	private void setDefault() {
		this.t1 = new Tacka(0,0);
		this.t2 = new Tacka(1,1);
	}
	public Pravougaonik() {
		this.setDefault();
	}
	
	public Pravougaonik(int x1,int y1,int x2, int y2) {
		if (isValid(x1,y1,x2,y2)) {
			this.t1 = new Tacka(x1,y1);
			this.t2 = new Tacka(x2,y2);
		}else this.setDefault();
	}
	
	public Tacka getT1() {
		return new Tacka(this.t1.getX(),this.t1.getY());
	}
	
	public Tacka getT2() {
		return new Tacka(this.t2.getX(),this.t2.getY());
	}
	
	public void setT1(int x, int y) {
		if(isValid(x,y,this.t2.getX(),this.t2.getY())) {
			this.t1.setX(x);
			this.t1.setY(y);
		}else System.out.println("Pogresan unos");
	}
	
	public void setT2(int x, int y) {
		if(isValid(this.t1.getX(),this.t1.getY(),x,y)) {
			this.t2.setX(x);
			this.t2.setY(y);
		}else System.out.println("Pogresan unos");
	}
	
	public Pravougaonik(Tacka t1, Tacka t2 ) {
		if (isValid(t1.getX(),t1.getY(),t2.getX(),t2.getY())) {
			this.t1 = new Tacka(t1.getX(),t1.getY());
			this.t2 = new Tacka(t2.getX(),t2.getY());
		}else this.setDefault();
	}
	
	public void print() {
		System.out.println(this.t1.toString());
		System.out.println(this.t2.toString());
	}
	
	public int povrsina() {
		int p = (this.t2.getX()-this.t1.getX())*(this.t2.getY()-this.t1.getY());
		return p;
	}
	public int obim() {
		int o = (this.t2.getX()-this.t1.getX())*2+(this.t2.getY()-this.t1.getY())*2;
		return o;
	}
	public boolean contains(Tacka t) {
		if(t.getX() <= this.t2.getX() && t.getX()>=this.t1.getX() &&
				t.getY()<= this.t2.getY() && t.getY()>=this.t1.getY())
		return true;
		else return false;
	}
	public boolean contains(Pravougaonik p) {
		if(this.contains(p.getT1()) && (this.contains(p.getT2())))
			return true;
		else return false;
	}
}
