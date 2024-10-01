import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int l = 0,r= n-1;
        int value = 1;
       while(value <= n*n){
           for (int i = l;i<= r;i++){
               a[l][i]=value;
               value++;
           }
           l++;
           for(int i = l;i<=r;i++){
               a[i][r]=value;
               value++;
           }
           r--;
           for(int i= r;i>=l-1;i--){
               a[r+1][i]=value;
               value++;
           }
           for(int i=r;i>=l;i--) {
               a[i][l-1] = value;
           }
       }
       System.out.println(a);
    }
}
