// interface instead of the multiple inheritence
public class Interface1 {
    public static void main(String[] args) {
    C b=new C();
    b.sum();

    }
}
interface A{

}
interface B{

}
class  C implements A,B{
     public static void sum(){

    }
    

}
