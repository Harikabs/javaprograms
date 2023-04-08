//program for getter and setter 
public class GetSet{
int y;
public static void main(String args[]){
int x;
GetSet myobj=new GetSet();
myobj.setY(11);
System.out.println(myobj.getY());
}
int getY(){
return y;
}
void setY(int value){
y=value;
}
}
