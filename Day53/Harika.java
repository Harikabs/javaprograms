//program to demonstrate the IS-A relaionship between classes 
public class Harika extends Human { // IS-A relationship
    public static void main(String[] args) {
        Harika hh = new Harika();
        hh.walk();
        
    }
}
class Human {
    void walk() {
        System.out.println(" walking  ");
    }

}
