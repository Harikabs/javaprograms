//program for classes,methods,objects,attributes of the phone
public class Phone1_Program{
public static void main(String args[]){
Phone vivo=new Phone();
vivo.play(2);
}
}
class Phone{
private String color;
int storagespace;
String model;
private double price;
String company;
String songs[]={"dhoom","chamkila","ruba ruba"};
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
}

void browsing(String topic){
System.out.print("The search topic is:"+topic);
}
}
