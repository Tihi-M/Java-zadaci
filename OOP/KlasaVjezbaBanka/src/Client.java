
public class Client {
	private String ime;
	private String prezime;
	private int hh;
	private int mm;
	public boolean validHH(int hh) {
		if (hh>=0 && hh< 24) return true;
		else return false;
	}
	public boolean validMM(int mm) {
		if(mm >=0 && mm < 60)return true;
		else return false;
		
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getHh() {
		return hh;
	}
	public void setHh(int hh) {
		if (validHH(hh))this.hh = hh;
		else System.out.println("Los unos");
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		if (validMM(mm))this.mm = mm;
		else System.out.println("Los unos");
	}
	public Client() {
		this.ime = "";
		this.prezime = "";
		this.hh = 12;
		this.mm = 0;
	}
	public Client(String ime, String prezime, int hh, int mm) {
		if (validHH(hh) && validMM(mm)) {
			this.ime = ime;
			this.prezime = prezime;
			this.hh = hh;
			this.mm = mm;
		}else System.out.println("Los unos");
	}
	public int vrijemeCekanja(int tek_hh,int tek_mm) {
		int prosloVremena = -1;
		if(validHH(tek_hh) && validMM(tek_mm)) {
			prosloVremena=(tek_hh*60+tek_mm)-(this.hh*60+this.mm);
		}
		return prosloVremena;
	}
	public void print() {
		System.out.println("Ime:" + this.ime+" Prezime:"+this.prezime);
		System.out.println(this.hh+":"+this.mm);
		
	}
}
