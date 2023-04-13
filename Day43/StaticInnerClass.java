import java.util.*;
public class StaticInnerClass {
    
    public static void main(String[] args) {
        Flower.Tulips.tulips(5);
    }
}
class Flower{
    private static void outerMethod(){
        System.out.println("the outer function");
    }
    static  class Tulips{
     public  static void tulips(int n){
        System.out.println("the lotus is in rcolor"+n);
        outerMethod();
    }
    }
}

