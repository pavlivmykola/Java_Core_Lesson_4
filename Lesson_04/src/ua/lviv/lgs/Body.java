package ua.lviv.lgs;

public class Body {
	
	private String color;

	@Override
	public String toString() {
		return "Body [color=" + color + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void paintBody() {
		this.color+=" +blue";
	};
}
