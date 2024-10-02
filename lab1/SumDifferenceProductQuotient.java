import java.awt.Component;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SumDifferenceProductQuotient {
    public static void main(String[] args) {
        new Scanner(System.in);
        String num1 = JOptionPane.showInputDialog((Component)null, "Please input the first number :");
        double strNum1 = Double.parseDouble(num1);
        int x = 0;

        double strNum2;
        do {
            String num2 = JOptionPane.showInputDialog((Component)null, "Please input the second number :");
            strNum2 = Double.parseDouble(num2);
            if (strNum2 == 0.0) {
                JOptionPane.showMessageDialog((Component)null, "Số thứ 2 phải khác 0");
                x = 1;
            } else {
                x = 0;
            }
        } while(x==1);

        Double sum = strNum1 + strNum2;
        Double difference = strNum1 - strNum2;
        Double product = strNum1 * strNum2;
        Double quotient = strNum1 / strNum2;
        JOptionPane.showMessageDialog((Component)null, "tong la :" + sum + "\nhieu la :" + difference + " \ntich la :" + product + "\nthuong la : " + quotient);
    }
}
