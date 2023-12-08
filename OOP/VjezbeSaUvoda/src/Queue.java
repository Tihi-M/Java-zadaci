
public class Queue {
	private KolicinaNovca[] data;
	private int kapacitet;
	private int end;
	public Queue(int k) {
		this.data = new KolicinaNovca[k];
		this.kapacitet = k;
		this.end = 0;
	}
	public void push(KolicinaNovca k) {
		if(this.end == this.kapacitet) {
			System.out.println("Niz je popunjen");
		}else {
			this.data[end] = k;
			this.end++;
		}
	}
	public KolicinaNovca pop() {
		KolicinaNovca n = this.data[0];
		for(int i=1;i<data.length;i++) {
			this.data[i-1] = data[i];
		}
		end--;
		return n;
	}
	public Queue copyOff() {
		Queue q = new Queue(this.kapacitet);
		for (int i = 0; i<end;i++) {
			q.push(this.data[i]);
		}
		q.end = this.end;
		return q;
	}
	public int count(KolicinaNovca k) {
		int br=0;
		for(int i = 0; i<end;i++) {
			if(k.compareTo(data[i])==0) {
				br++;
			}
		}
		return br;
	}
	public void print() {
		for(int i =0;i<this.data.length;i++) {
			System.out.println(this.data[i].getKolicina());
		}
	}
}
