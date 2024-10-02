
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        int n = s.nextInt();
        double[] Array = new double[n];
        double tong = 0.0;
        double dem = 0.0;

        for(int i = 0; i < n; ++i) {
            Array[i] = s.nextDouble();
            tong += Array[i];
            dem = (double)(i + 1);
        }

        Arrays.sort(Array);
        System.out.println("Phần tử của mảng sau khi sắp xếp :");
        System.out.println(Arrays.toString(Array));
        System.out.println("tổng các phần tử của mảng là : " + tong);
        System.out.println("Giá trị trung bình các phần tử của mảng là : " + tong / dem);
    }
}
