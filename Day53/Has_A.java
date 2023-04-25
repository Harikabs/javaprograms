public class Has_A extends Human {
    public static void main(String[] args) {
        Has_A a= new Has_A();
        a.walk(); 
    } 
}
class Human {
    void walk() {
        System.out.println("walking");
    Brain b=new Brain();
    b.iq();    
    }
}
class Brain {
    void iq(){
        System.out.println(" between 85 and 115 ");
    }
}

