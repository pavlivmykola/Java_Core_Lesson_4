package ua.lviv.lgs;

public class Robot {
	public String message;
	
	Robot(){
		this.message="я Robot Ц € просто працюю";
	};
	
	public void work() {
		System.out.println(message);
	};

	public static void main(String[] args) {
		Robot r = new Robot();
		r.work();
		CoffeRobot cr=new CoffeRobot();
		cr.work();
		RobotDancer rd = new RobotDancer();
		rd.work();
		RobotCooker rc = new RobotCooker();
		rc.work();
		Robot[] RobotArray = {r,cr,rd,rc};
		for (Robot ra: RobotArray) {
			ra.work();
		};
		
	}
	
}
