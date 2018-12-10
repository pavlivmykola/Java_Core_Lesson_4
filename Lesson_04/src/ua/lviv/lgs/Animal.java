package ua.lviv.lgs;

public class Animal {
	private String name;
	private int speed;
	private int age;
	
	
	public Animal(String name, int speed, int age) {
		this.name = name;
		this.speed = speed;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal("Monkey",15,45);
		System.out.println("Animalname = "+animal.getName()+"; Animal speed = "+animal.getSpeed()+"; Animal age = "+animal.getAge());
		animal.setAge(5);
		animal.setName("Dog");
		animal.setSpeed(40);
		System.out.println("Animalname = "+animal.getName()+"; Animal speed = "+animal.getSpeed()+"; Animal age = "+animal.getAge());
		
	}
}
