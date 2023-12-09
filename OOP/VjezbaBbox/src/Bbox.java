
public class Bbox {
	private int xMin;
	private int yMin;
	private int xMax;
	private int yMax;
	public int getxMin() {
		return xMin;
	}
	public void setxMin(int xMin) {
		if(this.xMax > xMin)
		this.xMin = xMin;
		else System.out.println("Invalid input");
	}
	public int getyMin() {
		return yMin;
	}
	public void setyMin(int yMin) {
		if(this.yMax >yMin)
		this.yMin = yMin;
		else System.out.println("Invalid input");
	}
	public int getxMax() {
		return xMax;
	}
	public void setxMax(int xMax) {
		if(this.xMin < xMax)
		this.xMax = xMax;
	}
	public int getyMax() {
		return yMax;
	}
	public void setyMax(int yMax) {
		if(this.yMin < yMax)
		this.yMax = yMax;
		else System.out.println("Invalid input");
	}
	private boolean areValidCords(int x1, int y1, int x2, int y2) {
		if(x1<x2 && y1<y2)return true;
		else return false;
	}
	public Bbox() {
		this.xMin = 0;
		this.yMax = 0;
		this.xMax = 1;
		this.yMax = 1;
	}
	public Bbox(int x1,int y1,int x2, int y2) {
		if(areValidCords(x1,y1,x2,y2)) {
		this.xMin = x1;
		this.yMin = y1;
		this.xMax = x2;
		this.yMax = y2;
		}
	}
	public int width() {
		return this.xMax-this.xMin;
	}
	public int height() {
		return this.yMax-this.yMin;
	}
	private boolean presjekPostiji(Bbox b) {
		if(this.xMin > b.xMax || this.xMax < b.xMin || this.yMin > b.yMax || this.yMax<b.yMin) {
			return false; 
		}else return true;
	}
	public int povrsinaPresjeka(Bbox b) {
		Bbox presjek = new Bbox();
		if(this.presjekPostiji(b)) {
		presjek.setxMax(Math.min(xMax, b.getxMax()));
		presjek.setyMax(Math.min(yMax, b.getyMax()));
		presjek.setxMin(Math.max(xMin, b.getxMin()));
		presjek.setyMin(Math.max(yMin, b.getyMin()));
		}
		return presjek.height()*presjek.width();
	}
	public int povrsinaUnije(Bbox b) {
		Bbox unija = new Bbox();
		unija.setxMax(Math.max(xMax, b.getxMax()));
		unija.setyMax(Math.max(yMax, b.getyMax()));
		unija.setxMin(Math.min(xMin, b.getxMin()));
		unija.setyMin(Math.min(yMin, b.getyMin()));
		return unija.height()*unija.width();
	}
	public double iou(Bbox b) {
		int presjek = this.povrsinaPresjeka(b);
		int unija = this.povrsinaUnije(b);
		return (double) presjek/unija;
	}
	public boolean equals(Bbox b) {
		if(this.xMax == b.getxMax() && this.yMax == b.getyMax() && this.xMin == b.getxMin() && this.yMin == b.getyMin()) {
			return true;
		}else return false;
	}
}
