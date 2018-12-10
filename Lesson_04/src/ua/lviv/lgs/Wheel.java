package ua.lviv.lgs;

public class Wheel {
	private int radius;

	@Override
	public String toString() {
		return "Wheel [radius=" + radius + "]";
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void mydify (int i) {
		this.radius*=i;
	}

}
