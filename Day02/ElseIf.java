import java.util.*;
public class ElseIf{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int time=sc.nextInt();
if(time>4&&time<9){
System.out.println("morning");
}
else if (time<13){
System.out.println("afternoon");
}
else if(time<18){
System.out.println("evening");
}
else{
System.out.println("night");
}
}
}
