import java.util.Scanner;

class person{
    static int age;
    String name;
    public static void in(String _name){
        System.out.println(_name);
    }
}

public class java6 {
    public static void main(String [] args){
        person lam = new person();
        lam.in("lam");
        person.age = 23;
        System.out.println(lam.age);
        lam.age = 100;
        System.out.println(lam.age);
    }
}
