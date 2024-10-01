import javax.swing.JOptionPane;
public class Equations {
    public static void main(String[] args) {
        String options[] ={"Phương trình bậc nhất một ẩn","Phương trình bậc hai một ẩn"," Hệ phương trình bậc nhất hai ẩn"};
        int option = JOptionPane.showOptionDialog(null,"Chọn phương trình bạn muốn giải : ","select option",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
        if(option == 0){
            String ip1,ip2;
            int validInput=1;
            double a= 0;
            do{
                ip1 = JOptionPane.showInputDialog(null,"nhập hệ số a :");
                a = Double.parseDouble(ip1);
                if(a==0){
                    JOptionPane.showMessageDialog(null,"hệ số a phải khác 0");
                    validInput = 0;
                }
            } while (validInput==0);
            ip2= JOptionPane.showInputDialog(null,"nhập hẹ số b :");
            double b = Double.parseDouble(ip2);
            JOptionPane.showMessageDialog(null,"nghiệm của phương trình : "+ -b/a);
        }
        if(option == 2){
            String a1,a2,a3,a4,a5,a6;
            JOptionPane.showMessageDialog(null,"hệ phương trình có dạng \n a11*x1 + a22*x2 = b1 \n a21*x1 + a22*x2 = b2");
            a1= JOptionPane.showInputDialog(null," nhập hê số a11 :");
            double a11 = Double.parseDouble(a1);
            a2 = JOptionPane.showInputDialog(null," nhập hê số a12 :");
            double a12 = Double.parseDouble(a2);
            a3 = JOptionPane.showInputDialog(null," nhập hê số b1 :");
            double b1 = Double.parseDouble(a3);
            a4 = JOptionPane.showInputDialog(null," nhập hê số a21 :");
            double a21 = Double.parseDouble(a4);
            a5 = JOptionPane.showInputDialog(null," nhập hê số a22 :");
            double a22 = Double.parseDouble(a5);
            a6 = JOptionPane.showInputDialog(null," nhập hê số b2 :");
            double b2 = Double.parseDouble(a6);

            //su dung dinh thuc de giai he pt
            double D = a11 * a22 - a12 * a21;
            double D1 = b1 * a22 - b2 * a12;
            double D2 = a11 * b2 - a21 * b1;
            if(D == 0){
                if(D1 == 0 && D2 ==0){
                    JOptionPane.showMessageDialog(null,"hệ phương trình có vô số nghiệm");
                }
                else {
                    JOptionPane.showMessageDialog(null,"hệ phương trình vô nghiệm");
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"nghiệm của hệ phương trình là : \n x1 = " + D1/D + ", x2 = " + D2/D);
            }
        }
        if(option == 1){
            JOptionPane.showMessageDialog(null,"Phương trình có dạng \n a*x^2 + b*x + c = 0");
            String ip1 = JOptionPane.showInputDialog(null,"Nhập hệ số a :");
            double a = Double.parseDouble(ip1);
            String ip2 = JOptionPane.showInputDialog(null,"Nhập hệ số b :");
            double b = Double.parseDouble(ip2);
            String ip3 = JOptionPane.showInputDialog(null, " Nhập hệ số c :");
            double c = Double.parseDouble(ip3);
            if(a==0){
                if(b == 0){
                    if(c==0){
                        JOptionPane.showMessageDialog(null,"phương trình có vô sô nghiệm ");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"phương trình vô nghiệm ");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"phương trình có nghiệm duy nhất : "+ -b/a);
                }
            }
            else {
                double denta = b*b - 4*a*c;
                if(denta<0){
                    JOptionPane.showMessageDialog(null,"phương trình vô nghiệm");
                }
                if(denta > 0){
                    JOptionPane.showMessageDialog(null,"Phương trình có 2 nghiệm phân biệt \n x1 = "+ (-b + Math.sqrt(denta))/2/a + "x2 = " + (-b - Math.sqrt(denta))/2/a );
                }
                if(denta == 0){
                    JOptionPane.showMessageDialog(null,"phương trình có nghệm kép x = " + -b/2/a );
                }
            }
        }
    }
}
