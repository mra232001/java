public class java4 {
    public static void main(String [] args){
        System.out.println(_min(4, 5));
        for(int i = 1; i <= 5; i++){
            System.out.printf("Value: %d %s\n", i, "lamdeptrai");
        }
    }
    public static int _min(int x, int y){
        if(x < y) return x;
        else return y;
    }
}
