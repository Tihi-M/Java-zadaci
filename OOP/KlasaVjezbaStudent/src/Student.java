
public class Student {
	private String ime;
	private String prezime;
	private int brojIndeksa;
	private String imeFakulteta;
	private int godinaStudija;
	private float prosjecnaOcjena;
	private void setDefault() {
		this.brojIndeksa = 1;
		this.imeFakulteta = "Nepoznato";
		this.godinaStudija = 1;
		this.prosjecnaOcjena =0;
	}
	public Student(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
		this.setDefault();
	}
	public Student() {
		this.ime = null;
		this.prezime = null;
		this.setDefault();
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
	public int getBrojIndeksa() {
		return brojIndeksa;
	}
	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}
	public String getImeFakulteta() {
		return imeFakulteta;
	}
	public void setImeFakulteta(String imeFakulteta) {
		this.imeFakulteta = imeFakulteta;
	}
	public int getGodinaStudija() {
		return godinaStudija;
	}
	public void setGodinaStudija(int godinaStudija) {
		this.godinaStudija = godinaStudija;
	}
	public float getProsjecnaOcjena() {
		return prosjecnaOcjena;
	}
	public void setProsjecnaOcjena(float prosjecnaOcjena) {
		this.prosjecnaOcjena = prosjecnaOcjena;
	}
	public String toString() {
		return this.ime + " " + this.prezime + " " + this.imeFakulteta + " " + this.brojIndeksa+"/2018 " + this.godinaStudija+" "+this.prosjecnaOcjena;
 	}
	
}
