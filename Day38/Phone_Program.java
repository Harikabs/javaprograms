//program for classes,methods,objects,attributes of the phone
public class Phone_Program{
public static void main(String args[]){
Phone vivo=new Phone();
vivo.play(2);
Phone apple=new Phone();
apple.setPrice(-2345);
System.out.println(apple.getPrice());
Phone c=new Phone();
c.setColor("black");
System.out.println(c.getColor());
}
}
class Phone{
private String color;
int storagespace;
String model;
private double price;
String company;
String songs[]={"dhoom","chamkila","ruba ruba"};
double getPrice(){
return price;
}
void setPrice(double pr){
price=pr;
return;
}
String getColor()
{
return color;
}
void setColor(String c1)
{
color=c1;
return;
}

void changeVolume(boolean increase){
if(increase)
System.out.println("Volume increased");
else
System.out.println("Volume decreased");
}

void call(String person){
System.out.println("i am calling to"+person);
}

void play(int id){
System.out.println("playing:"+songs[id]);
return;
}

void browsing(String topic){
System.out.print("The search topic is:"+topic);
}
}
