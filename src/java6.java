import java.util.Scanner;

class person{
    static int age;
    static String name;
    public void in(String _name){
        name = _name;
        System.out.println(name);
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
// non-static function co the goi static variable nhuwng static function khong the goi
// non-static variable