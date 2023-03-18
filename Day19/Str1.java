//program for showing stringpool and string 
import java.util.*;
import java.util.Arrays;
public class Str1{
public static void main(String args[]){
//char arr[]={'h','a','r','i','k','a'};
String str1="harika";
String str="";
for(int i=0;i<str1.length();i++){
if(i!=str1.length()-1)
str+=str1.charAt(i);
else
str+='k';
System.out.println(str);
}
}
}
