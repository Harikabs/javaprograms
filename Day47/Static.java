// the static block run only for one time 
// the constructer will run as many times we want
//
public class Static {
    public static void main(String[] args) {
    Animal object1=new Animal();
    Animal object2=new Animal();
    Animal object3=new Animal();

    
    }
    
}
class Animal{
    static {
        System.out.println("static block");
    }
    Animal(){
        System.out.println("the constructer block");
    }
}
