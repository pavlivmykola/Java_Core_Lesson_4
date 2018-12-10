package ua.lviv.lgs;

public class Helm {

	private int diameter;

	@Override
	public String toString() {
		return "Helm [diameter=" + diameter + "]";
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	
	public void increaseHelm(int i) {
		this.diameter*=i;
	};
}
