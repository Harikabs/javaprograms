//program for representing run time ploymorphism
public class RunTime {
    
    public static void main(String[] args) {
     Maruthi.milage();
     Nano.milage();
     Car.milage();
    }   
}
class Car{
    static void milage(){
        System.out.println("the milage of car is 27");
    }
}
class Nano extends Car{
    static void milage(){
        System.out.println(" the milage of the nano is 23");
    }
}
class Maruthi extends Car{
    static void milage(){
        System.out.println("maruthi milage is 26");
    }
}
