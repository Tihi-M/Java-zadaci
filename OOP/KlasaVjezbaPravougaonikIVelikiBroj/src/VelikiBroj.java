	class VelikiBroj{
		private int[] cifre;
		private char znak;
		private int brCifara;
	private void initialization(int num) {
		int tempN = Math.abs(num);
		int brCif = 0;
		int i = 0;
		if(num > 0) {
			this.znak = '+';
		}else {
			this.znak = '-';
		}
		while(tempN > 0) {
			brCif++;
			tempN /=10;
			
		}
		this.cifre = new int[brCif];
		while(Math.abs(num) > 0) {
			this.cifre[i] = Math.abs(num%10);
			num/=10;
			i++;
		}
		this.brCifara = brCif;
	}
	
	public VelikiBroj(int num) {
		if(num == 0) {
			System.out.println("0 nije velikiBroj ._.");
		}else {
			this.initialization(num);
		}
	}
	
	public void print() {
		System.out.print(this.znak);
		for(int i = this.cifre.length-1;i>=0;i--) {
			System.out.print(cifre[i]+" ");
		}
		System.out.println();
	}
	public int signs(char otherNumSign) {
		if (this.znak == otherNumSign && this.znak=='+') {
			return 1;
		}
		else if (this.znak == otherNumSign && this.znak=='-') {
			return -1;
		}
		else if(this.znak == '+' && otherNumSign == '-') {
			return 2;
		}else return -2;
	}
	public int findOgNum() {
		int ogNum=0;
		int stepenDesetke=1;
		for(int i= 0;i <this.brCifara;i++) {
			ogNum += this.cifre[i]*stepenDesetke;
			stepenDesetke*=10;
		}
		return ogNum;
	}
	public VelikiBroj plus(VelikiBroj k) {
		int sabirak1=this.findOgNum();
		int sabirak2=k.findOgNum();
		switch(this.signs(k.znak)) {
		case 1: return new VelikiBroj(sabirak1+sabirak2);
		case -1: return new VelikiBroj((-1)*sabirak1 -sabirak2);
		case 2: return new VelikiBroj(sabirak1-sabirak2);
		case -2: return new VelikiBroj((-1)*sabirak1 + sabirak2);
		default: return new VelikiBroj(0);
		}
	}
	public VelikiBroj minus(VelikiBroj k) {
		int num1=this.findOgNum();
		int num2=k.findOgNum();
		switch(this.signs(k.znak)) {
		case 1: return new VelikiBroj(num1-num2);
		case -1: return new VelikiBroj(num2 - num1);
		case 2: return new VelikiBroj(num1+num2);
		case -2: return new VelikiBroj((-1)*num1 - num2);
		default: return new VelikiBroj(0);
		}
	}
	public VelikiBroj proizvod(VelikiBroj k) {
		int num1=this.findOgNum();
		int num2=k.findOgNum();
		switch(this.signs(k.znak)) {
		case 1,-1: return new VelikiBroj(num1*num2);
		case 2,-2: return new VelikiBroj((-1)*num1*num2);
		default: return new VelikiBroj(0);
		}
	}
}