
public class Automobil {
	private String name;
	private int topSpeed;
	private float acceleration;
	private float secTo100;
	private boolean turboCharged;
	public Automobil() {
		this.name = " ";
		this.topSpeed = 0;
		this.acceleration =0;
		this.turboCharged = false;
		this.secTo100 = 0;
	}
	public boolean validTopSpeed(int speed) {
		if(speed<=0)return false;
		else return true;
	}
	public boolean validSecTo100(float secs) {
		if(secs<=0)return false;
		else return true;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		if(validTopSpeed(topSpeed))
		this.topSpeed = topSpeed;
		else System.out.println("Invalid input");
	}
	public float getAcceleration() {
		return acceleration;
	}
	public void setAcceleration(float acceleration) {
		this.acceleration = acceleration;
	}
	public float getSecTo100() {
		return secTo100;
	}
	public void setSecTo100(float secTo100) {
		if(validSecTo100(secTo100))
		this.secTo100 = secTo100;
		else System.out.println("Invalid input");
	}
	
	public void setTurboCharged(boolean turboCharged) {
		this.turboCharged = turboCharged;
	}
	public boolean isTurboCharged() {
		return this.turboCharged;
	}
	public Automobil(String name, int topSpeed,float secTo100,float acceleration,boolean turboCharged) {
		this.name = name;
		
		if(validTopSpeed(topSpeed))
		this.topSpeed = topSpeed;
		else System.out.println("Invalid input");
		
		if(validSecTo100(secTo100))
		this.secTo100 = secTo100;
		else System.out.println("Invalid input");
		
		this.secTo100 = secTo100;
		this.acceleration = acceleration;
		this.turboCharged = turboCharged;
	}
	public void turboUsed() {
		if(this.turboCharged == true) {
		this.topSpeed +=50;
		this.turboCharged = false;
		}
	}
	public float ConvertToMs(int speed) {
		return speed/(float)3.6;
	}
	public float timeToTopSpeed() {
		float speed = this.ConvertToMs(this.topSpeed);
		return speed/this.acceleration;
	}
	
	public String toString() {
		return this.name + " " + this.topSpeed;
	}
}
