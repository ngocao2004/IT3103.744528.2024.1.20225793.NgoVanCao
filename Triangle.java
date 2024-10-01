import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d = 1;
        while(d<=n){
            for(int i= d;i<n;i++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*d-1);k++){
                System.out.print("*");
            }
            System.out.print("\n");
            d++;
        }
    }
}
