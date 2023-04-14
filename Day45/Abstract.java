public class Abstract {
    public static void main(String[] args) {
    HDFC h=new HDFC();
    h.bank();
    h.sum();
    }
   
}
interface RBI{
     public void sum();
}
abstract class Bank {
   public void bank(){
    System.out.println("bank");
   }
}
class HDFC extends Bank implements RBI{
    public void bank(){

    }
    public void sum(){
        
    }

}