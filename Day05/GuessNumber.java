import java.util.*;
public class GuessNumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int guess;
int n=(int)(Math.random()*100)+1;
System.out.println("guess the number");
do{
guess=sc.nextInt();
if(guess>n){
System.out.println("too high!try again");
}
else if(guess<n){
System.out.println("too low!try again");
}
else{
System.out.println("correct ! you won");
}
}while(guess!=n);
}
}

