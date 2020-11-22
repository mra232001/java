import java.util.Scanner;

public class java5 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int n;
        int [] a = new int [102];
        n = cin.nextInt();
        for(int i = 1; i <= n; i++){
            a[i] = cin.nextInt();
        }
        System.out.println(n);
        for(int i = 1; i <= n; i++){
            System.out.printf("%d ", a[i]);
        }
    }
}
