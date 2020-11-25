public class nguoitienhoa extends person {
    nguoitienhoa(int age, String name) {
        super(age, name);
    }

    public static void main(String [] args){
        person lam = new person(19, "lam");
        System.out.println("tuoi cua " + lam.age + " va ten la " + lam.name);
    }
}
