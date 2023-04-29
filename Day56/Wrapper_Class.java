public class Wrapper_Class {
    public static void main(String[] args) {
        int x = Boolean.compare(false,true);
        System.out.println(x);
        boolean a = 87<90; 
        System.out.println(Boolean.logicalOr(a, false));
        boolean b = Boolean.logicalAnd(4>9, 9<18);
        System.out.println(b);
        boolean c = Boolean.logicalXor(1>8, 6>2);
        System.out.println(c);

    }
    
}
