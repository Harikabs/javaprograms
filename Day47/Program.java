//program here we have to create the object because there is no static keyword and  which cannot be loaded into the  class loader

public class Program{
    public static void main(String[] args) {
        Object o=new Object();
        o.size();
        System.out.println(o.a);
        Object o1=new Object();
        o1.size();
        o1.a=76;
        System.out.println(o1.a);
    }
}
class Object{
    int  a=13;
    void size(){
        System.out.println("the size of the object "+a);
    }
}