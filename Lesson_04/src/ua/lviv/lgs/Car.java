package ua.lviv.lgs;

public class Car {
	private double weigth;
	private Body body;
	private Helm helm;
	private Wheel wheel;
	
	Car(double weight, Body body,Helm helm,Wheel wheel){
		this.weigth=weight;
		this.body=body;
		this.helm=helm;
		this.wheel=wheel;
	};
	
	
@Override
	public String toString() {
		return "Car [weigth=" + weigth + ", body=" + body + ", helm=" + helm + ", wheel=" + wheel + "]";
	}


public static void main(String[] args) {
	Body body = new Body();
	Helm helm = new Helm();
	Wheel wheel = new Wheel();
	Car car=new Car(1530.07,body,helm,wheel);
	System.out.println(car);
	car.wheel.setRadius(15);
	car.body.setColor("white");
	car.helm.setDiameter(50);
	System.out.println(car);
	car.wheel.mydify(3);
	car.body.paintBody();
	car.helm.increaseHelm(5);;
	System.out.println(car);
	
}
}
