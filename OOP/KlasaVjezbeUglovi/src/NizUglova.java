
public class NizUglova {
	private Ugao[] niz;
	private int kapacitet;
	private int brElem;
	public NizUglova(){
		this.kapacitet = 100;
		this.niz = new Ugao[kapacitet];
		this.brElem = 0;
	}
	public void dodaj(Ugao d) {
		if(brElem < kapacitet) {
			this.niz[brElem]= new Ugao(d.getStep(),d.getMin(),d.getSec());
			this.brElem	++;
		}else System.out.println("Niz je popunjen");
	}
	public void setNewNiz(int index,int capacity,int brEl, Ugao[] arr) {
		this.niz = new Ugao[capacity];
		this.brElem = brEl;
		for(int i = 0;i < this.brElem;i++) {
			if(i >= index)this.niz[i]=arr[i+1];
			else this.niz[i] = arr[i];
		}
	}
	public Ugao maxUgao() {
		int maxUgaoIndex=0;
		Ugao maxUgao = new Ugao(0,0,0);
		for(int i = 0;i<this.brElem;i++) {
			if(this.niz[i].CompareTo(maxUgao)==1) {
				maxUgaoIndex = i;
				maxUgao = new Ugao(this.niz[i].getStep(),this.niz[i].getMin(),this.niz[i].getSec());
			}
		}
		this.setNewNiz(maxUgaoIndex,this.kapacitet-1,this.brElem-1,this.niz);
		return maxUgao;
	}
	public Ugao prosjecnaVr() {
		Ugao x = new Ugao();
		for(int i = 0;i<this.brElem;i++) {
			if(i != brElem)
			x = this.niz[i].plus(this.niz[i+1]);
		}
	
	}
	public void print() {
		for(int i = 0; i<this.brElem;i++) {
			System.out.println(this.niz[i]);
		}
		System.out.println("---------");	
		
	}
}
