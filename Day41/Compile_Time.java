public class Compile_Time {
    public static void main(String[] args) {
    Tiger.weight(100);
    Tiger.weight("lioness", 56);   
    Animal.weight(90);
    Lion.weight(69);
    Lion.weight(78);
    }
}
class Animal{
    static void  weight(int n){
        System.out.println(" the weight of the animals are " +n);   
    }
}
class Lion extends Animal{
    static void weight(double x){
        System.out.println("the weight of the lion are"+x);
    }
}
class Tiger extends Animal{
    static void weight(String s,int y){
        System.out.println(s+y);
    }
}


