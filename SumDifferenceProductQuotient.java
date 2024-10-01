import java.util.Scanner;
import javax.swing.JOptionPane;

public class SumDifferenceProductQuotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1,num2;
        num1 = JOptionPane.showInputDialog( null,"Please input the first number :");
        double strNum1 = Double.parseDouble(num1);
        int x = 0;
        double strNum2;
        do{
            num2 = JOptionPane.showInputDialog(null,"Please input the second number :");
            strNum2 = Double.parseDouble(num2);
            if(strNum2==0){
                JOptionPane.showMessageDialog(null,"Số thứ 2 phải khác 0");
                x=1;
            }
            else{x=0;}
        } while(x==1);
        Double sum = strNum1 + strNum2;
        Double difference = strNum1 - strNum2;
        Double product = strNum1 * strNum2;
        Double quotient = strNum1 / strNum2;
        JOptionPane.showMessageDialog(null,"tong la :" + sum +"\n" + "hieu la :" + difference + " \n" + "tich la :" + product + "\n" +"thuong la : "+ quotient);
    }
}
