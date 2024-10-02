import java.awt.Component;
import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNotification = "you've just entered: ";
        String strNum1 = JOptionPane.showInputDialog((Component)null, "Please input the first number: ", "Input the first number", 1);
        strNotification = strNotification + strNum1 + " and ";
        String strNum2 = JOptionPane.showInputDialog((Component)null, "Please input the second number:", "Input the second number", 1);
        strNotification = strNotification + strNum2;
        JOptionPane.showMessageDialog((Component)null, strNotification, "Show two numbers", 1);
        System.exit(0);
    }
}
