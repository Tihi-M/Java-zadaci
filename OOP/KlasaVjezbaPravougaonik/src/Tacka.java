
public class Tacka {
	private int x;
	private int y;
	public static int brTacaka=0;
	
	public Tacka(int x,int y) {
		this.x = x;
		this.y = y;
		brTacaka++;
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
	public String toString() {
		return this.x + " " + this.y;
	}
	
}
