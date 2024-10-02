import java.awt.Component;
import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String result = JOptionPane.showInputDialog("Please enter your name:");
        JOptionPane.showMessageDialog((Component)null, "hi " + result + "!");
        System.exit(0);
    }
}
