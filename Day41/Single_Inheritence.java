public class Single_Inheritence{
    public static void main(String[] args) {
        Lenova.memorySize(4);
        Lenova.screenSize(15.6);
        Lenova.battery(4);    
    }
}
class Laptop{
    static void battery(int x){
        System.out.print("the batterylife of the laptop "+x);
    }
}
class Lenova extends Laptop{
    static void screenSize(double y){
        System.out.println("the screen size of the "+y);
    }
    static void memorySize(double z){
        System.out.println("the memory size is "+z);
    }
}