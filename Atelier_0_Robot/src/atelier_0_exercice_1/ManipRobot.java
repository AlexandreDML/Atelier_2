package atelier_0_exercice_1;

public class ManipRobot {

	public static void main(String[] args) {
		Robot robot_1 = new Robot("toto", 10, 20, 3);
		Robot robot_2 = new Robot("titi", 0, 0, 1);
		
		System.out.println(robot_1);
		System.out.println(robot_2);
		
		robot_1.modifOrientation(1);
		robot_1.avancer();
		robot_2.modifOrientation(2);
		robot_2.avancer();
		
		robot_1.afficheToi();
		robot_2.afficheToi();
		//System.out.println(robot_1);
		//System.out.println(robot_2);
	}
	
}