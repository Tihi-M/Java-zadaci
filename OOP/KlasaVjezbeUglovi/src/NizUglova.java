
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
			else {
				x.setStep(x.getStep()+this.niz[i].getStep());
				x.setMin(x.getMin()+this.niz[i].getMin());
				x.setSec(x.getSec()+this.niz[i].getSec());
			}
		}
		x.setStep(x.getStep()/brElem);
		x.setMin(x.getMin()/brElem);
		x.setSec(x.getSec()/brElem);
		return x;
	}
	public int duzinaNajduzegPodniza() {
		int max = 0;
		int tempMax = 0;
		Ugao devedeset = new Ugao(90,0,0);
		for(int i = 0;i<this.brElem;i++) {
			while(this.niz[i].CompareTo(devedeset) == 1) {
				tempMax++;
				i++;
			}
			if(tempMax > max) {
				max =tempMax;
			}
			tempMax = 0;
		}
		return max;
	}
	public void veci_devedeset() {
		int max = this.duzinaNajduzegPodniza();
		int tempMax = 0;
		int firstIndex =0;
		int tempFirstIndex=0;
		int lastIndex =0;
		Ugao devedeset = new Ugao(90,0,0);
		
		for(int i = 0;i<this.brElem;i++){
			if(this.niz[i].CompareTo(devedeset)==1) {
				tempFirstIndex = i;
				}
			while(this.niz[i].CompareTo(devedeset) == 1) {
				tempMax++;
				i++;
				//System.out.println(tempMax);
			}
			if(tempMax == max) {
				firstIndex = tempFirstIndex;
				lastIndex = i-1;
			}
			tempMax = 0;
		}
		System.out.println(this.niz[firstIndex]);
		System.out.println(this.niz[lastIndex]);
	}
	/*
	public void veci_devedeset() {
        int trenutniBrojElemenata = 0;
        int maksimalniBrojElemenata = 0;
        int indexend=0;
        Ugao a = new Ugao(90,0,0);
        for (int i = 0; i < this.brElem; i++) {
            if (this.niz[i].CompareTo(a)==1) {
                trenutniBrojElemenata++;



                if (trenutniBrojElemenata > maksimalniBrojElemenata) {
                    maksimalniBrojElemenata = trenutniBrojElemenata;
                    indexend=i;
                }
            } else {

                trenutniBrojElemenata = 0;
            }

        }
        int indexstart=indexend-maksimalniBrojElemenata;
        System.out.println(this.niz[indexstart+1]);
        System.out.println(this.niz[indexend]);
    }*/
	public void print() {
		for(int i = 0; i<this.brElem;i++) {
			System.out.println(this.niz[i]);
		}
		System.out.println("---------");	
		
	}
}
