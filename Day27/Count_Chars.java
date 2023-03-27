//program for printing the duplicate values
import java.util.Arrays;
public class Count_Chars{
public static void main(String args[]){
String str="hellooharika";
char x[]=str.toCharArray();
for(int i=0;i<str.length();i++){
for(int j=i+1;j<str.length();j++){
if(x[i]==x[j])
System.out.print(x[j]);
}
}
}
}
