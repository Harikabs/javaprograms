//program to explain access modifiers
public class Identifiers{
public static void main(String args[]){
Scope p=new Scope();
p.play();
//System.out.println(music());
Scope.music();
}
}
class Scope{
void play(){
System.out.println("the void program");
}
static void music(){
System.out.println("the program executed");
}
}       
