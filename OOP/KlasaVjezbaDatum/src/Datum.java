
public class Datum {
	private int d;
	private int m;
	private int g;
	public Datum() {
		this.d = 1;
		this.m = 1;
		this.g = 2000;
	}
	
	public boolean jePrestupna(int g) {
		if((g % 4 == 0 && g % 100 != 0)||(g%400==0))
			return true;
		else return false;
	}
	
	public int daysInMonth(int m, int g) {
		switch (m) {
		case 1,3,5,7,8,10,12: return 31;
		case 4, 6,9,11:return 30;
		case 2:if (jePrestupna(g)) return 29;
		else return 28;
		default: return 0;
		}
			
	}
	public boolean isValid(int d,int m,int g) {
		if( d >= 1 && d<=daysInMonth(m,g) && m <= 12 && m>=1 && g > 0)
			return true;
		else return false;
	}
	
	public Datum(int d,int m, int g) {
		if (isValid(d,m,g)){
		this.d = d;
		this.m = m;
		this.g = g;
		}else System.out.println("Los Unos");
	}
	public void print() {
		System.out.println(this.d + " "+ this.m+" "+this.g);
	}
	public boolean sameDate(int d, int m, int g) {
		if(this.d == d && this.m == m && this.g == g)return true;
		else return false;	
	}
	public int compareTo(Datum d) {
		if (sameDate(d.getD(),d.getM(),d.getG())) {
		return 0;	
		}else if (this.g>d.getG()) {
			return 1;
		}else if (this.m > d.getM()) {
			return 1;
		}else if (this.d > d.getD()) {
			return 1;
		}else return -1;
	}
	public int compareTo(int d, int m, int g) {
		if (sameDate(d,m,g)) {
		return 0;	
		}else if (this.g>g) {
			return 1;
		}else if (this.m > m) {
			return 1;
		}else if (this.d > d) {
			return 1;
		}else return -1;
	}
	public int doKrajaGod() {
		int tempM = this.m-1;
		int daysPassed=0;
		while (tempM>0) {
			daysPassed+=daysInMonth(tempM,this.g);
			tempM--;
		}
		daysPassed+=d;
		int danaUGod;
		if (jePrestupna(this.g)) {
			danaUGod = 366;
		}
		else danaUGod = 365;
		return danaUGod - daysPassed;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		if (d >= 1 && d<=daysInMonth(this.m,this.g)) {
		this.d = d;
		} else System.out.println("Nepostojeci dan");
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		if(m>=1 && m<=12) {
		this.m = m;
		} else System.out.println("Nepostojeci mjesec");
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		if(g < 0) {
		this.g = g;
		} else System.out.println("Nepostojeca godina");
	}
	
}
