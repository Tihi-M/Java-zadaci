
public class Pravougaonik {
	private double maxX;
	private double maxY;
	private double minX;
	private double minY;
	private boolean areValidCords(double x1,double y1,double x2, double y2) {
		if (x1<x2 && y1<y2) 
			return true;
			else return false;
	}
	public double getMaxX() {
		return maxX;
	}
	public void setMaxX(double maxX) {
		if(this.minX < maxX)
		this.maxX = maxX;
		else System.out.println("invalid input");
	}
	public double getMaxY() {
		return maxY;
	}
	public void setMaxY(double maxY) {
		if(this.minY < maxY)
		this.maxY = maxY;
		else System.out.println("Invalid input");
	}
	public double getMinX() {
		return minX;
	}
	public void setMinX(double minX) {
		if(this.maxX > minX)
		this.minX = minX;
		else System.out.println("Invalid Input");
	}
	public double getMinY() {
		return minY;
	}
	public void setMinY(double minY) {
		if(this.maxY > minY)
		this.minY = minY;
		else System.out.println("Invalid input");
	}
	public Pravougaonik(double minX,double minY,double maxX,double maxY) {
		if(areValidCords(minX,minY,maxX,maxY)) {
			this.maxX = maxX;
			this.maxY = maxY;
			this.minX = minX;
			this.minY = minY;
		}else System.out.println("Invalid input");
	}
	public Pravougaonik() {
		this.minX = 0;
		this.minY = 0;
		this.maxX = 2;
		this.maxY = 2;
	}
	public double PovrsinaPravougaonika() {
		double povrs = (this.maxX-this.minX)*(this.maxY-this.minY);
		return povrs;
	}
	public Pravougaonik presjek(Pravougaonik p) {
		Pravougaonik presjek = new Pravougaonik();
		presjek.setMaxX(Math.min(this.maxX, p.getMaxX()));
		presjek.setMaxY(Math.min(this.maxY, p.getMaxY()));
		presjek.setMinX(Math.max(this.minX, p.getMinX()));
		presjek.setMinY(Math.max(this.minY, p.getMinY()));
		return presjek;	
	}
	public String toString() {
		return this.minX + " " + this.minY + " " + this.maxX + " " + this.maxY;
	}
}
