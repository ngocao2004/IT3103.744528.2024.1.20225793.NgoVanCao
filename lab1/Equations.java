import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Equations {
    public static void main(String[] args) {
        String[] options = new String[]{"Phương trình bậc nhất một ẩn", "Phương trình bậc hai một ẩn", " Hệ phương trình bậc nhất hai ẩn"};
        int option = JOptionPane.showOptionDialog((Component)null, "Chọn phương trình bạn muốn giải : ", "select option", -1, 1, (Icon)null, options, options[0]);
        String ip1;
        String ip2;
        if (option == 0) {
            int validInput = 0;
            double a = 0.0;

            do {
                ip1 = JOptionPane.showInputDialog((Component)null, "nhập hệ số a :");
                a = Double.parseDouble(ip1);
                if (a == 0.0) {
                    JOptionPane.showMessageDialog((Component)null, "hệ số a phải khác 0");
                    validInput = 1;
                }
            } while(validInput==1);

            ip2 = JOptionPane.showInputDialog((Component)null, "nhập hẹ số b :");
            double b = Double.parseDouble(ip2);
            JOptionPane.showMessageDialog((Component)null, "nghiệm của phương trình : " + -b / a);
        }
        if (option == 2) {
            JOptionPane.showMessageDialog((Component)null, "hệ phương trình có dạng \n a11*x1 + a22*x2 = b1 \n a21*x1 + a22*x2 = b2");
            ip1 = JOptionPane.showInputDialog((Component)null, " nhập hê số a11 :");
            double a11 = Double.parseDouble(ip1);
            ip2 = JOptionPane.showInputDialog((Component)null, " nhập hê số a12 :");
            double a12 = Double.parseDouble(ip2);
            String a3 = JOptionPane.showInputDialog((Component)null, " nhập hê số b1 :");
            double b1 = Double.parseDouble(a3);
            ip2 = JOptionPane.showInputDialog((Component)null, " nhập hê số a21 :");
            double a21 = Double.parseDouble(ip2);
            String a5 = JOptionPane.showInputDialog((Component)null, " nhập hê số a22 :");
            double a22 = Double.parseDouble(a5);
            String a6 = JOptionPane.showInputDialog((Component)null, " nhập hê số b2 :");
            double b2 = Double.parseDouble(a6);
            double D = a11 * a22 - a12 * a21;
            double D1 = b1 * a22 - b2 * a12;
            double D2 = a11 * b2 - a21 * b1;
            if (D == 0.0) {
                if (D1 == 0.0 && D2 == 0.0) {
                    JOptionPane.showMessageDialog((Component)null, "hệ phương trình có vô số nghiệm");
                } else {
                    JOptionPane.showMessageDialog((Component)null, "hệ phương trình vô nghiệm");
                }
            } else {
                JOptionPane.showMessageDialog((Component)null, "nghiệm của hệ phương trình là : \n x1 = " + D1 / D + ", x2 = " + D2 / D);
            }
        }

        if (option == 1) {
            JOptionPane.showMessageDialog((Component)null, "Phương trình có dạng \n a*x^2 + b*x + c = 0");
            ip1 = JOptionPane.showInputDialog((Component)null, "Nhập hệ số a :");
            double a = Double.parseDouble(ip1);
            ip2 = JOptionPane.showInputDialog((Component)null, "Nhập hệ số b :");
            double b = Double.parseDouble(ip2);
            String ip3 = JOptionPane.showInputDialog((Component)null, " Nhập hệ số c :");
            double c = Double.parseDouble(ip3);
            if (a == 0.0) {
                if (b == 0.0) {
                    if (c == 0.0) {
                        JOptionPane.showMessageDialog((Component)null, "phương trình có vô sô nghiệm ");
                    } else {
                        JOptionPane.showMessageDialog((Component)null, "phương trình vô nghiệm ");
                    }
                } else {
                    JOptionPane.showMessageDialog((Component)null, "phương trình có nghiệm duy nhất : " + -c / b);
                }
            } else {
                double denta = b * b - 4.0 * a * c;
                if (denta < 0.0) {
                    JOptionPane.showMessageDialog((Component)null, "phương trình vô nghiệm");
                }

                if (denta > 0.0) {
                    double var10001 = (-b + Math.sqrt(denta)) / 2.0 / a;
                    JOptionPane.showMessageDialog((Component)null, "Phương trình có 2 nghiệm phân biệt \n x1 = " + var10001 + "x2 = " + (-b - Math.sqrt(denta)) / 2.0 / a);
                }

                if (denta == 0.0) {
                    JOptionPane.showMessageDialog((Component)null, "phương trình có nghệm kép x = " + -b / 2.0 / a);
                }
            }
        }

    }
}

