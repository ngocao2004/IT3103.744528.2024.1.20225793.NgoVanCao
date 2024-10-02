import java.awt.Component;
import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog((Component)null, "Do you want to change the first class ticket?");
        JOptionPane.showMessageDialog((Component)null, "You've chosen:" + (option == 0 ? "YES" : "NO"));
        System.exit(0);
    }
}