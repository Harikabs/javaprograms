//if we declare   same variable within  the main class and out of the main class it will print the local variable (wiyh in the main class)
public class LocalVariable {
     static int x=6;
     public static void main(String[] args) {
        int x=8;
        System.out.println(x);
     }
}
