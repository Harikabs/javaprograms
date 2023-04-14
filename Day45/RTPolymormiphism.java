public class RTPolymormiphism {
    public static void main(String[] args) {
    Dog d=new Dog();
    d.makeNoise();
    }
}
class Animal{
    public void makeNoise(){
        System.out.println("make some noise");
    }
}
class Dog extends Animal{
    public void makeNoise(){
        System.out.println("bow bow");
    }
}
