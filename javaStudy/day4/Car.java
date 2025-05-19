package javaStudy.day4;
/*
 * 자동차를 정으 합니다.
 */
public class Car {
	
	private String color;
	private String mfg;
	private int mfgYear;
	private int speed;
	
	public Car(String color) {
		this.color = color;
	}
	public Car(String color, String mfg) {
		this(color);
		this.mfg = mfg;
	}
	public Car(String color, String mfg, int mfgyear) {
		this(color,mfg);
		this.mfgYear = mfgyear;
	}
	

	public String getMfg() {
		return mfg;
	}
	public void setMfg(String mfg) {
		this.mfg = mfg;
	}
	public int getMfgYear() {
		return mfgYear;
	}
	public void setMfgYear(int mfgYear) {
		this.mfgYear = mfgYear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void accelate(int speed) {
		if(speed < 0) {
			return;
		}
		setSpeed(speed);
	}
	
	
	
	
}
