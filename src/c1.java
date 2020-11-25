import java.util.Scanner;

public class c1 {
    public static void main(String [] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-- > 0){
            int n = cin.nextInt();
            if(n==1){
                System.out.println(0);
                continue;
            }
            if(n==2){
                System.out.println(1);
                continue;
            }
            if(n==3){
                System.out.println(2);
                continue;
            }
            if(n%2==1){
                System.out.println(3);
                continue;
            }
            System.out.println(2);

        }
    }
}
