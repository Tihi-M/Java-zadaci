
public class Tacka {
	private int x;
	private int y;
	public Tacka(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		String s = new String(this.x + " "+this.y);
		return s;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
