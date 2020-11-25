class frog{
    private int id;
    private String s;
    frog(int id, String s){
        this.id = id;
        this.s = s;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(s);
        return sb.toString();
    }
}
public class java10 {
    public static void main(String [] args){
        frog a = new frog(5, "lam dep trai");
        System.out.println(a);
    }
}
