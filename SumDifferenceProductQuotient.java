import java.util.Scanner;
import javax.swing.JOptionPane;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1,num2;
        num1 = JOptionPane.showInputDialog( null,"Please input the first number :");
        num2 = JOptionPane.showInputDialog(null,"Please input the second number :");
        double strNum1 = Double.parseDouble(num1);
        double strNum2 = Double.parseDouble(num2);
        Double sum = strNum1 + strNum2;
        Double difference = strNum1 - strNum2;
        Double product = strNum1 * strNum2;
        Double quotient = strNum1 / strNum2;
        JOptionPane.showMessageDialog(null,"tong la :" + sum +"\n" + "hieu la :" + difference + " \n" + "tich la :" + product + "\n" +"thuong la : "+ quotient);
    }
}
