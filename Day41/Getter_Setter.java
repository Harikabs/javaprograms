public class Getter_Setter {
    public static void main(String[] args) {
    program.setA(); 
    System.out.println(program.getA());

    }
}
class program{
    static int a;
    public static void setA() {
        a = 5;
    }
    public static int getA() {
        return a;
    }
}
