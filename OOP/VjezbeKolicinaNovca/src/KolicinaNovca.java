
public class KolicinaNovca {
		private int valutaId;
		private double kolicina;
		private double kurs;
		public KolicinaNovca(int valutaId, double kolicina,double kurs) {
			this.valutaId = valutaId;
			this.kolicina = kolicina;
			this.kurs = kurs;
		}
		public int getValutaId() {
			return valutaId;
		}
		public void setValutaId(int valutaId) {
			this.valutaId = valutaId;
		}
		public double getKolicina() {
			return kolicina;
		}
		public void setKolicina(double kolicina) {
			this.kolicina = kolicina;
		}
		public double getKurs() {
			return kurs;
		}
		public void setKurs(double kurs) {
			double changeRate;
			if(kurs > 0) {	
			changeRate = this.kurs/kurs;
			this.kolicina = this.kolicina*changeRate;
			this.kurs = kurs;
			}
		}
		
		public KolicinaNovca add(KolicinaNovca k) {
				KolicinaNovca res = new KolicinaNovca(this.valutaId,k.getKolicina(),k.kurs);
				res.setKurs(this.kurs);
				res.setKolicina(this.kolicina);
				return res;
			}

		public int compareTo(KolicinaNovca k) {
			if(k.getKurs()*k.getKurs() == this.kurs*this.kolicina) {
				return 0;
			}else if(k.getKurs()*k.getKurs() < this.kurs*this.kolicina) {
				return 1;
			}
			else return -1;
		}
		public String toString() {
			return this.kolicina + " " +this.kolicina*this.kurs;
		}
		}
