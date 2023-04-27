public interface Do_It_Yourself {
    public static void main(String[] args) {
        Dog.eat();
        Cat.eat(); 
        Dog.run();
    }
}
class Animal{
    static void eat() {
        System.out.println(" Eat Food ");
    }
}
class Dog extends Animal {
    static void run() {
        System.out.println("i will run fast ");
    }
}
class Cat extends Animal {

}
