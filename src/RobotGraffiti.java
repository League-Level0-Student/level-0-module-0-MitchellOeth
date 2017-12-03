import org.jointheleague.graphical.robot.Robot;
public class RobotGraffiti {
public static void main(String[] args) {
Robot Mitch=new Robot();
Mitch.setSpeed(100);
Mitch.hide();
Mitch.penDown();
Mitch.move(200);
Mitch.turn(135);
Mitch.move(100);
Mitch.turn(-90);
Mitch.move(100);
Mitch.turn(135);
Mitch.move(200);
}
	
}
