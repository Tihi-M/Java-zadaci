
public class Ugao {
	private int step;
	private int min;
	private int sec;
	private boolean validMin(int min) {
		if(min >=0 && min <=59)return true;
		else return false;
	}
	private boolean validSec(int sec) {
		if(sec>=0 && sec<=59)return true;
		else return false;
	}private boolean validStep(int step) {
		if(sec>=0 && sec<=359)return true;
		else return false;
	}
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		if(validStep(step))
		this.step = step;
		else {
			if(step > 359) {
				this.step  = step % 360;
			}
			else if(step < 0 && step > -359) {
				this.step = Math.abs(step);
			}else {
				this.step = Math.abs(step%360);
			}
		}
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		if(validMin(min))
		this.min = min;
		else System.out.println("Invalid Input");
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		if(validSec(sec))
		this.sec = sec;
		else System.out.println("Invalid input");
	}
	public Ugao(int step,int min, int sec) {
		if(validStep(step) && validMin(min) && validSec(sec)){
			this.step = step;
			this.min = min;
			this.sec = sec;
		}
		else System.out.println("Invalid input");
	}
	public Ugao() {
		this.step= 0;
		this.min = 0;
		this.sec = 0;
		}
	public int CompareTo(Ugao u) {
		if(this.step>u.step)return 1;
		else if(this.step == u.step) {
			if(this.min > u.min) return 1;
			else if(this.min == u.min) {
				if(this.sec > u.sec) return 1;
				else if(this.sec == u.sec) return 0;
				else return -1;
			}else return -1;
		}else return -1;
	}
	public Ugao plus(Ugao u) {
		int step;
		int min;
		int sec;
		int ostatakSec=0;
		int ostatakMin=0;
		
		if(this.sec + u.sec >59) {
			sec = (this.sec+u.sec)%60;
			ostatakSec = (this.sec+u.sec)/60;
		}else {
			sec = this.sec + u.sec;
		}
		if(this.min + u.min + ostatakSec> 59) {
			min = (this.min + u.min+ostatakSec)%60;
			ostatakMin =(this.min+u.min+ostatakSec)/60;
		}else {
			min = this.min + u.min+ostatakSec;
		}
		if(this.step + u.step + ostatakMin> 359) {
			step = (this.step + u.step+ostatakMin)%360;
		}else {
			step = this.step + u.step + ostatakMin;
		}
		return new Ugao(step, min, sec);
	}
	public String toString() {
		return this.step+" "+ this.min+" "+this.sec;
			}
}
