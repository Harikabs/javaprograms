//program parameterized for  constructors in oops
public class Parameters{
public static void main(String args[]){
Rock r1=new Rock(33,"rock");
Rock r2=new Rock();
r2.setX(10);
System.out.println(r2.getX());
}
}
class Rock{
private int x;
Rock(){
System.out.println("empty constructer");
}
Rock(int b,String xyz){
System.out.println(" constructer with one parameters");
}
Rock(int a,String msg,int x){
System.out.println("constructer with two parameters one is string one is int");
}
void setX(int val){
x=val;
}
int getX(){
return x;
}
}





