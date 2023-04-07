//program for printing the middle chars of the string
import java.util.Arrays;
public class Middle{
public static void main(String args[]){
String str="harika";
String res="";
char arr[]=str.toCharArray();
for(int i=arr.length-1;i>=0;i--){
res+=arr[i];
}
System.out.println(res);
int n=res.length();
if(res.length()%2==0)
System.out.print(res.substring((res.length()/2)-1,(res.length()/2)+1));
else
System.out.print(res.substring((res.length()-1)/2,((res.length()-1)/2)+1));
}
}
