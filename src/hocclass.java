import java.util.Scanner;

class per{
    int age;
    String name;
}
public class hocclass {
    public static void main(String [] args){
        per one = new per();
        Scanner cin = new Scanner(System.in);
        // day la khai bao 1 cai giong nhu bien, no khong co tac dung nhap hay gi het, chi la
        /// khai bao
        System.out.println("Ten");
        one.name = cin.next();
        // day la lenh nhap, nhu kieu cin trong c++
        System.out.println("tuoi");
        one.age = cin.nextInt();
        // day cung vay
        System.out.printf("Ten thang nay la: %s va tuoi cua no la: %d", one.name, one.age);
    }
}
