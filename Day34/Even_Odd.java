//program for functional programing determaining even or odd
public class Even_Odd{
public static void main(String args[]){
for(int i=0;i<10;i++){
if(isEven(i))
System.out.println(i+" is even");
else
System.out.println(i+" is odd");
}
}
public static boolean isEven(int x){
if(x%2==0)
return true;
else
return false;
}
}
 
