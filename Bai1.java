import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n :");
        int n= sc.nextInt();
        List<Integer> a = new ArrayList<>();
        System.out.println("nhap day so");
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        Collections.sort(a);
        System.out.println(a);
    }
}
