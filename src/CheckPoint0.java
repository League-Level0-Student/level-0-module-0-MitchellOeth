import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
public class CheckPoint0 {
public static void main(String[] args) {
String color	= JOptionPane.showInputDialog(null, "What is your favorite color?");
JOptionPane.showMessageDialog(null, color+" is my favorite color too!");
Robot Mitch=new Robot();
Mitch.hide();
Mitch.setSpeed(100);
Mitch.penDown();
for (int i = 0; i < 3; i++) {
Mitch.move(200);
Mitch.turn(120);
}
}
}