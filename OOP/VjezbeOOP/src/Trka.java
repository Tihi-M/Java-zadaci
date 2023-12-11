
public class Trka {
	private Automobil[] data;
	private int kapacitet;
	private int brojUcesnika;
	private int duzinaTrke;
	private int minimalTopSpeed;
	public Trka(int kapacitet,int duzinaTrke,int minimalTopSpeed) {
		this.kapacitet = kapacitet;
		this.brojUcesnika = 0;
		this.duzinaTrke = duzinaTrke;
		this.data = new Automobil[this.kapacitet];
		this.minimalTopSpeed = minimalTopSpeed;
	}
	public double timeToFinishRace(Automobil a) {
		double time = Math.sqrt(2*this.duzinaTrke/a.getAcceleration());
		return time;
	}
	public void addRacer(Automobil a) {
		if(this.brojUcesnika<this.kapacitet && a.getTopSpeed()>this.minimalTopSpeed) {
			this.data[brojUcesnika] = a;
			this.brojUcesnika++;
		}
	}
	public Automobil findWinner() {
		int winnerIndex= 0;
		double minTime = 10000;
		for(int i = 0; i<this.brojUcesnika;i++) {
			if(this.timeToFinishRace(this.data[i]) < minTime) {
				winnerIndex = i;
			}
		}
		return new Automobil(this.data[winnerIndex].getName(),this.data[winnerIndex].getTopSpeed(),this.data[winnerIndex].getSecTo100(),this.data[winnerIndex].getAcceleration(),this.data[winnerIndex].isTurboCharged());
	}
	public void printResults() {
		for(int i = 0; i<this.brojUcesnika;i++) {
			System.out.println(this.data[i] + ": " +this.timeToFinishRace(this.data[i])+" seconds");
		}
	}
}
