
public class ClientQueue {
	private Client[] data;
	private int num;
	private int kapacitet;
	public ClientQueue() {
		this.num = 0;
		this.kapacitet = 100;
		this.data = new Client[kapacitet]; 
	}
	public ClientQueue(int k) {
		this.kapacitet = k;
		this.data = new Client[k];
	}
	public void push(Client c) {
		if(this.num < this.kapacitet) {
			this.data[this.num] = c;
			this.num++;
		}else System.out.println("Niz je popunjen");
	}
	public void pop() {
		Client[] temp = this.data;
		for(int i = 1; i < this.data.length;i++) {
			this.data[i] = temp[i];
		}
	}
	public float average(int hh, int mm) {
		int sumOfTime=0;
		for(int i = 0; i<this.data.length;i++) {
			sumOfTime+=this.data[i].vrijemeCekanja(hh, mm);
		}
		return sumOfTime/this.data.length;
	}
}
