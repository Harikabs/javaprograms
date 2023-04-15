// program having classes without the abstract class and functions is called the concrete class 
public class Concrete {
    public static void main(String[] args) {
       Pen1.write();
    }
    
}
class Pen1{
    static String brand;
    static String type;
    public static void write(){
        System.out.println("write something");
    }


}
