public class MyClass{
public static void main(String args[]){
Phone p1=new Phone();
p1.price=20000;
Phone p2=new Phone();
p2.price=40000;
p1=p2;
System.out.println(p1.price);
System.out.println(p1.price);
}
}
class Phone{
int price;
void sayHello(){
System.out.print("hello welcome");
}
}


