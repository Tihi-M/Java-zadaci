
public class Queue {
	private KolicinaNovca[] data;
	private int kapacitet;
	private int end;
	private boolean validKapacitet(int k) {
		if(k>0) {
			return true;
		}
		return false;
	}
	public Queue(int kapacitet) {
		if(validKapacitet(kapacitet))
		this.kapacitet = kapacitet;
		else System.out.println("error");
		this.data = new KolicinaNovca[this.kapacitet];
		this.end = 0;
	}
	public void push(KolicinaNovca k) {
		if(this.kapacitet > this.end) {
			this.data[end] = k;
			this.end++;
		}else System.out.println("error");
	}
	public KolicinaNovca pop() {
		KolicinaNovca first = this.data[0];
		for(int i = 1; i < this.end;i++) {
			this.data[i-1] = this.data[i];
		}
		this.end--;
		return first;
	}
	public Queue copyOf() {
		int tempKapacitet = this.kapacitet;
		Queue copy = new Queue(tempKapacitet);
		for(int i = 0; i<this.kapacitet;i++) {
			copy.push(this.data[i]);
			copy.end++;
		}
		copy.end = this.end;
		return copy;
	}
	public int count(KolicinaNovca k) {
		int c = 0;
		for(int i = 0;i<this.end; i++) {
			if(this.data[i].compareTo(k)==0) {
				c++;
			}
			
		}
		return c;
	}
	
}
